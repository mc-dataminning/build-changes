import com.mojang.serialization.MapCodec;

public class dea extends dfh implements dfb {
   public static final MapCodec<dea> a = b(dea::new);
   private static final ewj b = ewg.a(dey.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dey.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   protected dea(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.a(dfa.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      drq.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
