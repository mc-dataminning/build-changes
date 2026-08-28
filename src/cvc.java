import java.util.List;
import java.util.Optional;

public class cvc extends cvk {
   private static final xd a = xd.c("painting.random").a(n.h);
   private final btv<? extends cjw> b;

   public cvc(btv<? extends cjw> $$0, cvk.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public brp a(czm $$0) {
      je $$1 = $$0.a();
      jj $$2 = $$0.k();
      je $$3 = $$1.a($$2);
      cnu $$4 = $$0.o();
      cvp $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return brp.d;
      } else {
         deg $$6 = $$0.q();
         cjw $$8;
         if (this.b == btv.av) {
            Optional<cjz> $$7 = cjz.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return brp.c;
            }

            $$8 = $$7.get();
         } else if (this.b == btv.ai) {
            $$8 = new cjx($$6, $$3, $$2);
         } else {
            if (this.b != btv.V) {
               return brp.a;
            }

            $$8 = new cjv($$6, $$3, $$2);
         }

         cye $$12 = $$5.a(kr.R, cye.a);
         if (!$$12.b()) {
            btv.a($$6, $$4, $$8, $$12);
         }

         if ($$8.o()) {
            if (!$$6.B) {
               $$8.B();
               $$6.a($$4, dzl.t, $$8.dq());
               $$6.b($$8);
            }

            $$5.h(1);
            return brp.a;
         } else {
            return brp.c;
         }
      }
   }

   protected boolean a(cnu $$0, jj $$1, cvp $$2, je $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
      super.a($$0, $$1, $$2, $$3);
      jp.a $$4 = $$1.a();
      if ($$4 != null && this.b == btv.av) {
         cye $$5 = $$0.a(kr.R, cye.a);
         if (!$$5.b()) {
            $$5.a($$4.a(ut.a), cjz.e).result().ifPresentOrElse($$1x -> {
               ((cka)$$1x.a()).e().ifPresent($$2::add);
               ((cka)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(xd.a("painting.dimensions", ((cka)$$1x.a()).b(), ((cka)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
