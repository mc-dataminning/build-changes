import com.mojang.serialization.MapCodec;

public abstract class dcr extends cym {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final emf h = cwj.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final emf i = cwj.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final emf j = cwj.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dcr(diz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcr> a();

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
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
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
