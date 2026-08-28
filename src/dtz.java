import com.mojang.serialization.MapCodec;

public class dtz extends dpe implements dmu {
   public static final MapCodec<dtz> b = b(dtz::new);
   private static final ffw c = dmr.b(12.0, 0.0, 10.0);

   @Override
   public MapCodec<dtz> a() {
      return b;
   }

   protected dtz(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c;
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return true;
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      $$0.b($$2, dmt.bF.m());
   }
}
