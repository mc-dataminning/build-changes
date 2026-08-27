import javax.annotation.Nullable;

public class cgm extends cfo implements cfw {
   public static final cgm.a e = new cgm.a();

   public cgm(bly<? extends cgm> $$0, cto $$1) {
      super($$0, $$1);
   }

   public cgm(bly<? extends cgm> $$0, cdk $$1, cto $$2) {
      super($$0, $$1.dr(), $$1.gf(), $$1.dx(), $$2);
      this.b($$1);
   }

   @Override
   protected eln aq() {
      float $$0 = this.ai().n().a / 2.0F;
      float $$1 = this.ai().n().b;
      float $$2 = 0.15F;
      return new eln(
         this.dk().c - (double)$$0,
         this.dk().d - 0.15F,
         this.dk().e - (double)$$0,
         this.dk().c + (double)$$0,
         this.dk().d - 0.15F + (double)$$1,
         this.dk().e + (double)$$0
      );
   }

   @Override
   protected float a(bmw $$0, blv $$1) {
      return 0.0F;
   }

   @Override
   public boolean h(blu $$0) {
      return $$0 instanceof cgm ? false : super.h($$0);
   }

   @Override
   protected boolean a(blu $$0) {
      return $$0 instanceof cgm ? false : super.a($$0);
   }

   @Override
   protected void a(elp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         $$0.a().a(this.dN().a(this, this.w() instanceof bmk $$1 ? $$1 : null), 1.0F);
         this.z();
      }
   }

   private void z() {
      this.dM().a(this, null, e, this.dr(), this.dt(), this.dx(), (float)(3.0 + this.ag.j()), false, cto.a.e, jx.y, jx.z, arr.Be);
   }

   @Override
   protected void a(elo $$0) {
      super.a($$0);
      this.z();
      this.am();
   }

   @Override
   protected void a(elq $$0) {
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
   public cmx q() {
      return cmx.f;
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
   protected csx.a ag_() {
      return csx.a.b;
   }

   public static final class a extends cth {
      @Override
      public boolean a(ctg $$0, blu $$1) {
         return false;
      }
   }
}
