import java.time.Duration;
import javax.annotation.Nullable;

public class fis {
   @Nullable
   private fip a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fip $$0) {
      this.a = $$0;
   }

   @Nullable
   public fip a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, flk $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fff.Q().aW().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.c();
            }

            this.d = $$3;
         }

         if ($$3 && ac.c() - this.c > this.b.toMillis()) {
            fnd $$4 = fff.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fpw a(flk $$0, boolean $$1, boolean $$2) {
      return (fpw)(!$$1 && $$2 && fff.Q().aW().b() ? new fps($$0) : new fpy($$0));
   }

   public void a(fla $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
