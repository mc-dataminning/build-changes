import java.util.EnumSet;

public class cby extends cbk {
   private final buv a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public cby(buv $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(cbk.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.fY()) {
         return false;
      } else {
         eyw $$0 = cfh.a(this.a, 16, 7, eyw.c(this.a.fZ()), (float) (Math.PI / 2));
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
