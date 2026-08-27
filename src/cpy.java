import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpy extends cqh {
   private static final vu a = vu.c("painting.random").a(n.h);
   private final bpd<? extends cew> b;

   public cpy(bpd<? extends cew> $$0, cqh.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bnd a(csw $$0) {
      ib $$1 = $$0.a();
      ih $$2 = $$0.k();
      ib $$3 = $$1.a($$2);
      ciu $$4 = $$0.o();
      cqm $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bnd.e;
      } else {
         cxb $$6 = $$0.q();
         cew $$8;
         if (this.b == bpd.av) {
            Optional<cez> $$7 = cez.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bnd.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bpd.aj) {
            $$8 = new cex($$6, $$3, $$2);
         } else {
            if (this.b != bpd.W) {
               return bnd.a($$6.B);
            }

            $$8 = new cev($$6, $$3, $$2);
         }

         ta $$12 = $$5.w();
         if ($$12 != null) {
            bpd.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, drp.t, $$8.dk());
               $$6.b($$8);
            }

            $$5.h(1);
            return bnd.a($$6.B);
         } else {
            return bnd.b;
         }
      }
   }

   protected boolean a(ciu $$0, ih $$1, cqm $$2, ib $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bpd.av) {
         ta $$4 = $$0.w();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            ta $$5 = $$4.p("EntityTag");
            cez.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(vu.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(vu.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(vu.a("painting.dimensions", aww.e(((cfa)$$1x.a()).a(), 16), aww.e(((cfa)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
