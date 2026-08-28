import java.time.Duration;
import javax.annotation.Nullable;

public class fiu {
   @Nullable
   private fir a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fir $$0) {
      this.a = $$0;
   }

   @Nullable
   public fir a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, flm $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && ffh.Q().aW().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.c();
            }

            this.d = $$3;
         }

         if ($$3 && ac.c() - this.c > this.b.toMillis()) {
            fnf $$4 = ffh.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fpy a(flm $$0, boolean $$1, boolean $$2) {
      return (fpy)(!$$1 && $$2 && ffh.Q().aW().b() ? new fpu($$0) : new fqa($$0));
   }

   public void a(flc $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
