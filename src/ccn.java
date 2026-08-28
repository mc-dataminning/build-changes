import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccn extends cby {
   private final bvi a;
   @Nullable
   private bva b;
   private double c;
   private double d;
   private double e;
   private final double f;
   private final float g;

   public ccn(bvi $$0, double $$1, float $$2) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.a(EnumSet.of(cby.a.a));
   }

   @Override
   public boolean b() {
      this.b = this.a.m();
      if (this.b == null) {
         return false;
      } else if (this.b.g(this.a) > (double)(this.g * this.g)) {
         return false;
      } else {
         ezn $$0 = cfv.a(this.a, 16, 7, this.b.dv(), (float) (Math.PI / 2));
         if ($$0 == null) {
            return false;
         } else {
            this.c = $$0.d;
            this.d = $$0.e;
            this.e = $$0.f;
            return true;
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a.P().m() && this.b.bM() && this.b.g(this.a) < (double)(this.g * this.g);
   }

   @Override
   public void e() {
      this.b = null;
   }

   @Override
   public void d() {
      this.a.P().a(this.c, this.d, this.e, this.f);
   }
}
