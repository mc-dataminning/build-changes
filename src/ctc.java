import java.util.List;
import java.util.Optional;

public class ctc extends ctl {
   private static final wx a = wx.c("painting.random").a(n.h);
   private final bsc<? extends cia> b;

   public ctc(bsc<? extends cia> $$0, ctl.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bpw a(cxd $$0) {
      io $$1 = $$0.a();
      it $$2 = $$0.k();
      io $$3 = $$1.a($$2);
      cly $$4 = $$0.o();
      ctq $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bpw.e;
      } else {
         daz $$6 = $$0.q();
         cia $$8;
         if (this.b == bsc.av) {
            Optional<cid> $$7 = cid.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bpw.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bsc.ai) {
            $$8 = new cib($$6, $$3, $$2);
         } else {
            if (this.b != bsc.V) {
               return bpw.a($$6.B);
            }

            $$8 = new chz($$6, $$3, $$2);
         }

         cwf $$12 = $$5.a(kb.L, cwf.a);
         if (!$$12.b()) {
            bsc.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dvw.t, $$8.dn());
               $$6.b($$8);
            }

            $$5.h(1);
            return bpw.a($$6.B);
         } else {
            return bpw.b;
         }
      }
   }

   protected boolean a(cly $$0, it $$1, ctq $$2, io $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bsc.av) {
         cwf $$4 = $$0.a(kb.L, cwf.a);
         if (!$$4.b()) {
            $$4.a(cid.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(wx.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(wx.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(wx.a("painting.dimensions", ayf.e(((cie)$$1x.a()).a(), 16), ayf.e(((cie)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
