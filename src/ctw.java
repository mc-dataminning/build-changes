import java.util.List;
import java.util.Optional;

public class ctw extends cuf {
   private static final xl a = xl.c("painting.random").a(n.h);
   private final bsv<? extends ciu> b;

   public ctw(bsv<? extends ciu> $$0, cuf.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bqp a(cxx $$0) {
      iz $$1 = $$0.a();
      je $$2 = $$0.k();
      iz $$3 = $$1.a($$2);
      cms $$4 = $$0.o();
      cuk $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bqp.f;
      } else {
         dbt $$6 = $$0.q();
         ciu $$8;
         if (this.b == bsv.av) {
            Optional<cix> $$7 = cix.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bqp.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bsv.ai) {
            $$8 = new civ($$6, $$3, $$2);
         } else {
            if (this.b != bsv.V) {
               return bqp.a($$6.B);
            }

            $$8 = new cit($$6, $$3, $$2);
         }

         cwz $$12 = $$5.a(km.L, cwz.a);
         if (!$$12.b()) {
            bsv.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dwq.t, $$8.dn());
               $$6.b($$8);
            }

            $$5.h(1);
            return bqp.a($$6.B);
         } else {
            return bqp.c;
         }
      }
   }

   protected boolean a(cms $$0, je $$1, cuk $$2, iz $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bsv.av) {
         cwz $$4 = $$0.a(km.L, cwz.a);
         if (!$$4.b()) {
            $$4.a(cix.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(xl.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(xl.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(xl.a("painting.dimensions", ayu.e(((ciy)$$1x.a()).a(), 16), ayu.e(((ciy)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
