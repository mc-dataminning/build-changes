import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgz extends dal implements daf, des {
   public static final MapCodec<dgz> a = b(dgz::new);
   protected static final float b = 6.0F;
   protected static final eqm c = dac.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dgz> a() {
      return a;
   }

   protected dgz(dna.d $$0) {
      super($$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return c;
   }

   @Override
   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      return $$0.d($$1, $$2, ih.b) && !$$0.a(dae.kJ);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      eip $$1 = $$0.q().b_($$0.a());
      return $$1.a(aus.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      dnb $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return $$6;
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
   protected eip c_(dnb $$0) {
      return eiq.c.a(false);
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      dnb $$4 = dae.bx.o();
      dnb $$5 = $$4.a(dih.d, dnx.a);
      ib $$6 = $$2.c();
      if ($$0.a_($$6).a(dae.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable ciu $$0, cwh $$1, ib $$2, dnb $$3, eio $$4) {
      return false;
   }

   @Override
   public boolean a(cxc $$0, ib $$1, dnb $$2, eip $$3) {
      return false;
   }
}
