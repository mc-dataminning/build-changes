import com.mojang.serialization.MapCodec;

public class die extends daj implements dad {
   public static final MapCodec<die> a = b(die::new);
   protected static final float b = 6.0F;
   protected static final eqk c = daa.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<die> a() {
      return a;
   }

   protected die(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return c;
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return true;
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      dci $$4 = (dci)($$3.a(dac.bu) ? dac.iI : dac.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         dci.a($$0, $$4.o(), $$2, 2);
      }
   }
}
