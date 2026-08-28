import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbb extends cam {
   private final btw a;
   @Nullable
   private btn b;
   private double c;
   private double d;
   private double e;
   private final double f;
   private final float g;

   public cbb(btw $$0, double $$1, float $$2) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.a(EnumSet.of(cam.a.a));
   }

   @Override
   public boolean b() {
      this.b = this.a.p();
      if (this.b == null) {
         return false;
      } else if (this.b.g(this.a) > (double)(this.g * this.g)) {
         return false;
      } else {
         exa $$0 = cej.a(this.a, 16, 7, this.b.dn(), (float) (Math.PI / 2));
         if ($$0 == null) {
            return false;
         } else {
            this.c = $$0.c;
            this.d = $$0.d;
            this.e = $$0.e;
            return true;
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a.N().l() && this.b.bE() && this.b.g(this.a) < (double)(this.g * this.g);
   }

   @Override
   public void e() {
      this.b = null;
   }

   @Override
   public void d() {
      this.a.N().a(this.c, this.d, this.e, this.f);
   }
}
