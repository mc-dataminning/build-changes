import java.util.Map;

public class cgi extends bqp<cgc> {
   public cgi() {
      super(Map.of(bya.o, byb.a, bya.m, byb.b, bya.aU, byb.b, bya.aV, byb.b));
   }

   protected boolean a(apa $$0, cgc $$1) {
      return $$1.aC() && !$$1.aZ() && $$1.ap() == bpi.a;
   }

   protected void a(apa $$0, cgc $$1, long $$2) {
      box $$3 = $$1.dM().c(bya.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dh());
         eov $$5 = null;
         if ($$4) {
            eov $$6 = bzr.a($$1, 5, 5, $$3.dh());
            if ($$6 != null && cge.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.f($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.ef().h() ? cge.a($$3, $$1.ef()) : a($$1, $$3);
         }

         $$1.dM().a(bya.m, new byd(ib.a($$5), 0.6F, 1));
      }
   }

   private static eov a(cgc $$0, box $$1) {
      eov $$2 = $$1.dh().d($$0.dh());
      double $$3 = $$2.f() - awm.d($$0.ef().j(), 8.0, 4.0);
      eov $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dh().e($$4);
   }
}
