import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cls extends cmc {
   private static final vb a = vb.c("painting.random").a(n.h);
   private final blj<? extends caw> b;

   public cls(blj<? extends caw> $$0, cmc.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bjl a(cos $$0) {
      hv $$1 = $$0.a();
      ia $$2 = $$0.k();
      hv $$3 = $$1.a($$2);
      cer $$4 = $$0.o();
      cmh $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bjl.e;
      } else {
         csy $$6 = $$0.q();
         caw $$8;
         if (this.b == blj.as) {
            Optional<caz> $$7 = caz.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bjl.b;
            }

            $$8 = $$7.get();
         } else if (this.b == blj.ag) {
            $$8 = new cax($$6, $$3, $$2);
         } else {
            if (this.b != blj.T) {
               return bjl.a($$6.B);
            }

            $$8 = new cav($$6, $$3, $$2);
         }

         sj $$12 = $$5.v();
         if ($$12 != null) {
            blj.a($$6, $$4, $$8, $$12);
         }

         if ($$8.A()) {
            if (!$$6.B) {
               $$8.D();
               $$6.a($$4, dmz.t, $$8.dk());
               $$6.b($$8);
            }

            $$5.h(1);
            return bjl.a($$6.B);
         } else {
            return bjl.b;
         }
      }
   }

   protected boolean a(cer $$0, ia $$1, cmh $$2, hv $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == blj.as) {
         sj $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            sj $$5 = $$4.p("EntityTag");
            caz.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(vb.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(vb.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(vb.a("painting.dimensions", aty.e(((cba)$$1x.a()).a(), 16), aty.e(((cba)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
