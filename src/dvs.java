import com.mojang.serialization.MapCodec;

public class dvs extends dpr implements dnh {
   public static final MapCodec<dvs> b = b(dvs::new);
   private static final fgm c = dne.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dvs> a() {
      return b;
   }

   protected dvs(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c;
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return dnh.a_($$0, $$1, dng.bE.m());
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      dnh.a((djz)$$0, $$2, dng.bE.m()).ifPresent($$1x -> $$0.b($$1x, dng.bE.m()));
   }
}
