import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class boi extends boj {
   private static final List<cjc> c = ImmutableList.of(cjk.oH, cjk.ur);

   @Override
   protected void a(aks $$0, cbj $$1) {
      Optional<hf> $$2 = $$1.dN().c(bsj.c);
      if (!$$2.isEmpty()) {
         hf $$3 = $$2.get();
         dfl $$4 = $$0.a_($$3.b());
         if ($$4.a(csy.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aks $$0, cbj $$1, hf $$2, dfl $$3) {
      gw $$4 = $$2.b();
      if ($$3.c(cug.d) == 8) {
         $$3 = cug.a($$1, $$3, (cpx)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bhh $$8 = $$1.y();
      int $$9 = $$8.b();
      dfl $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cjh $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.L();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = cug.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(cug.d) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aks $$0, dfl $$1, gw $$2, dfl $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cbj $$0) {
      bhh $$1 = $$0.y();
      if ($$1.a_(cjk.oJ) <= 36) {
         int $$2 = $$1.a_(cjk.oI);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cjk.oI, $$6);
            cjh $$7 = $$1.a(new cjh(cjk.oJ, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
