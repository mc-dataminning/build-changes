import java.util.ArrayList;
import java.util.List;

public class cvz extends cui {
   public static final int a = 160;

   public cvz(cui.a $$0) {
      super($$0);
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bsa> $$4 = new ArrayList<>();
         cxr $$5 = $$0.a(km.G, cxr.a);

         for (cxr.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cwo.a($$4, $$2::add, 1.0F, $$1.b());
      }
   }

   @Override
   public cun a(cun $$0, dbw $$1, btn $$2) {
      cxr $$3 = $$0.a(km.G, cxr.a);

      for (cxr.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      super.a($$0, $$1, $$2);
      return $$2.fP() ? $$0 : new cun(cuq.pq);
   }
}
