import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;

public class fke {
   private static final long a = 5368709120L;
   private static final String b = "world";
   private final BooleanSupplier c;
   private final Path d;

   public static File a(Path $$0, BooleanSupplier $$1) throws IOException {
      return new fke($$0, $$1).a();
   }

   private fke(Path $$0, BooleanSupplier $$1) {
      this.c = $$1;
      this.d = $$0;
   }

   private File a() throws IOException {
      TarArchiveOutputStream $$0 = null;

      File var3;
      try {
         File $$1 = File.createTempFile("realms-upload-file", ".tar.gz");
         $$0 = new TarArchiveOutputStream(new GZIPOutputStream(new FileOutputStream($$1)));
         $$0.setLongFileMode(3);
         this.a($$0, this.d, "world", true);
         if (this.c.getAsBoolean()) {
            throw new fjz();
         }

         $$0.finish();
         this.a($$1.length());
         var3 = $$1;
      } finally {
         if ($$0 != null) {
            $$0.close();
         }
      }

      return var3;
   }

   private void a(TarArchiveOutputStream $$0, Path $$1, String $$2, boolean $$3) throws IOException {
      if (this.c.getAsBoolean()) {
         throw new fjz();
      } else {
         this.a($$0.getBytesWritten());
         File $$4 = $$1.toFile();
         String $$5 = $$3 ? $$2 : $$2 + $$4.getName();
         TarArchiveEntry $$6 = new TarArchiveEntry($$4, $$5);
         $$0.putArchiveEntry($$6);
         if ($$4.isFile()) {
            try (InputStream $$7 = new FileInputStream($$4)) {
               $$7.transferTo($$0);
            }

            $$0.closeArchiveEntry();
         } else {
            $$0.closeArchiveEntry();
            File[] $$8 = $$4.listFiles();
            if ($$8 != null) {
               for (File $$9 : $$8) {
                  this.a($$0, $$9.toPath(), $$5 + "/", false);
               }
            }
         }
      }
   }

   private void a(long $$0) {
      if ($$0 > 5368709120L) {
         throw new fkc(5368709120L);
      }
   }
}
