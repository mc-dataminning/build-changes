import com.mojang.serialization.MapCodec;

public abstract class dhz extends dij {
   protected static final int a = 2;
   protected static final fal b = dij.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dhz(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhz> a();

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return a($$1, $$2.e(), jm.b);
   }
}
