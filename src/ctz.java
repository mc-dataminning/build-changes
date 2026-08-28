import java.util.List;
import java.util.Optional;

public class ctz extends cui {
   private static final xo a = xo.c("painting.random").a(n.h);
   private final bsy<? extends cix> b;

   public ctz(bsy<? extends cix> $$0, cui.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bqs a(cya $$0) {
      iz $$1 = $$0.a();
      je $$2 = $$0.k();
      iz $$3 = $$1.a($$2);
      cmv $$4 = $$0.o();
      cun $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bqs.f;
      } else {
         dbw $$6 = $$0.q();
         cix $$8;
         if (this.b == bsy.av) {
            Optional<cja> $$7 = cja.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bqs.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bsy.ai) {
            $$8 = new ciy($$6, $$3, $$2);
         } else {
            if (this.b != bsy.V) {
               return bqs.a($$6.B);
            }

            $$8 = new ciw($$6, $$3, $$2);
         }

         cxc $$12 = $$5.a(km.L, cxc.a);
         if (!$$12.b()) {
            bsy.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dwt.t, $$8.dn());
               $$6.b($$8);
            }

            $$5.h(1);
            return bqs.a($$6.B);
         } else {
            return bqs.c;
         }
      }
   }

   protected boolean a(cmv $$0, je $$1, cun $$2, iz $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bsy.av) {
         cxc $$4 = $$0.a(km.L, cxc.a);
         if (!$$4.b()) {
            $$4.a(cja.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(xo.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(xo.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(xo.a("painting.dimensions", ayx.e(((cjb)$$1x.a()).a(), 16), ayx.e(((cjb)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
