import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dnv extends dno implements dnw {
   public static final MapCodec<dnv> a = b(dnv::new);
   public static final ech b = ecg.h;
   private static final int c = 5;

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   public dnv(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      ebq $$5 = $$1.a_($$2.d());
      boolean $$6 = $$5.g($$1, $$2).c() && $$5.y().c();
      if ($$6) {
         $$3.a($$0.c(b), $$2);
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected eya b_(ebq $$0) {
      return eyb.c.a(false);
   }

   public static void b(dkk $$0, iw $$1, ebq $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dkk $$0, iw $$1, ebq $$2, ebq $$3) {
      if (o($$2)) {
         ebq $$4 = q($$3);
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

   private static boolean o(ebq $$0) {
      return $$0.a(dnq.nJ) || $$0.a(dnq.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static ebq q(ebq $$0) {
      if ($$0.a(dnq.nJ)) {
         return $$0;
      } else if ($$0.a(dnq.en)) {
         return dnq.nJ.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dnq.lp) ? dnq.nJ.m().b(b, Boolean.valueOf(true)) : dnq.J.m();
      }
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lz.as, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awy.da, awz.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lz.at, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lz.at, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awy.cY, awz.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      $$2.a($$3, eyb.c, eyb.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jc.a || $$4 == jc.b && !$$6.a(dnq.nJ) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      ebq $$3 = $$1.a_($$2.e());
      return $$3.a(dnq.nJ) || $$3.a(dnq.lp) || $$3.a(dnq.en);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return fgt.a();
   }

   @Override
   protected dub a_(ebq $$0) {
      return dub.a;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   public dak a(@Nullable byf $$0, dkk $$1, iw $$2, ebq $$3) {
      $$1.a($$2, dnq.a.m(), 11);
      return new dak(dao.rp);
   }

   @Override
   public Optional<awx> ap_() {
      return eyb.c.j();
   }
}
