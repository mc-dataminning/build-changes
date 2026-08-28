import java.util.List;
import java.util.Optional;

public class cto extends ctx {
   private static final wu a = wu.c("painting.random").a(n.h);
   private final bsm<? extends cim> b;

   public cto(bsm<? extends cim> $$0, ctx.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bqg a(cxo $$0) {
      ja $$1 = $$0.a();
      jf $$2 = $$0.k();
      ja $$3 = $$1.a($$2);
      cmk $$4 = $$0.o();
      cuc $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bqg.f;
      } else {
         dcf $$6 = $$0.q();
         cim $$8;
         if (this.b == bsm.av) {
            Optional<cip> $$7 = cip.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bqg.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bsm.ai) {
            $$8 = new cin($$6, $$3, $$2);
         } else {
            if (this.b != bsm.V) {
               return bqg.a($$6.B);
            }

            $$8 = new cil($$6, $$3, $$2);
         }

         cwq $$12 = $$5.a(kn.M, cwq.a);
         if (!$$12.b()) {
            bsm.a($$6, $$4, $$8, $$12);
         }

         if ($$8.s()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dxg.t, $$8.do());
               $$6.b($$8);
            }

            $$5.h(1);
            return bqg.a($$6.B);
         } else {
            return bqg.c;
         }
      }
   }

   protected boolean a(cmk $$0, jf $$1, cuc $$2, ja $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      super.a($$0, $$1, $$2, $$3);
      jl.a $$4 = $$1.a();
      if ($$4 != null && this.b == bsm.av) {
         cwq $$5 = $$0.a(kn.M, cwq.a);
         if (!$$5.b()) {
            $$5.a($$4.a(ul.a), cip.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(wu.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(wu.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(wu.a("painting.dimensions", ((ciq)$$1x.a()).b(), ((ciq)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
