import com.mojang.serialization.MapCodec;

public class dke extends dfi {
   public static final MapCodec<dke> a = b(dke::new);
   protected static final ewk b = dez.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   public dke(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b;
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return $$0.a(awp.aL) || $$0.a(dfb.dX) || super.b($$0, $$1, $$2);
   }
}
