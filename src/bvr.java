import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvr extends bvu {
   private final boz a;
   private final Predicate<boz> b;
   @Nullable
   private boz c;
   private final double d;
   private final byi e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public bvr(boz $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.N();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(bvu.a.a, bvu.a.b));
      if (!($$0.N() instanceof byh) && !($$0.N() instanceof byg)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean a() {
      List<boz> $$0 = this.a.dJ().a(boz.class, this.a.cE().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (boz $$1 : $$0) {
            if (!$$1.cb()) {
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
      this.h = this.a.a(eic.j);
      this.a.a(eic.j, 0.0F);
   }

   @Override
   public void d() {
      this.c = null;
      this.e.n();
      this.a.a(eic.j, this.h);
   }

   @Override
   public void e() {
      if (this.c != null && !this.a.fZ()) {
         this.a.I().a(this.c, 10.0F, (float)this.a.ab());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.do() - this.c.do();
            double $$1 = this.a.dq() - this.c.dq();
            double $$2 = this.a.du() - this.c.du();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.n();
               buw $$4 = this.c.I();
               if ($$3 <= (double)this.g || $$4.e() == this.a.do() && $$4.f() == this.a.dq() && $$4.g() == this.a.du()) {
                  double $$5 = this.c.do() - this.a.do();
                  double $$6 = this.c.du() - this.a.du();
                  this.e.a(this.a.do() - $$5, this.a.dq(), this.a.du() - $$6, this.d);
               }
            }
         }
      }
   }
}
