import com.google.common.hash.Hashing;
import javax.annotation.Nullable;

public class fmt implements AutoCloseable {
   private static final akk a = new akk("textures/misc/unknown_server.png");
   private static final int b = 64;
   private static final int c = 64;
   private final gpp d;
   private final akk e;
   @Nullable
   private gpb f;
   private boolean g;

   private fmt(gpp $$0, akk $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static fmt a(gpp $$0, String $$1) {
      return new fmt($$0, new akk("minecraft", "worlds/" + ac.a($$1, akk::b) + "/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public static fmt b(gpp $$0, String $$1) {
      return new fmt($$0, new akk("minecraft", "servers/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public void a(ezn $$0) {
      if ($$0.a() == 64 && $$0.b() == 64) {
         try {
            this.c();
            if (this.f == null) {
               this.f = new gpb($$0);
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

   public akk b() {
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
