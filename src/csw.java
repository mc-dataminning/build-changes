import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class csw extends cuk {
   private static final int a = ayz.f(0.4F, 0.4F, 1.0F);
   private static final int b = 64;

   public csw(cuk.a $$0) {
      super($$0);
   }

   public static float d(cup $$0) {
      cxc $$1 = $$0.a(km.F, cxc.a);
      return $$1.e().floatValue();
   }

   @Override
   public boolean a(cup $$0, crp $$1, cqc $$2, cmx $$3) {
      if ($$2 != cqc.b) {
         return false;
      } else {
         cxc $$4 = $$0.a(km.F);
         if ($$4 == null) {
            return false;
         } else {
            cup $$5 = $$1.g();
            cxc.a $$6 = new cxc.a($$4);
            if ($$5.e()) {
               this.a($$3);
               cup $$7 = $$6.b();
               if ($$7 != null) {
                  cup $$8 = $$1.d($$7);
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
   public boolean a(cup $$0, cup $$1, crp $$2, cqc $$3, cmx $$4, buh $$5) {
      if ($$3 == cqc.b && $$2.b($$4)) {
         cxc $$6 = $$0.a(km.F);
         if ($$6 == null) {
            return false;
         } else {
            cxc.a $$7 = new cxc.a($$6);
            if ($$1.e()) {
               cup $$8 = $$7.b();
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
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      cup $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(awk.c.b(this));
         return bqv.a($$3, $$0.x_());
      } else {
         return bqv.d($$3);
      }
   }

   @Override
   public boolean e(cup $$0) {
      cxc $$1 = $$0.a(km.F, cxc.a);
      return $$1.e().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int f(cup $$0) {
      cxc $$1 = $$0.a(km.F, cxc.a);
      return Math.min(1 + ayz.a($$1.e(), 12), 13);
   }

   @Override
   public int g(cup $$0) {
      return a;
   }

   private static boolean a(cup $$0, cmx $$1) {
      cxc $$2 = $$0.a(km.F);
      if ($$2 != null && !$$2.f()) {
         $$0.b(km.F, cxc.a);
         if ($$1 instanceof arg) {
            $$2.c().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<crz> h(cup $$0) {
      return !$$0.b(km.q) && !$$0.b(km.p) ? Optional.ofNullable($$0.a(km.F)).map(cry::new) : Optional.empty();
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      cxc $$4 = $$0.a(km.F);
      if ($$4 != null) {
         int $$5 = ayz.a($$4.e(), 64);
         $$2.add(xp.a("item.minecraft.bundle.fullness", $$5, 64).a(n.h));
      }
   }

   @Override
   public void a(cjh $$0) {
      cxc $$1 = $$0.p().a(km.F);
      if ($$1 != null) {
         $$0.p().b(km.F, cxc.a);
         cur.a($$0, $$1.c());
      }
   }

   private void a(bsu $$0) {
      $$0.a(awa.dq, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void b(bsu $$0) {
      $$0.a(awa.dp, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void c(bsu $$0) {
      $$0.a(awa.do, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }
}
