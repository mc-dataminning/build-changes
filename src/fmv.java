import java.time.Duration;
import javax.annotation.Nullable;

public class fmv {
   @Nullable
   private fms a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fms $$0) {
      this.a = $$0;
   }

   @Nullable
   public fms a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fpp $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fji.Q().aY().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ae.c();
            }

            this.d = $$3;
         }

         if ($$3 && ae.c() - this.c > this.b.toMillis()) {
            fra $$4 = fji.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private ftk a(fpp $$0, boolean $$1, boolean $$2) {
      return (ftk)(!$$1 && $$2 && fji.Q().aY().b() ? new ftf($$0) : new ftm($$0));
   }

   public void a(fpf $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
