import com.mojang.serialization.MapCodec;

public class den extends cwp {
   public static final MapCodec<den> a = b(den::new);
   private static final double b = 5.0;
   private static final eml c = cwp.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<den> a() {
      return a;
   }

   protected den(djf.d $$0) {
      super($$0);
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.a;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return c;
   }

   @Override
   public float d(djg $$0, csu $$1, hx $$2) {
      return 1.0F;
   }
}
