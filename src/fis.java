import com.google.common.hash.Hashing;
import javax.annotation.Nullable;

public class fis implements AutoCloseable {
   private static final ajt a = new ajt("textures/misc/unknown_server.png");
   private static final int b = 64;
   private static final int c = 64;
   private final glk d;
   private final ajt e;
   @Nullable
   private gkw f;
   private boolean g;

   private fis(glk $$0, ajt $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static fis a(glk $$0, String $$1) {
      return new fis($$0, new ajt("minecraft", "worlds/" + ac.a($$1, ajt::b) + "/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public static fis b(glk $$0, String $$1) {
      return new fis($$0, new ajt("minecraft", "servers/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public void a(evj $$0) {
      if ($$0.a() == 64 && $$0.b() == 64) {
         try {
            this.c();
            if (this.f == null) {
               this.f = new gkw($$0);
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

   public ajt b() {
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
