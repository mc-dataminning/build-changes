import java.time.Duration;
import javax.annotation.Nullable;

public class fit {
   @Nullable
   private fiq a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fiq $$0) {
      this.a = $$0;
   }

   @Nullable
   public fiq a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fll $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && ffg.Q().aW().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.c();
            }

            this.d = $$3;
         }

         if ($$3 && ac.c() - this.c > this.b.toMillis()) {
            fne $$4 = ffg.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fpx a(fll $$0, boolean $$1, boolean $$2) {
      return (fpx)(!$$1 && $$2 && ffg.Q().aW().b() ? new fpt($$0) : new fpz($$0));
   }

   public void a(flb $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
