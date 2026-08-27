import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmi extends cms {
   private static final vf a = vf.c("painting.random").a(n.h);
   private final bly<? extends cbl> b;

   public cmi(bly<? extends cbl> $$0, cms.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bka a(cpi $$0) {
      hx $$1 = $$0.a();
      ic $$2 = $$0.k();
      hx $$3 = $$1.a($$2);
      cfh $$4 = $$0.o();
      cmx $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bka.e;
      } else {
         cto $$6 = $$0.q();
         cbl $$8;
         if (this.b == bly.as) {
            Optional<cbo> $$7 = cbo.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bka.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bly.ag) {
            $$8 = new cbm($$6, $$3, $$2);
         } else {
            if (this.b != bly.T) {
               return bka.a($$6.B);
            }

            $$8 = new cbk($$6, $$3, $$2);
         }

         sn $$12 = $$5.v();
         if ($$12 != null) {
            bly.a($$6, $$4, $$8, $$12);
         }

         if ($$8.A()) {
            if (!$$6.B) {
               $$8.D();
               $$6.a($$4, dnq.t, $$8.dk());
               $$6.b($$8);
            }

            $$5.h(1);
            return bka.a($$6.B);
         } else {
            return bka.b;
         }
      }
   }

   protected boolean a(cfh $$0, ic $$1, cmx $$2, hx $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cmx $$0, @Nullable cto $$1, List<vf> $$2, cop $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bly.as) {
         sn $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            sn $$5 = $$4.p("EntityTag");
            cbo.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(vf.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(vf.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(vf.a("painting.dimensions", aun.e(((cbp)$$1x.a()).a(), 16), aun.e(((cbp)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
