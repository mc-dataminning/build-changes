import com.mojang.serialization.MapCodec;

public class dkw extends dke {
   public static final MapCodec<dkw> a = b(dkw::new);
   private static final fcr b = dke.b(16.0, 0.0, 1.0);

   @Override
   public MapCodec<? extends dkw> a() {
      return a;
   }

   public dkw(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return !$$1.u($$2.e());
   }
}
