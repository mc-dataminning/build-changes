import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class csh extends ctv {
   private static final int a = aye.f(0.4F, 0.4F, 1.0F);
   private static final int b = 64;

   public csh(ctv.a $$0) {
      super($$0);
   }

   public static float c(cua $$0) {
      cwm $$1 = $$0.a(kn.F, cwm.a);
      return $$1.e().floatValue();
   }

   @Override
   public boolean a(cua $$0, cra $$1, cpn $$2, cmh $$3) {
      if ($$2 != cpn.b) {
         return false;
      } else {
         cwm $$4 = $$0.a(kn.F);
         if ($$4 == null) {
            return false;
         } else {
            cua $$5 = $$1.g();
            cwm.a $$6 = new cwm.a($$4);
            if ($$5.e()) {
               this.a($$3);
               cua $$7 = $$6.b();
               if ($$7 != null) {
                  cua $$8 = $$1.d($$7);
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
   public boolean a(cua $$0, cua $$1, cra $$2, cpn $$3, cmh $$4, btq $$5) {
      if ($$3 == cpn.b && $$2.b($$4)) {
         cwm $$6 = $$0.a(kn.F);
         if ($$6 == null) {
            return false;
         } else {
            cwm.a $$7 = new cwm.a($$6);
            if ($$1.e()) {
               cua $$8 = $$7.b();
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
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(avp.c.b(this));
         return bqe.a($$3, $$0.x_());
      } else {
         return bqe.d($$3);
      }
   }

   @Override
   public boolean d(cua $$0) {
      cwm $$1 = $$0.a(kn.F, cwm.a);
      return $$1.e().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cua $$0) {
      cwm $$1 = $$0.a(kn.F, cwm.a);
      return Math.min(1 + aye.a($$1.e(), 12), 13);
   }

   @Override
   public int f(cua $$0) {
      return a;
   }

   private static boolean a(cua $$0, cmh $$1) {
      cwm $$2 = $$0.a(kn.F);
      if ($$2 != null && !$$2.f()) {
         $$0.b(kn.F, cwm.a);
         if ($$1 instanceof aql) {
            $$2.c().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<crk> g(cua $$0) {
      return !$$0.b(kn.q) && !$$0.b(kn.p) ? Optional.ofNullable($$0.a(kn.F)).map(crj::new) : Optional.empty();
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      cwm $$4 = $$0.a(kn.F);
      if ($$4 != null) {
         int $$5 = aye.a($$4.e(), 64);
         $$2.add(wu.a("item.minecraft.bundle.fullness", $$5, 64).a(n.h));
      }
   }

   @Override
   public void a(cir $$0) {
      cwm $$1 = $$0.p().a(kn.F);
      if ($$1 != null) {
         $$0.p().b(kn.F, cwm.a);
         cuc.a($$0, $$1.c());
      }
   }

   private void a(bsd $$0) {
      $$0.a(avf.dq, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void b(bsd $$0) {
      $$0.a(avf.dp, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void c(bsd $$0) {
      $$0.a(avf.do, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }
}
