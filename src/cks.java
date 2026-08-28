import java.util.Map;

public class cks extends buu<ckm> {
   public cks() {
      super(Map.of(ccf.o, ccg.a, ccf.m, ccg.b, ccf.aU, ccg.b, ccf.aV, ccg.b));
   }

   protected boolean a(aqm $$0, ckm $$1) {
      return $$1.aF() && !$$1.bf() && $$1.as() == btn.a;
   }

   protected void a(aqm $$0, ckm $$1, long $$2) {
      btb $$3 = $$1.dU().c(ccf.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.l($$3.do());
         ewf $$5 = null;
         if ($$4) {
            ewf $$6 = cdw.a($$1, 5, 5, $$3.do());
            if ($$6 != null && cko.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dT().h() ? cko.a($$3, $$1.dT()) : a($$1, $$3);
         }

         $$1.dU().a(ccf.m, new cci(ja.a($$5), 0.6F, 1));
      }
   }

   private static ewf a(ckm $$0, btb $$1) {
      ewf $$2 = $$1.do().d($$0.do());
      double $$3 = $$2.f() - ayg.d($$0.dT().j(), 8.0, 4.0);
      ewf $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.do().e($$4);
   }
}
