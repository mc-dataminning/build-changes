import com.mojang.serialization.MapCodec;

public abstract class dnb extends dke implements dna {
   public dnb(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dnb> a();

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         clv $$4 = clv.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(clv $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dxq $$0) {
      return $$0.l() || $$0.a(awp.aN) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$3.a(16) == 0) {
         ji $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azd.a($$1, $$2, $$3, new ll(lt.C, $$0));
         }
      }
   }

   public int b(dxq $$0, dgf $$1, ji $$2) {
      return -16777216;
   }
}
