import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class crf extends cqe implements cqm {
   public static final dha d = new dia(true, false, Optional.empty(), ma.e.a(axu.cB).map(Function.identity()));
   public static final double e = 0.25;

   public crf(bvq<? extends crf> $$0, dhh $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public crf(bvq<? extends crf> $$0, dhh $$1, bvj $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   crf(bvq<? extends crf> $$0, double $$1, double $$2, double $$3, fbx $$4, dhh $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected fbs ax() {
      float $$0 = this.aq().n().a() / 2.0F;
      float $$1 = this.aq().n().b();
      float $$2 = 0.15F;
      return new fbs(
         this.dt().d - (double)$$0,
         this.dt().e - 0.15F,
         this.dt().f - (double)$$0,
         this.dt().d + (double)$$0,
         this.dt().e - 0.15F + (double)$$1,
         this.dt().f + (double)$$0
      );
   }

   @Override
   public boolean i(bvj $$0) {
      return $$0 instanceof crf ? false : super.i($$0);
   }

   @Override
   protected boolean b(bvj $$0) {
      if ($$0 instanceof crf) {
         return false;
      } else {
         return $$0.aq() == bvq.S ? false : super.b($$0);
      }
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      if (this.dV() instanceof ash $$1) {
         bwf $$4 = this.p() instanceof bwf $$3 ? $$3 : null;
         bvj $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         btz $$6 = this.dW().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bwf $$7) {
            dea.a($$1, (bvj)$$7, $$6);
         }

         this.a(this.dt());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(fbx var1);

   @Override
   protected void a(fbt $$0) {
      super.a($$0);
      if (!this.dV().C) {
         kl $$1 = $$0.c().q();
         fbx $$2 = fbx.a($$1).d(0.25, 0.25, 0.25);
         fbx $$3 = $$0.g().e($$2);
         this.a($$3);
         this.at();
      }
   }

   @Override
   protected void a(fbv $$0) {
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
   public cxo l() {
      return cxo.k;
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
