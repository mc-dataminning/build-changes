import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzw extends bzz {
   private final btd a;
   private final Predicate<btd> b;
   @Nullable
   private btd c;
   private final double d;
   private final ccn e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public bzw(btd $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.K();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(bzz.a.a, bzz.a.b));
      if (!($$0.K() instanceof ccm) && !($$0.K() instanceof ccl)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean a() {
      List<btd> $$0 = this.a.dQ().a(btd.class, this.a.cL().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (btd $$1 : $$0) {
            if (!$$1.ci()) {
               this.c = $$1;
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean b() {
      return this.c != null && !this.e.l() && this.a.g(this.c) > (double)(this.g * this.g);
   }

   @Override
   public void c() {
      this.f = 0;
      this.h = this.a.a(eoy.j);
      this.a.a(eoy.j, 0.0F);
   }

   @Override
   public void d() {
      this.c = null;
      this.e.n();
      this.a.a(eoy.j, this.h);
   }

   @Override
   public void e() {
      if (this.c != null && !this.a.ga()) {
         this.a.G().a(this.c, 10.0F, (float)this.a.aa());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.dv() - this.c.dv();
            double $$1 = this.a.dx() - this.c.dx();
            double $$2 = this.a.dB() - this.c.dB();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.n();
               bzb $$4 = this.c.G();
               if ($$3 <= (double)this.g || $$4.e() == this.a.dv() && $$4.f() == this.a.dx() && $$4.g() == this.a.dB()) {
                  double $$5 = this.c.dv() - this.a.dv();
                  double $$6 = this.c.dB() - this.a.dB();
                  this.e.a(this.a.dv() - $$5, this.a.dx(), this.a.dB() - $$6, this.d);
               }
            }
         }
      }
   }
}
