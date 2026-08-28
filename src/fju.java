import java.time.Duration;
import javax.annotation.Nullable;

public class fju {
   @Nullable
   private fjr a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fjr $$0) {
      this.a = $$0;
   }

   @Nullable
   public fjr a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fmm $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fgi.Q().aU().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ad.c();
            }

            this.d = $$3;
         }

         if ($$3 && ad.c() - this.c > this.b.toMillis()) {
            fnx $$4 = fgi.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fqi a(fmm $$0, boolean $$1, boolean $$2) {
      return (fqi)(!$$1 && $$2 && fgi.Q().aU().b() ? new fqd($$0) : new fqk($$0));
   }

   public void a(fmc $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
