import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckm extends ckw {
   private static final ur a = ur.c("painting.random").a(n.h);
   private final bkm<? extends bzx> b;

   public ckm(bkm<? extends bzx> $$0, ckw.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public biq a(cnl $$0) {
      ht $$1 = $$0.a();
      hx $$2 = $$0.k();
      ht $$3 = $$1.a($$2);
      cdm $$4 = $$0.o();
      clb $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return biq.e;
      } else {
         crs $$6 = $$0.q();
         bzx $$8;
         if (this.b == bkm.ar) {
            Optional<caa> $$7 = caa.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return biq.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bkm.af) {
            $$8 = new bzy($$6, $$3, $$2);
         } else {
            if (this.b != bkm.S) {
               return biq.a($$6.B);
            }

            $$8 = new bzw($$6, $$3, $$2);
         }

         rz $$12 = $$5.v();
         if ($$12 != null) {
            bkm.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dlg.t, $$8.dj());
               $$6.b($$8);
            }

            $$5.h(1);
            return biq.a($$6.B);
         } else {
            return biq.b;
         }
      }
   }

   protected boolean a(cdm $$0, hx $$1, clb $$2, ht $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(clb $$0, @Nullable crs $$1, List<ur> $$2, cms $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bkm.ar) {
         rz $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            rz $$5 = $$4.p("EntityTag");
            caa.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(ur.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(ur.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(ur.a("painting.dimensions", ati.e(((cab)$$1x.a()).a(), 16), ati.e(((cab)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
