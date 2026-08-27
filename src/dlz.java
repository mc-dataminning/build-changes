import com.mojang.serialization.MapCodec;

public class dlz extends dea {
   public static final MapCodec<dlz> a = b(dlz::new);
   private static final double b = 5.0;
   private static final evf c = dea.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   protected dlz(drc.d $$0) {
      super($$0);
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.a;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return c;
   }

   @Override
   protected float d(drd $$0, daf $$1, io $$2) {
      return 1.0F;
   }
}
