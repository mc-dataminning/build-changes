import com.mojang.serialization.MapCodec;

public abstract class czs extends dac {
   protected static final int a = 2;
   protected static final eqm b = dac.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected czs(dna.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czs> a();

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !this.a($$0, $$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return a($$1, $$2.d(), ih.b);
   }
}
