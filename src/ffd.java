import java.time.Duration;
import javax.annotation.Nullable;

public class ffd {
   @Nullable
   private ffa a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable ffa $$0) {
      this.a = $$0;
   }

   @Nullable
   public ffa a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fhv $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fbp.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.b();
            }

            this.d = $$3;
         }

         if ($$3 && ac.b() - this.c > this.b.toMillis()) {
            fjo $$4 = fbp.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fmg a(fhv $$0, boolean $$1, boolean $$2) {
      return (fmg)(!$$1 && $$2 && fbp.Q().aX().b() ? new fmc($$0) : new fmi($$0));
   }

   public void a(fhl $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
