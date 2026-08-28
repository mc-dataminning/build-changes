import java.util.Map;

public class cnu extends bxr<cno> {
   public cnu() {
      super(Map.of(cfc.o, cfd.a, cfc.m, cfd.b, cfc.aU, cfd.b, cfc.aV, cfd.b));
   }

   protected boolean a(ard $$0, cno $$1) {
      return $$1.aJ() && !$$1.bj() && $$1.aw() == bwk.a;
   }

   protected void a(ard $$0, cno $$1, long $$2) {
      bvy $$3 = $$1.ea().c(cfc.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.l($$3.ds());
         fbx $$5 = null;
         if ($$4) {
            fbx $$6 = cgt.a($$1, 5, 5, $$3.ds());
            if ($$6 != null && cnq.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dX().h() ? cnq.a($$3, $$1.dX()) : a($$1, $$3);
         }

         $$1.ea().a(cfc.m, new cff(ji.a((kb)$$5), 0.6F, 1));
      }
   }

   private static fbx a(cno $$0, bvy $$1) {
      fbx $$2 = $$1.ds().d($$0.ds());
      double $$3 = $$2.g() - ayz.d($$0.dX().j(), 8.0, 4.0);
      fbx $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.ds().e($$4);
   }
}
