import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class btz extends bua {
   private static final List<cpl> c = ImmutableList.of(cpt.pu, cpt.vh);

   @Override
   protected void a(apa $$0, chn $$1) {
      Optional<ik> $$2 = $$1.dM().c(bya.c);
      if (!$$2.isEmpty()) {
         ik $$3 = $$2.get();
         dme $$4 = $$0.a_($$3.b());
         if ($$4.a(czh.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(apa $$0, chn $$1, ik $$2, dme $$3) {
      ib $$4 = $$2.b();
      if ($$3.c(daq.e) == 8) {
         $$3 = daq.a($$1, $$3, (cwe)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bmu $$8 = $$1.A();
      int $$9 = $$8.b();
      dme $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cpq $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.M();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = daq.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(daq.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(apa $$0, dme $$1, ib $$2, dme $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(chn $$0) {
      bmu $$1 = $$0.A();
      if ($$1.a_(cpt.pw) <= 36) {
         int $$2 = $$1.a_(cpt.pv);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cpt.pv, $$6);
            cpq $$7 = $$1.a(new cpq(cpt.pw, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
