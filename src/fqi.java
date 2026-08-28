import java.time.Duration;
import javax.annotation.Nullable;

public class fqi {
   @Nullable
   private fqf a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fqf $$0) {
      this.a = $$0;
   }

   @Nullable
   public fqf a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, ftb $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && flk.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = af.c();
            }

            this.d = $$3;
         }

         if ($$3 && af.c() - this.c > this.b.toMillis()) {
            fum $$4 = flk.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fwx a(ftb $$0, boolean $$1, boolean $$2) {
      return (fwx)(!$$1 && $$2 && flk.Q().aX().b() ? new fws($$0) : new fwz($$0));
   }

   public void a(fsr $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
