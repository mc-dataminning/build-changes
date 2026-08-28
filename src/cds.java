import java.util.EnumSet;
import javax.annotation.Nullable;

public class cds extends cdd {
   private final bwn a;
   @Nullable
   private bwf b;
   private double c;
   private double d;
   private double e;
   private final double f;
   private final float g;

   public cds(bwn $$0, double $$1, float $$2) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.a(EnumSet.of(cdd.a.a));
   }

   @Override
   public boolean b() {
      this.b = this.a.O_();
      if (this.b == null) {
         return false;
      } else if (this.b.g(this.a) > (double)(this.g * this.g)) {
         return false;
      } else {
         fbx $$0 = cha.a(this.a, 16, 7, this.b.dt(), (float) (Math.PI / 2));
         if ($$0 == null) {
            return false;
         } else {
            this.c = $$0.d;
            this.d = $$0.e;
            this.e = $$0.f;
            return true;
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a.L().m() && this.b.bL() && this.b.g(this.a) < (double)(this.g * this.g);
   }

   @Override
   public void e() {
      this.b = null;
   }

   @Override
   public void d() {
      this.a.L().a(this.c, this.d, this.e, this.f);
   }
}
