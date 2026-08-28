import java.util.EnumSet;

public class cdk extends ccw {
   private final bwg a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public cdk(bwg $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(ccw.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.gc()) {
         return false;
      } else {
         fbx $$0 = cgt.a(this.a, 16, 7, fbx.c(this.a.gd()), (float) (Math.PI / 2));
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
