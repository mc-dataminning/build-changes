import java.time.Duration;
import javax.annotation.Nullable;

public class fiq {
   @Nullable
   private fin a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fin $$0) {
      this.a = $$0;
   }

   @Nullable
   public fin a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fli $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && ffd.Q().aW().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.c();
            }

            this.d = $$3;
         }

         if ($$3 && ac.c() - this.c > this.b.toMillis()) {
            fnb $$4 = ffd.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fpu a(fli $$0, boolean $$1, boolean $$2) {
      return (fpu)(!$$1 && $$2 && ffd.Q().aW().b() ? new fpq($$0) : new fpw($$0));
   }

   public void a(fky $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
