import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class brg extends brh {
   private static final List<cmm> c = ImmutableList.of(cmu.ps, cmu.ve);

   @Override
   protected void a(amz $$0, ceo $$1) {
      Optional<ig> $$2 = $$1.dO().c(bvh.c);
      if (!$$2.isEmpty()) {
         ig $$3 = $$2.get();
         dja $$4 = $$0.a_($$3.b());
         if ($$4.a(cwl.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(amz $$0, ceo $$1, ig $$2, dja $$3) {
      hx $$4 = $$2.b();
      if ($$3.c(cxu.e) == 8) {
         $$3 = cxu.a($$1, $$3, (cti)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bkd $$8 = $$1.A();
      int $$9 = $$8.b();
      dja $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cmr $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.L();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = cxu.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(cxu.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(amz $$0, dja $$1, hx $$2, dja $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(ceo $$0) {
      bkd $$1 = $$0.A();
      if ($$1.a_(cmu.pu) <= 36) {
         int $$2 = $$1.a_(cmu.pt);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cmu.pt, $$6);
            cmr $$7 = $$1.a(new cmr(cmu.pu, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
