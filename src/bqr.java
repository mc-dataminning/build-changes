import java.util.EnumSet;

public class bqr extends bqd {
   private final bjr a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public bqr(bjr $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bqd.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fL()) {
         return false;
      } else {
         ehp $$0 = bty.a(this.a, 16, 7, ehp.c(this.a.fM()), (float) (Math.PI / 2));
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.c;
            this.c = $$0.d;
            this.d = $$0.e;
            return true;
         }
      }
   }

   @Override
   public boolean b() {
      return !this.a.L().l();
   }

   @Override
   public void c() {
      this.a.L().a(this.b, this.c, this.d, this.e);
   }
}
