import java.util.EnumSet;

public class bqp extends bqb {
   private final bjp a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public bqp(bjp $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bqb.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fL()) {
         return false;
      } else {
         ehn $$0 = btw.a(this.a, 16, 7, ehn.c(this.a.fM()), (float) (Math.PI / 2));
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
