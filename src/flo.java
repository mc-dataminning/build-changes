import java.time.Duration;
import javax.annotation.Nullable;

public class flo {
   @Nullable
   private fll a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fll $$0) {
      this.a = $$0;
   }

   @Nullable
   public fll a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, foh $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fib.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ad.c();
            }

            this.d = $$3;
         }

         if ($$3 && ad.c() - this.c > this.b.toMillis()) {
            fpt $$4 = fib.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fsd a(foh $$0, boolean $$1, boolean $$2) {
      return (fsd)(!$$1 && $$2 && fib.Q().aX().b() ? new fry($$0) : new fsf($$0));
   }

   public void a(fnx $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
