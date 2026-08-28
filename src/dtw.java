import com.mojang.serialization.MapCodec;

public class dtw extends dwq {
   public static final MapCodec<dtw> a = b(dtw::new);
   private static final fgm b = dne.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dtw> a() {
      return a;
   }

   protected dtw(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b;
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return $$0.a(axg.aO) || $$0.a(dng.eo) || super.b($$0, $$1, $$2);
   }
}
