import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ciw extends cjg {
   private static final tl a = tl.c("painting.random").a(n.h);
   private final bja<? extends byl> b;

   public ciw(bja<? extends byl> $$0, cjg.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bhe a(clv $$0) {
      gw $$1 = $$0.a();
      ha $$2 = $$0.k();
      gw $$3 = $$1.a($$2);
      cca $$4 = $$0.o();
      cjl $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bhe.e;
      } else {
         cqb $$6 = $$0.q();
         byl $$8;
         if (this.b == bja.ar) {
            Optional<byo> $$7 = byo.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bhe.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bja.af) {
            $$8 = new bym($$6, $$3, $$2);
         } else {
            if (this.b != bja.S) {
               return bhe.a($$6.B);
            }

            $$8 = new byk($$6, $$3, $$2);
         }

         qw $$12 = $$5.v();
         if ($$12 != null) {
            bja.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, djn.t, $$8.dj());
               $$6.b($$8);
            }

            $$5.h(1);
            return bhe.a($$6.B);
         } else {
            return bhe.b;
         }
      }
   }

   protected boolean a(cca $$0, ha $$1, cjl $$2, gw $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cjl $$0, @Nullable cqb $$1, List<tl> $$2, clc $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bja.ar) {
         qw $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            qw $$5 = $$4.p("EntityTag");
            byo.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(tl.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(tl.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(tl.a("painting.dimensions", asb.e(((byp)$$1x.a()).a(), 16), asb.e(((byp)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
