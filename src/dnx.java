import com.mojang.serialization.MapCodec;

public class dnx extends dne {
   public static final MapCodec<dnx> a = b(dnx::new);
   private static final fgm b = dne.b(16.0, 0.0, 1.0);

   @Override
   public MapCodec<? extends dnx> a() {
      return a;
   }

   public dnx(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return !$$1.v($$2.e());
   }
}
