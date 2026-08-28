import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class ccf extends ccg {
   private static final List<cyz> c = ImmutableList.of(czh.qj, czh.ww);

   @Override
   protected void a(arq $$0, cqo $$1) {
      Optional<jd> $$2 = $$1.ec().c(cgg.c);
      if (!$$2.isEmpty()) {
         jd $$3 = $$2.get();
         eah $$4 = $$0.a_($$3.b());
         if ($$4.a(dmh.pK)) {
            this.c($$0, $$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(arq $$0, cqo $$1, jd $$2, eah $$3) {
      iu $$4 = $$2.b();
      if ($$3.c(dnr.e) == 8) {
         $$3 = dnr.a($$1, $$3, (dja)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      buk $$8 = $$1.n();
      int $$9 = $$8.b();
      eah $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         czd $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.h());
         if ($$13 != -1) {
            int $$14 = $$12.M();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dnr.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dnr.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(arq $$0, eah $$1, iu $$2, eah $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void c(arq $$0, cqo $$1) {
      buk $$2 = $$1.n();
      if ($$2.a_(czh.ql) <= 36) {
         int $$3 = $$2.a_(czh.qk);
         int $$4 = 3;
         int $$5 = 3;
         int $$6 = Math.min(3, $$3 / 3);
         if ($$6 != 0) {
            int $$7 = $$6 * 3;
            $$2.a(czh.qk, $$7);
            czd $$8 = $$2.b(new czd(czh.ql, $$6));
            if (!$$8.f()) {
               $$1.a($$0, $$8, 0.5F);
            }
         }
      }
   }
}
