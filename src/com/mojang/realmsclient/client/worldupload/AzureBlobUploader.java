package com.mojang.realmsclient.client.worldupload;

import com.google.common.escape.Escaper;
import com.google.common.io.ByteStreams;
import com.google.common.net.UrlEscapers;
import com.mojang.realmsclient.client.UploadStatus;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringJoiner;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import org.apache.commons.io.function.IOSupplier;
import org.apache.commons.io.input.CountingInputStream;

final class AzureBlobUploader {
   private static final String OCTET_STREAM = "application/octet-stream";
   private static final Duration REQUEST_TIMEOUT = Duration.ofMinutes(15L);
   private static final Escaper QUERY_ESCAPER = UrlEscapers.urlFormParameterEscaper();
   private final UploadHttpClient client;
   private final UploadRetry retry = new UploadRetry();

   public AzureBlobUploader(final UploadHttpClient client) {
      this.client = client;
   }

   public void upload(
      final UploadPlan plan,
      final Supplier<UploadSession> sessionSupplier,
      final UploadStatus progress,
      final UploadCancellation cancellation,
      final Runnable beforeBlockCommit
   ) {
      cancellation.throwIfCancelled();
      progress.setTotalBytes(plan.fileSize());
      progress.restart();
      if (plan.usesBlocks()) {
         this.uploadBlocks(plan, sessionSupplier, progress, cancellation, beforeBlockCommit);
      } else {
         this.uploadSingle(plan, sessionSupplier, progress, cancellation);
      }
   }

   private void uploadSingle(
      final UploadPlan plan, final Supplier<UploadSession> sessionSupplier, final UploadStatus progress, final UploadCancellation cancellation
   ) {
      this.sendWithRetry(
         () -> openSegment(plan.archive(), 0L, plan.fileSize(), plan.fileSize(), progress),
         plan.fileSize(),
         body -> blobRequest(sessionSupplier.get().uploadUrl(), body).header("x-ms-blob-type", "BlockBlob").build(),
         ContentV2UploadException.Error.SINGLE_UPLOAD_FAILED,
         cancellation
      );
      progress.onWrite(plan.fileSize());
   }

   private void uploadBlocks(
      final UploadPlan plan,
      final Supplier<UploadSession> sessionSupplier,
      final UploadStatus progress,
      final UploadCancellation cancellation,
      final Runnable beforeBlockCommit
   ) {
      List<AzureBlobUploader.Block> blocks = blocks(plan.fileSize(), plan.blockSize());
      long acknowledgedBytes = 0L;

      for (AzureBlobUploader.Block block : blocks) {
         this.sendWithRetry(
            () -> openSegment(plan.archive(), block.offset(), block.length(), plan.fileSize(), progress),
            block.length(),
            body -> blobRequest(appendQuery(sessionSupplier.get().uploadUrl(), Map.of("comp", "block", "blockid", block.id())), body).build(),
            ContentV2UploadException.Error.BLOCK_UPLOAD_FAILED,
            cancellation
         );
         acknowledgedBytes += block.length();
         progress.onWrite(acknowledgedBytes);
      }

      cancellation.throwIfCancelled();
      beforeBlockCommit.run();
      cancellation.throwIfCancelled();
      byte[] blockList = blockListXml(blocks).getBytes(StandardCharsets.UTF_8);
      this.sendWithRetry(
         () -> new ByteArrayInputStream(blockList),
         blockList.length,
         body -> HttpRequest.newBuilder(appendQuery(sessionSupplier.get().uploadUrl(), Map.of("comp", "blocklist")))
            .timeout(REQUEST_TIMEOUT)
            .header("Content-Type", "application/xml")
            .header("x-ms-blob-content-type", "application/octet-stream")
            .PUT(body)
            .build(),
         ContentV2UploadException.Error.BLOCK_LIST_FAILED,
         cancellation
      );
   }

   private static Builder blobRequest(final URI uri, final BodyPublisher publisher) {
      return HttpRequest.newBuilder(uri).timeout(REQUEST_TIMEOUT).header("Content-Type", "application/octet-stream").PUT(publisher);
   }

   private void sendWithRetry(
      final IOSupplier<InputStream> bodySupplier,
      final long bodyLength,
      final Function<BodyPublisher, HttpRequest> requestFactory,
      final ContentV2UploadException.Error error,
      final UploadCancellation cancellation
   ) {
      for (int attempt = 0; attempt < 5; attempt++) {
         cancellation.throwIfCancelled();
         HttpResponse<Void> response = null;

         try {
            label80: {
               try (InputStream body = (InputStream)bodySupplier.get()) {
                  HttpRequest request = requestFactory.apply(singleUseBody(body, bodyLength));
                  cancellation.throwIfCancelled();
                  response = cancellation.join(this.client.sendAsync(request, BodyHandlers.discarding()), REQUEST_TIMEOUT);
                  cancellation.throwIfCancelled();
                  if (!UploadRetry.isSuccessful(response.statusCode())) {
                     if (!UploadRetry.isTransient(response.statusCode())) {
                        throw new ContentV2UploadException(error);
                     }
                     break label80;
                  }
               }

               return;
            }
         } catch (CompletionException e) {
            cancellation.throwIfCancelled();
            if (!isTransientFailure(e)) {
               throw new ContentV2UploadException(error);
            }
         } catch (IOException | IllegalArgumentException e) {
            cancellation.throwIfCancelled();
            throw new ContentV2UploadException(error);
         }

         if (attempt + 1 == 5) {
            throw new ContentV2UploadException(error);
         }

         this.retry.sleep(this.retry.delay(response, attempt), cancellation);
      }

      throw new ContentV2UploadException(error);
   }

