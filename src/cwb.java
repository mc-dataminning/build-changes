import java.util.ArrayList;
import java.util.List;

public class cwb extends cuk {
   public static final int a = 160;

   public cwb(cuk.a $$0) {
      super($$0);
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bsc> $$4 = new ArrayList<>();
         cxt $$5 = $$0.a(km.H, cxt.a);

         for (cxt.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cwq.a($$4, $$2::add, 1.0F, $$1.b());
      }
   }

   @Override
   public cup a(cup $$0, dby $$1, btp $$2) {
      cxt $$3 = $$0.a(km.H, cxt.a);

      for (cxt.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      super.a($$0, $$1, $$2);
      return $$2.fP() ? $$0 : new cup(cus.pq);
   }
}
