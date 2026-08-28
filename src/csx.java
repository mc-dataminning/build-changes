import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class csx extends cul {
   private static final int a = ayz.f(0.4F, 0.4F, 1.0F);
   private static final int b = 64;

   public csx(cul.a $$0) {
      super($$0);
   }

   public static float d(cuq $$0) {
      cxd $$1 = $$0.a(km.F, cxd.a);
      return $$1.e().floatValue();
   }

   @Override
   public boolean a(cuq $$0, crq $$1, cqd $$2, cmy $$3) {
      if ($$2 != cqd.b) {
         return false;
      } else {
         cxd $$4 = $$0.a(km.F);
         if ($$4 == null) {
            return false;
         } else {
            cuq $$5 = $$1.g();
            cxd.a $$6 = new cxd.a($$4);
            if ($$5.e()) {
               this.a($$3);
               cuq $$7 = $$6.b();
               if ($$7 != null) {
                  cuq $$8 = $$1.d($$7);
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
   public boolean a(cuq $$0, cuq $$1, crq $$2, cqd $$3, cmy $$4, bui $$5) {
      if ($$3 == cqd.b && $$2.b($$4)) {
         cxd $$6 = $$0.a(km.F);
         if ($$6 == null) {
            return false;
         } else {
            cxd.a $$7 = new cxd.a($$6);
            if ($$1.e()) {
               cuq $$8 = $$7.b();
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
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      cuq $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(awk.c.b(this));
         return bqw.a($$3, $$0.x_());
      } else {
         return bqw.d($$3);
      }
   }

   @Override
   public boolean e(cuq $$0) {
      cxd $$1 = $$0.a(km.F, cxd.a);
      return $$1.e().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int f(cuq $$0) {
      cxd $$1 = $$0.a(km.F, cxd.a);
      return Math.min(1 + ayz.a($$1.e(), 12), 13);
   }

   @Override
   public int g(cuq $$0) {
      return a;
   }

   private static boolean a(cuq $$0, cmy $$1) {
      cxd $$2 = $$0.a(km.F);
      if ($$2 != null && !$$2.f()) {
         $$0.b(km.F, cxd.a);
         if ($$1 instanceof arg) {
            $$2.c().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<csa> h(cuq $$0) {
      return !$$0.b(km.q) && !$$0.b(km.p) ? Optional.ofNullable($$0.a(km.F)).map(crz::new) : Optional.empty();
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      cxd $$4 = $$0.a(km.F);
      if ($$4 != null) {
         int $$5 = ayz.a($$4.e(), 64);
         $$2.add(xp.a("item.minecraft.bundle.fullness", $$5, 64).a(n.h));
      }
   }

   @Override
   public void a(cji $$0) {
      cxd $$1 = $$0.p().a(km.F);
      if ($$1 != null) {
         $$0.p().b(km.F, cxd.a);
         cus.a($$0, $$1.c());
      }
   }

   private void a(bsv $$0) {
      $$0.a(awa.dq, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void b(bsv $$0) {
      $$0.a(awa.dp, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void c(bsv $$0) {
      $$0.a(awa.do, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }
}
