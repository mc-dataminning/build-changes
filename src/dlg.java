import com.mojang.serialization.MapCodec;

public abstract class dlg extends dha {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final ewi h = dex.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ewi i = dex.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ewi j = dex.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dlg(drz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlg> a();

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
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
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
