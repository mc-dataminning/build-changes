import java.util.List;
import java.util.Optional;

public class cwc extends cwk {
   private static final wp a = wp.c("painting.random").a(n.h);
   private final bur<? extends ckt> b;

   public cwc(bur<? extends ckt> $$0, cwk.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bsj a(dah $$0) {
      ji $$1 = $$0.a();
      jn $$2 = $$0.k();
      ji $$3 = $$1.a($$2);
      cow $$4 = $$0.o();
      cwo $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bsj.d;
      } else {
         dgh $$6 = $$0.q();
         ckt $$8;
         if (this.b == bur.aK) {
            Optional<ckw> $$7 = ckw.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bsj.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bur.as) {
            $$8 = new cku($$6, $$3, $$2);
         } else {
            if (this.b != bur.af) {
               return bsj.a;
            }

            $$8 = new cks($$6, $$3, $$2);
         }

         cyx $$12 = $$5.a(kv.W, cyx.a);
         if (!$$12.c()) {
            bur.a($$6, $$4, $$8, $$12);
         }

         if ($$8.m()) {
            if (!$$6.C) {
               $$8.z();
               $$6.a($$4, ebs.t, $$8.dt());
               $$6.b($$8);
            }

            $$5.h(1);
            return bsj.a;
         } else {
            return bsj.c;
         }
      }
   }

   protected boolean a(cow $$0, jn $$1, cwo $$2, ji $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cwo $$0, cwk.b $$1, List<wp> $$2, cyg $$3) {
      super.a($$0, $$1, $$2, $$3);
      jt.a $$4 = $$1.a();
      if ($$4 != null && this.b == bur.aK) {
         cyx $$5 = $$0.a(kv.W, cyx.a);
         if (!$$5.c()) {
            $$5.a($$4.a(ue.a), ckw.d).result().ifPresentOrElse($$1x -> {
               ((ckx)$$1x.a()).e().ifPresent($$2::add);
               ((ckx)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(wp.a("painting.dimensions", ((ckx)$$1x.a()).b(), ((ckx)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
