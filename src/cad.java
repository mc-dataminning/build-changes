import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class cad extends cae {
   private static final List<cvx> c = ImmutableList.of(cwf.pw, cwf.vn);

   @Override
   protected void a(arn $$0, cny $$1) {
      Optional<jp> $$2 = $$1.ed().c(cee.c);
      if (!$$2.isEmpty()) {
         jp $$3 = $$2.get();
         dvj $$4 = $$0.a_($$3.b());
         if ($$4.a(dig.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(arn $$0, cny $$1, jp $$2, dvj $$3) {
      jh $$4 = $$2.b();
      if ($$3.c(djp.e) == 8) {
         $$3 = djp.a($$1, $$3, (dfb)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bsk $$8 = $$1.y();
      int $$9 = $$8.b();
      dvj $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cwb $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.h());
         if ($$13 != -1) {
            int $$14 = $$12.L();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = djp.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(djp.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(arn $$0, dvj $$1, jh $$2, dvj $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cny $$0) {
      bsk $$1 = $$0.y();
      if ($$1.a_(cwf.py) <= 36) {
         int $$2 = $$1.a_(cwf.px);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cwf.px, $$6);
            cwb $$7 = $$1.b(new cwb(cwf.py, $$5));
            if (!$$7.f()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
