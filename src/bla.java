import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bla extends blb {
   private static final List<cfu> c = ImmutableList.of(cgc.oH, cgc.ur);

   @Override
   protected void a(aif $$0, byb $$1) {
      Optional<hd> $$2 = $$1.dK().c(bpb.c);
      if ($$2.isPresent()) {
         hd $$3 = $$2.get();
         dcb $$4 = $$0.a_($$3.b());
         if ($$4.a(cpo.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aif $$0, byb $$1, hd $$2, dcb $$3) {
      gu $$4 = $$2.b();
      if ($$3.c(cqw.d) == 8) {
         $$3 = cqw.a($$1, $$3, (cmm)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bee $$8 = $$1.w();
      int $$9 = $$8.b();
      dcb $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cfz $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.L();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = cqw.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(cqw.d) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aif $$0, dcb $$1, gu $$2, dcb $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(byb $$0) {
      bee $$1 = $$0.w();
      if ($$1.a_(cgc.oJ) <= 36) {
         int $$2 = $$1.a_(cgc.oI);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cgc.oI, $$6);
            cfz $$7 = $$1.a(new cfz(cgc.oJ, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
