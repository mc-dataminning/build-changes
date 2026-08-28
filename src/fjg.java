import java.time.Duration;
import javax.annotation.Nullable;

public class fjg {
   @Nullable
   private fjd a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fjd $$0) {
      this.a = $$0;
   }

   @Nullable
   public fjd a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fly $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fft.Q().aW().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ac.c();
            }

            this.d = $$3;
         }

         if ($$3 && ac.c() - this.c > this.b.toMillis()) {
            fnj $$4 = fft.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fpt a(fly $$0, boolean $$1, boolean $$2) {
      return (fpt)(!$$1 && $$2 && fft.Q().aW().b() ? new fpp($$0) : new fpv($$0));
   }

   public void a(flo $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
