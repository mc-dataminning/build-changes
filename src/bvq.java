import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bvq extends bvr {
   private static final List<cre> c = ImmutableList.of(crm.pu, crm.vj);

   @Override
   protected void a(aps $$0, cjg $$1) {
      Optional<ik> $$2 = $$1.dP().c(bzr.c);
      if (!$$2.isEmpty()) {
         ik $$3 = $$2.get();
         doz $$4 = $$0.a_($$3.b());
         if ($$4.a(dca.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aps $$0, cjg $$1, ik $$2, doz $$3) {
      ib $$4 = $$2.b();
      if ($$3.c(ddj.e) == 8) {
         $$3 = ddj.a($$1, $$3, (cyx)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      boj $$8 = $$1.y();
      int $$9 = $$8.b();
      doz $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         crj $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.f());
         if ($$13 != -1) {
            int $$14 = $$12.G();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = ddj.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(ddj.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aps $$0, doz $$1, ib $$2, doz $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cjg $$0) {
      boj $$1 = $$0.y();
      if ($$1.a_(crm.pw) <= 36) {
         int $$2 = $$1.a_(crm.pv);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(crm.pv, $$6);
            crj $$7 = $$1.a(new crj(crm.pw, $$5));
            if (!$$7.d()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
