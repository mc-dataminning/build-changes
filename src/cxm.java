import java.util.List;
import java.util.Optional;

public class cxm extends cxu {
   private static final wv a = wv.c("painting.random").a(n.h);
   private final bwb<? extends cmf> b;

   public cxm(bwb<? extends cmf> $$0, cxu.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public btq a(dbp $$0) {
      jj $$1 = $$0.a();
      jo $$2 = $$0.k();
      jj $$3 = $$1.a($$2);
      cqi $$4 = $$0.o();
      cxy $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return btq.d;
      } else {
         dhp $$6 = $$0.q();
         cmf $$8;
         if (this.b == bwb.aK) {
            Optional<cmi> $$7 = cmi.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return btq.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bwb.as) {
            $$8 = new cmg($$6, $$3, $$2);
         } else {
            if (this.b != bwb.af) {
               return btq.a;
            }

            $$8 = new cme($$6, $$3, $$2);
         }

         bwb.<cmf>a($$6, $$5, $$4).accept($$8);
         if ($$8.g()) {
            if (!$$6.C) {
               $$8.v();
               $$6.a($$4, edm.t, $$8.dt());
               $$6.b($$8);
            }

            $$5.h(1);
            return btq.a;
         } else {
            return btq.c;
         }
      }
   }

   protected boolean a(cqi $$0, jo $$1, cxy $$2, jj $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bwb.aK) {
         js<cmj> $$4 = $$0.a(kx.aG);
         if ($$4 != null) {
            $$4.a().e().ifPresent($$2::add);
            $$4.a().f().ifPresent($$2::add);
            $$2.add(wv.a("painting.dimensions", $$4.a().b(), $$4.a().c()));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
