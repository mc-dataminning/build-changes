import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyu extends ctc implements ctj {
   public static final MapCodec<cyu> a = b(cyu::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final eia f = ehx.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<cyu> a() {
      return a;
   }

   public cyu(dfc.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dfd $$0, dfd $$1, ha $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public eia f(dfd $$0, cph $$1, gw $$2) {
      return ehx.a();
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      if (!($$3 instanceof bjm) || $$3.dm().a(this)) {
         $$3.a($$0, new ehh(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            ash $$4 = $$1.D_();
            boolean $$5 = $$3.ac != $$3.dq() || $$3.ae != $$3.dw();
            if ($$5 && $$4.h()) {
               $$1.a(
                  iv.aE,
                  $$3.dq(),
                  (double)($$2.v() + 1),
                  $$3.dw(),
                  (double)(asb.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(asb.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bM() && ($$1.X().b(cpx.c) || $$3 instanceof cca) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cqb $$0, dfd $$1, gw $$2, biw $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bjm $$5) {
         bjm.a $$7 = $$5.eF();
         apf $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      if ($$3 instanceof ehr $$4) {
         biw $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof bys;
            if ($$6 || a($$5) && $$3.a(ehx.b(), $$2, false) && !$$3.b()) {
               return super.c($$0, $$1, $$2, $$3);
            }
         }
      }

      return ehx.a();
   }

   @Override
   public eia b(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return ehx.a();
   }

   public static boolean a(biw $$0) {
      if ($$0.ag().a(apy.h)) {
         return true;
      } else {
         return $$0 instanceof bjm ? ((bjm)$$0).c(bjb.c).a(cjo.oN) : false;
      }
   }

   @Override
   public cjl a(@Nullable cca $$0, cqc $$1, gw $$2, dfd $$3) {
      $$1.a($$2, cte.a.o(), 11);
      if (!$$1.w_()) {
         $$1.c(2001, $$2, ctc.i($$3));
      }

      return new cjl(cjo.pN);
   }

   @Override
   public Optional<apf> aq_() {
      return Optional.of(apg.cF);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return true;
   }
}
