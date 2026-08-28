import java.time.Duration;
import javax.annotation.Nullable;

public class fja {
   @Nullable
   private fix a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fix $$0) {
      this.a = $$0;
   }

   @Nullable
   public fix a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fls $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && ffn.Q().aW().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.c();
            }

            this.d = $$3;
         }

         if ($$3 && ac.c() - this.c > this.b.toMillis()) {
            fnd $$4 = ffn.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fpn a(fls $$0, boolean $$1, boolean $$2) {
      return (fpn)(!$$1 && $$2 && ffn.Q().aW().b() ? new fpj($$0) : new fpp($$0));
   }

   public void a(fli $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
