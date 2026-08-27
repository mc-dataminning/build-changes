import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cku extends cle {
   private static final ur a = ur.c("painting.random").a(n.h);
   private final bku<? extends caf> b;

   public cku(bku<? extends caf> $$0, cle.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bix a(cnt $$0) {
      ht $$1 = $$0.a();
      hx $$2 = $$0.k();
      ht $$3 = $$1.a($$2);
      cdu $$4 = $$0.o();
      clj $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bix.e;
      } else {
         csa $$6 = $$0.q();
         caf $$8;
         if (this.b == bku.ar) {
            Optional<cai> $$7 = cai.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bix.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bku.af) {
            $$8 = new cag($$6, $$3, $$2);
         } else {
            if (this.b != bku.S) {
               return bix.a($$6.B);
            }

            $$8 = new cae($$6, $$3, $$2);
         }

         rz $$12 = $$5.v();
         if ($$12 != null) {
            bku.a($$6, $$4, $$8, $$12);
         }

         if ($$8.A()) {
            if (!$$6.B) {
               $$8.D();
               $$6.a($$4, dls.t, $$8.dl());
               $$6.b($$8);
            }

            $$5.h(1);
            return bix.a($$6.B);
         } else {
            return bix.b;
         }
      }
   }

   protected boolean a(cdu $$0, hx $$1, clj $$2, ht $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(clj $$0, @Nullable csa $$1, List<ur> $$2, cna $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bku.ar) {
         rz $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            rz $$5 = $$4.p("EntityTag");
            cai.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(ur.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(ur.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(ur.a("painting.dimensions", atm.e(((caj)$$1x.a()).a(), 16), atm.e(((caj)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
