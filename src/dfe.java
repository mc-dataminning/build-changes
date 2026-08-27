import com.mojang.serialization.MapCodec;

public class dfe extends daj {
   public static final MapCodec<dfe> a = b(dfe::new);
   protected static final eqk b = daa.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   public dfe(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return $$0.a(aun.aL) || $$0.a(dac.dX) || super.b($$0, $$1, $$2);
   }
}
