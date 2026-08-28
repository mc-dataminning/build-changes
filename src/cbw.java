import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbw extends cbh {
   private final bus a;
   @Nullable
   private buk b;
   private double c;
   private double d;
   private double e;
   private final double f;
   private final float g;

   public cbw(bus $$0, double $$1, float $$2) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.a(EnumSet.of(cbh.a.a));
   }

   @Override
   public boolean b() {
      this.b = this.a.m();
      if (this.b == null) {
         return false;
      } else if (this.b.g(this.a) > (double)(this.g * this.g)) {
         return false;
      } else {
         eys $$0 = cfe.a(this.a, 16, 7, this.b.dq(), (float) (Math.PI / 2));
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
      return !this.a.P().m() && this.b.bI() && this.b.g(this.a) < (double)(this.g * this.g);
   }

   @Override
   public void e() {
      this.b = null;
   }

   @Override
   public void d() {
      this.a.P().a(this.c, this.d, this.e, this.f);
   }
}
