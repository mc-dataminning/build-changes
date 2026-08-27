import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bxr extends bxs {
   private static final List<ctj> c = ImmutableList.of(ctr.pv, ctr.vl);

   @Override
   protected void a(aqm $$0, clj $$1) {
      Optional<iw> $$2 = $$1.dS().c(cbs.c);
      if (!$$2.isEmpty()) {
         iw $$3 = $$2.get();
         drb $$4 = $$0.a_($$3.b());
         if ($$4.a(dea.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aqm $$0, clj $$1, iw $$2, drb $$3) {
      io $$4 = $$2.b();
      if ($$3.c(dfj.e) == 8) {
         $$3 = dfj.a($$1, $$3, (dax)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bqd $$8 = $$1.y();
      int $$9 = $$8.b();
      drb $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cto $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.g());
         if ($$13 != -1) {
            int $$14 = $$12.I();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dfj.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dfj.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aqm $$0, drb $$1, io $$2, drb $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(clj $$0) {
      bqd $$1 = $$0.y();
      if ($$1.a_(ctr.px) <= 36) {
         int $$2 = $$1.a_(ctr.pw);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(ctr.pw, $$6);
            cto $$7 = $$1.b(new cto(ctr.px, $$5));
            if (!$$7.e()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
