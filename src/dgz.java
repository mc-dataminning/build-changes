import com.mojang.serialization.MapCodec;

public abstract class dgz extends dhj {
   protected static final int a = 2;
   protected static final ezm b = dhj.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dgz(dun.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgz> a();

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1 == jj.a && !this.a($$0, $$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return a($$1, $$2.e(), jj.b);
   }
}
