import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cms extends cnb {
   private static final vg a = vg.c("painting.random").a(n.h);
   private final bmc<? extends cbt> b;

   public cms(bmc<? extends cbt> $$0, cnb.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bkc a(cpr $$0) {
      hx $$1 = $$0.a();
      ic $$2 = $$0.k();
      hx $$3 = $$1.a($$2);
      cfq $$4 = $$0.o();
      cng $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bkc.e;
      } else {
         ctx $$6 = $$0.q();
         cbt $$8;
         if (this.b == bmc.at) {
            Optional<cbw> $$7 = cbw.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bkc.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bmc.ah) {
            $$8 = new cbu($$6, $$3, $$2);
         } else {
            if (this.b != bmc.U) {
               return bkc.a($$6.B);
            }

            $$8 = new cbs($$6, $$3, $$2);
         }

         so $$12 = $$5.v();
         if ($$12 != null) {
            bmc.a($$6, $$4, $$8, $$12);
         }

         if ($$8.A()) {
            if (!$$6.B) {
               $$8.D();
               $$6.a($$4, dnz.t, $$8.dj());
               $$6.b($$8);
            }

            $$5.h(1);
            return bkc.a($$6.B);
         } else {
            return bkc.b;
         }
      }
   }

   protected boolean a(cfq $$0, ic $$1, cng $$2, hx $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bmc.at) {
         so $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            so $$5 = $$4.p("EntityTag");
            cbw.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(vg.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(vg.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(vg.a("painting.dimensions", aup.e(((cbx)$$1x.a()).a(), 16), aup.e(((cbx)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
