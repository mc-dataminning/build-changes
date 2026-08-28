import com.mojang.serialization.MapCodec;

public abstract class dhc extends dhm {
   protected static final int a = 2;
   protected static final ezq b = dhm.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dhc(dur.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhc> a();

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1 == jk.a && !this.a($$0, $$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return a($$1, $$2.e(), jk.b);
   }
}
