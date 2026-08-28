import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class csj extends crg implements crp {
   public static final dip d = new djo(true, false, Optional.empty(), mf.e.a(axc.cD).map(Function.identity()));
   public static final double e = 0.25;

   public csj(bwm<? extends csj> $$0, div $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public csj(bwm<? extends csj> $$0, div $$1, bwd $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   csj(bwm<? extends csj> $$0, double $$1, double $$2, double $$3, fei $$4, div $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected fed c(fei $$0) {
      float $$1 = this.aq().n().a() / 2.0F;
      float $$2 = this.aq().n().b();
      float $$3 = 0.15F;
      return new fed($$0.d - (double)$$1, $$0.e - 0.15F, $$0.f - (double)$$1, $$0.d + (double)$$1, $$0.e - 0.15F + (double)$$2, $$0.f + (double)$$1);
   }

   @Override
   public boolean i(bwd $$0) {
      return $$0 instanceof csj ? false : super.i($$0);
   }

   @Override
   protected boolean b(bwd $$0) {
      if ($$0 instanceof csj) {
         return false;
      } else {
         return $$0.aq() == bwm.R ? false : super.b($$0);
      }
   }

   @Override
   protected void a(fef $$0) {
      super.a($$0);
      if (this.dV() instanceof arq $$1) {
         bxc $$4 = this.q() instanceof bxc $$3 ? $$3 : null;
         bwd $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         bus $$6 = this.dW().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bxc $$7) {
            dfn.a($$1, (bwd)$$7, $$6);
         }

         this.a(this.dt());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(fei var1);

   @Override
   protected void a(fee $$0) {
      super.a($$0);
      if (!this.dV().C) {
         jz $$1 = $$0.c().q();
         fei $$2 = fei.a($$1).d(0.25, 0.25, 0.25);
         fei $$3 = $$0.g().e($$2);
         this.a($$3);
         this.at();
      }
   }

   @Override
   protected void a(feg $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.at();
      }
   }

   @Override
   protected boolean g() {
      return false;
   }

   @Override
   public cyy f() {
      return cyy.k;
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
   protected lv j() {
      return null;
   }

   @Override
   public void h() {
      if (!this.dV().C && this.dB() > this.dV().ao() + 30) {
         this.a(this.dt());
         this.at();
      } else {
         super.h();
      }
   }
}
