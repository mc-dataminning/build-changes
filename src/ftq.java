import java.time.Duration;
import javax.annotation.Nullable;

public class ftq {
   @Nullable
   private ftn a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable ftn $$0) {
      this.a = $$0;
   }

   @Nullable
   public ftn a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fwj $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fos.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = af.c();
            }

            this.d = $$3;
         }

         if ($$3 && af.c() - this.c > this.b.toMillis()) {
            fxu $$4 = fos.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private gah a(fwj $$0, boolean $$1, boolean $$2) {
      return (gah)(!$$1 && $$2 && fos.Q().aX().b() ? new gac($$0) : new gaj($$0));
   }

   public void a(fvz $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
