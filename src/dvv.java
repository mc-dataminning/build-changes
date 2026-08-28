import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvv extends dpn implements dsb {
   public static final MapCodec<dvv> c = b(dvv::new);
   public static final ece<ecc> d = dpn.b;
   private static final fgm e = dne.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dvv> a() {
      return c;
   }

   public dvv(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return e;
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return $$0.c($$1, $$2, jc.b) && !$$0.a(dng.lp);
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return new daa(dng.bG);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = super.a($$0);
      if ($$1 != null) {
         exq $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(axl.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      if ($$0.c(d) == ecc.a) {
         ebg $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == ecc.b;
      } else {
         exq $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(axl.a) && $$4.e() == 8;
      }
   }

   @Override
   protected exq b_(ebg $$0) {
      return exr.c.a(false);
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
