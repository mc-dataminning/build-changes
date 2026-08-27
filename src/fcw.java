import java.time.Duration;
import javax.annotation.Nullable;

public class fcw {
   @Nullable
   private fct a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fct $$0) {
      this.a = $$0;
   }

   @Nullable
   public fct a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, ffo $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && ezi.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.b();
            }

            this.d = $$3;
         }

         if ($$3 && ac.b() - this.c > this.b.toMillis()) {
            fhh $$4 = ezi.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fka a(ffo $$0, boolean $$1, boolean $$2) {
      return (fka)(!$$1 && $$2 && ezi.Q().aX().b() ? new fjw($$0) : new fkc($$0));
   }

   public void a(ffe $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
