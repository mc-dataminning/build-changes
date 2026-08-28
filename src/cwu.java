import java.util.List;
import java.util.Optional;

public class cwu extends cxc {
   private static final xk a = xk.c("painting.random").a(n.h);
   private final bvi<? extends clk> b;

   public cwu(bvi<? extends clk> $$0, cxc.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bta a(daz $$0) {
      jh $$1 = $$0.a();
      jm $$2 = $$0.k();
      jh $$3 = $$1.a($$2);
      cpo $$4 = $$0.o();
      cxg $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bta.d;
      } else {
         dgz $$6 = $$0.q();
         clk $$8;
         if (this.b == bvi.aL) {
            Optional<cln> $$7 = cln.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bta.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bvi.at) {
            $$8 = new cll($$6, $$3, $$2);
         } else {
            if (this.b != bvi.ag) {
               return bta.a;
            }

            $$8 = new clj($$6, $$3, $$2);
         }

         czp $$12 = $$5.a(ku.W, czp.a);
         if (!$$12.c()) {
            bvi.a($$6, $$4, $$8, $$12);
         }

         if ($$8.m()) {
            if (!$$6.C) {
               $$8.z();
               $$6.a($$4, eck.t, $$8.du());
               $$6.b($$8);
            }

            $$5.h(1);
            return bta.a;
         } else {
            return bta.c;
         }
      }
   }

   protected boolean a(cpo $$0, jm $$1, cxg $$2, jh $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      super.a($$0, $$1, $$2, $$3);
      js.a $$4 = $$1.a();
      if ($$4 != null && this.b == bvi.aL) {
         czp $$5 = $$0.a(ku.W, czp.a);
         if (!$$5.c()) {
            $$5.a($$4.a(va.a), cln.d).result().ifPresentOrElse($$1x -> {
               ((clo)$$1x.a()).e().ifPresent($$2::add);
               ((clo)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(xk.a("painting.dimensions", ((clo)$$1x.a()).b(), ((clo)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
