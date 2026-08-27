import java.util.EnumSet;
import javax.annotation.Nullable;

public class cad extends bzo {
   private final bsz a;
   @Nullable
   private bsq b;
   private double c;
   private double d;
   private double e;
   private final double f;
   private final float g;

   public cad(bsz $$0, double $$1, float $$2) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.a(EnumSet.of(bzo.a.a));
   }

   @Override
   public boolean a() {
      this.b = this.a.p();
      if (this.b == null) {
         return false;
      } else if (this.b.g(this.a) > (double)(this.g * this.g)) {
         return false;
      } else {
         eum $$0 = cdl.a(this.a, 16, 7, this.b.dn(), (float) (Math.PI / 2));
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
   public boolean b() {
      return !this.a.K().l() && this.b.bD() && this.b.g(this.a) < (double)(this.g * this.g);
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Override
   public void c() {
      this.a.K().a(this.c, this.d, this.e, this.f);
   }
}
