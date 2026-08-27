import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class btg extends bth {
   private static final List<cou> c = ImmutableList.of(cpc.pu, cpc.vh);

   @Override
   protected void a(aov $$0, cgu $$1) {
      Optional<ii> $$2 = $$1.dO().c(bxh.c);
      if (!$$2.isEmpty()) {
         ii $$3 = $$2.get();
         dlf $$4 = $$0.a_($$3.b());
         if ($$4.a(cyq.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aov $$0, cgu $$1, ii $$2, dlf $$3) {
      hz $$4 = $$2.b();
      if ($$3.c(czz.e) == 8) {
         $$3 = czz.a($$1, $$3, (cvn)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bmd $$8 = $$1.A();
      int $$9 = $$8.b();
      dlf $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         coz $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.M();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = czz.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(czz.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aov $$0, dlf $$1, hz $$2, dlf $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cgu $$0) {
      bmd $$1 = $$0.A();
      if ($$1.a_(cpc.pw) <= 36) {
         int $$2 = $$1.a_(cpc.pv);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cpc.pv, $$6);
            coz $$7 = $$1.a(new coz(cpc.pw, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
