import com.mojang.serialization.MapCodec;

public abstract class dfj extends dfa {
   protected dfj(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfj> a();

   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      return $$0.a(awp.af) || $$0.a(dfc.cC);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      iz $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dsd $$0, dbf $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return $$1 == eol.c && !this.aG ? true : super.a($$0, $$1);
   }
}
