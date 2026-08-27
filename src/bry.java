import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bry extends bsb {
   private final bli a;
   private final Predicate<bli> b;
   @Nullable
   private bli c;
   private final double d;
   private final bup e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public bry(bli $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.N();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(bsb.a.a, bsb.a.b));
      if (!($$0.N() instanceof buo) && !($$0.N() instanceof bun)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean a() {
      List<bli> $$0 = this.a.dN().a(bli.class, this.a.cH().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (bli $$1 : $$0) {
            if (!$$1.ce()) {
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
      this.h = this.a.a(edd.j);
      this.a.a(edd.j, 0.0F);
   }

   @Override
   public void d() {
      this.c = null;
      this.e.n();
      this.a.a(edd.j, this.h);
   }

   @Override
   public void e() {
      if (this.c != null && !this.a.fT()) {
         this.a.I().a(this.c, 10.0F, (float)this.a.aa());
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
               brd $$4 = this.c.I();
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
