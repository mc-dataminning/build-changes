import com.mojang.serialization.MapCodec;

public class dhy extends daa {
   public static final MapCodec<dhy> a = b(dhy::new);
   private static final double b = 5.0;
   private static final eqk c = daa.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dhy> a() {
      return a;
   }

   protected dhy(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.a;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return c;
   }

   @Override
   protected float d(dmz $$0, cwf $$1, ib $$2) {
      return 1.0F;
   }
}
