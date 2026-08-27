import com.mojang.serialization.MapCodec;

public class czi extends czk {
   public static final MapCodec<czi> a = b(czi::new);
   private static final eqk b = daa.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends czi> a() {
      return a;
   }

   protected czi(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }
}
