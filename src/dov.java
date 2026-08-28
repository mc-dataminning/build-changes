import com.mojang.serialization.MapCodec;

public class dov extends dgv {
   public static final MapCodec<dov> a = b(dov::new);
   private static final double b = 5.0;
   private static final eyx c = dgv.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dov> a() {
      return a;
   }

   protected dov(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.a;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return c;
   }

   @Override
   protected float c(dua $$0, dcx $$1, je $$2) {
      return 1.0F;
   }
}
