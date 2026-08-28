import java.util.List;
import java.util.Optional;

public class ctp extends cty {
   private static final wu a = wu.c("painting.random").a(n.h);
   private final bsn<? extends cin> b;

   public ctp(bsn<? extends cin> $$0, cty.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bqh a(cxp $$0) {
      ja $$1 = $$0.a();
      jf $$2 = $$0.k();
      ja $$3 = $$1.a($$2);
      cml $$4 = $$0.o();
      cud $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bqh.f;
      } else {
         dcg $$6 = $$0.q();
         cin $$8;
         if (this.b == bsn.av) {
            Optional<ciq> $$7 = ciq.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bqh.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bsn.ai) {
            $$8 = new cio($$6, $$3, $$2);
         } else {
            if (this.b != bsn.V) {
               return bqh.a($$6.B);
            }

            $$8 = new cim($$6, $$3, $$2);
         }

         cwr $$12 = $$5.a(kn.M, cwr.a);
         if (!$$12.b()) {
            bsn.a($$6, $$4, $$8, $$12);
         }

         if ($$8.s()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dxh.t, $$8.dp());
               $$6.b($$8);
            }

            $$5.h(1);
            return bqh.a($$6.B);
         } else {
            return bqh.c;
         }
      }
   }

   protected boolean a(cml $$0, jf $$1, cud $$2, ja $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      super.a($$0, $$1, $$2, $$3);
      jl.a $$4 = $$1.a();
      if ($$4 != null && this.b == bsn.av) {
         cwr $$5 = $$0.a(kn.M, cwr.a);
         if (!$$5.b()) {
            $$5.a($$4.a(ul.a), ciq.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(wu.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(wu.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(wu.a("painting.dimensions", ((cir)$$1x.a()).b(), ((cir)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
