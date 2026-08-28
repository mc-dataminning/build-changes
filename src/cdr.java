import java.util.EnumSet;

public class cdr extends cdd {
   private final bwn a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public cdr(bwn $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(cdd.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.ak()) {
         return false;
      } else {
         fbx $$0 = cha.a(this.a, 16, 7, fbx.c(this.a.fX()), (float) (Math.PI / 2));
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
      return !this.a.L().m();
   }

   @Override
   public void d() {
      this.a.L().a(this.b, this.c, this.d, this.e);
   }
}
