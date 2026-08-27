import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmc extends cmm {
   private static final vd a = vd.c("painting.random").a(n.h);
   private final blt<? extends cbg> b;

   public cmc(blt<? extends cbg> $$0, cmm.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bjv a(cpc $$0) {
      hx $$1 = $$0.a();
      ic $$2 = $$0.k();
      hx $$3 = $$1.a($$2);
      cfb $$4 = $$0.o();
      cmr $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bjv.e;
      } else {
         cti $$6 = $$0.q();
         cbg $$8;
         if (this.b == blt.as) {
            Optional<cbj> $$7 = cbj.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bjv.b;
            }

            $$8 = $$7.get();
         } else if (this.b == blt.ag) {
            $$8 = new cbh($$6, $$3, $$2);
         } else {
            if (this.b != blt.T) {
               return bjv.a($$6.B);
            }

            $$8 = new cbf($$6, $$3, $$2);
         }

         sl $$12 = $$5.v();
         if ($$12 != null) {
            blt.a($$6, $$4, $$8, $$12);
         }

         if ($$8.A()) {
            if (!$$6.B) {
               $$8.D();
               $$6.a($$4, dnk.t, $$8.dk());
               $$6.b($$8);
            }

            $$5.h(1);
            return bjv.a($$6.B);
         } else {
            return bjv.b;
         }
      }
   }

   protected boolean a(cfb $$0, ic $$1, cmr $$2, hx $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cmr $$0, @Nullable cti $$1, List<vd> $$2, coi $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == blt.as) {
         sl $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            sl $$5 = $$4.p("EntityTag");
            cbj.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(vd.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(vd.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(vd.a("painting.dimensions", aui.e(((cbk)$$1x.a()).a(), 16), aui.e(((cbk)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
