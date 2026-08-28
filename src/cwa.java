import java.util.List;
import java.util.Optional;

public class cwa extends cwi {
   private static final xj a = xj.c("painting.random").a(n.h);
   private final bus<? extends cku> b;

   public cwa(bus<? extends cku> $$0, cwi.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bsk a(daf $$0) {
      jh $$1 = $$0.a();
      jm $$2 = $$0.k();
      jh $$3 = $$1.a($$2);
      cou $$4 = $$0.o();
      cwm $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bsk.d;
      } else {
         dfm $$6 = $$0.q();
         cku $$8;
         if (this.b == bus.aJ) {
            Optional<ckx> $$7 = ckx.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bsk.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bus.ar) {
            $$8 = new ckv($$6, $$3, $$2);
         } else {
            if (this.b != bus.ae) {
               return bsk.a;
            }

            $$8 = new ckt($$6, $$3, $$2);
         }

         cyv $$12 = $$5.a(ku.W, cyv.a);
         if (!$$12.b()) {
            bus.a($$6, $$4, $$8, $$12);
         }

         if ($$8.l()) {
            if (!$$6.C) {
               $$8.y();
               $$6.a($$4, ear.t, $$8.dt());
               $$6.b($$8);
            }

            $$5.h(1);
            return bsk.a;
         } else {
            return bsk.c;
         }
      }
   }

   protected boolean a(cou $$0, jm $$1, cwm $$2, jh $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      super.a($$0, $$1, $$2, $$3);
      js.a $$4 = $$1.a();
      if ($$4 != null && this.b == bus.aJ) {
         cyv $$5 = $$0.a(ku.W, cyv.a);
         if (!$$5.b()) {
            $$5.a($$4.a(uz.a), ckx.d).result().ifPresentOrElse($$1x -> {
               ((cky)$$1x.a()).e().ifPresent($$2::add);
               ((cky)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(xj.a("painting.dimensions", ((cky)$$1x.a()).b(), ((cky)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
