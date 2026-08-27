import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ckc extends cjb implements cjj {
   public ckc(bpd<? extends ckc> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public ckc(bpd<? extends ckc> $$0, cxb $$1, box $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
   }

   ckc(bpd<? extends ckc> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cxb $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected epo aq() {
      float $$0 = this.ai().n().a() / 2.0F;
      float $$1 = this.ai().n().b();
      float $$2 = 0.15F;
      return new epo(
         this.dk().c - (double)$$0,
         this.dk().d - 0.15F,
         this.dk().e - (double)$$0,
         this.dk().c + (double)$$0,
         this.dk().d - 0.15F + (double)$$1,
         this.dk().e + (double)$$0
      );
   }

   @Override
   public boolean i(box $$0) {
      return $$0 instanceof ckc ? false : super.i($$0);
   }

   @Override
   protected boolean b(box $$0) {
      return $$0 instanceof ckc ? false : super.b($$0);
   }

   @Override
   protected void a(epq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         $$0.a().a(this.dN().c(this, this.af_() instanceof bpp $$1 ? $$1 : null), 1.0F);
         this.y();
      }
   }

   protected abstract void y();

   @Override
   protected void a(epp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.y();
         this.am();
      }
   }

   @Override
   protected void a(epr $$0) {
      cxb $$1 = this.dM();
      if ($$0.c() == epr.a.b) {
         ib $$2 = ((epp)$$0).a();
         dnb $$3 = $$1.a_($$2);
         if (!$$3.r($$1, $$2)) {
            return;
         }
      }

      super.a($$0);
      if (!this.dM().B && !this.f) {
         this.am();
      }

      this.f = false;
   }

   @Override
   protected boolean r() {
      return false;
   }

   @Override
   public cqm p() {
      return cqm.h;
   }

   @Override
   protected float w() {
      return 1.0F;
   }

   @Override
   protected float x() {
      return this.w();
   }

   @Nullable
   @Override
   protected ka s() {
      return null;
   }

   @Override
   protected cwk.a ag_() {
      return cwk.a.b;
   }

   public static class a extends cwu {
      @Override
      public boolean a(cwt $$0, box $$1) {
         return false;
      }

      @Override
      public Optional<Float> a(cwt $$0, cwh $$1, ib $$2, dnb $$3, eip $$4) {
         return $$3.a(aun.cs) ? Optional.of(3600000.0F) : Optional.empty();
      }
   }
}
