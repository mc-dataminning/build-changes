import java.util.ArrayList;
import java.util.List;

public class cwd extends cum {
   public static final int a = 160;

   public cwd(cum.a $$0) {
      super($$0);
   }

   @Override
   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bse> $$4 = new ArrayList<>();
         cxv $$5 = $$0.a(km.H, cxv.a);

         for (cxv.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cws.a($$4, $$2::add, 1.0F, $$1.b());
      }
   }

   @Override
   public cur a(cur $$0, dca $$1, btr $$2) {
      cxv $$3 = $$0.a(km.H, cxv.a);

      for (cxv.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      super.a($$0, $$1, $$2);
      return $$2.fP() ? $$0 : new cur(cuu.pq);
   }
}
