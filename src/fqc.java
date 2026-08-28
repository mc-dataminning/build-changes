import com.google.common.hash.Hashing;
import javax.annotation.Nullable;

public class fqc implements AutoCloseable {
   private static final alh a = alh.b("textures/misc/unknown_server.png");
   private static final int b = 64;
   private static final int c = 64;
   private final gxt d;
   private final alh e;
   @Nullable
   private gxf f;
   private boolean g;

   private fqc(gxt $$0, alh $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static fqc a(gxt $$0, String $$1) {
      return new fqc($$0, alh.b("worlds/" + ad.a($$1, alh::b) + "/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public static fqc b(gxt $$0, String $$1) {
      return new fqc($$0, alh.b("servers/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public void a(fct $$0) {
      if ($$0.a() == 64 && $$0.b() == 64) {
         try {
            this.c();
            if (this.f == null) {
               this.f = new gxf($$0);
            } else {
               this.f.a($$0);
               this.f.e();
            }

            this.d.a(this.e, this.f);
         } catch (Throwable var3) {
            $$0.close();
            this.a();
            throw var3;
         }
      } else {
         $$0.close();
         throw new IllegalArgumentException("Icon must be 64x64, but was " + $$0.a() + "x" + $$0.b());
      }
   }

   public void a() {
      this.c();
      if (this.f != null) {
         this.d.b(this.e);
         this.f.close();
         this.f = null;
      }
   }

   public alh b() {
      return this.f != null ? this.e : a;
   }

   @Override
   public void close() {
      this.a();
      this.g = true;
   }

   private void c() {
      if (this.g) {
         throw new IllegalStateException("Icon already closed");
      }
   }
}
