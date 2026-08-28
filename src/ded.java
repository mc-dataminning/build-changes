import com.mojang.serialization.MapCodec;

public class ded extends dfk implements dfe {
   public static final MapCodec<ded> a = b(ded::new);
   private static final ewm b = ewj.a(dfb.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dfb.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   protected ded(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return b;
   }

   @Override
   protected boolean b(dse $$0, dbg $$1, iz $$2) {
      return $$0.a(dfd.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      drt.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
