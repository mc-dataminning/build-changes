import java.time.Duration;
import javax.annotation.Nullable;

public class fmn {
   @Nullable
   private fmk a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fmk $$0) {
      this.a = $$0;
   }

   @Nullable
   public fmk a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fph $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fja.Q().aZ().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ad.c();
            }

            this.d = $$3;
         }

         if ($$3 && ad.c() - this.c > this.b.toMillis()) {
            fqs $$4 = fja.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private ftc a(fph $$0, boolean $$1, boolean $$2) {
      return (ftc)(!$$1 && $$2 && fja.Q().aZ().b() ? new fsx($$0) : new fte($$0));
   }

   public void a(fox $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
