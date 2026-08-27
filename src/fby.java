import java.time.Duration;
import javax.annotation.Nullable;

public class fby {
   @Nullable
   private fbv a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fbv $$0) {
      this.a = $$0;
   }

   @Nullable
   public fbv a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fep $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && eyk.P().aW().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.b();
            }

            this.d = $$3;
         }

         if ($$3 && ac.b() - this.c > this.b.toMillis()) {
            fgh $$4 = eyk.P().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fja a(fep $$0, boolean $$1, boolean $$2) {
      return (fja)(!$$1 && $$2 && eyk.P().aW().b() ? new fiw($$0) : new fjc($$0));
   }

   public void a(fef $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
