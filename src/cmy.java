import java.util.Map;

public class cmy extends bwy<cms> {
   public cmy() {
      super(Map.of(cej.o, cek.a, cej.m, cek.b, cej.aU, cek.b, cej.aV, cek.b));
   }

   protected boolean a(arc $$0, cms $$1) {
      return $$1.aJ() && !$$1.bj() && $$1.aw() == bvr.a;
   }

   protected void a(arc $$0, cms $$1, long $$2) {
      bvf $$3 = $$1.ec().c(cej.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.du());
         fay $$5 = null;
         if ($$4) {
            fay $$6 = cga.a($$1, 5, 5, $$3.du());
            if ($$6 != null && cmu.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dZ().h() ? cmu.a($$3, $$1.dZ()) : a($$1, $$3);
         }

         $$1.ec().a(cej.m, new cem(ji.a((kb)$$5), 0.6F, 1));
      }
   }

   private static fay a(cms $$0, bvf $$1) {
      fay $$2 = $$1.du().d($$0.du());
      double $$3 = $$2.g() - ayy.d($$0.dZ().j(), 8.0, 4.0);
      fay $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.du().e($$4);
   }
}
