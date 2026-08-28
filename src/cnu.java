import java.util.Map;

public class cnu extends bxu<cno> {
   public cnu() {
      super(Map.of(cff.o, cfg.a, cff.m, cfg.b, cff.aU, cfg.b, cff.aV, cfg.b));
   }

   protected boolean a(ash $$0, cno $$1) {
      return $$1.aJ() && !$$1.bj() && $$1.aw() == bwn.a;
   }

   protected void a(ash $$0, cno $$1, long $$2) {
      bwb $$3 = $$1.eb().c(cff.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.dt());
         fbs $$5 = null;
         if ($$4) {
            fbs $$6 = cgw.a($$1, 5, 5, $$3.dt());
            if ($$6 != null && cnq.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dY().h() ? cnq.a($$3, $$1.dY()) : a($$1, $$3);
         }

         $$1.eb().a(cff.m, new cfi(jh.a((ka)$$5), 0.6F, 1));
      }
   }

   private static fbs a(cno $$0, bwb $$1) {
      fbs $$2 = $$1.dt().d($$0.dt());
      double $$3 = $$2.g() - bae.d($$0.dY().j(), 8.0, 4.0);
      fbs $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dt().e($$4);
   }
}
