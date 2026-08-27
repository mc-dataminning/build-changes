import javax.annotation.Nullable;

public class cgv extends cfx implements cgf {
   public static final cgv.a e = new cgv.a();

   public cgv(bmc<? extends cgv> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cgv(bmc<? extends cgv> $$0, cds $$1, ctx $$2) {
      super($$0, $$1.dq(), $$1.gh(), $$1.dw(), $$2);
      this.c($$1);
   }

   @Override
   protected elx aq() {
      float $$0 = this.ai().n().a() / 2.0F;
      float $$1 = this.ai().n().b();
      float $$2 = 0.15F;
      return new elx(
         this.dj().c - (double)$$0,
         this.dj().d - 0.15F,
         this.dj().e - (double)$$0,
         this.dj().c + (double)$$0,
         this.dj().d - 0.15F + (double)$$1,
         this.dj().e + (double)$$0
      );
   }

   @Override
   public boolean h(blw $$0) {
      return $$0 instanceof cgv ? false : super.h($$0);
   }

   @Override
   protected boolean b(blw $$0) {
      return $$0 instanceof cgv ? false : super.b($$0);
   }

   @Override
   protected void a(elz $$0) {
      super.a($$0);
      if (!this.dL().B) {
         $$0.a().a(this.dM().c(this, this.w() instanceof bmo $$1 ? $$1 : null), 1.0F);
         this.z();
      }
   }

   private void z() {
      this.dL().a(this, null, e, this.dq(), this.ds(), this.dw(), (float)(3.0 + this.ag.j()), false, ctx.a.e, jx.y, jx.z, art.Bt);
   }

   @Override
   protected void a(ely $$0) {
      super.a($$0);
      this.z();
      this.am();
   }

   @Override
   protected void a(ema $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.am();
      }
   }

   @Override
   protected boolean s() {
      return false;
   }

   @Override
   public cng q() {
      return cng.f;
   }

   @Override
   protected float x() {
      return 1.0F;
   }

   @Override
   protected float y() {
      return this.x();
   }

   @Nullable
   @Override
   protected jv u() {
      return null;
   }

   @Override
   protected ctg.a ah_() {
      return ctg.a.b;
   }

   public static final class a extends ctq {
      @Override
      public boolean a(ctp $$0, blw $$1) {
         return false;
      }
   }
}
