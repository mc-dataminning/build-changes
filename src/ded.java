import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ded extends ddp implements deq {
   public static final MapCodec<ded> c = b(ded::new);
   protected static final eqk g = daa.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<ded> a() {
      return c;
   }

   protected ded(dmy.d $$0) {
      super($$0, ih.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dmz $$0) {
      return $$0.a(dac.G);
   }

   @Override
   protected daa b() {
      return dac.md;
   }

   @Override
   protected boolean m(dmz $$0) {
      return !$$0.a(dac.kJ);
   }

   @Override
   public boolean a(@Nullable cis $$0, cwf $$1, ib $$2, dmz $$3, eim $$4) {
      return false;
   }

   @Override
   public boolean a(cxa $$0, ib $$1, dmz $$2, ein $$3) {
      return false;
   }

   @Override
   protected int a(axd $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      ein $$1 = $$0.q().b_($$0.a());
      return $$1.a(aus.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected ein c_(dmz $$0) {
      return eio.c.a(false);
   }
}
