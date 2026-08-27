import com.mojang.serialization.MapCodec;

public abstract class cyi extends cys {
   protected static final int a = 2;
   protected static final eos b = cys.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected cyi(dli.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cyi> a();

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !this.a($$0, $$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return a($$1, $$2.d(), ie.b);
   }
}
