import java.util.List;
import java.util.Optional;

public class cub extends cuk {
   private static final xp a = xp.c("painting.random").a(n.h);
   private final bta<? extends ciz> b;

   public cub(bta<? extends ciz> $$0, cuk.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bqu a(cyc $$0) {
      iz $$1 = $$0.a();
      je $$2 = $$0.k();
      iz $$3 = $$1.a($$2);
      cmx $$4 = $$0.o();
      cup $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bqu.f;
      } else {
         dby $$6 = $$0.q();
         ciz $$8;
         if (this.b == bta.av) {
            Optional<cjc> $$7 = cjc.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bqu.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bta.ai) {
            $$8 = new cja($$6, $$3, $$2);
         } else {
            if (this.b != bta.V) {
               return bqu.a($$6.B);
            }

            $$8 = new ciy($$6, $$3, $$2);
         }

         cxe $$12 = $$5.a(km.M, cxe.a);
         if (!$$12.b()) {
            bta.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dwv.t, $$8.dn());
               $$6.b($$8);
            }

            $$5.h(1);
            return bqu.a($$6.B);
         } else {
            return bqu.c;
         }
      }
   }

   protected boolean a(cmx $$0, je $$1, cup $$2, iz $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bta.av) {
         cxe $$4 = $$0.a(km.M, cxe.a);
         if (!$$4.b()) {
            $$4.a(cjc.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(xp.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(xp.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(xp.a("painting.dimensions", ayz.e(((cjd)$$1x.a()).a(), 16), ayz.e(((cjd)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
