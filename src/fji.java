import java.time.Duration;
import javax.annotation.Nullable;

public class fji {
   @Nullable
   private fjf a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fjf $$0) {
      this.a = $$0;
   }

   @Nullable
   public fjf a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fma $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && ffw.Q().aU().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.c();
            }

            this.d = $$3;
         }

         if ($$3 && ac.c() - this.c > this.b.toMillis()) {
            fnl $$4 = ffw.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fpv a(fma $$0, boolean $$1, boolean $$2) {
      return (fpv)(!$$1 && $$2 && ffw.Q().aU().b() ? new fpr($$0) : new fpx($$0));
   }

   public void a(flq $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