   private static BodyPublisher singleUseBody(final InputStream body, final long length) {
      AtomicReference<InputStream> unread = new AtomicReference<>(body);
      return BodyPublishers.fromPublisher(BodyPublishers.ofInputStream(() -> unread.getAndSet(null)), length);
   }

   private static boolean isTransientFailure(final Throwable failure) {
      boolean transportFailure = false;

      for (Throwable cause = failure; cause != null; cause = cause.getCause()) {
         if (cause instanceof CancellationException || cause instanceof RealmsUploadCanceledException) {
            throw new RealmsUploadCanceledException();
         }

         if (cause instanceof IOException) {
            transportFailure = true;
         }
      }

      return transportFailure;
   }

   private static List<AzureBlobUploader.Block> blocks(final long fileSize, final long blockSize) {
      if (fileSize > 0L && blockSize > 0L) {
         long count = 1L + (fileSize - 1L) / blockSize;
         if (count > 2147483647L) {
            throw new ContentV2UploadException(ContentV2UploadException.Error.FILE_TOO_LARGE);
         }

         List<AzureBlobUploader.Block> blocks = new ArrayList<>((int)count);
         long offset = 0L;

         for (long blockNumber = 1L; blockNumber <= count; blockNumber++) {
            long length = Math.min(blockSize, fileSize - offset);
            blocks.add(new AzureBlobUploader.Block(blockId(blockNumber), offset, length));
            offset += length;
         }

         return List.copyOf(blocks);
      } else {
         throw new IllegalArgumentException("Archive and block sizes must be positive");
      }
   }

   private static String blockId(final long blockNumber) {
      if (blockNumber <= 0L) {
         throw new IllegalArgumentException("Block numbers must be positive");
      }

      String text = String.format(Locale.ROOT, "block-%06d", blockNumber);
      return Base64.getUrlEncoder().withoutPadding().encodeToString(text.getBytes(StandardCharsets.UTF_8));
   }

   private static String blockListXml(final List<AzureBlobUploader.Block> blocks) {
      try {
         StringWriter output = new StringWriter();
         XMLStreamWriter writer = XMLOutputFactory.newFactory().createXMLStreamWriter(output);
         writer.writeStartDocument("utf-8", "1.0");
         writer.writeStartElement("BlockList");

         for (AzureBlobUploader.Block block : blocks) {
            writer.writeStartElement("Latest");
            writer.writeCharacters(block.id());
            writer.writeEndElement();
         }

         writer.writeEndElement();
         writer.writeEndDocument();
         writer.close();
         return output.toString();
      } catch (XMLStreamException e) {
         throw new ContentV2UploadException(ContentV2UploadException.Error.BLOCK_LIST_FAILED);
      }
   }

   private static URI appendQuery(final URI base, final Map<String, String> parameters) {
      StringJoiner query = new StringJoiner("&");
      parameters.forEach((name, value) -> query.add(QUERY_ESCAPER.escape(name) + "=" + QUERY_ESCAPER.escape(value)));
      return URI.create(base + (base.getRawQuery() == null ? "?" : "&") + query);
   }

   private static InputStream openSegment(final Path path, final long offset, final long length, final long expectedFileSize, final UploadStatus progress) throws IOException {
      if (offset >= 0L && length > 0L && length <= expectedFileSize && offset <= expectedFileSize - length) {
         FileChannel channel = FileChannel.open(path, StandardOpenOption.READ);

         try {
            if (channel.size() != expectedFileSize) {
               throw new IOException("Archive size changed during upload");
            }

            channel.position(offset);
         } catch (IOException | RuntimeException | Error e) {
            try {
               channel.close();
            } catch (IOException cleanupFailure) {
               e.addSuppressed(cleanupFailure);
            }

            throw e;
         }

         return new CountingInputStream(ByteStreams.limit(Channels.newInputStream(channel), length)) {
            protected void afterRead(final int count) throws IOException {
               super.afterRead(count);
               progress.onProgress(offset + this.getByteCount());
            }
         };
      } else {
         throw new IllegalArgumentException("Invalid archive range");
      }
   }

   private record Block(String id, long offset, long length) {
   }
}
