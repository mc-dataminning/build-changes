import java.util.List;
import java.util.Optional;

public class cwd extends cwl {
   private static final wp a = wp.c("painting.random").a(n.h);
   private final bus<? extends cku> b;

   public cwd(bus<? extends cku> $$0, cwl.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bsk a(dai $$0) {
      ji $$1 = $$0.a();
      jn $$2 = $$0.k();
      ji $$3 = $$1.a($$2);
      cox $$4 = $$0.o();
      cwp $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bsk.d;
      } else {
         dgi $$6 = $$0.q();
         cku $$8;
         if (this.b == bus.aK) {
            Optional<ckx> $$7 = ckx.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bsk.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bus.as) {
            $$8 = new ckv($$6, $$3, $$2);
         } else {
            if (this.b != bus.af) {
               return bsk.a;
            }

            $$8 = new ckt($$6, $$3, $$2);
         }

         cyy $$12 = $$5.a(kv.W, cyy.a);
         if (!$$12.c()) {
            bus.a($$6, $$4, $$8, $$12);
         }

         if ($$8.m()) {
            if (!$$6.C) {
               $$8.z();
               $$6.a($$4, ebt.t, $$8.dt());
               $$6.b($$8);
            }

            $$5.h(1);
            return bsk.a;
         } else {
            return bsk.c;
         }
      }
   }

   protected boolean a(cox $$0, jn $$1, cwp $$2, ji $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wp> $$2, cyh $$3) {
      super.a($$0, $$1, $$2, $$3);
      jt.a $$4 = $$1.a();
      if ($$4 != null && this.b == bus.aK) {
         cyy $$5 = $$0.a(kv.W, cyy.a);
         if (!$$5.c()) {
            $$5.a($$4.a(ue.a), ckx.d).result().ifPresentOrElse($$1x -> {
               ((cky)$$1x.a()).e().ifPresent($$2::add);
               ((cky)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(wp.a("painting.dimensions", ((cky)$$1x.a()).b(), ((cky)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
