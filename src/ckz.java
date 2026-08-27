import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckz extends clj {
   private static final uv a = uv.c("painting.random").a(n.h);
   private final bkz<? extends cak> b;

   public ckz(bkz<? extends cak> $$0, clj.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bjb a(cny $$0) {
      hx $$1 = $$0.a();
      ib $$2 = $$0.k();
      hx $$3 = $$1.a($$2);
      cdz $$4 = $$0.o();
      clo $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bjb.e;
      } else {
         csf $$6 = $$0.q();
         cak $$8;
         if (this.b == bkz.ar) {
            Optional<can> $$7 = can.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bjb.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bkz.af) {
            $$8 = new cal($$6, $$3, $$2);
         } else {
            if (this.b != bkz.S) {
               return bjb.a($$6.B);
            }

            $$8 = new caj($$6, $$3, $$2);
         }

         sd $$12 = $$5.v();
         if ($$12 != null) {
            bkz.a($$6, $$4, $$8, $$12);
         }

         if ($$8.A()) {
            if (!$$6.B) {
               $$8.D();
               $$6.a($$4, dlx.t, $$8.dl());
               $$6.b($$8);
            }

            $$5.h(1);
            return bjb.a($$6.B);
         } else {
            return bjb.b;
         }
      }
   }

   protected boolean a(cdz $$0, ib $$1, clo $$2, hx $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(clo $$0, @Nullable csf $$1, List<uv> $$2, cnf $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bkz.ar) {
         sd $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            sd $$5 = $$4.p("EntityTag");
            can.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(uv.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(uv.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(uv.a("painting.dimensions", atq.e(((cao)$$1x.a()).a(), 16), atq.e(((cao)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
