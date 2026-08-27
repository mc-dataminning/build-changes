import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class btk extends btl {
   private static final List<coy> c = ImmutableList.of(cpg.pu, cpg.vh);

   @Override
   protected void a(aow $$0, cgy $$1) {
      Optional<ii> $$2 = $$1.dO().c(bxl.c);
      if (!$$2.isEmpty()) {
         ii $$3 = $$2.get();
         dlj $$4 = $$0.a_($$3.b());
         if ($$4.a(cyu.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aow $$0, cgy $$1, ii $$2, dlj $$3) {
      hz $$4 = $$2.b();
      if ($$3.c(dad.e) == 8) {
         $$3 = dad.a($$1, $$3, (cvr)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bmf $$8 = $$1.A();
      int $$9 = $$8.b();
      dlj $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cpd $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.M();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dad.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dad.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aow $$0, dlj $$1, hz $$2, dlj $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cgy $$0) {
      bmf $$1 = $$0.A();
      if ($$1.a_(cpg.pw) <= 36) {
         int $$2 = $$1.a_(cpg.pv);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cpg.pv, $$6);
            cpd $$7 = $$1.a(new cpd(cpg.pw, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
