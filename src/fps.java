import java.time.Duration;
import javax.annotation.Nullable;

public class fps {
   @Nullable
   private fpp a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fpp $$0) {
      this.a = $$0;
   }

   @Nullable
   public fpp a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fsl $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fme.Q().aY().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ae.c();
            }

            this.d = $$3;
         }

         if ($$3 && ae.c() - this.c > this.b.toMillis()) {
            ftw $$4 = fme.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fwh a(fsl $$0, boolean $$1, boolean $$2) {
      return (fwh)(!$$1 && $$2 && fme.Q().aY().b() ? new fwc($$0) : new fwj($$0));
   }

   public void a(fsb $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
