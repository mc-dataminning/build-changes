import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class csw extends cul {
   private static final int a = ayo.f(0.4F, 0.4F, 1.0F);
   private static final int b = 64;

   public csw(cul.a $$0) {
      super($$0);
   }

   public static float c(cuq $$0) {
      cxf $$1 = $$0.a(kq.F, cxf.a);
      return $$1.e().floatValue();
   }

   @Override
   public boolean a(cuq $$0, crq $$1, cqd $$2, cmx $$3) {
      if ($$2 != cqd.b) {
         return false;
      } else {
         cxf $$4 = $$0.a(kq.F);
         if ($$4 == null) {
            return false;
         } else {
            cuq $$5 = $$1.g();
            cxf.a $$6 = new cxf.a($$4);
            if ($$5.e()) {
               this.a($$3);
               cuq $$7 = $$6.b();
               if ($$7 != null) {
                  cuq $$8 = $$1.d($$7);
                  $$6.a($$8);
               }
            } else if ($$5.g().ar_()) {
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
   public boolean a(cuq $$0, cuq $$1, crq $$2, cqd $$3, cmx $$4, bug $$5) {
      if ($$3 == cqd.b && $$2.b($$4)) {
         cxf $$6 = $$0.a(kq.F);
         if ($$6 == null) {
            return false;
         } else {
            cxf.a $$7 = new cxf.a($$6);
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

            $$0.b(kq.F, $$7.d());
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(avz.c.b(this));
         return bqs.a($$3, $$0.x_());
      } else {
         return bqs.d($$3);
      }
   }

   @Override
   public boolean d(cuq $$0) {
      cxf $$1 = $$0.a(kq.F, cxf.a);
      return $$1.e().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cuq $$0) {
      cxf $$1 = $$0.a(kq.F, cxf.a);
      return Math.min(1 + ayo.a($$1.e(), 12), 13);
   }

   @Override
   public int f(cuq $$0) {
      return a;
   }

   private static boolean a(cuq $$0, cmx $$1) {
      cxf $$2 = $$0.a(kq.F);
      if ($$2 != null && !$$2.f()) {
         $$0.b(kq.F, cxf.a);
         if ($$1 instanceof aqv) {
            $$2.c().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<csa> g(cuq $$0) {
      return !$$0.b(kq.q) && !$$0.b(kq.p) ? Optional.ofNullable($$0.a(kq.F)).map(crz::new) : Optional.empty();
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      cxf $$4 = $$0.a(kq.F);
      if ($$4 != null) {
         int $$5 = ayo.a($$4.e(), 64);
         $$2.add(wz.a("item.minecraft.bundle.fullness", $$5, 64).a(n.h));
      }
   }

   @Override
   public void a(cjh $$0) {
      cxf $$1 = $$0.p().a(kq.F);
      if ($$1 != null) {
         $$0.p().b(kq.F, cxf.a);
         cus.a($$0, $$1.c());
      }
   }

   private void a(bsr $$0) {
      $$0.a(avp.dq, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void b(bsr $$0) {
      $$0.a(avp.dp, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void c(bsr $$0) {
      $$0.a(avp.do, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }
}
