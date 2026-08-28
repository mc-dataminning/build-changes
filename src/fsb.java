import java.time.Duration;
import javax.annotation.Nullable;

public class fsb {
   @Nullable
   private fry a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fry $$0) {
      this.a = $$0;
   }

   @Nullable
   public fry a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fuu $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fnd.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = af.c();
            }

            this.d = $$3;
         }

         if ($$3 && af.c() - this.c > this.b.toMillis()) {
            fwf $$4 = fnd.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fys a(fuu $$0, boolean $$1, boolean $$2) {
      return (fys)(!$$1 && $$2 && fnd.Q().aX().b() ? new fyn($$0) : new fyu($$0));
   }

   public void a(fuk $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
