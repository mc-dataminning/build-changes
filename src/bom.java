import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bom extends bon {
   private static final List<cjg> c = ImmutableList.of(cjo.oH, cjo.ur);

   @Override
   protected void a(akt $$0, cbn $$1) {
      Optional<hd> $$2 = $$1.dN().c(bsn.c);
      if (!$$2.isEmpty()) {
         hd $$3 = $$2.get();
         dfd $$4 = $$0.a_($$3.b());
         if ($$4.a(cte.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(akt $$0, cbn $$1, hd $$2, dfd $$3) {
      gw $$4 = $$2.b();
      if ($$3.c(cun.e) == 8) {
         $$3 = cun.a($$1, $$3, (cqb)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bhl $$8 = $$1.y();
      int $$9 = $$8.b();
      dfd $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cjl $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.L();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = cun.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(cun.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(akt $$0, dfd $$1, gw $$2, dfd $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cbn $$0) {
      bhl $$1 = $$0.y();
      if ($$1.a_(cjo.oJ) <= 36) {
         int $$2 = $$1.a_(cjo.oI);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cjo.oI, $$6);
            cjl $$7 = $$1.a(new cjl(cjo.oJ, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
