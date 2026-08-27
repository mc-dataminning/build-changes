import java.time.Duration;
import javax.annotation.Nullable;

public class fav {
   @Nullable
   private fas a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fas $$0) {
      this.a = $$0;
   }

   @Nullable
   public fas a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fdm $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && exh.O().aV().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.b();
            }

            this.d = $$3;
         }

         if ($$3 && ac.b() - this.c > this.b.toMillis()) {
            ffe $$4 = exh.O().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fhx a(fdm $$0, boolean $$1, boolean $$2) {
      return (fhx)(!$$1 && $$2 && exh.O().aV().b() ? new fht($$0) : new fhz($$0));
   }

   public void a(fdc $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
