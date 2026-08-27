import java.util.List;
import java.util.Optional;

public class crv extends ctj {
   private static final int a = ayd.f(0.4F, 0.4F, 1.0F);

   public crv(ctj.a $$0) {
      super($$0);
   }

   public static float d(cto $$0) {
      cwb $$1 = $$0.a(kb.E, cwb.b);
      return (float)$$1.c() / 64.0F;
   }

   @Override
   public boolean a(cto $$0, cqo $$1, cpb $$2, clw $$3) {
      if ($$2 != cpb.b) {
         return false;
      } else {
         cwb $$4 = $$0.a(kb.E);
         if ($$4 == null) {
            return false;
         } else {
            cto $$5 = $$1.g();
            cwb.a $$6 = new cwb.a($$4);
            if ($$5.e()) {
               this.a($$3);
               cto $$7 = $$6.a();
               if ($$7 != null) {
                  cto $$8 = $$1.d($$7);
                  $$6.a($$8);
               }
            } else if ($$5.g().am_()) {
               int $$9 = $$6.a($$1, $$3);
               if ($$9 > 0) {
                  this.b($$3);
               }
            }

            $$0.b(kb.E, $$6.c());
            return true;
         }
      }
   }

   @Override
   public boolean a(cto $$0, cto $$1, cqo $$2, cpb $$3, clw $$4, btg $$5) {
      if ($$3 == cpb.b && $$2.b($$4)) {
         cwb $$6 = $$0.a(kb.E);
         if ($$6 == null) {
            return false;
         } else {
            cwb.a $$7 = new cwb.a($$6);
            if ($$1.e()) {
               cto $$8 = $$7.a();
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

            $$0.b(kb.E, $$7.c());
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      cto $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(avr.c.b(this));
         return bpv.a($$3, $$0.x_());
      } else {
         return bpv.d($$3);
      }
   }

   @Override
   public boolean e(cto $$0) {
      cwb $$1 = $$0.a(kb.E, cwb.b);
      return $$1.c() > 0;
   }

   @Override
   public int f(cto $$0) {
      cwb $$1 = $$0.a(kb.E, cwb.b);
      return Math.min(1 + 12 * $$1.c() / 64, 13);
   }

   @Override
   public int g(cto $$0) {
      return a;
   }

   private static boolean a(cto $$0, clw $$1) {
      cwb $$2 = $$0.a(kb.E);
      if ($$2 != null && !$$2.d()) {
         $$0.b(kb.E, cwb.b);
         if ($$1 instanceof aqn) {
            $$2.a().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<cqy> h(cto $$0) {
      return !$$0.b(kb.p) && !$$0.b(kb.o) ? Optional.ofNullable($$0.a(kb.E)).map(cqx::new) : Optional.empty();
   }

   @Override
   public void a(cto $$0, dax $$1, List<wx> $$2, cvh $$3) {
      cwb $$4 = $$0.a(kb.E);
      if ($$4 != null) {
         $$2.add(wx.a("item.minecraft.bundle.fullness", $$4.c(), 64).a(n.h));
      }
   }

   @Override
   public void a(cig $$0) {
      cwb $$1 = $$0.p().a(kb.E);
      if ($$1 != null) {
         $$0.p().b(kb.E, cwb.b);
         ctq.a($$0, $$1.a());
      }
   }

   private void a(bru $$0) {
      $$0.a(avh.dq, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void b(bru $$0) {
      $$0.a(avh.dp, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void c(bru $$0) {
      $$0.a(avh.do, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }
}
