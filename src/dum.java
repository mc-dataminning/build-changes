import com.mojang.serialization.MapCodec;

public class dum extends dpr implements dnh {
   public static final MapCodec<dum> b = b(dum::new);
   private static final fgm c = dne.b(12.0, 0.0, 10.0);

   @Override
   public MapCodec<dum> a() {
      return b;
   }

   protected dum(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c;
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return true;
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      $$0.b($$2, dng.bF.m());
   }
}
