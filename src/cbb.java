import java.util.EnumSet;

public class cbb extends can {
   private final bty a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public cbb(bty $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(can.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fX()) {
         return false;
      } else {
         evr $$0 = cek.a(this.a, 16, 7, evr.c(this.a.fY()), (float) (Math.PI / 2));
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
      return !this.a.K().l();
   }

   @Override
   public void c() {
      this.a.K().a(this.b, this.c, this.d, this.e);
   }
}
