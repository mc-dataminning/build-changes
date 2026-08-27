import java.time.Duration;
import javax.annotation.Nullable;

public class fgi {
   @Nullable
   private fgf a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fgf $$0) {
      this.a = $$0;
   }

   @Nullable
   public fgf a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fja $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fcu.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.b();
            }

            this.d = $$3;
         }

         if ($$3 && ac.b() - this.c > this.b.toMillis()) {
            fkt $$4 = fcu.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fnl a(fja $$0, boolean $$1, boolean $$2) {
      return (fnl)(!$$1 && $$2 && fcu.Q().aX().b() ? new fnh($$0) : new fnn($$0));
   }

   public void a(fiq $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
