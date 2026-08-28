import java.time.Duration;
import javax.annotation.Nullable;

public class fnk {
   @Nullable
   private fnh a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fnh $$0) {
      this.a = $$0;
   }

   @Nullable
   public fnh a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fqe $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fjx.Q().aY().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ae.c();
            }

            this.d = $$3;
         }

         if ($$3 && ae.c() - this.c > this.b.toMillis()) {
            frp $$4 = fjx.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private ftz a(fqe $$0, boolean $$1, boolean $$2) {
      return (ftz)(!$$1 && $$2 && fjx.Q().aY().b() ? new ftu($$0) : new fub($$0));
   }

   public void a(fpu $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
