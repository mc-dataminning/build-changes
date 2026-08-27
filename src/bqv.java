import java.util.EnumSet;

public class bqv extends bqh {
   private final bjv a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public bqv(bjv $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bqh.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fM()) {
         return false;
      } else {
         ehh $$0 = buc.a(this.a, 16, 7, ehh.c(this.a.fN()), (float) (Math.PI / 2));
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
