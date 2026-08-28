import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class byf extends byg {
   private static final List<cty> c = ImmutableList.of(cug.pv, cug.vl);

   @Override
   protected void a(aqm $$0, cly $$1) {
      Optional<ji> $$2 = $$1.dV().c(ccg.c);
      if (!$$2.isEmpty()) {
         ji $$3 = $$2.get();
         dsl $$4 = $$0.a_($$3.b());
         if ($$4.a(dfk.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aqm $$0, cly $$1, ji $$2, dsl $$3) {
      ja $$4 = $$2.b();
      if ($$3.c(dgt.e) == 8) {
         $$3 = dgt.a($$1, $$3, (dcg)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bqq $$8 = $$1.x();
      int $$9 = $$8.b();
      dsl $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cud $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.g());
         if ($$13 != -1) {
            int $$14 = $$12.H();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dgt.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dgt.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aqm $$0, dsl $$1, ja $$2, dsl $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cly $$0) {
      bqq $$1 = $$0.x();
      if ($$1.a_(cug.px) <= 36) {
         int $$2 = $$1.a_(cug.pw);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cug.pw, $$6);
            cud $$7 = $$1.b(new cud(cug.px, $$5));
            if (!$$7.e()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
