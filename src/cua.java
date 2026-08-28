import java.util.List;
import java.util.Optional;

public class cua extends cuj {
   private static final wy a = wy.c("painting.random").a(n.h);
   private final bsw<? extends cix> b;

   public cua(bsw<? extends cix> $$0, cuj.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bqq a(cyd $$0) {
      jd $$1 = $$0.a();
      ji $$2 = $$0.k();
      jd $$3 = $$1.a($$2);
      cmv $$4 = $$0.o();
      cuo $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bqq.f;
      } else {
         dcu $$6 = $$0.q();
         cix $$8;
         if (this.b == bsw.av) {
            Optional<cja> $$7 = cja.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bqq.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bsw.ai) {
            $$8 = new ciy($$6, $$3, $$2);
         } else {
            if (this.b != bsw.V) {
               return bqq.a($$6.B);
            }

            $$8 = new ciw($$6, $$3, $$2);
         }

         cxf $$12 = $$5.a(kq.M, cxf.a);
         if (!$$12.b()) {
            bsw.a($$6, $$4, $$8, $$12);
         }

         if ($$8.s()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dxw.t, $$8.do());
               $$6.b($$8);
            }

            $$5.h(1);
            return bqq.a($$6.B);
         } else {
            return bqq.c;
         }
      }
   }

   protected boolean a(cmv $$0, ji $$1, cuo $$2, jd $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      jo.a $$4 = $$1.a();
      if ($$4 != null && this.b == bsw.av) {
         cxf $$5 = $$0.a(kq.M, cxf.a);
         if (!$$5.b()) {
            $$5.a($$4.a(uo.a), cja.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(wy.c($$1xx.a().c("painting", "title")).a(n.o));
                  $$2.add(wy.c($$1xx.a().c("painting", "author")).a(n.h));
               });
               $$2.add(wy.a("painting.dimensions", ((cjb)$$1x.a()).b(), ((cjb)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
