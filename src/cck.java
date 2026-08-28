import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class cck extends ccl {
   private static final List<czj> c = ImmutableList.of(czr.qj, czr.ww);

   @Override
   protected void a(arq $$0, cqy $$1) {
      Optional<je> $$2 = $$1.eb().c(cgl.c);
      if (!$$2.isEmpty()) {
         je $$3 = $$2.get();
         eat $$4 = $$0.a_($$3.b());
         if ($$4.a(dmt.pK)) {
            this.c($$0, $$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(arq $$0, cqy $$1, je $$2, eat $$3) {
      iv $$4 = $$2.b();
      if ($$3.c(dod.e) == 8) {
         $$3 = dod.a($$1, $$3, (djm)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bun $$8 = $$1.n();
      int $$9 = $$8.b();
      eat $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         czn $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.h());
         if ($$13 != -1) {
            int $$14 = $$12.M();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dod.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dod.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(arq $$0, eat $$1, iv $$2, eat $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void c(arq $$0, cqy $$1) {
      bun $$2 = $$1.n();
      if ($$2.a_(czr.ql) <= 36) {
         int $$3 = $$2.a_(czr.qk);
         int $$4 = 3;
         int $$5 = 3;
         int $$6 = Math.min(3, $$3 / 3);
         if ($$6 != 0) {
            int $$7 = $$6 * 3;
            $$2.a(czr.qk, $$7);
            czn $$8 = $$2.b(new czn(czr.ql, $$6));
            if (!$$8.f()) {
               $$1.a($$0, $$8, 0.5F);
            }
         }
      }
   }
}
