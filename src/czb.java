import java.util.Optional;
import java.util.function.Consumer;

public class czb extends czj {
   private static final wy a = wy.c("painting.random").a(o.h);
   private final bwr<? extends cnj> b;

   public czb(bwr<? extends cnj> $$0, czj.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bug a(ddi $$0) {
      iv $$1 = $$0.a();
      jb $$2 = $$0.k();
      iv $$3 = $$1.a($$2);
      crm $$4 = $$0.o();
      czn $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bug.d;
      } else {
         djm $$6 = $$0.q();
         cnj $$8;
         if (this.b == bwr.aK) {
            Optional<cnm> $$7 = cnm.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bug.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bwr.as) {
            $$8 = new cnk($$6, $$3, $$2);
         } else {
            if (this.b != bwr.af) {
               return bug.a;
            }

            $$8 = new cni($$6, $$3, $$2);
         }

         bwr.<cnj>a($$6, $$5, $$4).accept($$8);
         if ($$8.g()) {
            if (!$$6.C) {
               $$8.v();
               $$6.a($$4, eft.t, $$8.ds());
               $$6.b($$8);
            }

            $$5.h(1);
            return bug.a;
         } else {
            return bug.c;
         }
      }
   }

   protected boolean a(crm $$0, jb $$1, czn $$2, iv $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(czn $$0, czj.b $$1, dcr $$2, Consumer<wy> $$3, dbc $$4) {
      if (this.b == bwr.aK && $$2.a(kk.aM)) {
         jf<cnn> $$5 = $$0.a(kk.aM);
         if ($$5 != null) {
            $$5.a().e().ifPresent($$3);
            $$5.a().f().ifPresent($$3);
            $$3.accept(wy.a("painting.dimensions", $$5.a().b(), $$5.a().c()));
         } else if ($$4.b()) {
            $$3.accept(a);
         }
      }
   }
}
