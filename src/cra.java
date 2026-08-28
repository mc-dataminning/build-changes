import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cra extends cpz implements cqh {
   public static final dgt d = new dhs(true, false, Optional.empty(), mb.e.a(awp.cD).map(Function.identity()));
   public static final double e = 0.25;

   public cra(bvi<? extends cra> $$0, dgz $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public cra(bvi<? extends cra> $$0, dgz $$1, bva $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   cra(bvi<? extends cra> $$0, double $$1, double $$2, double $$3, fbx $$4, dgz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected fbs c(fbx $$0) {
      float $$1 = this.aq().n().a() / 2.0F;
      float $$2 = this.aq().n().b();
      float $$3 = 0.15F;
      return new fbs($$0.d - (double)$$1, $$0.e - 0.15F, $$0.f - (double)$$1, $$0.d + (double)$$1, $$0.e - 0.15F + (double)$$2, $$0.f + (double)$$1);
   }

   @Override
   public boolean i(bva $$0) {
      return $$0 instanceof cra ? false : super.i($$0);
   }

   @Override
   protected boolean b(bva $$0) {
      if ($$0 instanceof cra) {
         return false;
      } else {
         return $$0.aq() == bvi.R ? false : super.b($$0);
      }
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      if (this.dU() instanceof ard $$1) {
         bvy $$4 = this.q() instanceof bvy $$3 ? $$3 : null;
         bva $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         btp $$6 = this.dV().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bvy $$7) {
            ddt.a($$1, (bva)$$7, $$6);
         }

         this.a(this.ds());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(fbx var1);

   @Override
   protected void a(fbt $$0) {
      super.a($$0);
      if (!this.dU().C) {
         km $$1 = $$0.c().q();
         fbx $$2 = fbx.a($$1).d(0.25, 0.25, 0.25);
         fbx $$3 = $$0.g().e($$2);
         this.a($$3);
         this.at();
      }
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.at();
      }
   }

   @Override
   protected boolean g() {
      return false;
   }

   @Override
   public cxh f() {
      return cxh.k;
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
   protected lr j() {
      return null;
   }

   @Override
   public void h() {
      if (!this.dU().C && this.dA() > this.dU().ao() + 30) {
         this.a(this.ds());
         this.at();
      } else {
         super.h();
      }
   }
}
