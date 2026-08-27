import com.mojang.serialization.MapCodec;

public class csl extends csm {
   public static final MapCodec<csl> a = b(csl::new);
   protected static final float b = 6.0F;
   protected static final eia c = ctc.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<csl> a() {
      return a;
   }

   protected csl(dfc.d $$0) {
      super($$0);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return c;
   }
}
