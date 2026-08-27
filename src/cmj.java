import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmj extends cmt {
   private static final vf a = vf.c("painting.random").a(n.h);
   private final blz<? extends cbm> b;

   public cmj(blz<? extends cbm> $$0, cmt.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bkb a(cpj $$0) {
      hx $$1 = $$0.a();
      ic $$2 = $$0.k();
      hx $$3 = $$1.a($$2);
      cfi $$4 = $$0.o();
      cmy $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bkb.e;
      } else {
         ctp $$6 = $$0.q();
         cbm $$8;
         if (this.b == blz.as) {
            Optional<cbp> $$7 = cbp.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bkb.b;
            }

            $$8 = $$7.get();
         } else if (this.b == blz.ag) {
            $$8 = new cbn($$6, $$3, $$2);
         } else {
            if (this.b != blz.T) {
               return bkb.a($$6.B);
            }

            $$8 = new cbl($$6, $$3, $$2);
         }

         sn $$12 = $$5.v();
         if ($$12 != null) {
            blz.a($$6, $$4, $$8, $$12);
         }

         if ($$8.A()) {
            if (!$$6.B) {
               $$8.D();
               $$6.a($$4, dnr.t, $$8.dk());
               $$6.b($$8);
            }

            $$5.h(1);
            return bkb.a($$6.B);
         } else {
            return bkb.b;
         }
      }
   }

   protected boolean a(cfi $$0, ic $$1, cmy $$2, hx $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cmy $$0, @Nullable ctp $$1, List<vf> $$2, coq $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == blz.as) {
         sn $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            sn $$5 = $$4.p("EntityTag");
            cbp.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(vf.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(vf.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(vf.a("painting.dimensions", auo.e(((cbq)$$1x.a()).a(), 16), auo.e(((cbq)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
