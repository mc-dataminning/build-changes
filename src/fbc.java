import java.time.Duration;
import javax.annotation.Nullable;

public class fbc {
   @Nullable
   private faz a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable faz $$0) {
      this.a = $$0;
   }

   @Nullable
   public faz a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fdt $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && exo.P().aW().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.b();
            }

            this.d = $$3;
         }

         if ($$3 && ac.b() - this.c > this.b.toMillis()) {
            ffl $$4 = exo.P().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fie a(fdt $$0, boolean $$1, boolean $$2) {
      return (fie)(!$$1 && $$2 && exo.P().aW().b() ? new fia($$0) : new fig($$0));
   }

   public void a(fdj $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
