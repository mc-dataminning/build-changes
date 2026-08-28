import com.mojang.serialization.MapCodec;

public class drw extends dke {
   public static final MapCodec<drw> a = b(drw::new);
   private static final fcr b = dke.b(16.0, 0.0, 14.0);
   private static final int c = 20;

   @Override
   public MapCodec<drw> a() {
      return a;
   }

   public drw(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b;
   }

   @Override
   protected fcr b_(dxq $$0, dgf $$1, ji $$2) {
      return fco.b();
   }

   @Override
   protected fcr c(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return fco.b();
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      dkl.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$4 == jn.b && $$6.a(dkg.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   @Override
   protected float c(dxq $$0, dgf $$1, ji $$2) {
      return 0.2F;
   }
}
