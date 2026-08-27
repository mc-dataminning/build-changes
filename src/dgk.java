import com.mojang.serialization.MapCodec;

public abstract class dgk extends dcf {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final eqm h = dac.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eqm i = dac.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final eqm j = dac.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dgk(dna.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgk> a();

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
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
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
