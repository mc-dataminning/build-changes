import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class csd extends cra implements crj {
   public static final dij d = new dji(true, false, Optional.empty(), mf.e.a(axa.cD).map(Function.identity()));
   public static final double e = 0.25;

   public csd(bwj<? extends csd> $$0, dip $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public csd(bwj<? extends csd> $$0, dip $$1, bwa $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   csd(bwj<? extends csd> $$0, double $$1, double $$2, double $$3, fdw $$4, dip $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected fdr c(fdw $$0) {
      float $$1 = this.aq().n().a() / 2.0F;
      float $$2 = this.aq().n().b();
      float $$3 = 0.15F;
      return new fdr($$0.d - (double)$$1, $$0.e - 0.15F, $$0.f - (double)$$1, $$0.d + (double)$$1, $$0.e - 0.15F + (double)$$2, $$0.f + (double)$$1);
   }

   @Override
   public boolean i(bwa $$0) {
      return $$0 instanceof csd ? false : super.i($$0);
   }

   @Override
   protected boolean b(bwa $$0) {
      if ($$0 instanceof csd) {
         return false;
      } else {
         return $$0.aq() == bwj.R ? false : super.b($$0);
      }
   }

   @Override
   protected void a(fdt $$0) {
      super.a($$0);
      if (this.dV() instanceof aro $$1) {
         bwz $$4 = this.q() instanceof bwz $$3 ? $$3 : null;
         bwa $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         bup $$6 = this.dW().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bwz $$7) {
            dfh.a($$1, (bwa)$$7, $$6);
         }

         this.a(this.dt());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(fdw var1);

   @Override
   protected void a(fds $$0) {
      super.a($$0);
      if (!this.dV().C) {
         jz $$1 = $$0.c().q();
         fdw $$2 = fdw.a($$1).d(0.25, 0.25, 0.25);
         fdw $$3 = $$0.g().e($$2);
         this.a($$3);
         this.at();
      }
   }

   @Override
   protected void a(fdu $$0) {
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
   public cys ae_() {
      return cys.k;
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
