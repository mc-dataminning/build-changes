import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class caz extends cbc {
   private final buh a;
   private final Predicate<buh> b;
   @Nullable
   private buh c;
   private final double d;
   private final cdq e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public caz(buh $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.P();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(cbc.a.a, cbc.a.b));
      if (!($$0.P() instanceof cdp) && !($$0.P() instanceof cdo)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean b() {
      List<buh> $$0 = this.a.dS().a(buh.class, this.a.cO().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (buh $$1 : $$0) {
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
      this.h = this.a.a(eqs.j);
      this.a.a(eqs.j, 0.0F);
   }

   @Override
   public void e() {
      this.c = null;
      this.e.o();
      this.a.a(eqs.j, this.h);
   }

   @Override
   public void a() {
      if (this.c != null && !this.a.K_()) {
         this.a.K().a(this.c, 10.0F, (float)this.a.ae());
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
               cae $$4 = this.c.K();
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
