import java.util.Map;

public class cnb extends bxb<cmv> {
   public cnb() {
      super(Map.of(cem.o, cen.a, cem.m, cen.b, cem.aU, cen.b, cem.aV, cen.b));
   }

   protected boolean a(ard $$0, cmv $$1) {
      return $$1.aJ() && !$$1.bj() && $$1.aw() == bvu.a;
   }

   protected void a(ard $$0, cmv $$1, long $$2) {
      bvi $$3 = $$1.eb().c(cem.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.l($$3.dt());
         fbb $$5 = null;
         if ($$4) {
            fbb $$6 = cgd.a($$1, 5, 5, $$3.dt());
            if ($$6 != null && cmx.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dY().h() ? cmx.a($$3, $$1.dY()) : a($$1, $$3);
         }

         $$1.eb().a(cem.m, new cep(ji.a((kb)$$5), 0.6F, 1));
      }
   }

   private static fbb a(cmv $$0, bvi $$1) {
      fbb $$2 = $$1.dt().d($$0.dt());
      double $$3 = $$2.g() - ayz.d($$0.dY().j(), 8.0, 4.0);
      fbb $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dt().e($$4);
   }
}
