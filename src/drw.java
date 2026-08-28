import com.mojang.serialization.MapCodec;

public class drw extends dmr {
   public static final MapCodec<drw> a = b(drw::new);
   private static final ffw b = dmr.b(16.0, 0.0, 14.0);

   @Override
   public MapCodec<drw> a() {
      return a;
   }

   public drw(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b;
   }

   @Override
   protected ffw b_(eat $$0, diq $$1, iv $$2) {
      return fft.b();
   }

   @Override
   protected ffw c(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return fft.b();
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   @Override
   protected float c(eat $$0, diq $$1, iv $$2) {
      return 0.2F;
   }
}
