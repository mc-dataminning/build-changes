import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bpj extends bpk {
   private static final List<cke> c = ImmutableList.of(ckm.oH, ckm.ur);

   @Override
   protected void a(alq $$0, cck $$1) {
      Optional<ia> $$2 = $$1.dN().c(btk.c);
      if (!$$2.isEmpty()) {
         ia $$3 = $$2.get();
         dgb $$4 = $$0.a_($$3.b());
         if ($$4.a(cuc.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(alq $$0, cck $$1, ia $$2, dgb $$3) {
      ht $$4 = $$2.b();
      if ($$3.c(cvl.e) == 8) {
         $$3 = cvl.a($$1, $$3, (cqz)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bii $$8 = $$1.y();
      int $$9 = $$8.b();
      dgb $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         ckj $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.L();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = cvl.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(cvl.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(alq $$0, dgb $$1, ht $$2, dgb $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cck $$0) {
      bii $$1 = $$0.y();
      if ($$1.a_(ckm.oJ) <= 36) {
         int $$2 = $$1.a_(ckm.oI);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(ckm.oI, $$6);
            ckj $$7 = $$1.a(new ckj(ckm.oJ, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
