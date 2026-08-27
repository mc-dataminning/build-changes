import java.util.Optional;
import javax.annotation.Nullable;

public class cyd extends csl implements csr {
   private static final float a = 0.083333336F;
   private static final float b = 0.9F;
   private static final float c = 1.5F;
   private static final float d = 2.5F;
   private static final ehw e = eht.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double f = 4.0;
   private static final double g = 7.0;

   public cyd(dey.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dez $$0, dez $$1, ha $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public ehw f(dez $$0, cor $$1, gu $$2) {
      return eht.a();
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      if (!($$3 instanceof biy) || $$3.dl().a(this)) {
         $$3.a($$0, new ehd(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            aru $$4 = $$1.y_();
            boolean $$5 = $$3.ac != $$3.dp() || $$3.ae != $$3.dv();
            if ($$5 && $$4.h()) {
               $$1.a(
                  iv.aE,
                  $$3.dp(),
                  (double)($$2.v() + 1),
                  $$3.dv(),
                  (double)(arp.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(arp.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bM() && ($$1.X().b(cph.c) || $$3 instanceof cbm) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cpl $$0, dez $$1, gu $$2, bii $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof biy $$5) {
         biy.a $$7 = $$5.eE();
         aov $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      if ($$3 instanceof ehn $$4) {
         bii $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return e;
            }

            boolean $$6 = $$5 instanceof bye;
            if ($$6 || a($$5) && $$3.a(eht.b(), $$2, false) && !$$3.b()) {
               return super.c($$0, $$1, $$2, $$3);
            }
         }
      }

      return eht.a();
   }

   @Override
   public ehw b(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return eht.a();
   }

   public static boolean a(bii $$0) {
      if ($$0.ag().a(apo.f)) {
         return true;
      } else {
         return $$0 instanceof biy ? ((biy)$$0).c(bin.c).a(cja.oN) : false;
      }
   }

   @Override
   public cix a(@Nullable cbm $$0, cpm $$1, gu $$2, dez $$3) {
      $$1.a($$2, csm.a.n(), 11);
      if (!$$1.r_()) {
         $$1.c(2001, $$2, csl.i($$3));
      }

      return new cix(cja.pN);
   }

   @Override
   public Optional<aov> al_() {
      return Optional.of(aow.cF);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return true;
   }
}
