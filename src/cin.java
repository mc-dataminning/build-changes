import javax.annotation.Nullable;

public class cin extends cho implements chw {
   public static final cin.a e = new cin.a();

   public cin(bnu<? extends cin> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cin(bnu<? extends cin> $$0, cfj $$1, cvn $$2) {
      super($$0, $$1.dr(), $$1.gh(), $$1.dx(), $$2);
      this.b($$1);
   }

   @Override
   protected enn aq() {
      float $$0 = this.ai().n().a() / 2.0F;
      float $$1 = this.ai().n().b();
      float $$2 = 0.15F;
      return new enn(
         this.dk().c - (double)$$0,
         this.dk().d - 0.15F,
         this.dk().e - (double)$$0,
         this.dk().c + (double)$$0,
         this.dk().d - 0.15F + (double)$$1,
         this.dk().e + (double)$$0
      );
   }

   @Override
   public boolean h(bno $$0) {
      return $$0 instanceof cin ? false : super.h($$0);
   }

   @Override
   protected boolean a(bno $$0) {
      return $$0 instanceof cin ? false : super.a($$0);
   }

   @Override
   protected void a(enp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         $$0.a().a(this.dN().c(this, this.w() instanceof bog $$1 ? $$1 : null), 1.0F);
         this.z();
      }
   }

   private void z() {
      this.dM().a(this, null, e, this.dr(), this.dt(), this.dx(), (float)(3.0 + this.af.j()), false, cvn.a.e, jz.y, jz.z, atk.Bt);
   }

   @Override
   protected void a(eno $$0) {
      super.a($$0);
      this.z();
      this.am();
   }

   @Override
   protected void a(enq $$0) {
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
   public coz q() {
      return coz.h;
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
   protected jx u() {
      return null;
   }

   @Override
   protected cuw.a ah_() {
      return cuw.a.b;
   }

   public static final class a extends cvg {
      @Override
      public boolean a(cvf $$0, bno $$1) {
         return false;
      }
   }
}
