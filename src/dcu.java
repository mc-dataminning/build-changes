import com.mojang.serialization.MapCodec;

public abstract class dcu extends dde {
   protected static final int a = 2;
   protected static final eui b = dde.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dcu(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcu> a();

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1 == is.a && !this.a($$0, $$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return a($$1, $$2.d(), is.b);
   }
}
