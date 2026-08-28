import java.util.Optional;
import java.util.function.Consumer;

public class cyy extends czg {
   private static final wy a = wy.c("painting.random").a(o.h);
   private final bwr<? extends cng> b;

   public cyy(bwr<? extends cng> $$0, czg.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bug a(ddf $$0) {
      iv $$1 = $$0.a();
      jb $$2 = $$0.k();
      iv $$3 = $$1.a($$2);
      crj $$4 = $$0.o();
      czk $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bug.d;
      } else {
         djh $$6 = $$0.q();
         cng $$8;
         if (this.b == bwr.aK) {
            Optional<cnj> $$7 = cnj.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bug.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bwr.as) {
            $$8 = new cnh($$6, $$3, $$2);
         } else {
            if (this.b != bwr.af) {
               return bug.a;
            }

            $$8 = new cnf($$6, $$3, $$2);
         }

         bwr.<cng>a($$6, $$5, $$4).accept($$8);
         if ($$8.g()) {
            if (!$$6.C) {
               $$8.v();
               $$6.a($$4, efo.t, $$8.ds());
               $$6.b($$8);
            }

            $$5.h(1);
            return bug.a;
         } else {
            return bug.c;
         }
      }
   }

   protected boolean a(crj $$0, jb $$1, czk $$2, iv $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(czk $$0, czg.b $$1, dco $$2, Consumer<wy> $$3, daz $$4) {
      if (this.b == bwr.aK && $$2.a(kk.aL)) {
         jf<cnk> $$5 = $$0.a(kk.aL);
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
