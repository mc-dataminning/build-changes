import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dnl extends dne implements dnm {
   public static final MapCodec<dnl> a = b(dnl::new);
   public static final ebx b = ebw.h;
   private static final int c = 5;

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   public dnl(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      ebg $$5 = $$1.a_($$2.d());
      boolean $$6 = $$5.g($$1, $$2).c() && $$5.y().c();
      if ($$6) {
         $$3.a($$0.c(b), $$2);
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected exq b_(ebg $$0) {
      return exr.c.a(false);
   }

   public static void b(dka $$0, iw $$1, ebg $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dka $$0, iw $$1, ebg $$2, ebg $$3) {
      if (o($$2)) {
         ebg $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         iw.a $$5 = $$1.k().c(jc.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jc.b);
         }
      }
   }

   private static boolean o(ebg $$0) {
      return $$0.a(dng.nJ) || $$0.a(dng.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static ebg q(ebg $$0) {
      if ($$0.a(dng.nJ)) {
         return $$0;
      } else if ($$0.a(dng.en)) {
         return dng.nJ.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dng.lp) ? dng.nJ.m().b(b, Boolean.valueOf(true)) : dng.J.m();
      }
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lz.as, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awr.da, aws.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lz.at, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lz.at, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awr.cY, aws.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      $$2.a($$3, exr.c, exr.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jc.a || $$4 == jc.b && !$$6.a(dng.nJ) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      ebg $$3 = $$1.a_($$2.e());
      return $$3.a(dng.nJ) || $$3.a(dng.lp) || $$3.a(dng.en);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return fgj.a();
   }

   @Override
   protected dtr a_(ebg $$0) {
      return dtr.a;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   public daa a(@Nullable bxw $$0, dka $$1, iw $$2, ebg $$3) {
      $$1.a($$2, dng.a.m(), 11);
      return new daa(dae.rp);
   }

   @Override
   public Optional<awq> at_() {
      return exr.c.j();
   }
}
