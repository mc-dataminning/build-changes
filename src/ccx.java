import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class ccx extends ccy {
   private static final List<czw> c = ImmutableList.of(dae.qj, dae.ww);

   @Override
   protected void a(aru $$0, crl $$1) {
      Optional<jf> $$2 = $$1.ec().c(cgy.c);
      if (!$$2.isEmpty()) {
         jf $$3 = $$2.get();
         ebg $$4 = $$0.a_($$3.b());
         if ($$4.a(dng.pK)) {
            this.c($$0, $$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aru $$0, crl $$1, jf $$2, ebg $$3) {
      iw $$4 = $$2.b();
      if ($$3.c(doq.e) == 8) {
         $$3 = doq.a($$1, $$3, (djz)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bva $$8 = $$1.n();
      int $$9 = $$8.b();
      ebg $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         daa $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.h());
         if ($$13 != -1) {
            int $$14 = $$12.M();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = doq.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(doq.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aru $$0, ebg $$1, iw $$2, ebg $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void c(aru $$0, crl $$1) {
      bva $$2 = $$1.n();
      if ($$2.a_(dae.ql) <= 36) {
         int $$3 = $$2.a_(dae.qk);
         int $$4 = 3;
         int $$5 = 3;
         int $$6 = Math.min(3, $$3 / 3);
         if ($$6 != 0) {
            int $$7 = $$6 * 3;
            $$2.a(dae.qk, $$7);
            daa $$8 = $$2.b(new daa(dae.ql, $$6));
            if (!$$8.f()) {
               $$1.a($$0, $$8, 0.5F);
            }
         }
      }
   }
}
