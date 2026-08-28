import java.util.Optional;
import java.util.function.Consumer;

public class cyg extends cyo {
   private static final ww a = ww.c("painting.random").a(n.h);
   private final bwj<? extends cmp> b;

   public cyg(bwj<? extends cmp> $$0, cyo.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bty a(dcn $$0) {
      iu $$1 = $$0.a();
      ja $$2 = $$0.k();
      iu $$3 = $$1.a($$2);
      cqs $$4 = $$0.o();
      cys $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bty.d;
      } else {
         dip $$6 = $$0.q();
         cmp $$8;
         if (this.b == bwj.aK) {
            Optional<cms> $$7 = cms.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bty.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bwj.as) {
            $$8 = new cmq($$6, $$3, $$2);
         } else {
            if (this.b != bwj.af) {
               return bty.a;
            }

            $$8 = new cmo($$6, $$3, $$2);
         }

         bwj.<cmp>a($$6, $$5, $$4).accept($$8);
         if ($$8.g()) {
            if (!$$6.C) {
               $$8.v();
               $$6.a($$4, eeo.t, $$8.dt());
               $$6.b($$8);
            }

            $$5.h(1);
            return bty.a;
         } else {
            return bty.c;
         }
      }
   }

   protected boolean a(cqs $$0, ja $$1, cys $$2, iu $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cys $$0, cyo.b $$1, dbw $$2, Consumer<ww> $$3, dah $$4) {
      if (this.b == bwj.aK && $$2.a(kj.aJ)) {
         je<cmt> $$5 = $$0.a(kj.aJ);
         if ($$5 != null) {
            $$5.a().e().ifPresent($$3);
            $$5.a().f().ifPresent($$3);
            $$3.accept(ww.a("painting.dimensions", $$5.a().b(), $$5.a().c()));
         } else if ($$4.b()) {
            $$3.accept(a);
         }
      }
   }
}
