import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class crg extends cqf implements cqn {
   public static final dhb d = new dib(true, false, Optional.empty(), ma.e.a(axu.cB).map(Function.identity()));
   public static final double e = 0.25;

   public crg(bvr<? extends crg> $$0, dhi $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public crg(bvr<? extends crg> $$0, dhi $$1, bvk $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   crg(bvr<? extends crg> $$0, double $$1, double $$2, double $$3, fby $$4, dhi $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected fbt ax() {
      float $$0 = this.aq().n().a() / 2.0F;
      float $$1 = this.aq().n().b();
      float $$2 = 0.15F;
      return new fbt(
         this.du().d - (double)$$0,
         this.du().e - 0.15F,
         this.du().f - (double)$$0,
         this.du().d + (double)$$0,
         this.du().e - 0.15F + (double)$$1,
         this.du().f + (double)$$0
      );
   }

   @Override
   public boolean i(bvk $$0) {
      return $$0 instanceof crg ? false : super.i($$0);
   }

   @Override
   protected boolean b(bvk $$0) {
      if ($$0 instanceof crg) {
         return false;
      } else {
         return $$0.aq() == bvr.S ? false : super.b($$0);
      }
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (this.dW() instanceof ash $$1) {
         bwg $$4 = this.p() instanceof bwg $$3 ? $$3 : null;
         bvk $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         bua $$6 = this.dX().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bwg $$7) {
            deb.a($$1, (bvk)$$7, $$6);
         }

         this.a(this.du());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(fby var1);

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      if (!this.dW().C) {
         kl $$1 = $$0.c().q();
         fby $$2 = fby.a($$1).d(0.25, 0.25, 0.25);
         fby $$3 = $$0.g().e($$2);
         this.a($$3);
         this.at();
      }
   }

   @Override
   protected void a(fbw $$0) {
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
   public cxp l() {
      return cxp.j;
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
      if (!this.dW().C && this.dC() > this.dW().am() + 30) {
         this.a(this.du());
         this.at();
      } else {
         super.h();
      }
   }
}
