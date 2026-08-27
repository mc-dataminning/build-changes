import java.time.Duration;
import javax.annotation.Nullable;

public class ffm {
   @Nullable
   private ffj a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable ffj $$0) {
      this.a = $$0;
   }

   @Nullable
   public ffj a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fie $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fby.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.b();
            }

            this.d = $$3;
         }

         if ($$3 && ac.b() - this.c > this.b.toMillis()) {
            fjx $$4 = fby.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fmp a(fie $$0, boolean $$1, boolean $$2) {
      return (fmp)(!$$1 && $$2 && fby.Q().aX().b() ? new fml($$0) : new fmr($$0));
   }

   public void a(fhu $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
