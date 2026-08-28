import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class cca extends ccb {
   private static final List<cyo> c = ImmutableList.of(cyw.qe, cyw.wp);

   @Override
   protected void a(aro $$0, cqe $$1) {
      Optional<jd> $$2 = $$1.eb().c(cgb.c);
      if (!$$2.isEmpty()) {
         jd $$3 = $$2.get();
         dzo $$4 = $$0.a_($$3.b());
         if ($$4.a(dlw.pG)) {
            this.c($$0, $$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aro $$0, cqe $$1, jd $$2, dzo $$3) {
      iu $$4 = $$2.b();
      if ($$3.c(dnf.e) == 8) {
         $$3 = dnf.a($$1, $$3, (dip)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      buf $$8 = $$1.n();
      int $$9 = $$8.b();
      dzo $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cys $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.h());
         if ($$13 != -1) {
            int $$14 = $$12.M();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dnf.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dnf.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aro $$0, dzo $$1, iu $$2, dzo $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void c(aro $$0, cqe $$1) {
      buf $$2 = $$1.n();
      if ($$2.a_(cyw.qg) <= 36) {
         int $$3 = $$2.a_(cyw.qf);
         int $$4 = 3;
         int $$5 = 3;
         int $$6 = Math.min(3, $$3 / 3);
         if ($$6 != 0) {
            int $$7 = $$6 * 3;
            $$2.a(cyw.qf, $$7);
            cys $$8 = $$2.b(new cys(cyw.qg, $$6));
            if (!$$8.f()) {
               $$1.a($$0, $$8, 0.5F);
            }
         }
      }
   }
}
