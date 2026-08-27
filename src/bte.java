import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bte extends bth {
   private final bmn a;
   private final Predicate<bmn> b;
   @Nullable
   private bmn c;
   private final double d;
   private final bvv e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public bte(bmn $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.N();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(bth.a.a, bth.a.b));
      if (!($$0.N() instanceof bvu) && !($$0.N() instanceof bvt)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean a() {
      List<bmn> $$0 = this.a.dM().a(bmn.class, this.a.cH().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (bmn $$1 : $$0) {
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
      this.h = this.a.a(efc.j);
      this.a.a(efc.j, 0.0F);
   }

   @Override
   public void d() {
      this.c = null;
      this.e.n();
      this.a.a(efc.j, this.h);
   }

   @Override
   public void e() {
      if (this.c != null && !this.a.fS()) {
         this.a.I().a(this.c, 10.0F, (float)this.a.aa());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.dr() - this.c.dr();
            double $$1 = this.a.dt() - this.c.dt();
            double $$2 = this.a.dx() - this.c.dx();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.n();
               bsj $$4 = this.c.I();
               if ($$3 <= (double)this.g || $$4.e() == this.a.dr() && $$4.f() == this.a.dt() && $$4.g() == this.a.dx()) {
                  double $$5 = this.c.dr() - this.a.dr();
                  double $$6 = this.c.dx() - this.a.dx();
                  this.e.a(this.a.dr() - $$5, this.a.dt(), this.a.dx() - $$6, this.d);
               }
            }
         }
      }
   }
}
