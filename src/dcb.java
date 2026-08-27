import com.mojang.serialization.MapCodec;

public class dcb extends dal {
   public static final MapCodec<dcb> a = b(dcb::new);
   protected static final float b = 6.0F;
   protected static final eqm c = dac.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dcb> a() {
      return a;
   }

   protected dcb(dna.d $$0) {
      super($$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return c;
   }

   @Override
   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      return $$0.a(aun.cf);
   }
}
