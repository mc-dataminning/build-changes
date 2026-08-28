import java.util.List;
import java.util.Optional;

public class cxd extends cxl {
   private static final xv a = xv.c("painting.random").a(n.h);
   private final bvr<? extends clt> b;

   public cxd(bvr<? extends clt> $$0, cxl.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public btj a(dbi $$0) {
      jh $$1 = $$0.a();
      jm $$2 = $$0.k();
      jh $$3 = $$1.a($$2);
      cpx $$4 = $$0.o();
      cxp $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return btj.d;
      } else {
         dhi $$6 = $$0.q();
         clt $$8;
         if (this.b == bvr.aL) {
            Optional<clw> $$7 = clw.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return btj.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bvr.at) {
            $$8 = new clu($$6, $$3, $$2);
         } else {
            if (this.b != bvr.ag) {
               return btj.a;
            }

            $$8 = new cls($$6, $$3, $$2);
         }

         czy $$12 = $$5.a(ku.W, czy.a);
         if (!$$12.b()) {
            bvr.a($$6, $$4, $$8, $$12);
         }

         if ($$8.m()) {
            if (!$$6.C) {
               $$8.z();
               $$6.a($$4, ecr.t, $$8.du());
               $$6.b($$8);
            }

            $$5.h(1);
            return btj.a;
         } else {
            return btj.c;
         }
      }
   }

   protected boolean a(cpx $$0, jm $$1, cxp $$2, jh $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      super.a($$0, $$1, $$2, $$3);
      js.a $$4 = $$1.a();
      if ($$4 != null && this.b == bvr.aL) {
         czy $$5 = $$0.a(ku.W, czy.a);
         if (!$$5.b()) {
            $$5.a($$4.a(vl.a), clw.d).result().ifPresentOrElse($$1x -> {
               ((clx)$$1x.a()).e().ifPresent($$2::add);
               ((clx)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(xv.a("painting.dimensions", ((clx)$$1x.a()).b(), ((clx)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
