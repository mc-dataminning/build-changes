import com.mojang.serialization.MapCodec;

public abstract class dli extends dhc {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final ewk h = dez.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ewk i = dez.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ewk j = dez.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dli(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dli> a();

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
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
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
