import java.util.EnumSet;
import javax.annotation.Nullable;

public class bxa extends bwl {
   private final bpw a;
   @Nullable
   private bpo b;
   private double c;
   private double d;
   private double e;
   private final double f;
   private final float g;

   public bxa(bpw $$0, double $$1, float $$2) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.a(EnumSet.of(bwl.a.a));
   }

   @Override
   public boolean a() {
      this.b = this.a.p();
      if (this.b == null) {
         return false;
      } else if (this.b.g(this.a) > (double)(this.g * this.g)) {
         return false;
      } else {
         epr $$0 = cai.a(this.a, 16, 7, this.b.dk(), (float) (Math.PI / 2));
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
      return !this.a.K().l() && this.b.bA() && this.b.g(this.a) < (double)(this.g * this.g);
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
