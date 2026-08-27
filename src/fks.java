import com.mojang.authlib.properties.PropertyMap;
import java.io.File;
import java.net.Proxy;
import java.nio.file.Path;
import javax.annotation.Nullable;

public class fks {
   public final fks.d a;
   public final eqr b;
   public final fks.a c;
   public final fks.b d;
   public final fks.c e;

   public fks(fks.d $$0, eqr $$1, fks.a $$2, fks.b $$3, fks.c $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public static class a {
      public final File a;
      public final File b;
      public final File c;
      @Nullable
      public final String d;

      public a(File $$0, File $$1, File $$2, @Nullable String $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public Path a() {
         return this.d == null ? this.c.toPath() : gho.a(this.c.toPath(), this.d);
      }
   }

   public static class b {
      public final boolean a;
      public final String b;
      public final String c;
      public final boolean d;
      public final boolean e;

      public b(boolean $$0, String $$1, String $$2, boolean $$3, boolean $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }
   }

   public static record c(@Nullable String a, @Nullable String b, @Nullable String c, @Nullable String d) {
      public boolean a() {
         return !ac.b(this.b) || !ac.b(this.c) || !ac.b(this.d);
      }

      @Nullable
      public String b() {
         return this.a;
      }

      @Nullable
      public String c() {
         return this.b;
      }

      @Nullable
      public String d() {
         return this.c;
      }

      @Nullable
      public String e() {
         return this.d;
      }
   }

   public static class d {
      public final exw a;
      public final PropertyMap b;
      public final PropertyMap c;
      public final Proxy d;

      public d(exw $$0, PropertyMap $$1, PropertyMap $$2, Proxy $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }
   }
}
