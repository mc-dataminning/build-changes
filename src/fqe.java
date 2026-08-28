import java.time.Duration;
import javax.annotation.Nullable;

public class fqe {
   @Nullable
   private fqb a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fqb $$0) {
      this.a = $$0;
   }

   @Nullable
   public fqb a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fsx $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && flh.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = af.c();
            }

            this.d = $$3;
         }

         if ($$3 && af.c() - this.c > this.b.toMillis()) {
            fui $$4 = flh.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fwt a(fsx $$0, boolean $$1, boolean $$2) {
      return (fwt)(!$$1 && $$2 && flh.Q().aX().b() ? new fwo($$0) : new fwv($$0));
   }

   public void a(fsn $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
