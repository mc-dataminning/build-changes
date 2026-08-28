import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzx extends caa {
   private final bte a;
   private final Predicate<bte> b;
   @Nullable
   private bte c;
   private final double d;
   private final cco e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public bzx(bte $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.J();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(caa.a.a, caa.a.b));
      if (!($$0.J() instanceof ccn) && !($$0.J() instanceof ccm)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean a() {
      List<bte> $$0 = this.a.dR().a(bte.class, this.a.cM().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (bte $$1 : $$0) {
            if (!$$1.cj()) {
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
      this.h = this.a.a(epa.j);
      this.a.a(epa.j, 0.0F);
   }

   @Override
   public void d() {
      this.c = null;
      this.e.n();
      this.a.a(epa.j, this.h);
   }

   @Override
   public void e() {
      if (this.c != null && !this.a.fZ()) {
         this.a.F().a(this.c, 10.0F, (float)this.a.aa());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.dw() - this.c.dw();
            double $$1 = this.a.dy() - this.c.dy();
            double $$2 = this.a.dC() - this.c.dC();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.n();
               bzc $$4 = this.c.F();
               if ($$3 <= (double)this.g || $$4.e() == this.a.dw() && $$4.f() == this.a.dy() && $$4.g() == this.a.dC()) {
                  double $$5 = this.c.dw() - this.a.dw();
                  double $$6 = this.c.dC() - this.a.dC();
                  this.e.a(this.a.dw() - $$5, this.a.dy(), this.a.dC() - $$6, this.d);
               }
            }
         }
      }
   }
}
