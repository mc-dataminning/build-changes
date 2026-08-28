import com.mojang.serialization.MapCodec;

public abstract class dev extends dff {
   protected static final int a = 2;
   protected static final ews b = dff.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dev(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dev> a();

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !this.a($$0, $$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return a($$1, $$2.d(), jf.b);
   }
}
