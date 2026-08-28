import com.mojang.serialization.MapCodec;

public class dmg extends dwq implements dnh {
   public static final MapCodec<dmg> a = b(dmg::new);
   private static final fgm b = fgj.a(dne.b(16.0, 8.0, 16.0), dne.b(4.0, 0.0, 8.0));

   @Override
   public MapCodec<dmg> a() {
      return a;
   }

   protected dmg(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b;
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return $$0.a(dng.ei) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      eau.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
