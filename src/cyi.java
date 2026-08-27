import java.util.Optional;
import javax.annotation.Nullable;

public class cyi extends csq implements csw {
   private static final float a = 0.083333336F;
   private static final float b = 0.9F;
   private static final float c = 1.5F;
   private static final float d = 2.5F;
   private static final eib e = ehy.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double f = 4.0;
   private static final double g = 7.0;

   public cyi(dfd.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dfe $$0, dfe $$1, hc $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public eib f(dfe $$0, cow $$1, gw $$2) {
      return ehy.a();
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      if (!($$3 instanceof bjb) || $$3.dl().a(this)) {
         $$3.a($$0, new ehi(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            arx $$4 = $$1.y_();
            boolean $$5 = $$3.ac != $$3.dp() || $$3.ae != $$3.dv();
            if ($$5 && $$4.h()) {
               $$1.a(
                  ix.aE,
                  $$3.dp(),
                  (double)($$2.v() + 1),
                  $$3.dv(),
                  (double)(ars.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ars.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bM() && ($$1.X().b(cpm.c) || $$3 instanceof cbp) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cpq $$0, dfe $$1, gw $$2, bil $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bjb $$5) {
         bjb.a $$7 = $$5.eE();
         aoy $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      if ($$3 instanceof ehs $$4) {
         bil $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return e;
            }

            boolean $$6 = $$5 instanceof byh;
            if ($$6 || a($$5) && $$3.a(ehy.b(), $$2, false) && !$$3.b()) {
               return super.c($$0, $$1, $$2, $$3);
            }
         }
      }

      return ehy.a();
   }

   @Override
   public eib b(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return ehy.a();
   }

   public static boolean a(bil $$0) {
      if ($$0.ag().a(apr.f)) {
         return true;
      } else {
         return $$0 instanceof bjb ? ((bjb)$$0).c(biq.c).a(cjd.oN) : false;
      }
   }

   @Override
   public cja a(@Nullable cbp $$0, cpr $$1, gw $$2, dfe $$3) {
      $$1.a($$2, csr.a.n(), 11);
      if (!$$1.r_()) {
         $$1.c(2001, $$2, csq.i($$3));
      }

      return new cja(cjd.pN);
   }

   @Override
   public Optional<aoy> al_() {
      return Optional.of(aoz.cF);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return true;
   }
}
