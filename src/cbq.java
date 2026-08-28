import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbq extends cbt {
   private final bux a;
   private final Predicate<bux> b;
   @Nullable
   private bux c;
   private final double d;
   private final ceh e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public cbq(bux $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.P();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(cbt.a.a, cbt.a.b));
      if (!($$0.P() instanceof ceg) && !($$0.P() instanceof cef)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean b() {
      List<bux> $$0 = this.a.dX().a(bux.class, this.a.cS().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (bux $$1 : $$0) {
            if (!$$1.cq()) {
               this.c = $$1;
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean c() {
      return this.c != null && !this.e.m() && this.a.g(this.c) > (double)(this.g * this.g);
   }

   @Override
   public void d() {
      this.f = 0;
      this.h = this.a.a(erv.j);
      this.a.a(erv.j, 0.0F);
   }

   @Override
   public void e() {
      this.c = null;
      this.e.o();
      this.a.a(erv.j, this.h);
   }

   @Override
   public void a() {
      if (this.c != null && !this.a.M_()) {
         this.a.K().a(this.c, 10.0F, (float)this.a.ad());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.dC() - this.c.dC();
            double $$1 = this.a.dE() - this.c.dE();
            double $$2 = this.a.dI() - this.c.dI();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.o();
               cav $$4 = this.c.K();
               if ($$3 <= (double)this.g || $$4.e() == this.a.dC() && $$4.f() == this.a.dE() && $$4.g() == this.a.dI()) {
                  double $$5 = this.c.dC() - this.a.dC();
                  double $$6 = this.c.dI() - this.a.dI();
                  this.e.a(this.a.dC() - $$5, this.a.dE(), this.a.dI() - $$6, this.d);
               }
            }
         }
      }
   }
}
