import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccc extends ccf {
   private final bvj a;
   private final Predicate<bvj> b;
   @Nullable
   private bvj c;
   private final double d;
   private final cet e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public ccc(bvj $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.L();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(ccf.a.a, ccf.a.b));
      if (!($$0.L() instanceof ces) && !($$0.L() instanceof cer)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean b() {
      List<bvj> $$0 = this.a.dV().a(bvj.class, this.a.cR().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (bvj $$1 : $$0) {
            if (!$$1.cp()) {
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
      this.h = this.a.a(esm.j);
      this.a.a(esm.j, 0.0F);
   }

   @Override
   public void e() {
      this.c = null;
      this.e.o();
      this.a.a(esm.j, this.h);
   }

   @Override
   public void a() {
      if (this.c != null && !this.a.N_()) {
         this.a.H().a(this.c, 10.0F, (float)this.a.Z());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.dA() - this.c.dA();
            double $$1 = this.a.dC() - this.c.dC();
            double $$2 = this.a.dG() - this.c.dG();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.o();
               cbh $$4 = this.c.H();
               if ($$3 <= (double)this.g || $$4.e() == this.a.dA() && $$4.f() == this.a.dC() && $$4.g() == this.a.dG()) {
                  double $$5 = this.c.dA() - this.a.dA();
                  double $$6 = this.c.dG() - this.a.dG();
                  this.e.a(this.a.dA() - $$5, this.a.dC(), this.a.dG() - $$6, this.d);
               }
            }
         }
      }
   }
}
