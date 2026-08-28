import java.util.List;
import java.util.Optional;

public class cwy extends cxg {
   private static final xv a = xv.c("painting.random").a(n.h);
   private final bvm<? extends clo> b;

   public cwy(bvm<? extends clo> $$0, cxg.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bte a(dbd $$0) {
      jh $$1 = $$0.a();
      jm $$2 = $$0.k();
      jh $$3 = $$1.a($$2);
      cps $$4 = $$0.o();
      cxk $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bte.d;
      } else {
         dha $$6 = $$0.q();
         clo $$8;
         if (this.b == bvm.aL) {
            Optional<clr> $$7 = clr.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bte.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bvm.at) {
            $$8 = new clp($$6, $$3, $$2);
         } else {
            if (this.b != bvm.ag) {
               return bte.a;
            }

            $$8 = new cln($$6, $$3, $$2);
         }

         czt $$12 = $$5.a(ku.W, czt.a);
         if (!$$12.b()) {
            bvm.a($$6, $$4, $$8, $$12);
         }

         if ($$8.m()) {
            if (!$$6.C) {
               $$8.z();
               $$6.a($$4, ecj.t, $$8.dt());
               $$6.b($$8);
            }

            $$5.h(1);
            return bte.a;
         } else {
            return bte.c;
         }
      }
   }

   protected boolean a(cps $$0, jm $$1, cxk $$2, jh $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      super.a($$0, $$1, $$2, $$3);
      js.a $$4 = $$1.a();
      if ($$4 != null && this.b == bvm.aL) {
         czt $$5 = $$0.a(ku.W, czt.a);
         if (!$$5.b()) {
            $$5.a($$4.a(vl.a), clr.d).result().ifPresentOrElse($$1x -> {
               ((cls)$$1x.a()).e().ifPresent($$2::add);
               ((cls)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(xv.a("painting.dimensions", ((cls)$$1x.a()).b(), ((cls)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
