import com.mojang.serialization.MapCodec;

public abstract class dcx extends cys {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final eml h = cwp.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eml i = cwp.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final eml j = cwp.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dcx(djf.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcx> a();

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
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
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
