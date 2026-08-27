import java.util.Optional;

public class cvf extends cpn implements cpt {
   private static final float a = 0.083333336F;
   private static final float b = 0.9F;
   private static final float c = 1.5F;
   private static final float d = 2.5F;
   private static final efb e = eey.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double f = 4.0;
   private static final double g = 7.0;

   public cvf(dca.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dcb $$0, dcb $$1, ha $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public efb f(dcb $$0, cls $$1, gu $$2) {
      return eey.a();
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
      if (!($$3 instanceof bfz) || $$3.dj().a(this)) {
         $$3.a($$0, new eei(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            apf $$4 = $$1.y_();
            boolean $$5 = $$3.ab != $$3.dn() || $$3.ad != $$3.dt();
            if ($$5 && $$4.h()) {
               $$1.a(
                  iv.aE,
                  $$3.dn(),
                  (double)($$2.v() + 1),
                  $$3.dt(),
                  (double)(apa.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(apa.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bL() && ($$1.X().b(cmi.c) || $$3 instanceof byo) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cmm $$0, dcb $$1, gu $$2, bfj $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bfz $$5) {
         bfz.a $$7 = $$5.eC();
         amg $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
      if ($$3 instanceof ees $$4) {
         bfj $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.aa > 2.5F) {
               return e;
            }

            boolean $$6 = $$5 instanceof bvg;
            if ($$6 || a($$5) && $$3.a(eey.b(), $$2, false) && !$$3.b()) {
               return super.c($$0, $$1, $$2, $$3);
            }
         }
      }

      return eey.a();
   }

   @Override
   public efb b(dcb $$0, cls $$1, gu $$2, een $$3) {
      return eey.a();
   }

   public static boolean a(bfj $$0) {
      if ($$0.ae().a(amz.f)) {
         return true;
      } else {
         return $$0 instanceof bfz ? ((bfz)$$0).c(bfo.c).a(cgc.oN) : false;
      }
   }

   @Override
   public cfz c(cmn $$0, gu $$1, dcb $$2) {
      $$0.a($$1, cpo.a.n(), 11);
      if (!$$0.r_()) {
         $$0.c(2001, $$1, cpn.i($$2));
      }

      return new cfz(cgc.pN);
   }

   @Override
   public Optional<amg> am_() {
      return Optional.of(amh.cF);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return true;
   }
}
