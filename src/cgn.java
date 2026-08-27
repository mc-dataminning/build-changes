import javax.annotation.Nullable;

public class cgn extends cfp implements cfx {
   public static final cgn.a e = new cgn.a();

   public cgn(blz<? extends cgn> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public cgn(blz<? extends cgn> $$0, cdl $$1, ctp $$2) {
      super($$0, $$1.dr(), $$1.gf(), $$1.dx(), $$2);
      this.b($$1);
   }

   @Override
   protected elo aq() {
      float $$0 = this.ai().n().a / 2.0F;
      float $$1 = this.ai().n().b;
      float $$2 = 0.15F;
      return new elo(
         this.dk().c - (double)$$0,
         this.dk().d - 0.15F,
         this.dk().e - (double)$$0,
         this.dk().c + (double)$$0,
         this.dk().d - 0.15F + (double)$$1,
         this.dk().e + (double)$$0
      );
   }

   @Override
   protected float a(bmx $$0, blw $$1) {
      return 0.0F;
   }

   @Override
   public boolean h(blv $$0) {
      return $$0 instanceof cgn ? false : super.h($$0);
   }

   @Override
   protected boolean a(blv $$0) {
      return $$0 instanceof cgn ? false : super.a($$0);
   }

   @Override
   protected void a(elq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         $$0.a().a(this.dN().a(this, this.w() instanceof bml $$1 ? $$1 : null), 1.0F);
         this.z();
      }
   }

   private void z() {
      this.dM().a(this, null, e, this.dr(), this.dt(), this.dx(), (float)(3.0 + this.ag.j()), false, ctp.a.e, jx.y, jx.z, ars.Be);
   }

   @Override
   protected void a(elp $$0) {
      super.a($$0);
      this.z();
      this.am();
   }

   @Override
   protected void a(elr $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.am();
      }
   }

   @Override
   protected boolean s() {
      return false;
   }

   @Override
   public cmy q() {
      return cmy.f;
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
   protected csy.a ag_() {
      return csy.a.b;
   }

   public static final class a extends cti {
      @Override
      public boolean a(cth $$0, blv $$1) {
         return false;
      }
   }
}
