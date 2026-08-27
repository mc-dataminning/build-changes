import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class buq extends bur {
   private static final List<cqf> c = ImmutableList.of(cqn.pu, cqn.vi);

   @Override
   protected void a(apf $$0, cif $$1) {
      Optional<ik> $$2 = $$1.dP().c(byr.c);
      if (!$$2.isEmpty()) {
         ik $$3 = $$2.get();
         dmz $$4 = $$0.a_($$3.b());
         if ($$4.a(dac.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(apf $$0, cif $$1, ik $$2, dmz $$3) {
      ib $$4 = $$2.b();
      if ($$3.c(dbl.e) == 8) {
         $$3 = dbl.a($$1, $$3, (cwz)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bnl $$8 = $$1.y();
      int $$9 = $$8.b();
      dmz $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cqk $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.M();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dbl.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dbl.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(apf $$0, dmz $$1, ib $$2, dmz $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cif $$0) {
      bnl $$1 = $$0.y();
      if ($$1.a_(cqn.pw) <= 36) {
         int $$2 = $$1.a_(cqn.pv);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cqn.pv, $$6);
            cqk $$7 = $$1.a(new cqk(cqn.pw, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
