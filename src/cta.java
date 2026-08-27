import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cta extends ctj {
   private static final wx a = wx.c("painting.random").a(n.h);
   private final bsa<? extends chy> b;

   public cta(bsa<? extends chy> $$0, ctj.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bpu a(cxb $$0) {
      io $$1 = $$0.a();
      it $$2 = $$0.k();
      io $$3 = $$1.a($$2);
      clw $$4 = $$0.o();
      cto $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bpu.e;
      } else {
         dax $$6 = $$0.q();
         chy $$8;
         if (this.b == bsa.av) {
            Optional<cib> $$7 = cib.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bpu.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bsa.ai) {
            $$8 = new chz($$6, $$3, $$2);
         } else {
            if (this.b != bsa.V) {
               return bpu.a($$6.B);
            }

            $$8 = new chx($$6, $$3, $$2);
         }

         cwd $$12 = $$5.a(kb.L, cwd.a);
         if (!$$12.b()) {
            bsa.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dvu.t, $$8.dn());
               $$6.b($$8);
            }

            $$5.h(1);
            return bpu.a($$6.B);
         } else {
            return bpu.b;
         }
      }
   }

   protected boolean a(clw $$0, it $$1, cto $$2, io $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bsa.av) {
         cwd $$4 = $$0.a(kb.L, cwd.a);
         if (!$$4.b()) {
            $$4.a(cib.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(wx.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(wx.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(wx.a("painting.dimensions", ayd.e(((cic)$$1x.a()).a(), 16), ayd.e(((cic)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
