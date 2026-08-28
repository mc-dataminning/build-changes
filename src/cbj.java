import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class cbj extends cbk {
   private static final List<cxl> c = ImmutableList.of(cxt.pR, cxt.wb);

   @Override
   protected void a(ash $$0, cpj $$1) {
      Optional<jp> $$2 = $$1.ec().c(cfk.c);
      if (!$$2.isEmpty()) {
         jp $$3 = $$2.get();
         dxv $$4 = $$0.a_($$3.b());
         if ($$4.a(dko.px)) {
            this.c($$0, $$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(ash $$0, cpj $$1, jp $$2, dxv $$3) {
      jh $$4 = $$2.b();
      if ($$3.c(dly.e) == 8) {
         $$3 = dly.a($$1, $$3, (dhi)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      btq $$8 = $$1.t();
      int $$9 = $$8.b();
      dxv $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cxp $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.h());
         if ($$13 != -1) {
            int $$14 = $$12.L();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dly.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dly.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(ash $$0, dxv $$1, jh $$2, dxv $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void c(ash $$0, cpj $$1) {
      btq $$2 = $$1.t();
      if ($$2.a_(cxt.pT) <= 36) {
         int $$3 = $$2.a_(cxt.pS);
         int $$4 = 3;
         int $$5 = 3;
         int $$6 = Math.min(3, $$3 / 3);
         if ($$6 != 0) {
            int $$7 = $$6 * 3;
            $$2.a(cxt.pS, $$7);
            cxp $$8 = $$2.b(new cxp(cxt.pT, $$6));
            if (!$$8.f()) {
               $$1.a($$0, $$8, 0.5F);
            }
         }
      }
   }
}
