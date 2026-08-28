import com.mojang.serialization.MapCodec;

public abstract class dnt extends djm {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final ezm h = dhj.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ezm i = dhj.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ezm j = dhj.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dnt(dun.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dnt> a();

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
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
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
