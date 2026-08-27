import com.mojang.serialization.MapCodec;

public abstract class czq extends daa {
   protected static final int a = 2;
   protected static final eqk b = daa.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected czq(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czq> a();

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !this.a($$0, $$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return a($$1, $$2.d(), ih.b);
   }
}
