import com.google.common.hash.Hashing;
import javax.annotation.Nullable;

public class flc implements AutoCloseable {
   private static final akm a = new akm("textures/misc/unknown_server.png");
   private static final int b = 64;
   private static final int c = 64;
   private final gnw d;
   private final akm e;
   @Nullable
   private gni f;
   private boolean g;

   private flc(gnw $$0, akm $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static flc a(gnw $$0, String $$1) {
      return new flc($$0, new akm("minecraft", "worlds/" + ac.a($$1, akm::b) + "/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public static flc b(gnw $$0, String $$1) {
      return new flc($$0, new akm("minecraft", "servers/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public void a(ext $$0) {
      if ($$0.a() == 64 && $$0.b() == 64) {
         try {
            this.c();
            if (this.f == null) {
               this.f = new gni($$0);
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

   public akm b() {
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
