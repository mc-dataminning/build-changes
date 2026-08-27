import java.util.Optional;
import javax.annotation.Nullable;

public class cyc extends csk implements csq {
   private static final float a = 0.083333336F;
   private static final float b = 0.9F;
   private static final float c = 1.5F;
   private static final float d = 2.5F;
   private static final ehy e = ehv.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double f = 4.0;
   private static final double g = 7.0;

   public cyc(dex.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dey $$0, dey $$1, hb $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public ehy f(dey $$0, coq $$1, gv $$2) {
      return ehv.a();
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if (!($$3 instanceof biw) || $$3.dl().a(this)) {
         $$3.a($$0, new ehf(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            art $$4 = $$1.y_();
            boolean $$5 = $$3.ac != $$3.dp() || $$3.ae != $$3.dv();
            if ($$5 && $$4.h()) {
               $$1.a(
                  iw.aE,
                  $$3.dp(),
                  (double)($$2.v() + 1),
                  $$3.dv(),
                  (double)(aro.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(aro.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bM() && ($$1.X().b(cpg.c) || $$3 instanceof cbl) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cpk $$0, dey $$1, gv $$2, big $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof biw $$5) {
         biw.a $$7 = $$5.eE();
         aot $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      if ($$3 instanceof ehp $$4) {
         big $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return e;
            }

            boolean $$6 = $$5 instanceof byd;
            if ($$6 || a($$5) && $$3.a(ehv.b(), $$2, false) && !$$3.b()) {
               return super.c($$0, $$1, $$2, $$3);
            }
         }
      }

      return ehv.a();
   }

   @Override
   public ehy b(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return ehv.a();
   }

   public static boolean a(big $$0) {
      if ($$0.ag().a(apm.f)) {
         return true;
      } else {
         return $$0 instanceof biw ? ((biw)$$0).c(bil.c).a(ciz.oN) : false;
      }
   }

   @Override
   public ciw a(@Nullable cbl $$0, cpl $$1, gv $$2, dey $$3) {
      $$1.a($$2, csl.a.n(), 11);
      if (!$$1.r_()) {
         $$1.c(2001, $$2, csk.i($$3));
      }

      return new ciw(ciz.pN);
   }

   @Override
   public Optional<aot> am_() {
      return Optional.of(aou.cF);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return true;
   }
}
