import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bnz extends boa {
   private static final List<cit> c = ImmutableList.of(cjb.oH, cjb.ur);

   @Override
   protected void a(akk $$0, cba $$1) {
      Optional<hd> $$2 = $$1.dM().c(bsa.c);
      if (!$$2.isEmpty()) {
         hd $$3 = $$2.get();
         dfa $$4 = $$0.a_($$3.b());
         if ($$4.a(csn.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(akk $$0, cba $$1, hd $$2, dfa $$3) {
      gu $$4 = $$2.b();
      if ($$3.c(ctv.d) == 8) {
         $$3 = ctv.a($$1, $$3, (cpm)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bgx $$8 = $$1.t();
      int $$9 = $$8.b();
      dfa $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         ciy $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.L();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = ctv.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(ctv.d) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(akk $$0, dfa $$1, gu $$2, dfa $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cba $$0) {
      bgx $$1 = $$0.t();
      if ($$1.a_(cjb.oJ) <= 36) {
         int $$2 = $$1.a_(cjb.oI);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cjb.oI, $$6);
            ciy $$7 = $$1.a(new ciy(cjb.oJ, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
