import java.util.EnumSet;

public class ceo extends cea {
   private final bxm a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public ceo(bxm $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(cea.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.gb()) {
         return false;
      } else {
         feq $$0 = chx.a(this.a, 16, 7, feq.c(this.a.gc()), (float) (Math.PI / 2));
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
      return !this.a.O().k();
   }

   @Override
   public void d() {
      this.a.O().a(this.b, this.c, this.d, this.e);
   }
}
