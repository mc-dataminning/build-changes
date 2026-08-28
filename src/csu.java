import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class csu extends cuj {
   private static final int a = ayn.f(0.4F, 0.4F, 1.0F);
   private static final int b = 64;

   public csu(cuj.a $$0) {
      super($$0);
   }

   public static float c(cuo $$0) {
      cxd $$1 = $$0.a(kq.F, cxd.a);
      return $$1.e().floatValue();
   }

   @Override
   public boolean a(cuo $$0, cro $$1, cqb $$2, cmv $$3) {
      if ($$2 != cqb.b) {
         return false;
      } else {
         cxd $$4 = $$0.a(kq.F);
         if ($$4 == null) {
            return false;
         } else {
            cuo $$5 = $$1.g();
            cxd.a $$6 = new cxd.a($$4);
            if ($$5.e()) {
               this.a($$3);
               cuo $$7 = $$6.b();
               if ($$7 != null) {
                  cuo $$8 = $$1.d($$7);
                  $$6.a($$8);
               }
            } else if ($$5.g().an_()) {
               int $$9 = $$6.a($$1, $$3);
               if ($$9 > 0) {
                  this.b($$3);
               }
            }

            $$0.b(kq.F, $$6.d());
            return true;
         }
      }
   }

   @Override
   public boolean a(cuo $$0, cuo $$1, cro $$2, cqb $$3, cmv $$4, bue $$5) {
      if ($$3 == cqb.b && $$2.b($$4)) {
         cxd $$6 = $$0.a(kq.F);
         if ($$6 == null) {
            return false;
         } else {
            cxd.a $$7 = new cxd.a($$6);
            if ($$1.e()) {
               cuo $$8 = $$7.b();
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

            $$0.b(kq.F, $$7.d());
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      cuo $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(avy.c.b(this));
         return bqr.a($$3, $$0.x_());
      } else {
         return bqr.d($$3);
      }
   }

   @Override
   public boolean d(cuo $$0) {
      cxd $$1 = $$0.a(kq.F, cxd.a);
      return $$1.e().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cuo $$0) {
      cxd $$1 = $$0.a(kq.F, cxd.a);
      return Math.min(1 + ayn.a($$1.e(), 12), 13);
   }

   @Override
   public int f(cuo $$0) {
      return a;
   }

   private static boolean a(cuo $$0, cmv $$1) {
      cxd $$2 = $$0.a(kq.F);
      if ($$2 != null && !$$2.f()) {
         $$0.b(kq.F, cxd.a);
         if ($$1 instanceof aqu) {
            $$2.c().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<cry> g(cuo $$0) {
      return !$$0.b(kq.q) && !$$0.b(kq.p) ? Optional.ofNullable($$0.a(kq.F)).map(crx::new) : Optional.empty();
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      cxd $$4 = $$0.a(kq.F);
      if ($$4 != null) {
         int $$5 = ayn.a($$4.e(), 64);
         $$2.add(wy.a("item.minecraft.bundle.fullness", $$5, 64).a(n.h));
      }
   }

   @Override
   public void a(cjf $$0) {
      cxd $$1 = $$0.p().a(kq.F);
      if ($$1 != null) {
         $$0.p().b(kq.F, cxd.a);
         cuq.a($$0, $$1.c());
      }
   }

   private void a(bsq $$0) {
      $$0.a(avo.dq, 0.8F, 0.8F + $$0.dQ().E_().i() * 0.4F);
   }

   private void b(bsq $$0) {
      $$0.a(avo.dp, 0.8F, 0.8F + $$0.dQ().E_().i() * 0.4F);
   }

   private void c(bsq $$0) {
      $$0.a(avo.do, 0.8F, 0.8F + $$0.dQ().E_().i() * 0.4F);
   }
}
