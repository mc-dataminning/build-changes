import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cpw extends cov implements cpd {
   public static final deu e = new dft(true, false, Optional.empty(), ly.e.a(axa.cA).map(Function.identity()));
   public static final double f = 0.25;

   public cpw(bul<? extends cpw> $$0, dfb $$1) {
      super($$0, $$1);
      this.d = 0.0;
   }

   public cpw(bul<? extends cpw> $$0, dfb $$1, bue $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.d = 0.0;
   }

   cpw(bul<? extends cpw> $$0, double $$1, double $$2, double $$3, ezn $$4, dfb $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.d = 0.0;
   }

   @Override
   protected ezi az() {
      float $$0 = this.ar().n().a() / 2.0F;
      float $$1 = this.ar().n().b();
      float $$2 = 0.15F;
      return new ezi(
         this.dv().d - (double)$$0,
         this.dv().e - 0.15F,
         this.dv().f - (double)$$0,
         this.dv().d + (double)$$0,
         this.dv().e - 0.15F + (double)$$1,
         this.dv().f + (double)$$0
      );
   }

   @Override
   public boolean i(bue $$0) {
      return $$0 instanceof cpw ? false : super.i($$0);
   }

   @Override
   protected boolean b(bue $$0) {
      if ($$0 instanceof cpw) {
         return false;
      } else {
         return $$0.ar() == bul.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(ezk $$0) {
      super.a($$0);
      if (!this.dX().C) {
         bva $$2 = this.s() instanceof bva $$1 ? $$1 : null;
         bue $$3 = $$0.a();
         if ($$2 != null) {
            $$2.B($$3);
         }

         bsu $$4 = this.dY().c(this, $$2);
         if ($$3.a($$4, 1.0F) && $$3 instanceof bva $$5) {
            dbu.a((arn)this.dX(), (bue)$$5, $$4);
         }

         this.a(this.dv());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(ezn var1);

   @Override
   protected void a(ezj $$0) {
      super.a($$0);
      if (!this.dX().C) {
         kl $$1 = $$0.c().q();
         ezn $$2 = ezn.a($$1).d(0.25, 0.25, 0.25);
         ezn $$3 = $$0.g().e($$2);
         this.a($$3);
         this.av();
      }
   }

   @Override
   protected void a(ezl $$0) {
      super.a($$0);
      if (!this.dX().C) {
         this.av();
      }
   }

   @Override
   protected boolean o() {
      return false;
   }

   @Override
   public cwb m() {
      return cwb.k;
   }

   @Override
   protected float t() {
      return 1.0F;
   }

   @Override
   protected float v() {
      return this.t();
   }

   @Nullable
   @Override
   protected lp q() {
      return null;
   }

   @Override
   public void l() {
      if (!this.dX().C && this.dD() > this.dX().al() + 30) {
         this.a(this.dv());
         this.av();
      } else {
         super.l();
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      return false;
   }
}
