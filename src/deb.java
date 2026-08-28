import com.mojang.serialization.MapCodec;

public class deb extends dfi implements dfc {
   public static final MapCodec<deb> a = b(deb::new);
   private static final ewk b = ewh.a(dez.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dez.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   protected deb(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b;
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return $$0.a(dfb.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      drr.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
