import java.time.Duration;
import javax.annotation.Nullable;

public class fin {
   @Nullable
   private fik a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fik $$0) {
      this.a = $$0;
   }

   @Nullable
   public fik a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, flf $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && ffa.Q().aW().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.c();
            }

            this.d = $$3;
         }

         if ($$3 && ac.c() - this.c > this.b.toMillis()) {
            fmy $$4 = ffa.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fpr a(flf $$0, boolean $$1, boolean $$2) {
      return (fpr)(!$$1 && $$2 && ffa.Q().aW().b() ? new fpn($$0) : new fpt($$0));
   }

   public void a(fkv $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
