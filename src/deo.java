import com.mojang.serialization.MapCodec;

public abstract class deo extends dey {
   protected static final int a = 2;
   protected static final ewj b = dey.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected deo(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends deo> a();

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !this.a($$0, $$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return a($$1, $$2.d(), je.b);
   }
}
