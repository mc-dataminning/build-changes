import com.mojang.serialization.MapCodec;

public abstract class dqb extends dlr {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final fbv h = djn.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fbv i = djn.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final fbv j = djn.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dqb(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqb> a();

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      switch ($$0.c(a).o()) {
         case a:
         default:
            return j;
         case c:
            return i;
         case b:
            return h;
      }
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
