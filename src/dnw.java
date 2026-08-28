import com.mojang.serialization.MapCodec;

public class dnw extends doz {
   public static final MapCodec<dnw> a = b(dnw::new);
   private static final fgk[] b = dnc.a(7, $$0 -> dnc.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   public dnw(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected djw d() {
      return dac.vp;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b[this.h($$0)];
   }
}
