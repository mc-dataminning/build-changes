import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bzm extends bzn {
   private static final List<cvk> c = ImmutableList.of(cvt.pw, cvt.vn);

   @Override
   protected void a(arh $$0, cnh $$1) {
      Optional<jm> $$2 = $$1.dX().c(cdn.c);
      if (!$$2.isEmpty()) {
         jm $$3 = $$2.get();
         duo $$4 = $$0.a_($$3.b());
         if ($$4.a(dhl.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(arh $$0, cnh $$1, jm $$2, duo $$3) {
      je $$4 = $$2.b();
      if ($$3.c(diu.e) == 8) {
         $$3 = diu.a($$1, $$3, (deg)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      brw $$8 = $$1.y();
      int $$9 = $$8.b();
      duo $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cvp $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.h());
         if ($$13 != -1) {
            int $$14 = $$12.J();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = diu.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(diu.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(arh $$0, duo $$1, je $$2, duo $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cnh $$0) {
      brw $$1 = $$0.y();
      if ($$1.a_(cvt.py) <= 36) {
         int $$2 = $$1.a_(cvt.px);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cvt.px, $$6);
            cvp $$7 = $$1.b(new cvp(cvt.py, $$5));
            if (!$$7.f()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
