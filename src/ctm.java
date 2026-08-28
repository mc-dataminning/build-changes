import java.util.List;
import java.util.Optional;

public class ctm extends ctv {
   private static final wu a = wu.c("painting.random").a(n.h);
   private final bsj<? extends cij> b;

   public ctm(bsj<? extends cij> $$0, ctv.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bqd a(cxm $$0) {
      ja $$1 = $$0.a();
      jf $$2 = $$0.k();
      ja $$3 = $$1.a($$2);
      cmh $$4 = $$0.o();
      cua $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bqd.f;
      } else {
         dcd $$6 = $$0.q();
         cij $$8;
         if (this.b == bsj.av) {
            Optional<cim> $$7 = cim.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bqd.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bsj.ai) {
            $$8 = new cik($$6, $$3, $$2);
         } else {
            if (this.b != bsj.V) {
               return bqd.a($$6.B);
            }

            $$8 = new cii($$6, $$3, $$2);
         }

         cwo $$12 = $$5.a(kn.M, cwo.a);
         if (!$$12.b()) {
            bsj.a($$6, $$4, $$8, $$12);
         }

         if ($$8.s()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dxa.t, $$8.dn());
               $$6.b($$8);
            }

            $$5.h(1);
            return bqd.a($$6.B);
         } else {
            return bqd.c;
         }
      }
   }

   protected boolean a(cmh $$0, jf $$1, cua $$2, ja $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      super.a($$0, $$1, $$2, $$3);
      jl.a $$4 = $$1.a();
      if ($$4 != null && this.b == bsj.av) {
         cwo $$5 = $$0.a(kn.M, cwo.a);
         if (!$$5.b()) {
            $$5.a($$4.a(ul.a), cim.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(wu.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(wu.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(wu.a("painting.dimensions", ((cin)$$1x.a()).b(), ((cin)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
