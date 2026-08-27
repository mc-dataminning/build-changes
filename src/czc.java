import com.mojang.serialization.MapCodec;

public class czc extends daj implements dad {
   public static final MapCodec<czc> a = b(czc::new);
   private static final eqk b = eqh.a(daa.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), daa.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<czc> a() {
      return a;
   }

   protected czc(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return $$0.a(dac.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      dmo.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
