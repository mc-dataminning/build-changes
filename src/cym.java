import java.util.Optional;
import java.util.function.Consumer;

public class cym extends cyu {
   private static final wy a = wy.c("painting.random").a(n.h);
   private final bwm<? extends cmv> b;

   public cym(bwm<? extends cmv> $$0, cyu.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bub a(dct $$0) {
      iu $$1 = $$0.a();
      ja $$2 = $$0.k();
      iu $$3 = $$1.a($$2);
      cqy $$4 = $$0.o();
      cyy $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bub.d;
      } else {
         div $$6 = $$0.q();
         cmv $$8;
         if (this.b == bwm.aK) {
            Optional<cmy> $$7 = cmy.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bub.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bwm.as) {
            $$8 = new cmw($$6, $$3, $$2);
         } else {
            if (this.b != bwm.af) {
               return bub.a;
            }

            $$8 = new cmu($$6, $$3, $$2);
         }

         bwm.<cmv>a($$6, $$5, $$4).accept($$8);
         if ($$8.g()) {
            if (!$$6.C) {
               $$8.v();
               $$6.a($$4, eez.t, $$8.dt());
               $$6.b($$8);
            }

            $$5.h(1);
            return bub.a;
         } else {
            return bub.c;
         }
      }
   }

   protected boolean a(cqy $$0, ja $$1, cyy $$2, iu $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cyy $$0, cyu.b $$1, dcc $$2, Consumer<wy> $$3, dan $$4) {
      if (this.b == bwm.aK && $$2.a(kj.aK)) {
         je<cmz> $$5 = $$0.a(kj.aK);
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
