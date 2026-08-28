import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class csy extends cum {
   private static final int a = ayz.f(0.4F, 0.4F, 1.0F);
   private static final int b = 64;

   public csy(cum.a $$0) {
      super($$0);
   }

   public static float d(cur $$0) {
      cxe $$1 = $$0.a(km.F, cxe.a);
      return $$1.e().floatValue();
   }

   @Override
   public boolean a(cur $$0, crr $$1, cqe $$2, cmz $$3) {
      if ($$2 != cqe.b) {
         return false;
      } else {
         cxe $$4 = $$0.a(km.F);
         if ($$4 == null) {
            return false;
         } else {
            cur $$5 = $$1.g();
            cxe.a $$6 = new cxe.a($$4);
            if ($$5.e()) {
               this.a($$3);
               cur $$7 = $$6.b();
               if ($$7 != null) {
                  cur $$8 = $$1.d($$7);
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
   public boolean a(cur $$0, cur $$1, crr $$2, cqe $$3, cmz $$4, buj $$5) {
      if ($$3 == cqe.b && $$2.b($$4)) {
         cxe $$6 = $$0.a(km.F);
         if ($$6 == null) {
            return false;
         } else {
            cxe.a $$7 = new cxe.a($$6);
            if ($$1.e()) {
               cur $$8 = $$7.b();
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
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      cur $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(awk.c.b(this));
         return bqx.a($$3, $$0.x_());
      } else {
         return bqx.d($$3);
      }
   }

   @Override
   public boolean e(cur $$0) {
      cxe $$1 = $$0.a(km.F, cxe.a);
      return $$1.e().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int f(cur $$0) {
      cxe $$1 = $$0.a(km.F, cxe.a);
      return Math.min(1 + ayz.a($$1.e(), 12), 13);
   }

   @Override
   public int g(cur $$0) {
      return a;
   }

   private static boolean a(cur $$0, cmz $$1) {
      cxe $$2 = $$0.a(km.F);
      if ($$2 != null && !$$2.f()) {
         $$0.b(km.F, cxe.a);
         if ($$1 instanceof arg) {
            $$2.c().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<csb> h(cur $$0) {
      return !$$0.b(km.q) && !$$0.b(km.p) ? Optional.ofNullable($$0.a(km.F)).map(csa::new) : Optional.empty();
   }

   @Override
   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
      cxe $$4 = $$0.a(km.F);
      if ($$4 != null) {
         int $$5 = ayz.a($$4.e(), 64);
         $$2.add(xp.a("item.minecraft.bundle.fullness", $$5, 64).a(n.h));
      }
   }

   @Override
   public void a(cjj $$0) {
      cxe $$1 = $$0.p().a(km.F);
      if ($$1 != null) {
         $$0.p().b(km.F, cxe.a);
         cut.a($$0, $$1.c());
      }
   }

   private void a(bsw $$0) {
      $$0.a(awa.dq, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void b(bsw $$0) {
      $$0.a(awa.dp, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void c(bsw $$0) {
      $$0.a(awa.do, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }
}
