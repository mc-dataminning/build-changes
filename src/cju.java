import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cju extends cke {
   private static final ui a = ui.c("painting.random").a(n.h);
   private final bjx<? extends bzi> b;

   public cju(bjx<? extends bzi> $$0, cke.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bib a(cmt $$0) {
      ht $$1 = $$0.a();
      hx $$2 = $$0.k();
      ht $$3 = $$1.a($$2);
      ccx $$4 = $$0.o();
      ckj $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bib.e;
      } else {
         cqz $$6 = $$0.q();
         bzi $$8;
         if (this.b == bjx.ar) {
            Optional<bzl> $$7 = bzl.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bib.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bjx.af) {
            $$8 = new bzj($$6, $$3, $$2);
         } else {
            if (this.b != bjx.S) {
               return bib.a($$6.B);
            }

            $$8 = new bzh($$6, $$3, $$2);
         }

         rt $$12 = $$5.v();
         if ($$12 != null) {
            bjx.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dkl.t, $$8.dj());
               $$6.b($$8);
            }

            $$5.h(1);
            return bib.a($$6.B);
         } else {
            return bib.b;
         }
      }
   }

   protected boolean a(ccx $$0, hx $$1, ckj $$2, ht $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bjx.ar) {
         rt $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            rt $$5 = $$4.p("EntityTag");
            bzl.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(ui.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(ui.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(ui.a("painting.dimensions", asy.e(((bzm)$$1x.a()).a(), 16), asy.e(((bzm)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
