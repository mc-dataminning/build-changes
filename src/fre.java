import java.time.Duration;
import javax.annotation.Nullable;

public class fre {
   @Nullable
   private frb a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable frb $$0) {
      this.a = $$0;
   }

   @Nullable
   public frb a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, ftx $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fmg.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = af.c();
            }

            this.d = $$3;
         }

         if ($$3 && af.c() - this.c > this.b.toMillis()) {
            fvi $$4 = fmg.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fxt a(ftx $$0, boolean $$1, boolean $$2) {
      return (fxt)(!$$1 && $$2 && fmg.Q().aX().b() ? new fxo($$0) : new fxv($$0));
   }

   public void a(ftn $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
