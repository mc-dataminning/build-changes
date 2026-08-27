import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cih extends cir {
   private static final te a = te.c("painting.random").a(n.h);
   private final bik<? extends bxw> b;

   public cih(bik<? extends bxw> $$0, cir.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bgo a(clg $$0) {
      gv $$1 = $$0.a();
      hb $$2 = $$0.k();
      gv $$3 = $$1.a($$2);
      cbl $$4 = $$0.o();
      ciw $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bgo.e;
      } else {
         cpk $$6 = $$0.q();
         bxw $$8;
         if (this.b == bik.ar) {
            Optional<bxz> $$7 = bxz.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bgo.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bik.af) {
            $$8 = new bxx($$6, $$3, $$2);
         } else {
            if (this.b != bik.S) {
               return bgo.a($$6.B);
            }

            $$8 = new bxv($$6, $$3, $$2);
         }

         qs $$12 = $$5.v();
         if ($$12 != null) {
            bik.a($$6, $$4, $$8, $$12);
         }

         if ($$8.t()) {
            if (!$$6.B) {
               $$8.x();
               $$6.a($$4, dji.t, $$8.di());
               $$6.b($$8);
            }

            $$5.h(1);
            return bgo.a($$6.B);
         } else {
            return bgo.b;
         }
      }
   }

   protected boolean a(cbl $$0, hb $$1, ciw $$2, gv $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bik.ar) {
         qs $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            qs $$5 = $$4.p("EntityTag");
            bxz.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(te.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(te.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(te.a("painting.dimensions", aro.e(((bya)$$1x.a()).a(), 16), aro.e(((bya)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
