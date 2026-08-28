import java.util.List;
import java.util.Optional;

public class cux extends cvg {
   private static final xd a = xd.c("painting.random").a(n.h);
   private final btq<? extends cjr> b;

   public cux(btq<? extends cjr> $$0, cvg.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public brk a(cyy $$0) {
      je $$1 = $$0.a();
      jj $$2 = $$0.k();
      je $$3 = $$1.a($$2);
      cnp $$4 = $$0.o();
      cvl $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return brk.d;
      } else {
         dds $$6 = $$0.q();
         cjr $$8;
         if (this.b == btq.av) {
            Optional<cju> $$7 = cju.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return brk.c;
            }

            $$8 = $$7.get();
         } else if (this.b == btq.ai) {
            $$8 = new cjs($$6, $$3, $$2);
         } else {
            if (this.b != btq.V) {
               return brk.a;
            }

            $$8 = new cjq($$6, $$3, $$2);
         }

         cya $$12 = $$5.a(kr.O, cya.a);
         if (!$$12.b()) {
            btq.a($$6, $$4, $$8, $$12);
         }

         if ($$8.o()) {
            if (!$$6.B) {
               $$8.B();
               $$6.a($$4, dyx.t, $$8.dq());
               $$6.b($$8);
            }

            $$5.h(1);
            return brk.a;
         } else {
            return brk.c;
         }
      }
   }

   protected boolean a(cnp $$0, jj $$1, cvl $$2, je $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      super.a($$0, $$1, $$2, $$3);
      jp.a $$4 = $$1.a();
      if ($$4 != null && this.b == btq.av) {
         cya $$5 = $$0.a(kr.O, cya.a);
         if (!$$5.b()) {
            $$5.a($$4.a(ut.a), cju.e).result().ifPresentOrElse($$1x -> {
               ((cjv)$$1x.a()).e().ifPresent($$2::add);
               ((cjv)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(xd.a("painting.dimensions", ((cjv)$$1x.a()).b(), ((cjv)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
