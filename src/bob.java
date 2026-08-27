import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bob extends boc {
   private static final List<civ> c = ImmutableList.of(cjd.oH, cjd.ur);

   @Override
   protected void a(akn $$0, cbc $$1) {
      Optional<hf> $$2 = $$1.dM().c(bsc.c);
      if (!$$2.isEmpty()) {
         hf $$3 = $$2.get();
         dfe $$4 = $$0.a_($$3.b());
         if ($$4.a(csr.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(akn $$0, cbc $$1, hf $$2, dfe $$3) {
      gw $$4 = $$2.b();
      if ($$3.c(ctz.d) == 8) {
         $$3 = ctz.a($$1, $$3, (cpq)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bha $$8 = $$1.t();
      int $$9 = $$8.b();
      dfe $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cja $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.L();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = ctz.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(ctz.d) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(akn $$0, dfe $$1, gw $$2, dfe $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cbc $$0) {
      bha $$1 = $$0.t();
      if ($$1.a_(cjd.oJ) <= 36) {
         int $$2 = $$1.a_(cjd.oI);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cjd.oI, $$6);
            cja $$7 = $$1.a(new cja(cjd.oJ, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
