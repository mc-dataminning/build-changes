import java.util.List;
import java.util.Optional;

public class cud extends cum {
   private static final xp a = xp.c("painting.random").a(n.h);
   private final btc<? extends cjb> b;

   public cud(btc<? extends cjb> $$0, cum.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bqw a(cye $$0) {
      iz $$1 = $$0.a();
      je $$2 = $$0.k();
      iz $$3 = $$1.a($$2);
      cmz $$4 = $$0.o();
      cur $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bqw.f;
      } else {
         dca $$6 = $$0.q();
         cjb $$8;
         if (this.b == btc.av) {
            Optional<cje> $$7 = cje.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bqw.c;
            }

            $$8 = $$7.get();
         } else if (this.b == btc.ai) {
            $$8 = new cjc($$6, $$3, $$2);
         } else {
            if (this.b != btc.V) {
               return bqw.a($$6.B);
            }

            $$8 = new cja($$6, $$3, $$2);
         }

         cxg $$12 = $$5.a(km.M, cxg.a);
         if (!$$12.b()) {
            btc.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dwx.t, $$8.dn());
               $$6.b($$8);
            }

            $$5.h(1);
            return bqw.a($$6.B);
         } else {
            return bqw.c;
         }
      }
   }

   protected boolean a(cmz $$0, je $$1, cur $$2, iz $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == btc.av) {
         cxg $$4 = $$0.a(km.M, cxg.a);
         if (!$$4.b()) {
            $$4.a(cje.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(xp.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(xp.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(xp.a("painting.dimensions", ayz.e(((cjf)$$1x.a()).a(), 16), ayz.e(((cjf)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
