import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byu extends byx {
   private final bsc a;
   private final Predicate<bsc> b;
   @Nullable
   private bsc c;
   private final double d;
   private final cbl e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public byu(bsc $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.K();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(byx.a.a, byx.a.b));
      if (!($$0.K() instanceof cbk) && !($$0.K() instanceof cbj)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean a() {
      List<bsc> $$0 = this.a.dN().a(bsc.class, this.a.cI().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (bsc $$1 : $$0) {
            if (!$$1.cf()) {
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
      this.h = this.a.a(emr.j);
      this.a.a(emr.j, 0.0F);
   }

   @Override
   public void d() {
      this.c = null;
      this.e.n();
      this.a.a(emr.j, this.h);
   }

   @Override
   public void e() {
      if (this.c != null && !this.a.gc()) {
         this.a.G().a(this.c, 10.0F, (float)this.a.Z());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.ds() - this.c.ds();
            double $$1 = this.a.du() - this.c.du();
            double $$2 = this.a.dy() - this.c.dy();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.n();
               bxz $$4 = this.c.G();
               if ($$3 <= (double)this.g || $$4.e() == this.a.ds() && $$4.f() == this.a.du() && $$4.g() == this.a.dy()) {
                  double $$5 = this.c.ds() - this.a.ds();
                  double $$6 = this.c.dy() - this.a.dy();
                  this.e.a(this.a.ds() - $$5, this.a.du(), this.a.dy() - $$6, this.d);
               }
            }
         }
      }
   }
}
