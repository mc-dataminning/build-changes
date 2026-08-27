import com.mojang.serialization.MapCodec;

public abstract class dbo extends dby {
   protected static final int a = 2;
   protected static final est b = dby.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dbo(doy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dbo> a();

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !this.a($$0, $$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return a($$1, $$2.d(), ih.b);
   }
}
