import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drn extends dqx implements dsb {
   public static final MapCodec<drn> c = b(drn::new);
   private static final double g = 0.14;
   private static final fgm h = dne.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<drn> a() {
      return c;
   }

   protected drn(ebf.d $$0) {
      super($$0, jc.b, h, true, 0.14);
   }

   @Override
   protected boolean h(ebg $$0) {
      return $$0.a(dng.J);
   }

   @Override
   protected dne b() {
      return dng.mJ;
   }

   @Override
   protected boolean o(ebg $$0) {
      return !$$0.a(dng.lp);
   }

   @Override
   public boolean a(@Nullable bxw $$0, djd $$1, iw $$2, ebg $$3, exp $$4) {
      return false;
   }

   @Override
   public boolean a(dka $$0, iw $$1, ebg $$2, exq $$3) {
      return false;
   }

   @Override
   protected int a(azz $$0) {
      return 1;
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      exq $$1 = $$0.q().b_($$0.a());
      return $$1.a(axl.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected exq b_(ebg $$0) {
      return exr.c.a(false);
   }
}
