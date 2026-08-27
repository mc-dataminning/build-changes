import java.util.ArrayList;
import java.util.List;

public class cvc extends ctl {
   public static final int a = 160;

   public cvc(ctl.a $$0) {
      super($$0);
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bre> $$4 = new ArrayList<>();
         cwu $$5 = $$0.a(kb.G, cwu.a);

         for (cwu.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cvr.a($$4, $$2::add, 1.0F, $$1.b());
      }
   }

   @Override
   public ctq a(ctq $$0, daz $$1, bsq $$2) {
      cwu $$3 = $$0.a(kb.G, cwu.a);

      for (cwu.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      super.a($$0, $$1, $$2);
      return $$2.fP() ? $$0 : new ctq(ctt.pq);
   }
}
