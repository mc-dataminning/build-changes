import com.mojang.serialization.MapCodec;

public abstract class dgi extends dcd {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final eqk h = daa.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eqk i = daa.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final eqk j = daa.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dgi(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgi> a();

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
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
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
