import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cop extends coy {
   private static final vq a = vq.c("painting.random").a(n.h);
   private final bnw<? extends cdo> b;

   public cop(bnw<? extends cdo> $$0, coy.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public blw a(crm $$0) {
      hz $$1 = $$0.a();
      ie $$2 = $$0.k();
      hz $$3 = $$1.a($$2);
      chl $$4 = $$0.o();
      cpd $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return blw.e;
      } else {
         cvr $$6 = $$0.q();
         cdo $$8;
         if (this.b == bnw.at) {
            Optional<cdr> $$7 = cdr.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return blw.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bnw.ah) {
            $$8 = new cdp($$6, $$3, $$2);
         } else {
            if (this.b != bnw.U) {
               return blw.a($$6.B);
            }

            $$8 = new cdn($$6, $$3, $$2);
         }

         sw $$12 = $$5.w();
         if ($$12 != null) {
            bnw.a($$6, $$4, $$8, $$12);
         }

         if ($$8.A()) {
            if (!$$6.B) {
               $$8.D();
               $$6.a($$4, dpw.t, $$8.dk());
               $$6.b($$8);
            }

            $$5.h(1);
            return blw.a($$6.B);
         } else {
            return blw.b;
         }
      }
   }

   protected boolean a(chl $$0, ie $$1, cpd $$2, hz $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bnw.at) {
         sw $$4 = $$0.w();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            sw $$5 = $$4.p("EntityTag");
            cdr.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(vq.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(vq.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(vq.a("painting.dimensions", awi.e(((cds)$$1x.a()).a(), 16), awi.e(((cds)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
