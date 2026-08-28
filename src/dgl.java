import com.mojang.serialization.MapCodec;

public abstract class dgl extends dgv {
   protected static final int a = 2;
   protected static final eyx b = dgv.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dgl(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgl> a();

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1 == jj.a && !this.a($$0, $$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return a($$1, $$2.e(), jj.b);
   }
}
