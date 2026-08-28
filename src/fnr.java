import java.time.Duration;
import javax.annotation.Nullable;

public class fnr {
   @Nullable
   private fno a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fno $$0) {
      this.a = $$0;
   }

   @Nullable
   public fno a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fql $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fke.Q().aY().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ae.c();
            }

            this.d = $$3;
         }

         if ($$3 && ae.c() - this.c > this.b.toMillis()) {
            frw $$4 = fke.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fuh a(fql $$0, boolean $$1, boolean $$2) {
      return (fuh)(!$$1 && $$2 && fke.Q().aY().b() ? new fuc($$0) : new fuj($$0));
   }

   public void a(fqb $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
