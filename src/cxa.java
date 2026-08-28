import java.util.ArrayList;
import java.util.List;

public class cxa extends cvg {
   public static final int a = 160;

   public cxa(cvg.a $$0) {
      super($$0);
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bsq> $$4 = new ArrayList<>();
         cyp $$5 = $$0.a(kr.J, cyp.a);

         for (cyp.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cxn.a($$4, $$2::add, 1.0F, $$1.b());
      }
   }

   @Override
   public cvl a(cvl $$0, dds $$1, buf $$2) {
      cyp $$3 = $$0.a(kr.J, cyp.a);

      for (cyp.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      return super.a($$0, $$1, $$2);
   }
}
