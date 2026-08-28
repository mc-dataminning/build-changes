import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bzp extends bzq {
   private static final List<cvn> c = ImmutableList.of(cvw.pw, cvw.vn);

   @Override
   protected void a(arj $$0, cnk $$1) {
      Optional<jn> $$2 = $$1.dY().c(cdq.c);
      if (!$$2.isEmpty()) {
         jn $$3 = $$2.get();
         dus $$4 = $$0.a_($$3.b());
         if ($$4.a(dho.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(arj $$0, cnk $$1, jn $$2, dus $$3) {
      jf $$4 = $$2.b();
      if ($$3.c(dix.e) == 8) {
         $$3 = dix.a($$1, $$3, (dej)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      brz $$8 = $$1.y();
      int $$9 = $$8.b();
      dus $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cvs $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.h());
         if ($$13 != -1) {
            int $$14 = $$12.K();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dix.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dix.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(arj $$0, dus $$1, jf $$2, dus $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cnk $$0) {
      brz $$1 = $$0.y();
      if ($$1.a_(cvw.py) <= 36) {
         int $$2 = $$1.a_(cvw.px);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cvw.px, $$6);
            cvs $$7 = $$1.b(new cvs(cvw.py, $$5));
            if (!$$7.f()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
