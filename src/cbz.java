import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbz extends ccc {
   private final bvg a;
   private final Predicate<bvg> b;
   @Nullable
   private bvg c;
   private final double d;
   private final ceq e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public cbz(bvg $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.P();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(ccc.a.a, ccc.a.b));
      if (!($$0.P() instanceof cep) && !($$0.P() instanceof ceo)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean b() {
      List<bvg> $$0 = this.a.dY().a(bvg.class, this.a.cT().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (bvg $$1 : $$0) {
            if (!$$1.cr()) {
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
      this.h = this.a.a(esf.j);
      this.a.a(esf.j, 0.0F);
   }

   @Override
   public void e() {
      this.c = null;
      this.e.o();
      this.a.a(esf.j, this.h);
   }

   @Override
   public void a() {
      if (this.c != null && !this.a.M_()) {
         this.a.K().a(this.c, 10.0F, (float)this.a.ad());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.dD() - this.c.dD();
            double $$1 = this.a.dF() - this.c.dF();
            double $$2 = this.a.dJ() - this.c.dJ();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.o();
               cbe $$4 = this.c.K();
               if ($$3 <= (double)this.g || $$4.e() == this.a.dD() && $$4.f() == this.a.dF() && $$4.g() == this.a.dJ()) {
                  double $$5 = this.c.dD() - this.a.dD();
                  double $$6 = this.c.dJ() - this.a.dJ();
                  this.e.a(this.a.dD() - $$5, this.a.dF(), this.a.dJ() - $$6, this.d);
               }
            }
         }
      }
   }
}
