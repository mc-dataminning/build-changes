import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bnx extends bny {
   private static final List<cir> c = ImmutableList.of(ciz.oH, ciz.ur);

   @Override
   protected void a(aki $$0, cay $$1) {
      Optional<he> $$2 = $$1.dM().c(bry.c);
      if ($$2.isPresent()) {
         he $$3 = $$2.get();
         dey $$4 = $$0.a_($$3.b());
         if ($$4.a(csl.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aki $$0, cay $$1, he $$2, dey $$3) {
      gv $$4 = $$2.b();
      if ($$3.c(ctt.d) == 8) {
         $$3 = ctt.a($$1, $$3, (cpk)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bgv $$8 = $$1.t();
      int $$9 = $$8.b();
      dey $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         ciw $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.L();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = ctt.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(ctt.d) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aki $$0, dey $$1, gv $$2, dey $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cay $$0) {
      bgv $$1 = $$0.t();
      if ($$1.a_(ciz.oJ) <= 36) {
         int $$2 = $$1.a_(ciz.oI);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(ciz.oI, $$6);
            ciw $$7 = $$1.a(new ciw(ciz.oJ, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
