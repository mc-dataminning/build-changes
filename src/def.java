import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class def extends ddr implements des {
   public static final MapCodec<def> c = b(def::new);
   protected static final eqm g = dac.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<def> a() {
      return c;
   }

   protected def(dna.d $$0) {
      super($$0, ih.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dnb $$0) {
      return $$0.a(dae.G);
   }

   @Override
   protected dac b() {
      return dae.md;
   }

   @Override
   protected boolean m(dnb $$0) {
      return !$$0.a(dae.kJ);
   }

   @Override
   public boolean a(@Nullable ciu $$0, cwh $$1, ib $$2, dnb $$3, eio $$4) {
      return false;
   }

   @Override
   public boolean a(cxc $$0, ib $$1, dnb $$2, eip $$3) {
      return false;
   }

   @Override
   protected int a(axd $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      eip $$1 = $$0.q().b_($$0.a());
      return $$1.a(aus.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eip c_(dnb $$0) {
      return eiq.c.a(false);
   }
}
