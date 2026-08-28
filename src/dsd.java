import com.mojang.serialization.MapCodec;

public class dsd extends dwd {
   public static final MapCodec<dsd> a = b(dsd::new);
   private static final ffw b = dmr.b(12.0, 0.0, 3.0);

   @Override
   public MapCodec<dsd> a() {
      return a;
   }

   public dsd(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b;
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      return $$0.a(axc.aO) || $$0.a(dmt.eo) || super.b($$0, $$1, $$2);
   }
}
