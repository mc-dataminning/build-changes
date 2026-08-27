import java.util.EnumSet;
import javax.annotation.Nullable;

public class btq extends btb {
   private final bmo a;
   @Nullable
   private bmf b;
   private double c;
   private double d;
   private double e;
   private final double f;
   private final float g;

   public btq(bmo $$0, double $$1, float $$2) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.a(EnumSet.of(btb.a.a));
   }

   @Override
   public boolean a() {
      this.b = this.a.q();
      if (this.b == null) {
         return false;
      } else if (this.b.f(this.a) > (double)(this.g * this.g)) {
         return false;
      } else {
         elm $$0 = bwx.a(this.a, 16, 7, this.b.dk(), (float) (Math.PI / 2));
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
      return !this.a.N().l() && this.b.bx() && this.b.f(this.a) < (double)(this.g * this.g);
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Override
   public void c() {
      this.a.N().a(this.c, this.d, this.e, this.f);
   }
}
