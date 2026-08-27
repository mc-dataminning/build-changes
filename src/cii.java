import java.util.Map;

public class cii extends bsl<cic> {
   public cii() {
      super(Map.of(bzw.o, bzx.a, bzw.m, bzx.b, bzw.aU, bzx.b, bzw.aV, bzx.b));
   }

   protected boolean a(apu $$0, cic $$1) {
      return $$1.aC() && !$$1.bc() && $$1.ap() == bre.a;
   }

   protected void a(apu $$0, cic $$1, long $$2) {
      bqt $$3 = $$1.dP().c(bzw.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dk());
         esj $$5 = null;
         if ($$4) {
            esj $$6 = cbn.a($$1, 5, 5, $$3.dk());
            if ($$6 != null && cie.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.ei().h() ? cie.a($$3, $$1.ei()) : a($$1, $$3);
         }

         $$1.dP().a(bzw.m, new bzz(id.a($$5), 0.6F, 1));
      }
   }

   private static esj a(cic $$0, bqt $$1) {
      esj $$2 = $$1.dk().d($$0.dk());
      double $$3 = $$2.f() - axm.d($$0.ei().j(), 8.0, 4.0);
      esj $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dk().e($$4);
   }
}
