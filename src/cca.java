import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cca extends ccd {
   private final bvh a;
   private final Predicate<bvh> b;
   @Nullable
   private bvh c;
   private final double d;
   private final cer e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public cca(bvh $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.L();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(ccd.a.a, ccd.a.b));
      if (!($$0.L() instanceof ceq) && !($$0.L() instanceof cep)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean b() {
      List<bvh> $$0 = this.a.dW().a(bvh.class, this.a.cR().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (bvh $$1 : $$0) {
            if (!$$1.cp()) {
               this.c = $$1;
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean c() {
      return this.c != null && !this.e.k() && this.a.g(this.c) > (double)(this.g * this.g);
   }

   @Override
   public void d() {
      this.f = 0;
      this.h = this.a.a(eto.j);
      this.a.a(eto.j, 0.0F);
   }

   @Override
   public void e() {
      this.c = null;
      this.e.m();
      this.a.a(eto.j, this.h);
   }

   @Override
   public void a() {
      if (this.c != null && !this.a.P_()) {
         this.a.H().a(this.c, 10.0F, (float)this.a.aa());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.dB() - this.c.dB();
            double $$1 = this.a.dD() - this.c.dD();
            double $$2 = this.a.dH() - this.c.dH();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.m();
               cbf $$4 = this.c.H();
               if ($$3 <= (double)this.g || $$4.e() == this.a.dB() && $$4.f() == this.a.dD() && $$4.g() == this.a.dH()) {
                  double $$5 = this.c.dB() - this.a.dB();
                  double $$6 = this.c.dH() - this.a.dH();
                  this.e.a(this.a.dB() - $$5, this.a.dD(), this.a.dH() - $$6, this.d);
               }
            }
         }
      }
   }
}
