import java.util.Map;

public class cld extends bvf<ckx> {
   public cld() {
      super(Map.of(ccq.o, ccr.a, ccq.m, ccr.b, ccq.aU, ccr.b, ccq.aV, ccr.b));
   }

   protected boolean a(aqt $$0, ckx $$1) {
      return $$1.aF() && !$$1.bf() && $$1.at() == bty.a;
   }

   protected void a(aqt $$0, ckx $$1, long $$2) {
      btl $$3 = $$1.dU().c(ccq.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.b($$3.do());
         eww $$5 = null;
         if ($$4) {
            eww $$6 = ceh.a($$1, 5, 5, $$3.do());
            if ($$6 != null && ckz.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dT().h() ? ckz.a($$3, $$1.dT()) : a($$1, $$3);
         }

         $$1.dU().a(ccq.m, new cct(jd.a((jw)$$5), 0.6F, 1));
      }
   }

   private static eww a(ckx $$0, btl $$1) {
      eww $$2 = $$1.do().d($$0.do());
      double $$3 = $$2.f() - ayn.d($$0.dT().j(), 8.0, 4.0);
      eww $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.do().e($$4);
   }
}
