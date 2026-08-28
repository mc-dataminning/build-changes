import java.util.EnumSet;

public class cba extends cam {
   private final btx a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public cba(btx $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(cam.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fX()) {
         return false;
      } else {
         evq $$0 = cej.a(this.a, 16, 7, evq.c(this.a.fY()), (float) (Math.PI / 2));
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
