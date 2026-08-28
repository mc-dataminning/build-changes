import java.time.Duration;
import javax.annotation.Nullable;

public class ftx {
   @Nullable
   private ftu a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable ftu $$0) {
      this.a = $$0;
   }

   @Nullable
   public ftu a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fwq $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && foz.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = af.c();
            }

            this.d = $$3;
         }

         if ($$3 && af.c() - this.c > this.b.toMillis()) {
            fyb $$4 = foz.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private gao a(fwq $$0, boolean $$1, boolean $$2) {
      return (gao)(!$$1 && $$2 && foz.Q().aX().b() ? new gaj($$0) : new gaq($$0));
   }

   public void a(fwg $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
