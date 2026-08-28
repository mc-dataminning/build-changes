import com.mojang.serialization.MapCodec;

public class dlk extends dfi {
   public static final MapCodec<dlk> a = b(dlk::new);
   protected static final float b = 6.0F;
   protected static final ewk c = dez.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dlk> a() {
      return a;
   }

   protected dlk(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return c;
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return $$0.a(awp.aL) || $$0.a(dfb.dX) || super.b($$0, $$1, $$2);
   }
}
