import com.mojang.serialization.MapCodec;

public class dli extends dfg {
   public static final MapCodec<dli> a = b(dli::new);
   protected static final float b = 6.0F;
   protected static final ewi c = dex.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dli> a() {
      return a;
   }

   protected dli(drz.d $$0) {
      super($$0);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return c;
   }

   @Override
   protected boolean b(dsa $$0, dbc $$1, iz $$2) {
      return $$0.a(awo.aL) || $$0.a(dez.dX) || super.b($$0, $$1, $$2);
   }
}
