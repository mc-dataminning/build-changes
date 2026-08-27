import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpc extends cpl {
   private static final vs a = vs.c("painting.random").a(n.h);
   private final bol<? extends ced> b;

   public cpc(bol<? extends ced> $$0, cpl.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bml a(crz $$0) {
      ib $$1 = $$0.a();
      ih $$2 = $$0.k();
      ib $$3 = $$1.a($$2);
      cia $$4 = $$0.o();
      cpq $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bml.e;
      } else {
         cwe $$6 = $$0.q();
         ced $$8;
         if (this.b == bol.at) {
            Optional<ceg> $$7 = ceg.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bml.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bol.ah) {
            $$8 = new cee($$6, $$3, $$2);
         } else {
            if (this.b != bol.U) {
               return bml.a($$6.B);
            }

            $$8 = new cec($$6, $$3, $$2);
         }

         sy $$12 = $$5.w();
         if ($$12 != null) {
            bol.a($$6, $$4, $$8, $$12);
         }

         if ($$8.A()) {
            if (!$$6.B) {
               $$8.D();
               $$6.a($$4, dqr.t, $$8.dh());
               $$6.b($$8);
            }

            $$5.h(1);
            return bml.a($$6.B);
         } else {
            return bml.b;
         }
      }
   }

   protected boolean a(cia $$0, ih $$1, cpq $$2, ib $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bol.at) {
         sy $$4 = $$0.w();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            sy $$5 = $$4.p("EntityTag");
            ceg.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(vs.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(vs.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(vs.a("painting.dimensions", awm.e(((ceh)$$1x.a()).a(), 16), awm.e(((ceh)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
