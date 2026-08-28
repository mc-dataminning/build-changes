import com.mojang.serialization.MapCodec;

public class dne extends dfi implements dfc {
   public static final MapCodec<dne> a = b(dne::new);
   protected static final float b = 6.0F;
   protected static final ewk c = dez.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   protected dne(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return c;
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return true;
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      dhh $$4 = (dhh)($$3.a(dfb.bu) ? dfb.iI : dfb.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         dhh.a($$0, $$4.o(), $$2, 2);
      }
   }
}
