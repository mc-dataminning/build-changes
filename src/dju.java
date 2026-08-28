import com.mojang.serialization.MapCodec;

public abstract class dju extends dke {
   private static final fcr a = dke.b(4.0, 0.0, 10.0);

   protected dju(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dju> a();

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return a;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4 == jn.a && !this.a($$0, $$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return a($$1, $$2.e(), jn.b);
   }
}
