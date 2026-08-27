import java.time.Duration;
import javax.annotation.Nullable;

public class fhn {
   @Nullable
   private fhk a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fhk $$0) {
      this.a = $$0;
   }

   @Nullable
   public fhk a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fkf $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fdz.Q().aY().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.c();
            }

            this.d = $$3;
         }

         if ($$3 && ac.c() - this.c > this.b.toMillis()) {
            fly $$4 = fdz.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private foq a(fkf $$0, boolean $$1, boolean $$2) {
      return (foq)(!$$1 && $$2 && fdz.Q().aY().b() ? new fom($$0) : new fot($$0));
   }

   public void a(fjv $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
