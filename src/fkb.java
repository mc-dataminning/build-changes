import java.time.Duration;
import javax.annotation.Nullable;

public class fkb {
   @Nullable
   private fjy a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fjy $$0) {
      this.a = $$0;
   }

   @Nullable
   public fjy a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fmt $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fgj.Q().aY().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ad.b();
            }

            this.d = $$3;
         }

         if ($$3 && ad.b() - this.c > this.b.toMillis()) {
            fon $$4 = fgj.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private frk a(fmt $$0, boolean $$1, boolean $$2) {
      return (frk)(!$$1 && $$2 && fgj.Q().aY().b() ? new frg($$0) : new frm($$0));
   }

   public void a(fmj $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
