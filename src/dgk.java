import com.mojang.serialization.MapCodec;

public class dgk extends daj {
   public static final MapCodec<dgk> a = b(dgk::new);
   protected static final float b = 6.0F;
   protected static final eqk c = daa.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   protected dgk(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return c;
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return $$0.a(aun.aL) || $$0.a(dac.dX) || super.b($$0, $$1, $$2);
   }
}
