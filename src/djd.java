import com.mojang.serialization.MapCodec;

public abstract class djd extends djn {
   protected static final int a = 2;
   protected static final fbv b = djn.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected djd(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djd> a();

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4 == jn.a && !this.a($$0, $$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return a($$1, $$2.e(), jn.b);
   }
}
