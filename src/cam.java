import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cam extends cap {
   private final btt a;
   private final Predicate<btt> b;
   @Nullable
   private btt c;
   private final double d;
   private final cdd e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public cam(btt $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.K();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(cap.a.a, cap.a.b));
      if (!($$0.K() instanceof cdc) && !($$0.K() instanceof cdb)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean a() {
      List<btt> $$0 = this.a.dP().a(btt.class, this.a.cK().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (btt $$1 : $$0) {
            if (!$$1.ch()) {
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
      this.h = this.a.a(eoo.j);
      this.a.a(eoo.j, 0.0F);
   }

   @Override
   public void d() {
      this.c = null;
      this.e.n();
      this.a.a(eoo.j, this.h);
   }

   @Override
   public void e() {
      if (this.c != null && !this.a.gd()) {
         this.a.G().a(this.c, 10.0F, (float)this.a.aa());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.du() - this.c.du();
            double $$1 = this.a.dw() - this.c.dw();
            double $$2 = this.a.dA() - this.c.dA();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.n();
               bzr $$4 = this.c.G();
               if ($$3 <= (double)this.g || $$4.e() == this.a.du() && $$4.f() == this.a.dw() && $$4.g() == this.a.dA()) {
                  double $$5 = this.c.du() - this.a.du();
                  double $$6 = this.c.dA() - this.a.dA();
                  this.e.a(this.a.du() - $$5, this.a.dw(), this.a.dA() - $$6, this.d);
               }
            }
         }
      }
   }
}
