import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bxq extends bxr {
   private static final List<cuc> c = ImmutableList.of(cuk.qO, cuk.wW);

   @Override
   protected void a(aqt $$0, cll $$1) {
      Optional<iz> $$2 = $$1.dZ().c(cbr.c);
      if (!$$2.isEmpty()) {
         iz $$3 = $$2.get();
         dtc $$4 = $$0.a_($$3.b());
         if ($$4.a(dfe.qn)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aqt $$0, cll $$1, iz $$2, dtc $$3) {
      ir $$4 = $$2.b();
      if ($$3.c(dgn.e) == 8) {
         $$3 = dgn.a($$1, $$3, (dca)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bqj $$8 = $$1.x();
      int $$9 = $$8.b();
      dtc $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cuh $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.f());
         if ($$13 != -1) {
            int $$14 = $$12.G();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dgn.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dgn.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aqt $$0, dtc $$1, ir $$2, dtc $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cll $$0) {
      bqj $$1 = $$0.x();
      if ($$1.a_(cuk.qQ) <= 36) {
         int $$2 = $$1.a_(cuk.qP);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cuk.qP, $$6);
            cuh $$7 = $$1.b(new cuh(cuk.qQ, $$5));
            if (!$$7.d()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
