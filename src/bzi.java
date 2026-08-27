import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzi extends bzl {
   private final bsq a;
   private final Predicate<bsq> b;
   @Nullable
   private bsq c;
   private final double d;
   private final cbz e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public bzi(bsq $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.J();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(bzl.a.a, bzl.a.b));
      if (!($$0.J() instanceof cby) && !($$0.J() instanceof cbx)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean a() {
      List<bsq> $$0 = this.a.dU().a(bsq.class, this.a.cP().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (bsq $$1 : $$0) {
            if (!$$1.cm()) {
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
      this.h = this.a.a(epv.j);
      this.a.a(epv.j, 0.0F);
   }

   @Override
   public void d() {
      this.c = null;
      this.e.n();
      this.a.a(epv.j, this.h);
   }

   @Override
   public void e() {
      if (this.c != null && !this.a.gl()) {
         this.a.F().a(this.c, 10.0F, (float)this.a.Z());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.dz() - this.c.dz();
            double $$1 = this.a.dB() - this.c.dB();
            double $$2 = this.a.dF() - this.c.dF();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.n();
               byn $$4 = this.c.F();
               if ($$3 <= (double)this.g || $$4.e() == this.a.dz() && $$4.f() == this.a.dB() && $$4.g() == this.a.dF()) {
                  double $$5 = this.c.dz() - this.a.dz();
                  double $$6 = this.c.dF() - this.a.dF();
                  this.e.a(this.a.dz() - $$5, this.a.dB(), this.a.dF() - $$6, this.d);
               }
            }
         }
      }
   }
}
