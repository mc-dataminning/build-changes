import java.time.Duration;
import javax.annotation.Nullable;

public class fir {
   @Nullable
   private fio a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fio $$0) {
      this.a = $$0;
   }

   @Nullable
   public fio a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, flj $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && ffe.Q().aW().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.c();
            }

            this.d = $$3;
         }

         if ($$3 && ac.c() - this.c > this.b.toMillis()) {
            fnc $$4 = ffe.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fpv a(flj $$0, boolean $$1, boolean $$2) {
      return (fpv)(!$$1 && $$2 && ffe.Q().aW().b() ? new fpr($$0) : new fpx($$0));
   }

   public void a(fkz $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
