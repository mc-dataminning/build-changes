import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class byb extends byc {
   private static final List<ctv> c = ImmutableList.of(cud.pv, cud.vl);

   @Override
   protected void a(aqk $$0, clu $$1) {
      Optional<ji> $$2 = $$1.dT().c(ccc.c);
      if (!$$2.isEmpty()) {
         ji $$3 = $$2.get();
         dsh $$4 = $$0.a_($$3.b());
         if ($$4.a(dfh.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aqk $$0, clu $$1, ji $$2, dsh $$3) {
      ja $$4 = $$2.b();
      if ($$3.c(dgq.e) == 8) {
         $$3 = dgq.a($$1, $$3, (dcd)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bqm $$8 = $$1.y();
      int $$9 = $$8.b();
      dsh $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cua $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.g());
         if ($$13 != -1) {
            int $$14 = $$12.H();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dgq.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dgq.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aqk $$0, dsh $$1, ja $$2, dsh $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(clu $$0) {
      bqm $$1 = $$0.y();
      if ($$1.a_(cud.px) <= 36) {
         int $$2 = $$1.a_(cud.pw);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cud.pw, $$6);
            cua $$7 = $$1.b(new cua(cud.px, $$5));
            if (!$$7.e()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
