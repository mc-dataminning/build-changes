import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bye extends byf {
   private static final List<ctx> c = ImmutableList.of(cuf.pv, cuf.vl);

   @Override
   protected void a(aqm $$0, clx $$1) {
      Optional<ji> $$2 = $$1.dU().c(ccf.c);
      if (!$$2.isEmpty()) {
         ji $$3 = $$2.get();
         dsk $$4 = $$0.a_($$3.b());
         if ($$4.a(dfj.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aqm $$0, clx $$1, ji $$2, dsk $$3) {
      ja $$4 = $$2.b();
      if ($$3.c(dgs.e) == 8) {
         $$3 = dgs.a($$1, $$3, (dcf)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bqp $$8 = $$1.y();
      int $$9 = $$8.b();
      dsk $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cuc $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.g());
         if ($$13 != -1) {
            int $$14 = $$12.H();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dgs.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dgs.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aqm $$0, dsk $$1, ja $$2, dsk $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(clx $$0) {
      bqp $$1 = $$0.y();
      if ($$1.a_(cuf.px) <= 36) {
         int $$2 = $$1.a_(cuf.pw);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cuf.pw, $$6);
            cuc $$7 = $$1.b(new cuc(cuf.px, $$5));
            if (!$$7.e()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
