import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bog extends boh {
   private static final List<cja> c = ImmutableList.of(cji.oH, cji.ur);

   @Override
   protected void a(akq $$0, cbh $$1) {
      Optional<hd> $$2 = $$1.dN().c(bsh.c);
      if (!$$2.isEmpty()) {
         hd $$3 = $$2.get();
         dfj $$4 = $$0.a_($$3.b());
         if ($$4.a(csw.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(akq $$0, cbh $$1, hd $$2, dfj $$3) {
      gw $$4 = $$2.b();
      if ($$3.c(cue.d) == 8) {
         $$3 = cue.a($$1, $$3, (cpv)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bhf $$8 = $$1.y();
      int $$9 = $$8.b();
      dfj $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cjf $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.L();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = cue.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(cue.d) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(akq $$0, dfj $$1, gw $$2, dfj $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cbh $$0) {
      bhf $$1 = $$0.y();
      if ($$1.a_(cji.oJ) <= 36) {
         int $$2 = $$1.a_(cji.oI);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cji.oI, $$6);
            cjf $$7 = $$1.a(new cjf(cji.oJ, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
