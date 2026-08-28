import com.mojang.serialization.MapCodec;

public class dpt extends dke implements dkh {
   public static final MapCodec<dpt> a = b(dpt::new);

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   protected dpt(dxp.d $$0) {
      super($$0);
   }

   private static boolean b(dxq $$0, dhc $$1, ji $$2) {
      ji $$3 = $$2.d();
      dxq $$4 = $$1.a_($$3);
      int $$5 = etn.a($$0, $$4, jn.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dkg.ei.m());
      }
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
      dxq $$4 = $$0.a_($$2);
      ji $$5 = $$2.d();
      dzn $$6 = $$0.m().g();
      ke<egg<?, ?>> $$7 = $$0.F_().e(mc.aM);
      if ($$4.a(dkg.oY)) {
         this.a($$7, rh.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dkg.oP)) {
         this.a($$7, rh.j, $$0, $$6, $$1, $$5);
         this.a($$7, rh.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rh.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(ke<egg<?, ?>> $$0, akt<egg<?, ?>> $$1, ard $$2, dzn $$3, azh $$4, ji $$5) {
      $$0.a($$1).ifPresent($$4x -> ((egg)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dkh.a aq_() {
      return dkh.a.a;
   }
}
