import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class cdg extends cdh {
   private static final List<dag> c = ImmutableList.of(dao.qj, dao.ww);

   @Override
   protected void a(asb $$0, cru $$1) {
      Optional<jf> $$2 = $$1.ec().c(chh.c);
      if (!$$2.isEmpty()) {
         jf $$3 = $$2.get();
         ebq $$4 = $$0.a_($$3.b());
         if ($$4.a(dnq.pK)) {
            this.c($$0, $$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(asb $$0, cru $$1, jf $$2, ebq $$3) {
      iw $$4 = $$2.b();
      if ($$3.c(dpa.e) == 8) {
         $$3 = dpa.a($$1, $$3, (dkj)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bvj $$8 = $$1.n();
      int $$9 = $$8.b();
      ebq $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         dak $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.h());
         if ($$13 != -1) {
            int $$14 = $$12.M();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dpa.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dpa.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(asb $$0, ebq $$1, iw $$2, ebq $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void c(asb $$0, cru $$1) {
      bvj $$2 = $$1.n();
      if ($$2.a_(dao.ql) <= 36) {
         int $$3 = $$2.a_(dao.qk);
         int $$4 = 3;
         int $$5 = 3;
         int $$6 = Math.min(3, $$3 / 3);
         if ($$6 != 0) {
            int $$7 = $$6 * 3;
            $$2.a(dao.qk, $$7);
            dak $$8 = $$2.b(new dak(dao.ql, $$6));
            if (!$$8.f()) {
               $$1.a($$0, $$8, 0.5F);
            }
         }
      }
   }
}
