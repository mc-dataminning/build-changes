import java.time.Duration;
import javax.annotation.Nullable;

public class fpu {
   @Nullable
   private fpr a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fpr $$0) {
      this.a = $$0;
   }

   @Nullable
   public fpr a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fsn $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fmg.Q().aY().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ae.c();
            }

            this.d = $$3;
         }

         if ($$3 && ae.c() - this.c > this.b.toMillis()) {
            fty $$4 = fmg.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fwj a(fsn $$0, boolean $$1, boolean $$2) {
      return (fwj)(!$$1 && $$2 && fmg.Q().aY().b() ? new fwe($$0) : new fwl($$0));
   }

   public void a(fsd $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
