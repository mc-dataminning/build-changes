import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqv extends cre {
   private static final wg a = wg.c("painting.random").a(n.h);
   private final bqb<? extends cfv> b;

   public cqv(bqb<? extends cfv> $$0, cre.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boa a(cuq $$0) {
      ib $$1 = $$0.a();
      ih $$2 = $$0.k();
      ib $$3 = $$1.a($$2);
      cjt $$4 = $$0.o();
      crj $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return boa.e;
      } else {
         cyx $$6 = $$0.q();
         cfv $$8;
         if (this.b == bqb.au) {
            Optional<cfy> $$7 = cfy.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return boa.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bqb.ai) {
            $$8 = new cfw($$6, $$3, $$2);
         } else {
            if (this.b != bqb.V) {
               return boa.a($$6.B);
            }

            $$8 = new cfu($$6, $$3, $$2);
         }

         ctt $$12 = $$5.a(jp.D, ctt.a);
         if (!$$12.b()) {
            bqb.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dts.t, $$8.dk());
               $$6.b($$8);
            }

            $$5.g(1);
            return boa.a($$6.B);
         } else {
            return boa.b;
         }
      }
   }

   protected boolean a(cjt $$0, ih $$1, crj $$2, ib $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bqb.au) {
         ctt $$4 = $$0.a(jp.D, ctt.a);
         if (!$$4.b()) {
            $$4.a(cfy.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(wg.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(wg.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(wg.a("painting.dimensions", axk.e(((cfz)$$1x.a()).a(), 16), axk.e(((cfz)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
