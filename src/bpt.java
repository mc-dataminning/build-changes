import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bpt extends bpw {
   private final bjd a;
   private final Predicate<bjd> b;
   @Nullable
   private bjd c;
   private final double d;
   private final bsk e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public bpt(bjd $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.H();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(bpw.a.a, bpw.a.b));
      if (!($$0.H() instanceof bsj) && !($$0.H() instanceof bsi)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean a() {
      List<bjd> $$0 = this.a.dK().a(bjd.class, this.a.cG().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (bjd $$1 : $$0) {
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
      this.h = this.a.a(eas.j);
      this.a.a(eas.j, 0.0F);
   }

   @Override
   public void d() {
      this.c = null;
      this.e.n();
      this.a.a(eas.j, this.h);
   }

   @Override
   public void e() {
      if (this.c != null && !this.a.fO()) {
         this.a.D().a(this.c, 10.0F, (float)this.a.W());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.dp() - this.c.dp();
            double $$1 = this.a.dr() - this.c.dr();
            double $$2 = this.a.dv() - this.c.dv();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.n();
               boy $$4 = this.c.D();
               if ($$3 <= (double)this.g || $$4.e() == this.a.dp() && $$4.f() == this.a.dr() && $$4.g() == this.a.dv()) {
                  double $$5 = this.c.dp() - this.a.dp();
                  double $$6 = this.c.dv() - this.a.dv();
                  this.e.a(this.a.dp() - $$5, this.a.dr(), this.a.dv() - $$6, this.d);
               }
            }
         }
      }
   }
}
