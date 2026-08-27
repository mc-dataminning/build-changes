import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cts extends cuc {
   private static final xe a = xe.c("painting.random").a(n.h);
   private final bsb<? extends chy> b;

   public cts(bsb<? extends chy> $$0, cuc.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bqa a(cyf $$0) {
      ir $$1 = $$0.a();
      iw $$2 = $$0.k();
      ir $$3 = $$1.a($$2);
      cly $$4 = $$0.o();
      cuh $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bqa.e;
      } else {
         dca $$6 = $$0.q();
         chy $$8;
         if (this.b == bsb.aw) {
            Optional<cib> $$7 = cib.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bqa.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bsb.ak) {
            $$8 = new chz($$6, $$3, $$2);
         } else {
            if (this.b != bsb.X) {
               return bqa.a($$6.C);
            }

            $$8 = new chx($$6, $$3, $$2);
         }

         cxf $$12 = $$5.a(ke.K, cxf.a);
         if (!$$12.b()) {
            bsb.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.C) {
               $$8.C();
               $$6.a($$4, dxv.t, $$8.ds());
               $$6.b($$8);
            }

            $$5.h(1);
            return bqa.a($$6.C);
         } else {
            return bqa.b;
         }
      }
   }

   protected boolean a(cly $$0, iw $$1, cuh $$2, ir $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bsb.aw) {
         cxf $$4 = $$0.a(ke.K, cxf.a);
         if (!$$4.b()) {
            $$4.a(cib.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(xe.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(xe.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(xe.a("painting.dimensions", aym.e(((cic)$$1x.a()).a(), 16), aym.e(((cic)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
