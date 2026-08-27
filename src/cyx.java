import com.mojang.serialization.MapCodec;

public class cyx extends cxh {
   public static final MapCodec<cyx> a = b(cyx::new);
   protected static final float b = 6.0F;
   protected static final emv c = cwy.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<cyx> a() {
      return a;
   }

   protected cyx(djo.d $$0) {
      super($$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return c;
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return $$0.a(asi.cd);
   }
}
