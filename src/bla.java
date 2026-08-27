import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bla {
   static final Logger a = LogUtils.getLogger();
   private static final int b = 4096;
   private static final String c = ".gz";
   private final Path d;
   private final String e;

   private bla(Path $$0, String $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static bla a(Path $$0, String $$1) throws IOException {
      Files.createDirectories($$0);
      return new bla($$0, $$1);
   }

   public bla.d a() throws IOException {
      bla.d var2;
      try (Stream<Path> $$0 = Files.list(this.d)) {
         var2 = new bla.d($$0.filter($$0x -> Files.isRegularFile($$0x)).map(this::a).filter(Objects::nonNull).toList());
      }

      return var2;
   }

   @Nullable
   private bla.b a(Path $$0) {
      String $$1 = $$0.getFileName().toString();
      int $$2 = $$1.indexOf(46);
      if ($$2 == -1) {
         return null;
      } else {
         bla.c $$3 = bla.c.a($$1.substring(0, $$2));
         if ($$3 != null) {
            String $$4 = $$1.substring($$2);
            if ($$4.equals(this.e)) {
               return new bla.e($$0, $$3);
            }

            if ($$4.equals(this.e + ".gz")) {
               return new bla.a($$0, $$3);
            }
         }

         return null;
      }
   }

   static void a(Path $$0, Path $$1) throws IOException {
      if (Files.exists($$1)) {
         throw new IOException("Compressed target file already exists: " + $$1);
      } else {
         try (FileChannel $$2 = FileChannel.open($$0, StandardOpenOption.WRITE, StandardOpenOption.READ)) {
            FileLock $$3 = $$2.tryLock();
            if ($$3 == null) {
               throw new IOException("Raw log file is already locked, cannot compress: " + $$0);
            }

            a($$2, $$1);
            $$2.truncate(0L);
         }

         Files.delete($$0);
      }
   }

   private static void a(ReadableByteChannel $$0, Path $$1) throws IOException {
      try (OutputStream $$2 = new GZIPOutputStream(Files.newOutputStream($$1))) {
         byte[] $$3 = new byte[4096];
         ByteBuffer $$4 = ByteBuffer.wrap($$3);

         while ($$0.read($$4) >= 0) {
            $$4.flip();
            $$2.write($$3, 0, $$4.limit());
            $$4.clear();
         }
      }
   }

   public bla.e a(LocalDate $$0) throws IOException {
      int $$1 = 1;
      Set<bla.c> $$2 = this.a().c();

      bla.c $$3;
      do {
         $$3 = new bla.c($$0, $$1++);
      } while ($$2.contains($$3));

      bla.e $$4 = new bla.e(this.d.resolve($$3.b(this.e)), $$3);
      Files.createFile($$4.c());
      return $$4;
   }

   public static record a(Path a, bla.c b) implements bla.b {
      @Nullable
      @Override
      public Reader a() throws IOException {
         return !Files.exists(this.a) ? null : new BufferedReader(new InputStreamReader(new GZIPInputStream(Files.newInputStream(this.a))));
      }

      @Override
      public bla.a b() {
         return this;
      }

      @Override
      public Path c() {
         return this.a;
      }

      @Override
      public bla.c d() {
         return this.b;
      }
   }

   public interface b {
      Path c();

      bla.c d();

      @Nullable
      Reader a() throws IOException;

      bla.a b() throws IOException;
   }

   public static record c(LocalDate a, int b) {
      private static final DateTimeFormatter c = DateTimeFormatter.BASIC_ISO_DATE;

      @Nullable
      public static bla.c a(String $$0) {
         int $$1 = $$0.indexOf("-");
         if ($$1 == -1) {
            return null;
         } else {
            String $$2 = $$0.substring(0, $$1);
            String $$3 = $$0.substring($$1 + 1);

            try {
               return new bla.c(LocalDate.parse($$2, c), Integer.parseInt($$3));
            } catch (DateTimeParseException | NumberFormatException var5) {
               return null;
            }
         }
      }

      @Override
      public String toString() {
         return c.format(this.a) + "-" + this.b;
      }

      public String b(String $$0) {
         return this + $$0;
      }
   }

   public static class d implements Iterable<bla.b> {
      private final List<bla.b> a;

      d(List<bla.b> $$0) {
         this.a = new ArrayList<>($$0);
      }

      public bla.d a(LocalDate $$0, int $$1) {
         this.a.removeIf($$2 -> {
            bla.c $$3 = $$2.d();
            LocalDate $$4 = $$3.a().plusDays((long)$$1);
            if (!$$0.isBefore($$4)) {
               try {
                  Files.delete($$2.c());
                  return true;
               } catch (IOException var6) {
                  bla.a.warn("Failed to delete expired event log file: {}", $$2.c(), var6);
               }
            }

            return false;
         });
         return this;
      }

      public bla.d a() {
         ListIterator<bla.b> $$0 = this.a.listIterator();

         while ($$0.hasNext()) {
            bla.b $$1 = $$0.next();

            try {
               $$0.set($$1.b());
            } catch (IOException var4) {
               bla.a.warn("Failed to compress event log file: {}", $$1.c(), var4);
            }
         }

         return this;
      }

      @Override
      public Iterator<bla.b> iterator() {
         return this.a.iterator();
      }

      public Stream<bla.b> b() {
         return this.a.stream();
      }

      public Set<bla.c> c() {
         return this.a.stream().map(bla.b::d).collect(Collectors.toSet());
      }
   }

   public static record e(Path a, bla.c b) implements bla.b {
      public FileChannel e() throws IOException {
         return FileChannel.open(this.a, StandardOpenOption.WRITE, StandardOpenOption.READ);
      }

      @Nullable
      @Override
      public Reader a() throws IOException {
         return Files.exists(this.a) ? Files.newBufferedReader(this.a) : null;
      }

      @Override
      public bla.a b() throws IOException {
         Path $$0 = this.a.resolveSibling(this.a.getFileName().toString() + ".gz");
         bla.a(this.a, $$0);
         return new bla.a($$0, this.b);
      }

      @Override
      public Path c() {
         return this.a;
      }

      @Override
      public bla.c d() {
         return this.b;
      }
   }
}
