import javax.annotation.Nullable;

public class cir extends chs implements cia {
   public static final cir.a e = new cir.a();

   public cir(bnw<? extends cir> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public cir(bnw<? extends cir> $$0, cfn $$1, cvr $$2) {
      super($$0, $$1.dr(), $$1.gi(), $$1.dx(), $$2);
      this.b($$1);
   }

   @Override
   protected enu aq() {
      float $$0 = this.ai().n().a() / 2.0F;
      float $$1 = this.ai().n().b();
      float $$2 = 0.15F;
      return new enu(
         this.dk().c - (double)$$0,
         this.dk().d - 0.15F,
         this.dk().e - (double)$$0,
         this.dk().c + (double)$$0,
         this.dk().d - 0.15F + (double)$$1,
         this.dk().e + (double)$$0
      );
   }

   @Override
   public boolean h(bnq $$0) {
      return $$0 instanceof cir ? false : super.h($$0);
   }

   @Override
   protected boolean a(bnq $$0) {
      return $$0 instanceof cir ? false : super.a($$0);
   }

   @Override
   protected void a(enw $$0) {
      super.a($$0);
      if (!this.dM().B) {
         $$0.a().a(this.dN().c(this, this.w() instanceof boi $$1 ? $$1 : null), 1.0F);
         this.z();
      }
   }

   private void z() {
      this.dM().a(this, null, e, this.dr(), this.dt(), this.dx(), (float)(3.0 + this.af.j()), false, cvr.a.e, jz.y, jz.z, atl.Bu);
   }

   @Override
   protected void a(env $$0) {
      super.a($$0);
      this.z();
      this.am();
   }

   @Override
   protected void a(enx $$0) {
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
   public cpd q() {
      return cpd.h;
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
   protected cva.a ah_() {
      return cva.a.b;
   }

   public static final class a extends cvk {
      @Override
      public boolean a(cvj $$0, bnq $$1) {
         return false;
      }
   }
}
