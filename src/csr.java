import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class csr extends cuf {
   private static final int a = ayu.f(0.4F, 0.4F, 1.0F);
   private static final int b = 64;

   public csr(cuf.a $$0) {
      super($$0);
   }

   public static float d(cuk $$0) {
      cwx $$1 = $$0.a(km.E, cwx.a);
      return $$1.e().floatValue();
   }

   @Override
   public boolean a(cuk $$0, crk $$1, cpx $$2, cms $$3) {
      if ($$2 != cpx.b) {
         return false;
      } else {
         cwx $$4 = $$0.a(km.E);
         if ($$4 == null) {
            return false;
         } else {
            cuk $$5 = $$1.g();
            cwx.a $$6 = new cwx.a($$4);
            if ($$5.e()) {
               this.a($$3);
               cuk $$7 = $$6.b();
               if ($$7 != null) {
                  cuk $$8 = $$1.d($$7);
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
   public boolean a(cuk $$0, cuk $$1, crk $$2, cpx $$3, cms $$4, buc $$5) {
      if ($$3 == cpx.b && $$2.b($$4)) {
         cwx $$6 = $$0.a(km.E);
         if ($$6 == null) {
            return false;
         } else {
            cwx.a $$7 = new cwx.a($$6);
            if ($$1.e()) {
               cuk $$8 = $$7.b();
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
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(awg.c.b(this));
         return bqq.a($$3, $$0.x_());
      } else {
         return bqq.d($$3);
      }
   }

   @Override
   public boolean e(cuk $$0) {
      cwx $$1 = $$0.a(km.E, cwx.a);
      return $$1.e().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int f(cuk $$0) {
      cwx $$1 = $$0.a(km.E, cwx.a);
      return Math.min(1 + ayu.a($$1.e(), 12), 13);
   }

   @Override
   public int g(cuk $$0) {
      return a;
   }

   private static boolean a(cuk $$0, cms $$1) {
      cwx $$2 = $$0.a(km.E);
      if ($$2 != null && !$$2.f()) {
         $$0.b(km.E, cwx.a);
         if ($$1 instanceof arc) {
            $$2.c().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<cru> h(cuk $$0) {
      return !$$0.b(km.p) && !$$0.b(km.o) ? Optional.ofNullable($$0.a(km.E)).map(crt::new) : Optional.empty();
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      cwx $$4 = $$0.a(km.E);
      if ($$4 != null) {
         int $$5 = ayu.a($$4.e(), 64);
         $$2.add(xl.a("item.minecraft.bundle.fullness", $$5, 64).a(n.h));
      }
   }

   @Override
   public void a(cjc $$0) {
      cwx $$1 = $$0.p().a(km.E);
      if ($$1 != null) {
         $$0.p().b(km.E, cwx.a);
         cum.a($$0, $$1.c());
      }
   }

   private void a(bsp $$0) {
      $$0.a(avw.dq, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void b(bsp $$0) {
      $$0.a(avw.dp, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void c(bsp $$0) {
      $$0.a(avw.do, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }
}
