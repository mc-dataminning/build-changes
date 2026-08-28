import java.time.Duration;
import javax.annotation.Nullable;

public class fte {
   @Nullable
   private ftb a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable ftb $$0) {
      this.a = $$0;
   }

   @Nullable
   public ftb a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fvx $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fof.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = af.c();
            }

            this.d = $$3;
         }

         if ($$3 && af.c() - this.c > this.b.toMillis()) {
            fxi $$4 = fof.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fzv a(fvx $$0, boolean $$1, boolean $$2) {
      return (fzv)(!$$1 && $$2 && fof.Q().aX().b() ? new fzq($$0) : new fzx($$0));
   }

   public void a(fvn $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
