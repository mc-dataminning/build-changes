import com.mojang.serialization.MapCodec;

public abstract class cyv extends czf {
   protected static final int a = 2;
   protected static final epo b = czf.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected cyv(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cyv> a();

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !this.a($$0, $$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return a($$1, $$2.d(), ih.b);
   }
}
