import java.util.ArrayList;
import java.util.List;

public class cvp extends cty {
   public static final int a = 160;

   public cvp(cty.a $$0) {
      super($$0);
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<brp> $$4 = new ArrayList<>();
         cxg $$5 = $$0.a(kn.H, cxg.a);

         for (cxg.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cwe.a($$4, $$2::add, 1.0F, $$1.b());
      }
   }

   @Override
   public cud a(cud $$0, dcg $$1, btc $$2) {
      cxg $$3 = $$0.a(kn.H, cxg.a);

      for (cxg.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      return super.a($$0, $$1, $$2);
   }
}
