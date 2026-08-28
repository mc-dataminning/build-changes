import java.util.ArrayList;
import java.util.List;

public class cwc extends cul {
   public static final int a = 160;

   public cwc(cul.a $$0) {
      super($$0);
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bsd> $$4 = new ArrayList<>();
         cxu $$5 = $$0.a(km.H, cxu.a);

         for (cxu.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cwr.a($$4, $$2::add, 1.0F, $$1.b());
      }
   }

   @Override
   public cuq a(cuq $$0, dbz $$1, btq $$2) {
      cxu $$3 = $$0.a(km.H, cxu.a);

      for (cxu.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      super.a($$0, $$1, $$2);
      return $$2.fP() ? $$0 : new cuq(cut.pq);
   }
}
