import java.util.List;
import java.util.Optional;

public class cua extends cuj {
   private static final xo a = xo.c("painting.random").a(n.h);
   private final bsz<? extends ciy> b;

   public cua(bsz<? extends ciy> $$0, cuj.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bqt a(cyb $$0) {
      iz $$1 = $$0.a();
      je $$2 = $$0.k();
      iz $$3 = $$1.a($$2);
      cmw $$4 = $$0.o();
      cuo $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bqt.f;
      } else {
         dbx $$6 = $$0.q();
         ciy $$8;
         if (this.b == bsz.av) {
            Optional<cjb> $$7 = cjb.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bqt.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bsz.ai) {
            $$8 = new ciz($$6, $$3, $$2);
         } else {
            if (this.b != bsz.V) {
               return bqt.a($$6.B);
            }

            $$8 = new cix($$6, $$3, $$2);
         }

         cxd $$12 = $$5.a(km.M, cxd.a);
         if (!$$12.b()) {
            bsz.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dwu.t, $$8.dn());
               $$6.b($$8);
            }

            $$5.h(1);
            return bqt.a($$6.B);
         } else {
            return bqt.c;
         }
      }
   }

   protected boolean a(cmw $$0, je $$1, cuo $$2, iz $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bsz.av) {
         cxd $$4 = $$0.a(km.M, cxd.a);
         if (!$$4.b()) {
            $$4.a(cjb.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(xo.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(xo.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(xo.a("painting.dimensions", ayy.e(((cjc)$$1x.a()).a(), 16), ayy.e(((cjc)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
