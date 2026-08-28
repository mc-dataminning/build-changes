import java.util.List;
import java.util.Optional;

public class cvp extends cvx {
   private static final xi a = xi.c("painting.random").a(n.h);
   private final bul<? extends ckn> b;

   public cvp(bul<? extends ckn> $$0, cvx.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bsd a(czu $$0) {
      jh $$1 = $$0.a();
      jm $$2 = $$0.k();
      jh $$3 = $$1.a($$2);
      com $$4 = $$0.o();
      cwb $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bsd.d;
      } else {
         dfb $$6 = $$0.q();
         ckn $$8;
         if (this.b == bul.av) {
            Optional<ckq> $$7 = ckq.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bsd.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bul.ai) {
            $$8 = new cko($$6, $$3, $$2);
         } else {
            if (this.b != bul.V) {
               return bsd.a;
            }

            $$8 = new ckm($$6, $$3, $$2);
         }

         cyk $$12 = $$5.a(ku.W, cyk.a);
         if (!$$12.b()) {
            bul.a($$6, $$4, $$8, $$12);
         }

         if ($$8.o()) {
            if (!$$6.C) {
               $$8.B();
               $$6.a($$4, eag.t, $$8.dv());
               $$6.b($$8);
            }

            $$5.h(1);
            return bsd.a;
         } else {
            return bsd.c;
         }
      }
   }

   protected boolean a(com $$0, jm $$1, cwb $$2, jh $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      super.a($$0, $$1, $$2, $$3);
      js.a $$4 = $$1.a();
      if ($$4 != null && this.b == bul.av) {
         cyk $$5 = $$0.a(ku.W, cyk.a);
         if (!$$5.b()) {
            $$5.a($$4.a(uy.a), ckq.e).result().ifPresentOrElse($$1x -> {
               ((ckr)$$1x.a()).e().ifPresent($$2::add);
               ((ckr)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(xi.a("painting.dimensions", ((ckr)$$1x.a()).b(), ((ckr)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
