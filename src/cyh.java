import com.mojang.serialization.MapCodec;

public class cyh extends czo implements czi {
   public static final MapCodec<cyh> a = b(cyh::new);
   private static final epo b = epl.a(czf.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), czf.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<cyh> a() {
      return a;
   }

   protected cyh(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return $$0.a(czh.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      dlt.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
