import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class csk extends cty {
   private static final int a = ayg.f(0.4F, 0.4F, 1.0F);
   private static final int b = 64;

   public csk(cty.a $$0) {
      super($$0);
   }

   public static float c(cud $$0) {
      cwp $$1 = $$0.a(kn.F, cwp.a);
      return $$1.e().floatValue();
   }

   @Override
   public boolean a(cud $$0, cre $$1, cpr $$2, cml $$3) {
      if ($$2 != cpr.b) {
         return false;
      } else {
         cwp $$4 = $$0.a(kn.F);
         if ($$4 == null) {
            return false;
         } else {
            cud $$5 = $$1.g();
            cwp.a $$6 = new cwp.a($$4);
            if ($$5.e()) {
               this.a($$3);
               cud $$7 = $$6.b();
               if ($$7 != null) {
                  cud $$8 = $$1.d($$7);
                  $$6.a($$8);
               }
            } else if ($$5.g().an_()) {
               int $$9 = $$6.a($$1, $$3);
               if ($$9 > 0) {
                  this.b($$3);
               }
            }

            $$0.b(kn.F, $$6.d());
            return true;
         }
      }
   }

   @Override
   public boolean a(cud $$0, cud $$1, cre $$2, cpr $$3, cml $$4, btu $$5) {
      if ($$3 == cpr.b && $$2.b($$4)) {
         cwp $$6 = $$0.a(kn.F);
         if ($$6 == null) {
            return false;
         } else {
            cwp.a $$7 = new cwp.a($$6);
            if ($$1.e()) {
               cud $$8 = $$7.b();
               if ($$8 != null) {
                  this.a($$4);
                  $$5.a($$8);
               }
            } else {
               int $$9 = $$7.a($$1);
               if ($$9 > 0) {
                  this.b($$4);
               }
            }

            $$0.b(kn.F, $$7.d());
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      cud $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(avr.c.b(this));
         return bqi.a($$3, $$0.x_());
      } else {
         return bqi.d($$3);
      }
   }

   @Override
   public boolean d(cud $$0) {
      cwp $$1 = $$0.a(kn.F, cwp.a);
      return $$1.e().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cud $$0) {
      cwp $$1 = $$0.a(kn.F, cwp.a);
      return Math.min(1 + ayg.a($$1.e(), 12), 13);
   }

   @Override
   public int f(cud $$0) {
      return a;
   }

   private static boolean a(cud $$0, cml $$1) {
      cwp $$2 = $$0.a(kn.F);
      if ($$2 != null && !$$2.f()) {
         $$0.b(kn.F, cwp.a);
         if ($$1 instanceof aqn) {
            $$2.c().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<cro> g(cud $$0) {
      return !$$0.b(kn.q) && !$$0.b(kn.p) ? Optional.ofNullable($$0.a(kn.F)).map(crn::new) : Optional.empty();
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      cwp $$4 = $$0.a(kn.F);
      if ($$4 != null) {
         int $$5 = ayg.a($$4.e(), 64);
         $$2.add(wu.a("item.minecraft.bundle.fullness", $$5, 64).a(n.h));
      }
   }

   @Override
   public void a(civ $$0) {
      cwp $$1 = $$0.p().a(kn.F);
      if ($$1 != null) {
         $$0.p().b(kn.F, cwp.a);
         cuf.a($$0, $$1.c());
      }
   }

   private void a(bsh $$0) {
      $$0.a(avh.dq, 0.8F, 0.8F + $$0.dR().E_().i() * 0.4F);
   }

   private void b(bsh $$0) {
      $$0.a(avh.dp, 0.8F, 0.8F + $$0.dR().E_().i() * 0.4F);
   }

   private void c(bsh $$0) {
      $$0.a(avh.do, 0.8F, 0.8F + $$0.dR().E_().i() * 0.4F);
   }
}
