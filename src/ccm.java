import java.util.EnumSet;

public class ccm extends cby {
   private final bvi a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public ccm(bvi $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(cby.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.gc()) {
         return false;
      } else {
         ezn $$0 = cfv.a(this.a, 16, 7, ezn.c(this.a.gd()), (float) (Math.PI / 2));
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.d;
            this.c = $$0.e;
            this.d = $$0.f;
            return true;
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a.P().m();
   }

   @Override
   public void d() {
      this.a.P().a(this.b, this.c, this.d, this.e);
   }
}
