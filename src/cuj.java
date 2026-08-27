import com.mojang.serialization.MapCodec;

public class cuj extends cuk {
   public static final MapCodec<cuj> a = b(cuj::new);
   protected static final float b = 6.0F;
   protected static final ekn c = cva.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<cuj> a() {
      return a;
   }

   protected cuj(dhh.d $$0) {
      super($$0);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return c;
   }
}
