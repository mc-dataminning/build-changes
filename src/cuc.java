import java.util.List;
import java.util.Optional;

public class cuc extends cul {
   private static final xp a = xp.c("painting.random").a(n.h);
   private final btb<? extends cja> b;

   public cuc(btb<? extends cja> $$0, cul.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bqv a(cyd $$0) {
      iz $$1 = $$0.a();
      je $$2 = $$0.k();
      iz $$3 = $$1.a($$2);
      cmy $$4 = $$0.o();
      cuq $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bqv.f;
      } else {
         dbz $$6 = $$0.q();
         cja $$8;
         if (this.b == btb.av) {
            Optional<cjd> $$7 = cjd.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bqv.c;
            }

            $$8 = $$7.get();
         } else if (this.b == btb.ai) {
            $$8 = new cjb($$6, $$3, $$2);
         } else {
            if (this.b != btb.V) {
               return bqv.a($$6.B);
            }

            $$8 = new ciz($$6, $$3, $$2);
         }

         cxf $$12 = $$5.a(km.M, cxf.a);
         if (!$$12.b()) {
            btb.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dww.t, $$8.dn());
               $$6.b($$8);
            }

            $$5.h(1);
            return bqv.a($$6.B);
         } else {
            return bqv.c;
         }
      }
   }

   protected boolean a(cmy $$0, je $$1, cuq $$2, iz $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == btb.av) {
         cxf $$4 = $$0.a(km.M, cxf.a);
         if (!$$4.b()) {
            $$4.a(cjd.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(xp.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(xp.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(xp.a("painting.dimensions", ayz.e(((cje)$$1x.a()).a(), 16), ayz.e(((cje)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
