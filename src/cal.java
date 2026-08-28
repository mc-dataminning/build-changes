import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class cal extends cam {
   private static final List<cwm> c = ImmutableList.of(cwu.qa, cwu.wl);

   @Override
   protected void a(ard $$0, coj $$1) {
      Optional<jq> $$2 = $$1.eb().c(cem.c);
      if (!$$2.isEmpty()) {
         jq $$3 = $$2.get();
         dwy $$4 = $$0.a_($$3.b());
         if ($$4.a(djp.pE)) {
            this.c($$0, $$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(ard $$0, coj $$1, jq $$2, dwy $$3) {
      ji $$4 = $$2.b();
      if ($$3.c(dky.e) == 8) {
         $$3 = dky.a($$1, $$3, (dgj)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bss $$8 = $$1.t();
      int $$9 = $$8.b();
      dwy $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cwq $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.h());
         if ($$13 != -1) {
            int $$14 = $$12.M();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dky.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dky.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(ard $$0, dwy $$1, ji $$2, dwy $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void c(ard $$0, coj $$1) {
      bss $$2 = $$1.t();
      if ($$2.a_(cwu.qc) <= 36) {
         int $$3 = $$2.a_(cwu.qb);
         int $$4 = 3;
         int $$5 = 3;
         int $$6 = Math.min(3, $$3 / 3);
         if ($$6 != 0) {
            int $$7 = $$6 * 3;
            $$2.a(cwu.qb, $$7);
            cwq $$8 = $$2.b(new cwq(cwu.qc, $$6));
            if (!$$8.f()) {
               $$1.a($$0, $$8, 0.5F);
            }
         }
      }
   }
}
