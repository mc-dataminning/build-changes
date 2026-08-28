import com.mojang.serialization.MapCodec;

public class dnr extends dwq {
   public static final MapCodec<dnr> a = b(dnr::new);
   private static final fgm b = dne.b(14.0, 0.0, 12.0);

   @Override
   public MapCodec<? extends dnr> a() {
      return a;
   }

   public dnr(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b;
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      ebg $$3 = $$1.a_($$2);
      return $$3.a(dng.eg) || $$3.a(dng.cN) || $$3.a($$1, $$2, jc.b, dvp.b);
   }
}
