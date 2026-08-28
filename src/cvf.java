import java.util.List;
import java.util.Optional;

public class cvf extends cvn {
   private static final xe a = xe.c("painting.random").a(n.h);
   private final bty<? extends cjz> b;

   public cvf(bty<? extends cjz> $$0, cvn.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public brs a(czp $$0) {
      jf $$1 = $$0.a();
      jk $$2 = $$0.k();
      jf $$3 = $$1.a($$2);
      cnx $$4 = $$0.o();
      cvs $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return brs.d;
      } else {
         dej $$6 = $$0.q();
         cjz $$8;
         if (this.b == bty.av) {
            Optional<ckc> $$7 = ckc.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return brs.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bty.ai) {
            $$8 = new cka($$6, $$3, $$2);
         } else {
            if (this.b != bty.V) {
               return brs.a;
            }

            $$8 = new cjy($$6, $$3, $$2);
         }

         cyh $$12 = $$5.a(ks.R, cyh.a);
         if (!$$12.b()) {
            bty.a($$6, $$4, $$8, $$12);
         }

         if ($$8.o()) {
            if (!$$6.B) {
               $$8.B();
               $$6.a($$4, dzp.t, $$8.dq());
               $$6.b($$8);
            }

            $$5.h(1);
            return brs.a;
         } else {
            return brs.c;
         }
      }
   }

   protected boolean a(cnx $$0, jk $$1, cvs $$2, jf $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      super.a($$0, $$1, $$2, $$3);
      jq.a $$4 = $$1.a();
      if ($$4 != null && this.b == bty.av) {
         cyh $$5 = $$0.a(ks.R, cyh.a);
         if (!$$5.b()) {
            $$5.a($$4.a(uu.a), ckc.e).result().ifPresentOrElse($$1x -> {
               ((ckd)$$1x.a()).e().ifPresent($$2::add);
               ((ckd)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(xe.a("painting.dimensions", ((ckd)$$1x.a()).b(), ((ckd)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
