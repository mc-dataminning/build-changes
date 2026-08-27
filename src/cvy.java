import com.mojang.serialization.MapCodec;

public class cvy extends cvz {
   public static final MapCodec<cvy> a = b(cvy::new);
   protected static final float b = 6.0F;
   protected static final eml c = cwp.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<cvy> a() {
      return a;
   }

   protected cvy(djf.d $$0) {
      super($$0);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return c;
   }
}
