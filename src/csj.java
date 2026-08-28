import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class csj extends ctx {
   private static final int a = ayg.f(0.4F, 0.4F, 1.0F);
   private static final int b = 64;

   public csj(ctx.a $$0) {
      super($$0);
   }

   public static float c(cuc $$0) {
      cwo $$1 = $$0.a(kn.F, cwo.a);
      return $$1.e().floatValue();
   }

   @Override
   public boolean a(cuc $$0, crd $$1, cpq $$2, cmk $$3) {
      if ($$2 != cpq.b) {
         return false;
      } else {
         cwo $$4 = $$0.a(kn.F);
         if ($$4 == null) {
            return false;
         } else {
            cuc $$5 = $$1.g();
            cwo.a $$6 = new cwo.a($$4);
            if ($$5.e()) {
               this.a($$3);
               cuc $$7 = $$6.b();
               if ($$7 != null) {
                  cuc $$8 = $$1.d($$7);
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
   public boolean a(cuc $$0, cuc $$1, crd $$2, cpq $$3, cmk $$4, btt $$5) {
      if ($$3 == cpq.b && $$2.b($$4)) {
         cwo $$6 = $$0.a(kn.F);
         if ($$6 == null) {
            return false;
         } else {
            cwo.a $$7 = new cwo.a($$6);
            if ($$1.e()) {
               cuc $$8 = $$7.b();
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
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      cuc $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(avr.c.b(this));
         return bqh.a($$3, $$0.x_());
      } else {
         return bqh.d($$3);
      }
   }

   @Override
   public boolean d(cuc $$0) {
      cwo $$1 = $$0.a(kn.F, cwo.a);
      return $$1.e().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cuc $$0) {
      cwo $$1 = $$0.a(kn.F, cwo.a);
      return Math.min(1 + ayg.a($$1.e(), 12), 13);
   }

   @Override
   public int f(cuc $$0) {
      return a;
   }

   private static boolean a(cuc $$0, cmk $$1) {
      cwo $$2 = $$0.a(kn.F);
      if ($$2 != null && !$$2.f()) {
         $$0.b(kn.F, cwo.a);
         if ($$1 instanceof aqn) {
            $$2.c().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<crn> g(cuc $$0) {
      return !$$0.b(kn.q) && !$$0.b(kn.p) ? Optional.ofNullable($$0.a(kn.F)).map(crm::new) : Optional.empty();
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      cwo $$4 = $$0.a(kn.F);
      if ($$4 != null) {
         int $$5 = ayg.a($$4.e(), 64);
         $$2.add(wu.a("item.minecraft.bundle.fullness", $$5, 64).a(n.h));
      }
   }

   @Override
   public void a(ciu $$0) {
      cwo $$1 = $$0.p().a(kn.F);
      if ($$1 != null) {
         $$0.p().b(kn.F, cwo.a);
         cue.a($$0, $$1.c());
      }
   }

   private void a(bsg $$0) {
      $$0.a(avh.dq, 0.8F, 0.8F + $$0.dQ().E_().i() * 0.4F);
   }

   private void b(bsg $$0) {
      $$0.a(avh.dp, 0.8F, 0.8F + $$0.dQ().E_().i() * 0.4F);
   }

   private void c(bsg $$0) {
      $$0.a(avh.do, 0.8F, 0.8F + $$0.dQ().E_().i() * 0.4F);
   }
}
