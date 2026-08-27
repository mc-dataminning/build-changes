import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bqw extends bqx {
   private static final List<cmc> c = ImmutableList.of(cmk.ps, cmk.ve);

   @Override
   protected void a(amp $$0, cee $$1) {
      Optional<id> $$2 = $$1.dO().c(bux.c);
      if (!$$2.isEmpty()) {
         id $$3 = $$2.get();
         dip $$4 = $$0.a_($$3.b());
         if ($$4.a(cwb.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(amp $$0, cee $$1, id $$2, dip $$3) {
      hv $$4 = $$2.b();
      if ($$3.c(cxk.e) == 8) {
         $$3 = cxk.a($$1, $$3, (csy)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bjt $$8 = $$1.A();
      int $$9 = $$8.b();
      dip $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cmh $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.L();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = cxk.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(cxk.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(amp $$0, dip $$1, hv $$2, dip $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cee $$0) {
      bjt $$1 = $$0.A();
      if ($$1.a_(cmk.pu) <= 36) {
         int $$2 = $$1.a_(cmk.pt);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cmk.pt, $$6);
            cmh $$7 = $$1.a(new cmh(cmk.pu, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
