import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgx extends daj implements dad, deq {
   public static final MapCodec<dgx> a = b(dgx::new);
   protected static final float b = 6.0F;
   protected static final eqk c = daa.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dgx> a() {
      return a;
   }

   protected dgx(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return c;
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return $$0.d($$1, $$2, ih.b) && !$$0.a(dac.kJ);
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      ein $$1 = $$0.q().b_($$0.a());
      return $$1.a(aus.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      dmz $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return $$6;
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
   protected ein c_(dmz $$0) {
      return eio.c.a(false);
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      dmz $$4 = dac.bx.o();
      dmz $$5 = $$4.a(dif.d, dnv.a);
      ib $$6 = $$2.c();
      if ($$0.a_($$6).a(dac.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cis $$0, cwf $$1, ib $$2, dmz $$3, eim $$4) {
      return false;
   }

   @Override
   public boolean a(cxa $$0, ib $$1, dmz $$2, ein $$3) {
      return false;
   }
}
