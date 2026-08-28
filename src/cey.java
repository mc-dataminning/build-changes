import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cey extends cfb {
   private final byh a;
   private final Predicate<byh> b;
   @Nullable
   private byh c;
   private final double d;
   private final chp e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public cey(byh $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.N();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(cfb.a.a, cfb.a.b));
      if (!($$0.N() instanceof cho) && !($$0.N() instanceof chn)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean b() {
      List<byh> $$0 = this.a.dV().a(byh.class, this.a.cR().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (byh $$1 : $$0) {
            if (!$$1.co()) {
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
      this.h = this.a.a(eyr.j);
      this.a.a(eyr.j, 0.0F);
   }

   @Override
   public void e() {
      this.c = null;
      this.e.m();
      this.a.a(eyr.j, this.h);
   }

   @Override
   public void a() {
      if (this.c != null && !this.a.Q_()) {
         this.a.I().a(this.c, 10.0F, (float)this.a.ac());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.dA() - this.c.dA();
            double $$1 = this.a.dC() - this.c.dC();
            double $$2 = this.a.dG() - this.c.dG();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.m();
               ced $$4 = this.c.I();
               if ($$3 <= (double)this.g || $$4.e() == this.a.dA() && $$4.f() == this.a.dC() && $$4.g() == this.a.dG()) {
                  double $$5 = this.c.dA() - this.a.dA();
                  double $$6 = this.c.dG() - this.a.dG();
                  this.e.a(this.a.dA() - $$5, this.a.dC(), this.a.dG() - $$6, this.d);
               }
            }
         }
      }
   }
}
