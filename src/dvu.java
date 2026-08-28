import com.mojang.serialization.MapCodec;

public class dvu extends dwq implements dnh {
   public static final MapCodec<dvu> a = b(dvu::new);
   private static final fgm b = dne.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dvu> a() {
      return a;
   }

   protected dvu(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b;
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return o($$2).m().a($$0, $$1) && $$0.v($$1.d());
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      dpn.a($$0, o($$3).m(), $$2, 2);
   }

   private static dpn o(ebg $$0) {
      return (dpn)($$0.a(dng.bB) ? dng.jk : dng.jj);
   }
}
