import com.mojang.serialization.MapCodec;

public class dme extends dko {
   public static final MapCodec<dme> a = b(dme::new);
   private static final fcr b = dke.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   protected dme(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b;
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.a(awp.cp);
   }
}
