import com.mojang.serialization.MapCodec;

public class cze extends dal implements daf {
   public static final MapCodec<cze> a = b(cze::new);
   private static final eqm b = eqj.a(dac.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dac.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<cze> a() {
      return a;
   }

   protected cze(dna.d $$0) {
      super($$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }

   @Override
   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      return $$0.a(dae.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      dmq.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
