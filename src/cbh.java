import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbh extends cbk {
   private final bup a;
   private final Predicate<bup> b;
   @Nullable
   private bup c;
   private final double d;
   private final cdy e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public cbh(bup $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.P();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(cbk.a.a, cbk.a.b));
      if (!($$0.P() instanceof cdx) && !($$0.P() instanceof cdw)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean b() {
      List<bup> $$0 = this.a.dS().a(bup.class, this.a.cO().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (bup $$1 : $$0) {
            if (!$$1.cm()) {
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
      this.h = this.a.a(erk.j);
      this.a.a(erk.j, 0.0F);
   }

   @Override
   public void e() {
      this.c = null;
      this.e.o();
      this.a.a(erk.j, this.h);
   }

   @Override
   public void a() {
      if (this.c != null && !this.a.L_()) {
         this.a.K().a(this.c, 10.0F, (float)this.a.ad());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.dx() - this.c.dx();
            double $$1 = this.a.dz() - this.c.dz();
            double $$2 = this.a.dD() - this.c.dD();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.o();
               cam $$4 = this.c.K();
               if ($$3 <= (double)this.g || $$4.e() == this.a.dx() && $$4.f() == this.a.dz() && $$4.g() == this.a.dD()) {
                  double $$5 = this.c.dx() - this.a.dx();
                  double $$6 = this.c.dD() - this.a.dD();
                  this.e.a(this.a.dx() - $$5, this.a.dz(), this.a.dD() - $$6, this.d);
               }
            }
         }
      }
   }
}
