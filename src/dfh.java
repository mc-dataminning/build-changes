import com.mojang.serialization.MapCodec;

public abstract class dfh extends dey {
   protected dfh(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfh> a();

   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.a(awo.af) || $$0.a(dfa.cC);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      iz $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dsb $$0, dbd $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return $$1 == eoj.c && !this.aG ? true : super.a($$0, $$1);
   }
}
