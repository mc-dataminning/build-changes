import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cso extends crl implements cru {
   public static final diu d = new djt(true, false, Optional.empty(), mf.e.a(axc.cE).map(Function.identity()));
   public static final double e = 0.25;

   public cso(bwo<? extends cso> $$0, dja $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public cso(bwo<? extends cso> $$0, dja $$1, bwf $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   cso(bwo<? extends cso> $$0, double $$1, double $$2, double $$3, feq $$4, dja $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected fel c(feq $$0) {
      float $$1 = this.aq().n().a() / 2.0F;
      float $$2 = this.aq().n().b();
      float $$3 = 0.15F;
      return new fel($$0.d - (double)$$1, $$0.e - 0.15F, $$0.f - (double)$$1, $$0.d + (double)$$1, $$0.e - 0.15F + (double)$$2, $$0.f + (double)$$1);
   }

   @Override
   public boolean i(bwf $$0) {
      return $$0 instanceof cso ? false : super.i($$0);
   }

   @Override
   protected boolean b(bwf $$0) {
      if ($$0 instanceof cso) {
         return false;
      } else {
         return $$0.aq() == bwo.R ? false : super.b($$0);
      }
   }

   @Override
   protected void a(fen $$0) {
      super.a($$0);
      if (this.dV() instanceof arq $$1) {
         bxe $$4 = this.q() instanceof bxe $$3 ? $$3 : null;
         bwf $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         buu $$6 = this.dW().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bxe $$7) {
            dfs.a($$1, (bwf)$$7, $$6);
         }

         this.a(this.dt());
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(feq var1);

   @Override
   protected void a(fem $$0) {
      super.a($$0);
      if (!this.dV().C) {
         jz $$1 = $$0.c().q();
         feq $$2 = feq.a($$1).d(0.25, 0.25, 0.25);
         feq $$3 = $$0.g().e($$2);
         this.a($$3);
         this.at();
      }
   }

   @Override
   protected void a(feo $$0) {
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
   public czd f() {
      return czd.k;
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
