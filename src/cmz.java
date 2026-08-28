import java.util.Map;

public class cmz extends bwz<cmt> {
   public cmz() {
      super(Map.of(cek.o, cel.a, cek.m, cel.b, cek.aU, cel.b, cek.aV, cel.b));
   }

   protected boolean a(arc $$0, cmt $$1) {
      return $$1.aJ() && !$$1.bj() && $$1.aw() == bvs.a;
   }

   protected void a(arc $$0, cmt $$1, long $$2) {
      bvg $$3 = $$1.ec().c(cek.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.du());
         fba $$5 = null;
         if ($$4) {
            fba $$6 = cgb.a($$1, 5, 5, $$3.du());
            if ($$6 != null && cmv.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dZ().h() ? cmv.a($$3, $$1.dZ()) : a($$1, $$3);
         }

         $$1.ec().a(cek.m, new cen(ji.a((kb)$$5), 0.6F, 1));
      }
   }

   private static fba a(cmt $$0, bvg $$1) {
      fba $$2 = $$1.du().d($$0.du());
      double $$3 = $$2.g() - ayz.d($$0.dZ().j(), 8.0, 4.0);
      fba $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.du().e($$4);
   }
}
