import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class csu extends cui {
   private static final int a = ayx.f(0.4F, 0.4F, 1.0F);
   private static final int b = 64;

   public csu(cui.a $$0) {
      super($$0);
   }

   public static float d(cun $$0) {
      cxa $$1 = $$0.a(km.E, cxa.a);
      return $$1.e().floatValue();
   }

   @Override
   public boolean a(cun $$0, crn $$1, cqa $$2, cmv $$3) {
      if ($$2 != cqa.b) {
         return false;
      } else {
         cxa $$4 = $$0.a(km.E);
         if ($$4 == null) {
            return false;
         } else {
            cun $$5 = $$1.g();
            cxa.a $$6 = new cxa.a($$4);
            if ($$5.e()) {
               this.a($$3);
               cun $$7 = $$6.b();
               if ($$7 != null) {
                  cun $$8 = $$1.d($$7);
                  $$6.a($$8);
               }
            } else if ($$5.g().an_()) {
               int $$9 = $$6.a($$1, $$3);
               if ($$9 > 0) {
                  this.b($$3);
               }
            }

            $$0.b(km.E, $$6.d());
            return true;
         }
      }
   }

   @Override
   public boolean a(cun $$0, cun $$1, crn $$2, cqa $$3, cmv $$4, buf $$5) {
      if ($$3 == cqa.b && $$2.b($$4)) {
         cxa $$6 = $$0.a(km.E);
         if ($$6 == null) {
            return false;
         } else {
            cxa.a $$7 = new cxa.a($$6);
            if ($$1.e()) {
               cun $$8 = $$7.b();
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

            $$0.b(km.E, $$7.d());
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(awj.c.b(this));
         return bqt.a($$3, $$0.x_());
      } else {
         return bqt.d($$3);
      }
   }

   @Override
   public boolean e(cun $$0) {
      cxa $$1 = $$0.a(km.E, cxa.a);
      return $$1.e().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int f(cun $$0) {
      cxa $$1 = $$0.a(km.E, cxa.a);
      return Math.min(1 + ayx.a($$1.e(), 12), 13);
   }

   @Override
   public int g(cun $$0) {
      return a;
   }

   private static boolean a(cun $$0, cmv $$1) {
      cxa $$2 = $$0.a(km.E);
      if ($$2 != null && !$$2.f()) {
         $$0.b(km.E, cxa.a);
         if ($$1 instanceof arf) {
            $$2.c().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<crx> h(cun $$0) {
      return !$$0.b(km.p) && !$$0.b(km.o) ? Optional.ofNullable($$0.a(km.E)).map(crw::new) : Optional.empty();
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      cxa $$4 = $$0.a(km.E);
      if ($$4 != null) {
         int $$5 = ayx.a($$4.e(), 64);
         $$2.add(xo.a("item.minecraft.bundle.fullness", $$5, 64).a(n.h));
      }
   }

   @Override
   public void a(cjf $$0) {
      cxa $$1 = $$0.p().a(km.E);
      if ($$1 != null) {
         $$0.p().b(km.E, cxa.a);
         cup.a($$0, $$1.c());
      }
   }

   private void a(bss $$0) {
      $$0.a(avz.dq, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void b(bss $$0) {
      $$0.a(avz.dp, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void c(bss $$0) {
      $$0.a(avz.do, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }
}
