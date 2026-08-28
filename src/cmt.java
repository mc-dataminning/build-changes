import java.util.Map;

public class cmt extends bwt<cmn> {
   public cmt() {
      super(Map.of(cee.o, cef.a, cee.m, cef.b, cee.aU, cef.b, cee.aV, cef.b));
   }

   protected boolean a(arn $$0, cmn $$1) {
      return $$1.aK() && !$$1.bk() && $$1.ay() == bvm.a;
   }

   protected void a(arn $$0, cmn $$1, long $$2) {
      bva $$3 = $$1.ed().c(cee.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.dv());
         ezn $$5 = null;
         if ($$4) {
            ezn $$6 = cfv.a($$1, 5, 5, $$3.dv());
            if ($$6 != null && cmp.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.ea().h() ? cmp.a($$3, $$1.ea()) : a($$1, $$3);
         }

         $$1.ed().a(cee.m, new ceh(jh.a((ka)$$5), 0.6F, 1));
      }
   }

   private static ezn a(cmn $$0, bva $$1) {
      ezn $$2 = $$1.dv().d($$0.dv());
      double $$3 = $$2.g() - azk.d($$0.ea().j(), 8.0, 4.0);
      ezn $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dv().e($$4);
   }
}
