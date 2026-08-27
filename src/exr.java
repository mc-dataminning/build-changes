import com.google.common.hash.Hashing;
import javax.annotation.Nullable;

public class exr implements AutoCloseable {
   private static final aey a = new aey("textures/misc/unknown_server.png");
   private static final int b = 64;
   private static final int c = 64;
   private final fzh d;
   private final aey e;
   @Nullable
   private fyt f;
   private boolean g;

   private exr(fzh $$0, aey $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static exr a(fzh $$0, String $$1) {
      return new exr($$0, new aey("minecraft", "worlds/" + ac.a($$1, aey::b) + "/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public static exr b(fzh $$0, String $$1) {
      return new exr($$0, new aey("minecraft", "servers/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public void a(eks $$0) {
      if ($$0.a() == 64 && $$0.b() == 64) {
         try {
            this.c();
            if (this.f == null) {
               this.f = new fyt($$0);
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

   public aey b() {
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
