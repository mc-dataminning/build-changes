import java.util.Optional;
import javax.annotation.Nullable;

public class cyn extends csv implements ctb {
   private static final float a = 0.083333336F;
   private static final float b = 0.9F;
   private static final float c = 1.5F;
   private static final float d = 2.5F;
   private static final eig e = eid.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double f = 4.0;
   private static final double g = 7.0;

   public cyn(dfi.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dfj $$0, dfj $$1, ha $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public eig f(dfj $$0, cpb $$1, gw $$2) {
      return eid.a();
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      if (!($$3 instanceof bjg) || $$3.dm().a(this)) {
         $$3.a($$0, new ehn(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            asc $$4 = $$1.D_();
            boolean $$5 = $$3.ac != $$3.dq() || $$3.ae != $$3.dw();
            if ($$5 && $$4.h()) {
               $$1.a(
                  iv.aE,
                  $$3.dq(),
                  (double)($$2.v() + 1),
                  $$3.dw(),
                  (double)(arw.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(arw.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bM() && ($$1.X().b(cpr.c) || $$3 instanceof cbu) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cpv $$0, dfj $$1, gw $$2, biq $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bjg $$5) {
         bjg.a $$7 = $$5.eF();
         apc $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      if ($$3 instanceof ehx $$4) {
         biq $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return e;
            }

            boolean $$6 = $$5 instanceof bym;
            if ($$6 || a($$5) && $$3.a(eid.b(), $$2, false) && !$$3.b()) {
               return super.c($$0, $$1, $$2, $$3);
            }
         }
      }

      return eid.a();
   }

   @Override
   public eig b(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return eid.a();
   }

   public static boolean a(biq $$0) {
      if ($$0.ag().a(apv.f)) {
         return true;
      } else {
         return $$0 instanceof bjg ? ((bjg)$$0).c(biv.c).a(cji.oN) : false;
      }
   }

   @Override
   public cjf a(@Nullable cbu $$0, cpw $$1, gw $$2, dfj $$3) {
      $$1.a($$2, csw.a.n(), 11);
      if (!$$1.w_()) {
         $$1.c(2001, $$2, csv.i($$3));
      }

      return new cjf(cji.pN);
   }

   @Override
   public Optional<apc> aq_() {
      return Optional.of(apd.cF);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return true;
   }
}
