import java.util.List;
import java.util.Optional;

public class cwb extends cwj {
   private static final wo a = wo.c("painting.random").a(n.h);
   private final buq<? extends cks> b;

   public cwb(buq<? extends cks> $$0, cwj.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bsi a(dag $$0) {
      ji $$1 = $$0.a();
      jn $$2 = $$0.k();
      ji $$3 = $$1.a($$2);
      cov $$4 = $$0.o();
      cwn $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bsi.d;
      } else {
         dgg $$6 = $$0.q();
         cks $$8;
         if (this.b == buq.aK) {
            Optional<ckv> $$7 = ckv.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bsi.c;
            }

            $$8 = $$7.get();
         } else if (this.b == buq.as) {
            $$8 = new ckt($$6, $$3, $$2);
         } else {
            if (this.b != buq.af) {
               return bsi.a;
            }

            $$8 = new ckr($$6, $$3, $$2);
         }

         cyw $$12 = $$5.a(kv.W, cyw.a);
         if (!$$12.c()) {
            buq.a($$6, $$4, $$8, $$12);
         }

         if ($$8.m()) {
            if (!$$6.C) {
               $$8.z();
               $$6.a($$4, ebr.t, $$8.du());
               $$6.b($$8);
            }

            $$5.h(1);
            return bsi.a;
         } else {
            return bsi.c;
         }
      }
   }

   protected boolean a(cov $$0, jn $$1, cwn $$2, ji $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      super.a($$0, $$1, $$2, $$3);
      jt.a $$4 = $$1.a();
      if ($$4 != null && this.b == buq.aK) {
         cyw $$5 = $$0.a(kv.W, cyw.a);
         if (!$$5.c()) {
            $$5.a($$4.a(ue.a), ckv.d).result().ifPresentOrElse($$1x -> {
               ((ckw)$$1x.a()).e().ifPresent($$2::add);
               ((ckw)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(wo.a("painting.dimensions", ((ckw)$$1x.a()).b(), ((ckw)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
