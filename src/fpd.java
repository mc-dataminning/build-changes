import com.google.common.hash.Hashing;
import javax.annotation.Nullable;

public class fpd implements AutoCloseable {
   private static final alb a = alb.b("textures/misc/unknown_server.png");
   private static final int b = 64;
   private static final int c = 64;
   private final gwl d;
   private final alb e;
   @Nullable
   private gvx f;
   private boolean g;

   private fpd(gwl $$0, alb $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static fpd a(gwl $$0, String $$1) {
      return new fpd($$0, alb.b("worlds/" + ad.a($$1, alb::b) + "/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public static fpd b(gwl $$0, String $$1) {
      return new fpd($$0, alb.b("servers/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public void a(fbp $$0) {
      if ($$0.a() == 64 && $$0.b() == 64) {
         try {
            this.c();
            if (this.f == null) {
               this.f = new gvx($$0);
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
         this.d.c(this.e);
         this.f.close();
         this.f = null;
      }
   }

   public alb b() {
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
