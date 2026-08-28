import com.mojang.serialization.MapCodec;

public class djh extends dke implements dkh {
   public static final MapCodec<djh> a = b(djh::new);
   private static final fcr b = dke.b(8.0, 0.0, 12.0);

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   public djh(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b.a($$0.a($$2));
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return $$1.a_($$2.e()).a(awp.ax);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         return dkg.a.m();
      } else {
         return $$4 == jn.b && $$6.a(dkg.nB) ? dkg.nB.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return new cxh(cxl.ef);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      this.a($$0, $$2);
   }

   protected void a(dgz $$0, ji $$1) {
      $$0.a($$1.d(), dkg.nB.m().b(dji.c, dyc.b), 3);
   }
}
