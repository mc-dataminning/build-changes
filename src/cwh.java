import com.mojang.serialization.MapCodec;

public class cwh extends cwi {
   public static final MapCodec<cwh> a = b(cwh::new);
   protected static final float b = 6.0F;
   protected static final emv c = cwy.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<cwh> a() {
      return a;
   }

   protected cwh(djo.d $$0) {
      super($$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return c;
   }
}
