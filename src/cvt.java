import java.util.List;
import java.util.Optional;

public class cvt extends cwb {
   private static final xl a = xl.c("painting.random").a(n.h);
   private final bup<? extends ckr> b;

   public cvt(bup<? extends ckr> $$0, cwb.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bsh a(czy $$0) {
      jh $$1 = $$0.a();
      jm $$2 = $$0.k();
      jh $$3 = $$1.a($$2);
      cor $$4 = $$0.o();
      cwf $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bsh.d;
      } else {
         dff $$6 = $$0.q();
         ckr $$8;
         if (this.b == bup.av) {
            Optional<cku> $$7 = cku.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bsh.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bup.ai) {
            $$8 = new cks($$6, $$3, $$2);
         } else {
            if (this.b != bup.V) {
               return bsh.a;
            }

            $$8 = new ckq($$6, $$3, $$2);
         }

         cyo $$12 = $$5.a(ku.W, cyo.a);
         if (!$$12.b()) {
            bup.a($$6, $$4, $$8, $$12);
         }

         if ($$8.o()) {
            if (!$$6.C) {
               $$8.B();
               $$6.a($$4, eak.t, $$8.dw());
               $$6.b($$8);
            }

            $$5.h(1);
            return bsh.a;
         } else {
            return bsh.c;
         }
      }
   }

   protected boolean a(cor $$0, jm $$1, cwf $$2, jh $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      super.a($$0, $$1, $$2, $$3);
      js.a $$4 = $$1.a();
      if ($$4 != null && this.b == bup.av) {
         cyo $$5 = $$0.a(ku.W, cyo.a);
         if (!$$5.b()) {
            $$5.a($$4.a(vb.a), cku.e).result().ifPresentOrElse($$1x -> {
               ((ckv)$$1x.a()).e().ifPresent($$2::add);
               ((ckv)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(xl.a("painting.dimensions", ((ckv)$$1x.a()).b(), ((ckv)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
