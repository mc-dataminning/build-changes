import com.mojang.serialization.MapCodec;

public class dig extends dal implements daf {
   public static final MapCodec<dig> a = b(dig::new);
   protected static final float b = 6.0F;
   protected static final eqm c = dac.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dig> a() {
      return a;
   }

   protected dig(dna.d $$0) {
      super($$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return c;
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return true;
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      dck $$4 = (dck)($$3.a(dae.bu) ? dae.iI : dae.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         dck.a($$0, $$4.o(), $$2, 2);
      }
   }
}
