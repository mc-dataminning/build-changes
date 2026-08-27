import java.util.Map;

public class cft extends bqa<cfn> {
   public cft() {
      super(Map.of(bxl.o, bxm.a, bxl.m, bxm.b, bxl.aU, bxm.b, bxl.aV, bxm.b));
   }

   protected boolean a(aow $$0, cfn $$1) {
      return $$1.aC() && !$$1.aZ() && $$1.ap() == bot.a;
   }

   protected void a(aow $$0, cfn $$1, long $$2) {
      boi $$3 = $$1.dO().c(bxl.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dk());
         enz $$5 = null;
         if ($$4) {
            enz $$6 = bzc.a($$1, 5, 5, $$3.dk());
            if ($$6 != null && cfp.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.f($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.eh().h() ? cfp.a($$3, $$1.eh()) : a($$1, $$3);
         }

         $$1.dO().a(bxl.m, new bxo(hz.a($$5), 0.6F, 1));
      }
   }

   private static enz a(cfn $$0, boi $$1) {
      enz $$2 = $$1.dk().d($$0.dk());
      double $$3 = $$2.f() - awi.d($$0.eh().j(), 8.0, 4.0);
      enz $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dk().e($$4);
   }
}
