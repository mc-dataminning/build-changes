import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cqd extends cpc implements cpk {
   public static final dff d = new dgf(true, false, Optional.empty(), lz.e.a(axc.cA).map(Function.identity()));
   public static final double e = 0.25;

   public cqd(bus<? extends cqd> $$0, dfm $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public cqd(bus<? extends cqd> $$0, dfm $$1, bul $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   cqd(bus<? extends cqd> $$0, double $$1, double $$2, double $$3, ezy $$4, dfm $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected ezt ax() {
      float $$0 = this.aq().n().a() / 2.0F;
      float $$1 = this.aq().n().b();
      float $$2 = 0.15F;
      return new ezt(
         this.dt().d - (double)$$0,
         this.dt().e - 0.15F,
         this.dt().f - (double)$$0,
         this.dt().d + (double)$$0,
         this.dt().e - 0.15F + (double)$$1,
         this.dt().f + (double)$$0
      );
   }

   @Override
   public boolean i(bul $$0) {
      return $$0 instanceof cqd ? false : super.i($$0);
   }

   @Override
   protected boolean b(bul $$0) {
      if ($$0 instanceof cqd) {
         return false;
      } else {
         return $$0.aq() == bus.Q ? false : super.b($$0);
      }
   }

   @Override
   protected void a(ezv $$0) {
      super.a($$0);
      if (this.dV() instanceof arp $$1) {
         bvh $$4 = this.p() instanceof bvh $$3 ? $$3 : null;
         bul $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         btb $$6 = this.dW().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bvh $$7) {
            dcf.a($$1, (bul)$$7, $$6);
         }

         this.a(this.dt());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(ezy var1);

   @Override
   protected void a(ezu $$0) {
      super.a($$0);
      if (!this.dV().C) {
         kl $$1 = $$0.c().q();
         ezy $$2 = ezy.a($$1).d(0.25, 0.25, 0.25);
         ezy $$3 = $$0.g().e($$2);
         this.a($$3);
         this.at();
      }
   }

   @Override
   protected void a(ezw $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.at();
      }
   }

   @Override
   protected boolean l() {
      return false;
   }

   @Override
   public cwm j() {
      return cwm.k;
   }

   @Override
   protected float q() {
      return 1.0F;
   }

   @Override
   protected float s() {
      return this.q();
   }

   @Nullable
   @Override
   protected lq n() {
      return null;
   }

   @Override
   public void h() {
      if (!this.dV().C && this.dB() > this.dV().al() + 30) {
         this.a(this.dt());
         this.at();
      } else {
         super.h();
      }
   }
}
