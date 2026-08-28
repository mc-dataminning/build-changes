import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duk extends dwq implements dnh, dsb {
   public static final MapCodec<duk> a = b(duk::new);
   private static final fgm b = dne.b(12.0, 0.0, 12.0);

   @Override
   public MapCodec<duk> a() {
      return a;
   }

   protected duk(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b;
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return $$0.c($$1, $$2, jc.b) && !$$0.a(dng.lp);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      exq $$1 = $$0.q().b_($$0.a());
      return $$1.a(axl.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      ebg $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return $$0.a_($$1.d()).a(dng.J);
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   protected exq b_(ebg $$0) {
      return exr.c.a(false);
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      ebg $$4 = dng.bH.m();
      ebg $$5 = $$4.b(dvv.d, ecc.a);
      iw $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable bxw $$0, djd $$1, iw $$2, ebg $$3, exp $$4) {
      return false;
   }

   @Override
   public boolean a(dka $$0, iw $$1, ebg $$2, exq $$3) {
      return false;
   }
}
