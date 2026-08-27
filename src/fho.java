import java.time.Duration;
import javax.annotation.Nullable;

public class fho {
   @Nullable
   private fhl a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fhl $$0) {
      this.a = $$0;
   }

   @Nullable
   public fhl a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fkg $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && feb.Q().aW().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.c();
            }

            this.d = $$3;
         }

         if ($$3 && ac.c() - this.c > this.b.toMillis()) {
            flz $$4 = feb.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fos a(fkg $$0, boolean $$1, boolean $$2) {
      return (fos)(!$$1 && $$2 && feb.Q().aW().b() ? new fon($$0) : new fou($$0));
   }

   public void a(fjw $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
