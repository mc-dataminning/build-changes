import java.util.List;
import java.util.Optional;

public class cuc extends cul {
   private static final wz a = wz.c("painting.random").a(n.h);
   private final bsx<? extends ciz> b;

   public cuc(bsx<? extends ciz> $$0, cul.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bqr a(cyf $$0) {
      jd $$1 = $$0.a();
      ji $$2 = $$0.k();
      jd $$3 = $$1.a($$2);
      cmx $$4 = $$0.o();
      cuq $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bqr.f;
      } else {
         dcw $$6 = $$0.q();
         ciz $$8;
         if (this.b == bsx.av) {
            Optional<cjc> $$7 = cjc.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bqr.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bsx.ai) {
            $$8 = new cja($$6, $$3, $$2);
         } else {
            if (this.b != bsx.V) {
               return bqr.a($$6.B);
            }

            $$8 = new ciy($$6, $$3, $$2);
         }

         cxh $$12 = $$5.a(kq.M, cxh.a);
         if (!$$12.b()) {
            bsx.a($$6, $$4, $$8, $$12);
         }

         if ($$8.s()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dxz.t, $$8.dm());
               $$6.b($$8);
            }

            $$5.h(1);
            return bqr.a($$6.B);
         } else {
            return bqr.c;
         }
      }
   }

   protected boolean a(cmx $$0, ji $$1, cuq $$2, jd $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      super.a($$0, $$1, $$2, $$3);
      jo.a $$4 = $$1.a();
      if ($$4 != null && this.b == bsx.av) {
         cxh $$5 = $$0.a(kq.M, cxh.a);
         if (!$$5.b()) {
            $$5.a($$4.a(up.a), cjc.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(wz.c($$1xx.a().c("painting", "title")).a(n.o));
                  $$2.add(wz.c($$1xx.a().c("painting", "author")).a(n.h));
               });
               $$2.add(wz.a("painting.dimensions", ((cjd)$$1x.a()).b(), ((cjd)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
