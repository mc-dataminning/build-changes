import java.time.Duration;
import javax.annotation.Nullable;

public class fpn {
   @Nullable
   private fpk a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fpk $$0) {
      this.a = $$0;
   }

   @Nullable
   public fpk a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fsg $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && flz.Q().aY().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ae.c();
            }

            this.d = $$3;
         }

         if ($$3 && ae.c() - this.c > this.b.toMillis()) {
            ftr $$4 = flz.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fwc a(fsg $$0, boolean $$1, boolean $$2) {
      return (fwc)(!$$1 && $$2 && flz.Q().aY().b() ? new fvx($$0) : new fwe($$0));
   }

   public void a(frw $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
