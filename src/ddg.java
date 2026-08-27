import com.mojang.serialization.MapCodec;

public abstract class ddg extends czb {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final emv h = cwy.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final emv i = cwy.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final emv j = cwy.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected ddg(djo.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends ddg> a();

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
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
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
