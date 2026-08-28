import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface btd {
   void a(bta var1, cuo var2);

   cuo a(bta var1);

   void a(bta var1, float var2);

   default void a(btc $$0, eqk $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(ald<eqm> $$0, eqk $$1, Map<bta, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(ald<eqm> $$0, eqk $$1, long $$2, Map<bta, Float> $$3) {
      if (!$$0.equals(eqd.a)) {
         eqm $$4 = $$1.a().o().be().b($$0);
         if ($$4 != eqm.a) {
            List<cuo> $$5 = $$4.a($$1, $$2);
            List<bta> $$6 = new ArrayList<>();

            for (cuo $$7 : $$5) {
               bta $$8 = this.a($$7, $$6);
               if ($$8 != null) {
                  cuo $$9 = $$8.f() ? $$7.c(1) : $$7;
                  this.a($$8, $$9);
                  Float $$10 = $$3.get($$8);
                  if ($$10 != null) {
                     this.a($$8, $$10);
                  }

                  $$6.add($$8);
               }
            }
         }
      }
   }

   @Nullable
   default bta a(cuo $$0, List<bta> $$1) {
      if ($$0.e()) {
         return null;
      } else {
         ctq $$2 = ctq.c_($$0);
         if ($$2 != null) {
            bta $$3 = $$2.m();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bta.a)) {
            return bta.a;
         }

         return null;
      }
   }
}
