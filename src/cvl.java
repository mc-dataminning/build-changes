import java.util.List;
import java.util.Optional;

public class cvl extends cvt {
   private static final xh a = xh.c("painting.random").a(n.h);
   private final bug<? extends cki> b;

   public cvl(bug<? extends cki> $$0, cvt.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bry a(czo $$0) {
      jg $$1 = $$0.a();
      jl $$2 = $$0.k();
      jg $$3 = $$1.a($$2);
      coh $$4 = $$0.o();
      cvx $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bry.d;
      } else {
         dev $$6 = $$0.q();
         cki $$8;
         if (this.b == bug.av) {
            Optional<ckl> $$7 = ckl.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bry.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bug.ai) {
            $$8 = new ckj($$6, $$3, $$2);
         } else {
            if (this.b != bug.V) {
               return bry.a;
            }

            $$8 = new ckh($$6, $$3, $$2);
         }

         cyg $$12 = $$5.a(kt.V, cyg.a);
         if (!$$12.b()) {
            bug.a($$6, $$4, $$8, $$12);
         }

         if ($$8.o()) {
            if (!$$6.C) {
               $$8.B();
               $$6.a($$4, eaa.t, $$8.dv());
               $$6.b($$8);
            }

            $$5.h(1);
            return bry.a;
         } else {
            return bry.c;
         }
      }
   }

   protected boolean a(coh $$0, jl $$1, cvx $$2, jg $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      super.a($$0, $$1, $$2, $$3);
      jr.a $$4 = $$1.a();
      if ($$4 != null && this.b == bug.av) {
         cyg $$5 = $$0.a(kt.V, cyg.a);
         if (!$$5.b()) {
            $$5.a($$4.a(ux.a), ckl.e).result().ifPresentOrElse($$1x -> {
               ((ckm)$$1x.a()).e().ifPresent($$2::add);
               ((ckm)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(xh.a("painting.dimensions", ((ckm)$$1x.a()).b(), ((ckm)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
