import com.mojang.serialization.MapCodec;

public abstract class dig extends diq {
   protected static final int a = 2;
   protected static final fas b = diq.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dig(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dig> a();

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return a($$1, $$2.e(), jm.b);
   }
}
