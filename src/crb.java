import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class crb extends cqa implements cqi {
   public static final dgt d = new dht(true, false, Optional.empty(), ma.e.a(axu.cB).map(Function.identity()));
   public static final double e = 0.25;

   public crb(bvm<? extends crb> $$0, dha $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public crb(bvm<? extends crb> $$0, dha $$1, bvf $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   crb(bvm<? extends crb> $$0, double $$1, double $$2, double $$3, fbs $$4, dha $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected fbn ax() {
      float $$0 = this.aq().n().a() / 2.0F;
      float $$1 = this.aq().n().b();
      float $$2 = 0.15F;
      return new fbn(
         this.dt().d - (double)$$0,
         this.dt().e - 0.15F,
         this.dt().f - (double)$$0,
         this.dt().d + (double)$$0,
         this.dt().e - 0.15F + (double)$$1,
         this.dt().f + (double)$$0
      );
   }

   @Override
   public boolean i(bvf $$0) {
      return $$0 instanceof crb ? false : super.i($$0);
   }

   @Override
   protected boolean b(bvf $$0) {
      if ($$0 instanceof crb) {
         return false;
      } else {
         return $$0.aq() == bvm.S ? false : super.b($$0);
      }
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);
      if (this.dV() instanceof ash $$1) {
         bwb $$4 = this.p() instanceof bwb $$3 ? $$3 : null;
         bvf $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         btv $$6 = this.dW().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bwb $$7) {
            ddt.a($$1, (bvf)$$7, $$6);
         }

         this.a(this.dt());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(fbs var1);

   @Override
   protected void a(fbo $$0) {
      super.a($$0);
      if (!this.dV().C) {
         kl $$1 = $$0.c().q();
         fbs $$2 = fbs.a($$1).d(0.25, 0.25, 0.25);
         fbs $$3 = $$0.g().e($$2);
         this.a($$3);
         this.at();
      }
   }

   @Override
   protected void a(fbq $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.at();
      }
   }

   @Override
   protected boolean m() {
      return false;
   }

   @Override
   public cxk l() {
      return cxk.k;
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
      if (!this.dV().C && this.dB() > this.dV().am() + 30) {
         this.a(this.dt());
         this.at();
      } else {
         super.h();
      }
   }
}
