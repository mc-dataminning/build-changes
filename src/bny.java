import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bny extends bnz {
   private static final List<cis> c = ImmutableList.of(cja.oH, cja.ur);

   @Override
   protected void a(akk $$0, caz $$1) {
      Optional<hd> $$2 = $$1.dM().c(brz.c);
      if (!$$2.isEmpty()) {
         hd $$3 = $$2.get();
         dez $$4 = $$0.a_($$3.b());
         if ($$4.a(csm.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(akk $$0, caz $$1, hd $$2, dez $$3) {
      gu $$4 = $$2.b();
      if ($$3.c(ctu.d) == 8) {
         $$3 = ctu.a($$1, $$3, (cpl)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bgx $$8 = $$1.t();
      int $$9 = $$8.b();
      dez $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cix $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.L();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = ctu.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(ctu.d) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(akk $$0, dez $$1, gu $$2, dez $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(caz $$0) {
      bgx $$1 = $$0.t();
      if ($$1.a_(cja.oJ) <= 36) {
         int $$2 = $$1.a_(cja.oI);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cja.oI, $$6);
            cix $$7 = $$1.a(new cix(cja.oJ, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
