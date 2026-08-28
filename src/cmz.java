import java.util.Map;

public class cmz extends bwz<cmt> {
   public cmz() {
      super(Map.of(cek.o, cel.a, cek.m, cel.b, cek.aU, cel.b, cek.aV, cel.b));
   }

   protected boolean a(ard $$0, cmt $$1) {
      return $$1.aJ() && !$$1.bj() && $$1.aw() == bvs.a;
   }

   protected void a(ard $$0, cmt $$1, long $$2) {
      bvg $$3 = $$1.eb().c(cek.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.l($$3.dt());
         faz $$5 = null;
         if ($$4) {
            faz $$6 = cgb.a($$1, 5, 5, $$3.dt());
            if ($$6 != null && cmv.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dY().h() ? cmv.a($$3, $$1.dY()) : a($$1, $$3);
         }

         $$1.eb().a(cek.m, new cen(ji.a((kb)$$5), 0.6F, 1));
      }
   }

   private static faz a(cmt $$0, bvg $$1) {
      faz $$2 = $$1.dt().d($$0.dt());
      double $$3 = $$2.g() - ayz.d($$0.dY().j(), 8.0, 4.0);
      faz $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dt().e($$4);
   }
}
