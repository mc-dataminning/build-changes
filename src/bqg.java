import java.util.EnumSet;

public class bqg extends bps {
   private final bjf a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public bqg(bjf $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bps.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fI()) {
         return false;
      } else {
         ehf $$0 = btn.a(this.a, 16, 7, ehf.c(this.a.fJ()), (float) (Math.PI / 2));
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
      return !this.a.H().l();
   }

   @Override
   public void c() {
      this.a.H().a(this.b, this.c, this.d, this.e);
   }
}
