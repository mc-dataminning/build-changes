import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cqx extends cpw implements cqe {
   public static final dgs d = new dhs(true, false, Optional.empty(), ma.e.a(axk.cB).map(Function.identity()));
   public static final double e = 0.25;

   public cqx(bvi<? extends cqx> $$0, dgz $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public cqx(bvi<? extends cqx> $$0, dgz $$1, bvb $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   cqx(bvi<? extends cqx> $$0, double $$1, double $$2, double $$3, fbr $$4, dgz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected fbm ax() {
      float $$0 = this.aq().n().a() / 2.0F;
      float $$1 = this.aq().n().b();
      float $$2 = 0.15F;
      return new fbm(
         this.du().d - (double)$$0,
         this.du().e - 0.15F,
         this.du().f - (double)$$0,
         this.du().d + (double)$$0,
         this.du().e - 0.15F + (double)$$1,
         this.du().f + (double)$$0
      );
   }

   @Override
   public boolean i(bvb $$0) {
      return $$0 instanceof cqx ? false : super.i($$0);
   }

   @Override
   protected boolean b(bvb $$0) {
      if ($$0 instanceof cqx) {
         return false;
      } else {
         return $$0.aq() == bvi.S ? false : super.b($$0);
      }
   }

   @Override
   protected void a(fbo $$0) {
      super.a($$0);
      if (this.dW() instanceof arx $$1) {
         bvx $$4 = this.p() instanceof bvx $$3 ? $$3 : null;
         bvb $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         btr $$6 = this.dX().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bvx $$7) {
            dds.a($$1, (bvb)$$7, $$6);
         }

         this.a(this.du());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(fbr var1);

   @Override
   protected void a(fbn $$0) {
      super.a($$0);
      if (!this.dW().C) {
         kl $$1 = $$0.c().q();
         fbr $$2 = fbr.a($$1).d(0.25, 0.25, 0.25);
         fbr $$3 = $$0.g().e($$2);
         this.a($$3);
         this.at();
      }
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.at();
      }
   }

   @Override
   protected boolean m() {
      return false;
   }

   @Override
   public cxg l() {
      return cxg.j;
   }

   @Override
   protected float t() {
      return 1.0F;
   }

   @Override
   protected float u() {
      return this.t();
   }

   @Nullable
   @Override
   protected lq s() {
      return null;
   }

   @Override
   public void h() {
      if (!this.dW().C && this.dC() > this.dW().an() + 30) {
         this.a(this.du());
         this.at();
      } else {
         super.h();
      }
   }
}
