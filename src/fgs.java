import java.time.Duration;
import javax.annotation.Nullable;

public class fgs {
   @Nullable
   private fgp a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fgp $$0) {
      this.a = $$0;
   }

   @Nullable
   public fgp a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fjk $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fde.Q().aY().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.b();
            }

            this.d = $$3;
         }

         if ($$3 && ac.b() - this.c > this.b.toMillis()) {
            fld $$4 = fde.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fnv a(fjk $$0, boolean $$1, boolean $$2) {
      return (fnv)(!$$1 && $$2 && fde.Q().aY().b() ? new fnr($$0) : new fnx($$0));
   }

   public void a(fja $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
