import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class asm extends asg {
   static final Logger c = LogUtils.getLogger();
   private final asm.b d;
   private final String e;

   asm(aso $$0, asm.b $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   private static String b(asr $$0, akt $$1) {
      return String.format(Locale.ROOT, "%s/%s/%s", $$0.a(), $$1.b(), $$1.a());
   }

   @Nullable
   @Override
   public atv<InputStream> a(String... $$0) {
      return this.b(String.join("/", $$0));
   }

   @Override
   public atv<InputStream> a(asr $$0, akt $$1) {
      return this.b(b($$0, $$1));
   }

   private String a(String $$0) {
      return this.e.isEmpty() ? $$0 : this.e + "/" + $$0;
   }

   @Nullable
   private atv<InputStream> b(String $$0) {
      ZipFile $$1 = this.d.a();
      if ($$1 == null) {
         return null;
      } else {
         ZipEntry $$2 = $$1.getEntry(this.a($$0));
         return $$2 == null ? null : atv.create($$1, $$2);
      }
   }

   @Override
   public Set<String> a(asr $$0) {
      ZipFile $$1 = this.d.a();
      if ($$1 == null) {
         return Set.of();
      } else {
         Enumeration<? extends ZipEntry> $$2 = $$1.entries();
         Set<String> $$3 = Sets.newHashSet();
         String $$4 = this.a($$0.a() + "/");

         while ($$2.hasMoreElements()) {
            ZipEntry $$5 = $$2.nextElement();
            String $$6 = $$5.getName();
            String $$7 = a($$4, $$6);
            if (!$$7.isEmpty()) {
               if (akt.h($$7)) {
                  $$3.add($$7);
               } else {
                  c.warn("Non [a-z0-9_.-] character in namespace {} in pack {}, ignoring", $$7, this.d.a);
               }
            }
         }

         return $$3;
      }
   }

   @VisibleForTesting
   public static String a(String $$0, String $$1) {
      if (!$$1.startsWith($$0)) {
         return "";
      } else {
         int $$2 = $$0.length();
         int $$3 = $$1.indexOf(47, $$2);
         return $$3 == -1 ? $$1.substring($$2) : $$1.substring($$2, $$3);
      }
   }

   @Override
   public void close() {
      this.d.close();
   }

   @Override
   public void a(asr $$0, String $$1, String $$2, asp.a $$3) {
      ZipFile $$4 = this.d.a();
      if ($$4 != null) {
         Enumeration<? extends ZipEntry> $$5 = $$4.entries();
         String $$6 = this.a($$0.a() + "/" + $$1 + "/");
         String $$7 = $$6 + $$2 + "/";

         while ($$5.hasMoreElements()) {
            ZipEntry $$8 = $$5.nextElement();
            if (!$$8.isDirectory()) {
               String $$9 = $$8.getName();
               if ($$9.startsWith($$7)) {
                  String $$10 = $$9.substring($$6.length());
                  akt $$11 = akt.a($$1, $$10);
                  if ($$11 != null) {
                     $$3.accept($$11, atv.create($$4, $$8));
                  } else {
                     c.warn("Invalid path in datapack: {}:{}, ignoring", $$1, $$10);
                  }
               }
            }
         }
      }
   }

   public static class a implements atl.c {
      private final File a;

      public a(Path $$0) {
         this($$0.toFile());
      }

      public a(File $$0) {
         this.a = $$0;
      }

      @Override
      public asp a(aso $$0) {
         asm.b $$1 = new asm.b(this.a);
         return new asm($$0, $$1, "");
      }

      @Override
      public asp a(aso $$0, atl.a $$1) {
         asm.b $$2 = new asm.b(this.a);
         asp $$3 = new asm($$0, $$2, "");
         List<String> $$4 = $$1.d();
         if ($$4.isEmpty()) {
            return $$3;
         } else {
            List<asp> $$5 = new ArrayList<>($$4.size());

            for (String $$6 : $$4) {
               $$5.add(new asm($$0, $$2, $$6));
            }

            return new asi($$3, $$5);
         }
      }
   }

   static class b implements AutoCloseable {
      final File a;
      @Nullable
      private ZipFile b;
      private boolean c;

      b(File $$0) {
         this.a = $$0;
      }

      @Nullable
      ZipFile a() {
         if (this.c) {
            return null;
         } else {
            if (this.b == null) {
               try {
                  this.b = new ZipFile(this.a);
               } catch (IOException var2) {
                  asm.c.error("Failed to open pack {}", this.a, var2);
                  this.c = true;
                  return null;
               }
            }

            return this.b;
         }
      }

      @Override
      public void close() {
         if (this.b != null) {
            IOUtils.closeQuietly(this.b);
            this.b = null;
         }
      }

      @Override
      protected void finalize() throws Throwable {
         this.close();
         super.finalize();
      }
   }
}
