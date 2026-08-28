import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class crr extends cqq implements cqy {
   public static final dhj d = new dii(true, false, Optional.empty(), md.e.a(awz.cD).map(Function.identity()));
   public static final double e = 0.25;

   public crr(bwb<? extends crr> $$0, dhp $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public crr(bwb<? extends crr> $$0, dhp $$1, bvs $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   crr(bwb<? extends crr> $$0, double $$1, double $$2, double $$3, fcu $$4, dhp $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected fcp c(fcu $$0) {
      float $$1 = this.aq().n().a() / 2.0F;
      float $$2 = this.aq().n().b();
      float $$3 = 0.15F;
      return new fcp($$0.d - (double)$$1, $$0.e - 0.15F, $$0.f - (double)$$1, $$0.d + (double)$$1, $$0.e - 0.15F + (double)$$2, $$0.f + (double)$$1);
   }

   @Override
   public boolean i(bvs $$0) {
      return $$0 instanceof crr ? false : super.i($$0);
   }

   @Override
   protected boolean b(bvs $$0) {
      if ($$0 instanceof crr) {
         return false;
      } else {
         return $$0.aq() == bwb.R ? false : super.b($$0);
      }
   }

   @Override
   protected void a(fcr $$0) {
      super.a($$0);
      if (this.dV() instanceof arn $$1) {
         bwr $$4 = this.q() instanceof bwr $$3 ? $$3 : null;
         bvs $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         buh $$6 = this.dW().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bwr $$7) {
            dej.a($$1, (bvs)$$7, $$6);
         }

         this.a(this.dt());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(fcu var1);

   @Override
   protected void a(fcq $$0) {
      super.a($$0);
      if (!this.dV().C) {
         kn $$1 = $$0.c().q();
         fcu $$2 = fcu.a($$1).d(0.25, 0.25, 0.25);
         fcu $$3 = $$0.g().e($$2);
         this.a($$3);
         this.at();
      }
   }

   @Override
   protected void a(fcs $$0) {
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
   public cxy f() {
      return cxy.k;
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
   protected lt j() {
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
