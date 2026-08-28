import com.mojang.serialization.MapCodec;

public class duz extends dmr {
   public static final MapCodec<duz> b = b(duz::new);

   @Override
   public MapCodec<duz> a() {
      return b;
   }

   public duz(ebf.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dng.a.m();
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(ebg $$0) {
      return $$0.a(axg.aV);
   }

   @Override
   protected boolean g(ebg $$0) {
      return true;
   }
}
