import java.time.Duration;
import javax.annotation.Nullable;

public class fpt {
   @Nullable
   private fpq a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fpq $$0) {
      this.a = $$0;
   }

   @Nullable
   public fpq a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fsm $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fmf.Q().aY().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ae.c();
            }

            this.d = $$3;
         }

         if ($$3 && ae.c() - this.c > this.b.toMillis()) {
            ftx $$4 = fmf.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fwi a(fsm $$0, boolean $$1, boolean $$2) {
      return (fwi)(!$$1 && $$2 && fmf.Q().aY().b() ? new fwd($$0) : new fwk($$0));
   }

   public void a(fsc $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
