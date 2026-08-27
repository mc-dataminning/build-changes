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

public class aoe extends aoa {
   static final Logger c = LogUtils.getLogger();
   private final aoe.b d;
   private final String e;

   aoe(String $$0, aoe.b $$1, boolean $$2, String $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.e = $$3;
   }

   private static String b(aoh $$0, agt $$1) {
      return String.format(Locale.ROOT, "%s/%s/%s", $$0.a(), $$1.b(), $$1.a());
   }

   @Nullable
   @Override
   public apk<InputStream> a(String... $$0) {
      return this.b(String.join("/", $$0));
   }

   @Override
   public apk<InputStream> a(aoh $$0, agt $$1) {
      return this.b(b($$0, $$1));
   }

   private String a(String $$0) {
      return this.e.isEmpty() ? $$0 : this.e + "/" + $$0;
   }

   @Nullable
   private apk<InputStream> b(String $$0) {
      ZipFile $$1 = this.d.a();
      if ($$1 == null) {
         return null;
      } else {
         ZipEntry $$2 = $$1.getEntry(this.a($$0));
         return $$2 == null ? null : apk.create($$1, $$2);
      }
   }

   @Override
   public Set<String> a(aoh $$0) {
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
               if (agt.h($$7)) {
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
   public void a(aoh $$0, String $$1, String $$2, aog.a $$3) {
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
                  agt $$11 = agt.a($$1, $$10);
                  if ($$11 != null) {
                     $$3.accept($$11, apk.create($$4, $$8));
                  } else {
                     c.warn("Invalid path in datapack: {}:{}, ignoring", $$1, $$10);
                  }
               }
            }
         }
      }
   }

   public static class a implements apa.c {
      private final File a;
      private final boolean b;

      public a(Path $$0, boolean $$1) {
         this($$0.toFile(), $$1);
      }

      public a(File $$0, boolean $$1) {
         this.b = $$1;
         this.a = $$0;
      }

      @Override
      public aog a(String $$0) {
         aoe.b $$1 = new aoe.b(this.a);
         return new aoe($$0, $$1, this.b, "");
      }

      @Override
      public aog a(String $$0, apa.a $$1) {
         aoe.b $$2 = new aoe.b(this.a);
         aog $$3 = new aoe($$0, $$2, this.b, "");
         List<String> $$4 = $$1.d();
         if ($$4.isEmpty()) {
            return $$3;
         } else {
            List<aog> $$5 = new ArrayList<>($$4.size());

            for (String $$6 : $$4) {
               $$5.add(new aoe($$0, $$2, this.b, $$6));
            }

            return new aoc($$3, $$5);
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
                  aoe.c.error("Failed to open pack {}", this.a, var2);
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
