import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class cbs extends cbt {
   private static final List<cxu> c = ImmutableList.of(cyc.qe, cyc.wp);

   @Override
   protected void a(arn $$0, cpu $$1) {
      Optional<jr> $$2 = $$1.eb().c(cft.c);
      if (!$$2.isEmpty()) {
         jr $$3 = $$2.get();
         dym $$4 = $$0.a_($$3.b());
         if ($$4.a(dkw.pG)) {
            this.c($$0, $$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(arn $$0, cpu $$1, jr $$2, dym $$3) {
      jj $$4 = $$2.b();
      if ($$3.c(dmf.e) == 8) {
         $$3 = dmf.a($$1, $$3, (dhp)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      btx $$8 = $$1.n();
      int $$9 = $$8.b();
      dym $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cxy $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.h());
         if ($$13 != -1) {
            int $$14 = $$12.M();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dmf.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dmf.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(arn $$0, dym $$1, jj $$2, dym $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void c(arn $$0, cpu $$1) {
      btx $$2 = $$1.n();
      if ($$2.a_(cyc.qg) <= 36) {
         int $$3 = $$2.a_(cyc.qf);
         int $$4 = 3;
         int $$5 = 3;
         int $$6 = Math.min(3, $$3 / 3);
         if ($$6 != 0) {
            int $$7 = $$6 * 3;
            $$2.a(cyc.qf, $$7);
            cxy $$8 = $$2.b(new cxy(cyc.qg, $$6));
            if (!$$8.f()) {
               $$1.a($$0, $$8, 0.5F);
            }
         }
      }
   }
}
