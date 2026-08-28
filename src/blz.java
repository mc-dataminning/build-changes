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

public class blz {
   static final Logger a = LogUtils.getLogger();
   private static final int b = 4096;
   private static final String c = ".gz";
   private final Path d;
   private final String e;

   private blz(Path $$0, String $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static blz a(Path $$0, String $$1) throws IOException {
      Files.createDirectories($$0);
      return new blz($$0, $$1);
   }

   public blz.d a() throws IOException {
      blz.d var2;
      try (Stream<Path> $$0 = Files.list(this.d)) {
         var2 = new blz.d($$0.filter($$0x -> Files.isRegularFile($$0x)).map(this::a).filter(Objects::nonNull).toList());
      }

      return var2;
   }

   @Nullable
   private blz.b a(Path $$0) {
      String $$1 = $$0.getFileName().toString();
      int $$2 = $$1.indexOf(46);
      if ($$2 == -1) {
         return null;
      } else {
         blz.c $$3 = blz.c.a($$1.substring(0, $$2));
         if ($$3 != null) {
            String $$4 = $$1.substring($$2);
            if ($$4.equals(this.e)) {
               return new blz.e($$0, $$3);
            }

            if ($$4.equals(this.e + ".gz")) {
               return new blz.a($$0, $$3);
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

   public blz.e a(LocalDate $$0) throws IOException {
      int $$1 = 1;
      Set<blz.c> $$2 = this.a().c();

      blz.c $$3;
      do {
         $$3 = new blz.c($$0, $$1++);
      } while ($$2.contains($$3));

      blz.e $$4 = new blz.e(this.d.resolve($$3.b(this.e)), $$3);
      Files.createFile($$4.c());
      return $$4;
   }

   public static record a(Path a, blz.c b) implements blz.b {
      @Nullable
      @Override
      public Reader a() throws IOException {
         return !Files.exists(this.a) ? null : new BufferedReader(new InputStreamReader(new GZIPInputStream(Files.newInputStream(this.a))));
      }

      @Override
      public blz.a b() {
         return this;
      }

      @Override
      public Path c() {
         return this.a;
      }

      @Override
      public blz.c d() {
         return this.b;
      }
   }

   public interface b {
      Path c();

      blz.c d();

      @Nullable
      Reader a() throws IOException;

      blz.a b() throws IOException;
   }

   public static record c(LocalDate a, int b) {
      private static final DateTimeFormatter c = DateTimeFormatter.BASIC_ISO_DATE;

      @Nullable
      public static blz.c a(String $$0) {
         int $$1 = $$0.indexOf("-");
         if ($$1 == -1) {
            return null;
         } else {
            String $$2 = $$0.substring(0, $$1);
            String $$3 = $$0.substring($$1 + 1);

            try {
               return new blz.c(LocalDate.parse($$2, c), Integer.parseInt($$3));
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

   public static class d implements Iterable<blz.b> {
      private final List<blz.b> a;

      d(List<blz.b> $$0) {
         this.a = new ArrayList<>($$0);
      }

      public blz.d a(LocalDate $$0, int $$1) {
         this.a.removeIf($$2 -> {
            blz.c $$3 = $$2.d();
            LocalDate $$4 = $$3.a().plusDays((long)$$1);
            if (!$$0.isBefore($$4)) {
               try {
                  Files.delete($$2.c());
                  return true;
               } catch (IOException var6) {
                  blz.a.warn("Failed to delete expired event log file: {}", $$2.c(), var6);
               }
            }

            return false;
         });
         return this;
      }

      public blz.d a() {
         ListIterator<blz.b> $$0 = this.a.listIterator();

         while ($$0.hasNext()) {
            blz.b $$1 = $$0.next();

            try {
               $$0.set($$1.b());
            } catch (IOException var4) {
               blz.a.warn("Failed to compress event log file: {}", $$1.c(), var4);
            }
         }

         return this;
      }

      @Override
      public Iterator<blz.b> iterator() {
         return this.a.iterator();
      }

      public Stream<blz.b> b() {
         return this.a.stream();
      }

      public Set<blz.c> c() {
         return this.a.stream().map(blz.b::d).collect(Collectors.toSet());
      }
   }

   public static record e(Path a, blz.c b) implements blz.b {
      public FileChannel e() throws IOException {
         return FileChannel.open(this.a, StandardOpenOption.WRITE, StandardOpenOption.READ);
      }

      @Nullable
      @Override
      public Reader a() throws IOException {
         return Files.exists(this.a) ? Files.newBufferedReader(this.a) : null;
      }

      @Override
      public blz.a b() throws IOException {
         Path $$0 = this.a.resolveSibling(this.a.getFileName().toString() + ".gz");
         blz.a(this.a, $$0);
         return new blz.a($$0, this.b);
      }

      @Override
      public Path c() {
         return this.a;
      }

      @Override
      public blz.c d() {
         return this.b;
      }
   }
}
