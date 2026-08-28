import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class csv extends cuj {
   private static final int a = ayy.f(0.4F, 0.4F, 1.0F);
   private static final int b = 64;

   public csv(cuj.a $$0) {
      super($$0);
   }

   public static float d(cuo $$0) {
      cxb $$1 = $$0.a(km.F, cxb.a);
      return $$1.e().floatValue();
   }

   @Override
   public boolean a(cuo $$0, cro $$1, cqb $$2, cmw $$3) {
      if ($$2 != cqb.b) {
         return false;
      } else {
         cxb $$4 = $$0.a(km.F);
         if ($$4 == null) {
            return false;
         } else {
            cuo $$5 = $$1.g();
            cxb.a $$6 = new cxb.a($$4);
            if ($$5.e()) {
               this.a($$3);
               cuo $$7 = $$6.b();
               if ($$7 != null) {
                  cuo $$8 = $$1.d($$7);
                  $$6.a($$8);
               }
            } else if ($$5.g().am_()) {
               int $$9 = $$6.a($$1, $$3);
               if ($$9 > 0) {
                  this.b($$3);
               }
            }

            $$0.b(km.F, $$6.d());
            return true;
         }
      }
   }

   @Override
   public boolean a(cuo $$0, cuo $$1, cro $$2, cqb $$3, cmw $$4, bug $$5) {
      if ($$3 == cqb.b && $$2.b($$4)) {
         cxb $$6 = $$0.a(km.F);
         if ($$6 == null) {
            return false;
         } else {
            cxb.a $$7 = new cxb.a($$6);
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

            $$0.b(km.F, $$7.d());
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      cuo $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(awj.c.b(this));
         return bqu.a($$3, $$0.x_());
      } else {
         return bqu.d($$3);
      }
   }

   @Override
   public boolean e(cuo $$0) {
      cxb $$1 = $$0.a(km.F, cxb.a);
      return $$1.e().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int f(cuo $$0) {
      cxb $$1 = $$0.a(km.F, cxb.a);
      return Math.min(1 + ayy.a($$1.e(), 12), 13);
   }

   @Override
   public int g(cuo $$0) {
      return a;
   }

   private static boolean a(cuo $$0, cmw $$1) {
      cxb $$2 = $$0.a(km.F);
      if ($$2 != null && !$$2.f()) {
         $$0.b(km.F, cxb.a);
         if ($$1 instanceof arf) {
            $$2.c().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<cry> h(cuo $$0) {
      return !$$0.b(km.q) && !$$0.b(km.p) ? Optional.ofNullable($$0.a(km.F)).map(crx::new) : Optional.empty();
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      cxb $$4 = $$0.a(km.F);
      if ($$4 != null) {
         int $$5 = ayy.a($$4.e(), 64);
         $$2.add(xo.a("item.minecraft.bundle.fullness", $$5, 64).a(n.h));
      }
   }

   @Override
   public void a(cjg $$0) {
      cxb $$1 = $$0.p().a(km.F);
      if ($$1 != null) {
         $$0.p().b(km.F, cxb.a);
         cuq.a($$0, $$1.c());
      }
   }

   private void a(bst $$0) {
      $$0.a(avz.dq, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void b(bst $$0) {
      $$0.a(avz.dp, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void c(bst $$0) {
      $$0.a(avz.do, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }
}
