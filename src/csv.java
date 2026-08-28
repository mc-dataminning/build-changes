import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class csv extends crs implements csb {
   public static final djb d = new dka(true, false, Optional.empty(), mg.e.a(axc.cF).map(Function.identity()));
   public static final double e = 0.25;

   public csv(bwr<? extends csv> $$0, djh $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public csv(bwr<? extends csv> $$0, djh $$1, bwi $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   csv(bwr<? extends csv> $$0, double $$1, double $$2, double $$3, fex $$4, djh $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected fes c(fex $$0) {
      float $$1 = this.an().n().a() / 2.0F;
      float $$2 = this.an().n().b();
      float $$3 = 0.15F;
      return new fes($$0.d - (double)$$1, $$0.e - 0.15F, $$0.f - (double)$$1, $$0.d + (double)$$1, $$0.e - 0.15F + (double)$$2, $$0.f + (double)$$1);
   }

   @Override
   public boolean i(bwi $$0) {
      return $$0 instanceof csv ? false : super.i($$0);
   }

   @Override
   protected boolean b(bwi $$0) {
      if ($$0 instanceof csv) {
         return false;
      } else {
         return $$0.an() == bwr.R ? false : super.b($$0);
      }
   }

   @Override
   protected void a(feu $$0) {
      super.a($$0);
      if (this.dU() instanceof arq $$1) {
         bxj $$4 = this.q() instanceof bxj $$3 ? $$3 : null;
         bwi $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         bux $$6 = this.dV().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bxj $$7) {
            dfz.a($$1, (bwi)$$7, $$6);
         }

         this.a(this.ds());
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(fex var1);

   @Override
   protected void a(fet $$0) {
      super.a($$0);
      if (!this.dU().C) {
         ka $$1 = $$0.c().q();
         fex $$2 = fex.a($$1).d(0.25, 0.25, 0.25);
         fex $$3 = $$0.g().e($$2);
         this.a($$3);
         this.aq();
      }
   }

   @Override
   protected void a(fev $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.aq();
      }
   }

   @Override
   protected boolean g() {
      return false;
   }

   @Override
   public czk f() {
      return czk.k;
   }

   @Override
   protected float m() {
      return 1.0F;
   }

   @Override
   protected float n() {
      return this.m();
   }

   @Nullable
   @Override
   protected lw j() {
      return null;
   }

   @Override
   public void h() {
      if (!this.dU().C && this.dA() > this.dU().ao() + 30) {
         this.a(this.ds());
         this.aq();
      } else {
         super.h();
      }
   }
}
