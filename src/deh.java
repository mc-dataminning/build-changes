import com.mojang.serialization.MapCodec;

public class deh extends dfo implements dfi {
   public static final MapCodec<deh> a = b(deh::new);
   private static final ews b = ewp.a(dff.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dff.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<deh> a() {
      return a;
   }

   protected deh(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.a(dfh.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      drw.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
