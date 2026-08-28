import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class cak extends cal {
   private static final List<cwi> c = ImmutableList.of(cwq.pw, cwq.vD);

   @Override
   protected void a(arp $$0, cof $$1) {
      Optional<jp> $$2 = $$1.eb().c(cel.c);
      if (!$$2.isEmpty()) {
         jp $$3 = $$2.get();
         dvv $$4 = $$0.a_($$3.b());
         if ($$4.a(dis.pc)) {
            this.c($$0, $$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(arp $$0, cof $$1, jp $$2, dvv $$3) {
      jh $$4 = $$2.b();
      if ($$3.c(dkb.e) == 8) {
         $$3 = dkb.a($$1, $$3, (dfm)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bsr $$8 = $$1.v();
      int $$9 = $$8.b();
      dvv $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cwm $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.h());
         if ($$13 != -1) {
            int $$14 = $$12.L();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dkb.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dkb.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(arp $$0, dvv $$1, jh $$2, dvv $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void c(arp $$0, cof $$1) {
      bsr $$2 = $$1.v();
      if ($$2.a_(cwq.py) <= 36) {
         int $$3 = $$2.a_(cwq.px);
         int $$4 = 3;
         int $$5 = 3;
         int $$6 = Math.min(3, $$3 / 3);
         if ($$6 != 0) {
            int $$7 = $$6 * 3;
            $$2.a(cwq.px, $$7);
            cwm $$8 = $$2.b(new cwm(cwq.py, $$6));
            if (!$$8.f()) {
               $$1.a($$0, $$8, 0.5F);
            }
         }
      }
   }
}
