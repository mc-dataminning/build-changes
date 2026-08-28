import java.time.Duration;
import javax.annotation.Nullable;

public class fmc {
   @Nullable
   private flz a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable flz $$0) {
      this.a = $$0;
   }

   @Nullable
   public flz a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fow $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fip.Q().aY().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ad.c();
            }

            this.d = $$3;
         }

         if ($$3 && ad.c() - this.c > this.b.toMillis()) {
            fqh $$4 = fip.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fsr a(fow $$0, boolean $$1, boolean $$2) {
      return (fsr)(!$$1 && $$2 && fip.Q().aY().b() ? new fsm($$0) : new fst($$0));
   }

   public void a(fol $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
