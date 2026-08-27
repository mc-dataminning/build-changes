import com.google.common.hash.Hashing;
import javax.annotation.Nullable;

public class fae implements AutoCloseable {
   private static final agm a = new agm("textures/misc/unknown_server.png");
   private static final int b = 64;
   private static final int c = 64;
   private final gca d;
   private final agm e;
   @Nullable
   private gbm f;
   private boolean g;

   private fae(gca $$0, agm $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static fae a(gca $$0, String $$1) {
      return new fae($$0, new agm("minecraft", "worlds/" + ac.a($$1, agm::b) + "/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public static fae b(gca $$0, String $$1) {
      return new fae($$0, new agm("minecraft", "servers/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public void a(enc $$0) {
      if ($$0.a() == 64 && $$0.b() == 64) {
         try {
            this.c();
            if (this.f == null) {
               this.f = new gbm($$0);
            } else {
               this.f.a($$0);
               this.f.d();
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

   public agm b() {
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
