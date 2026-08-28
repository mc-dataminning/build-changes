import java.time.Duration;
import javax.annotation.Nullable;

public class fqg {
   @Nullable
   private fqd a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fqd $$0) {
      this.a = $$0;
   }

   @Nullable
   public fqd a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fsz $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && flj.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = af.c();
            }

            this.d = $$3;
         }

         if ($$3 && af.c() - this.c > this.b.toMillis()) {
            fuk $$4 = flj.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fwv a(fsz $$0, boolean $$1, boolean $$2) {
      return (fwv)(!$$1 && $$2 && flj.Q().aX().b() ? new fwq($$0) : new fwx($$0));
   }

   public void a(fsp $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
