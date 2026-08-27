import java.time.Duration;
import javax.annotation.Nullable;

public class fcu {
   @Nullable
   private fcr a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fcr $$0) {
      this.a = $$0;
   }

   @Nullable
   public fcr a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, ffm $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && ezg.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.b();
            }

            this.d = $$3;
         }

         if ($$3 && ac.b() - this.c > this.b.toMillis()) {
            fhf $$4 = ezg.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fjy a(ffm $$0, boolean $$1, boolean $$2) {
      return (fjy)(!$$1 && $$2 && ezg.Q().aX().b() ? new fju($$0) : new fka($$0));
   }

   public void a(ffc $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
