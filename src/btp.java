import java.util.EnumSet;

public class btp extends btb {
   private final bmo a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public btp(bmo $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(btb.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fM()) {
         return false;
      } else {
         elm $$0 = bwx.a(this.a, 16, 7, elm.c(this.a.fN()), (float) (Math.PI / 2));
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
      return !this.a.N().l();
   }

   @Override
   public void c() {
      this.a.N().a(this.b, this.c, this.d, this.e);
   }
}
