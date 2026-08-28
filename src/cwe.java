import java.util.List;
import java.util.Optional;

public class cwe extends cwm {
   private static final wp a = wp.c("painting.random").a(n.h);
   private final but<? extends ckv> b;

   public cwe(but<? extends ckv> $$0, cwm.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bsl a(daj $$0) {
      ji $$1 = $$0.a();
      jn $$2 = $$0.k();
      ji $$3 = $$1.a($$2);
      coy $$4 = $$0.o();
      cwq $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bsl.d;
      } else {
         dgj $$6 = $$0.q();
         ckv $$8;
         if (this.b == but.aK) {
            Optional<cky> $$7 = cky.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bsl.c;
            }

            $$8 = $$7.get();
         } else if (this.b == but.as) {
            $$8 = new ckw($$6, $$3, $$2);
         } else {
            if (this.b != but.af) {
               return bsl.a;
            }

            $$8 = new cku($$6, $$3, $$2);
         }

         cyz $$12 = $$5.a(kv.W, cyz.a);
         if (!$$12.c()) {
            but.a($$6, $$4, $$8, $$12);
         }

         if ($$8.m()) {
            if (!$$6.C) {
               $$8.z();
               $$6.a($$4, ebu.t, $$8.dt());
               $$6.b($$8);
            }

            $$5.h(1);
            return bsl.a;
         } else {
            return bsl.c;
         }
      }
   }

   protected boolean a(coy $$0, jn $$1, cwq $$2, ji $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
      super.a($$0, $$1, $$2, $$3);
      jt.a $$4 = $$1.a();
      if ($$4 != null && this.b == but.aK) {
         cyz $$5 = $$0.a(kv.W, cyz.a);
         if (!$$5.c()) {
            $$5.a($$4.a(ue.a), cky.d).result().ifPresentOrElse($$1x -> {
               ((ckz)$$1x.a()).e().ifPresent($$2::add);
               ((ckz)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(wp.a("painting.dimensions", ((ckz)$$1x.a()).b(), ((ckz)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
