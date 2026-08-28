import java.util.List;
import java.util.Optional;

public class cxc extends cxk {
   private static final xv a = xv.c("painting.random").a(n.h);
   private final bvq<? extends cls> b;

   public cxc(bvq<? extends cls> $$0, cxk.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bti a(dbh $$0) {
      jh $$1 = $$0.a();
      jm $$2 = $$0.k();
      jh $$3 = $$1.a($$2);
      cpw $$4 = $$0.o();
      cxo $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bti.d;
      } else {
         dhh $$6 = $$0.q();
         cls $$8;
         if (this.b == bvq.aL) {
            Optional<clv> $$7 = clv.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bti.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bvq.at) {
            $$8 = new clt($$6, $$3, $$2);
         } else {
            if (this.b != bvq.ag) {
               return bti.a;
            }

            $$8 = new clr($$6, $$3, $$2);
         }

         czx $$12 = $$5.a(ku.W, czx.a);
         if (!$$12.b()) {
            bvq.a($$6, $$4, $$8, $$12);
         }

         if ($$8.m()) {
            if (!$$6.C) {
               $$8.z();
               $$6.a($$4, ecq.t, $$8.dt());
               $$6.b($$8);
            }

            $$5.h(1);
            return bti.a;
         } else {
            return bti.c;
         }
      }
   }

   protected boolean a(cpw $$0, jm $$1, cxo $$2, jh $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
      super.a($$0, $$1, $$2, $$3);
      js.a $$4 = $$1.a();
      if ($$4 != null && this.b == bvq.aL) {
         czx $$5 = $$0.a(ku.W, czx.a);
         if (!$$5.b()) {
            $$5.a($$4.a(vl.a), clv.d).result().ifPresentOrElse($$1x -> {
               ((clw)$$1x.a()).e().ifPresent($$2::add);
               ((clw)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(xv.a("painting.dimensions", ((clw)$$1x.a()).b(), ((clw)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
