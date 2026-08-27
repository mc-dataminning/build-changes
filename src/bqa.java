import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bqa extends bqd {
   private final bjk a;
   private final Predicate<bjk> b;
   @Nullable
   private bjk c;
   private final double d;
   private final bsr e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public bqa(bjk $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.L();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(bqd.a.a, bqd.a.b));
      if (!($$0.L() instanceof bsq) && !($$0.L() instanceof bsp)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean a() {
      List<bjk> $$0 = this.a.dL().a(bjk.class, this.a.cG().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (bjk $$1 : $$0) {
            if (!$$1.cd()) {
               this.c = $$1;
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean b() {
      return this.c != null && !this.e.l() && this.a.f(this.c) > (double)(this.g * this.g);
   }

   @Override
   public void c() {
      this.f = 0;
      this.h = this.a.a(eaz.j);
      this.a.a(eaz.j, 0.0F);
   }

   @Override
   public void d() {
      this.c = null;
      this.e.n();
      this.a.a(eaz.j, this.h);
   }

   @Override
   public void e() {
      if (this.c != null && !this.a.fR()) {
         this.a.G().a(this.c, 10.0F, (float)this.a.Y());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.dq() - this.c.dq();
            double $$1 = this.a.ds() - this.c.ds();
            double $$2 = this.a.dw() - this.c.dw();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.n();
               bpf $$4 = this.c.G();
               if ($$3 <= (double)this.g || $$4.e() == this.a.dq() && $$4.f() == this.a.ds() && $$4.g() == this.a.dw()) {
                  double $$5 = this.c.dq() - this.a.dq();
                  double $$6 = this.c.dw() - this.a.dw();
                  this.e.a(this.a.dq() - $$5, this.a.ds(), this.a.dw() - $$6, this.d);
               }
            }
         }
      }
   }
}
