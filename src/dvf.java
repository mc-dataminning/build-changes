import com.mojang.serialization.MapCodec;

public class dvf extends dpe implements dmu {
   public static final MapCodec<dvf> b = b(dvf::new);
   private static final ffw c = dmr.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dvf> a() {
      return b;
   }

   protected dvf(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c;
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return dmu.a_($$0, $$1, dmt.bE.m());
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      dmu.a((djm)$$0, $$2, dmt.bE.m()).ifPresent($$1x -> $$0.b($$1x, dmt.bE.m()));
   }
}
