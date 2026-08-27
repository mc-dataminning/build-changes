import java.util.Optional;
import javax.annotation.Nullable;

public class cye extends csm implements css {
   private static final float a = 0.083333336F;
   private static final float b = 0.9F;
   private static final float c = 1.5F;
   private static final float d = 2.5F;
   private static final ehx e = ehu.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double f = 4.0;
   private static final double g = 7.0;

   public cye(dez.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dfa $$0, dfa $$1, ha $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public ehx f(dfa $$0, cos $$1, gu $$2) {
      return ehu.a();
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      if (!($$3 instanceof biy) || $$3.dl().a(this)) {
         $$3.a($$0, new ehe(0.9F, 1.5, 0.9F));
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
         if ($$3.bM() && ($$1.X().b(cpi.c) || $$3 instanceof cbn) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cpm $$0, dfa $$1, gu $$2, bii $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof biy $$5) {
         biy.a $$7 = $$5.eE();
         aov $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      if ($$3 instanceof eho $$4) {
         bii $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return e;
            }

            boolean $$6 = $$5 instanceof byf;
            if ($$6 || a($$5) && $$3.a(ehu.b(), $$2, false) && !$$3.b()) {
               return super.c($$0, $$1, $$2, $$3);
            }
         }
      }

      return ehu.a();
   }

   @Override
   public ehx b(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return ehu.a();
   }

   public static boolean a(bii $$0) {
      if ($$0.ag().a(apo.f)) {
         return true;
      } else {
         return $$0 instanceof biy ? ((biy)$$0).c(bin.c).a(cjb.oN) : false;
      }
   }

   @Override
   public ciy a(@Nullable cbn $$0, cpn $$1, gu $$2, dfa $$3) {
      $$1.a($$2, csn.a.n(), 11);
      if (!$$1.r_()) {
         $$1.c(2001, $$2, csm.i($$3));
      }

      return new ciy(cjb.pN);
   }

   @Override
   public Optional<aov> am_() {
      return Optional.of(aow.cF);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return true;
   }
}
