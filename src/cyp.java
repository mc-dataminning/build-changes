import java.util.Optional;
import javax.annotation.Nullable;

public class cyp extends csx implements ctd {
   private static final float a = 0.083333336F;
   private static final float b = 0.9F;
   private static final float c = 1.5F;
   private static final float d = 2.5F;
   private static final eii e = eif.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double f = 4.0;
   private static final double g = 7.0;

   public cyp(dfk.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dfl $$0, dfl $$1, hc $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public eii f(dfl $$0, cpd $$1, gw $$2) {
      return eif.a();
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      if (!($$3 instanceof bji) || $$3.dm().a(this)) {
         $$3.a($$0, new ehp(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            ase $$4 = $$1.D_();
            boolean $$5 = $$3.ac != $$3.dq() || $$3.ae != $$3.dw();
            if ($$5 && $$4.h()) {
               $$1.a(
                  ix.aE,
                  $$3.dq(),
                  (double)($$2.v() + 1),
                  $$3.dw(),
                  (double)(ary.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ary.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bM() && ($$1.X().b(cpt.c) || $$3 instanceof cbw) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cpx $$0, dfl $$1, gw $$2, bis $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bji $$5) {
         bji.a $$7 = $$5.eF();
         ape $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      if ($$3 instanceof ehz $$4) {
         bis $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return e;
            }

            boolean $$6 = $$5 instanceof byo;
            if ($$6 || a($$5) && $$3.a(eif.b(), $$2, false) && !$$3.b()) {
               return super.c($$0, $$1, $$2, $$3);
            }
         }
      }

      return eif.a();
   }

   @Override
   public eii b(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return eif.a();
   }

   public static boolean a(bis $$0) {
      if ($$0.ag().a(apx.f)) {
         return true;
      } else {
         return $$0 instanceof bji ? ((bji)$$0).c(bix.c).a(cjk.oN) : false;
      }
   }

   @Override
   public cjh a(@Nullable cbw $$0, cpy $$1, gw $$2, dfl $$3) {
      $$1.a($$2, csy.a.n(), 11);
      if (!$$1.w_()) {
         $$1.c(2001, $$2, csx.i($$3));
      }

      return new cjh(cjk.pN);
   }

   @Override
   public Optional<ape> aq_() {
      return Optional.of(apf.cF);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return true;
   }
}
