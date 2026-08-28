import com.mojang.serialization.MapCodec;

public class dvj extends dnb {
   public static final MapCodec<dvj> b = b(dvj::new);

   @Override
   public MapCodec<dvj> a() {
      return b;
   }

   public dvj(ebp.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dnq.a.m();
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(ebq $$0) {
      return $$0.a(axn.aV);
   }

   @Override
   protected boolean g(ebq $$0) {
      return true;
   }
}
