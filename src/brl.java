import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class brl extends brm {
   private static final List<cms> c = ImmutableList.of(cna.ps, cna.ve);

   @Override
   protected void a(and $$0, ceu $$1) {
      Optional<ig> $$2 = $$1.dO().c(bvm.c);
      if (!$$2.isEmpty()) {
         ig $$3 = $$2.get();
         djg $$4 = $$0.a_($$3.b());
         if ($$4.a(cwr.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(and $$0, ceu $$1, ig $$2, djg $$3) {
      hx $$4 = $$2.b();
      if ($$3.c(cya.e) == 8) {
         $$3 = cya.a($$1, $$3, (cto)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bki $$8 = $$1.A();
      int $$9 = $$8.b();
      djg $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cmx $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.d());
         if ($$13 != -1) {
            int $$14 = $$12.L();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = cya.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(cya.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(and $$0, djg $$1, hx $$2, djg $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(ceu $$0) {
      bki $$1 = $$0.A();
      if ($$1.a_(cna.pu) <= 36) {
         int $$2 = $$1.a_(cna.pt);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cna.pt, $$6);
            cmx $$7 = $$1.a(new cmx(cna.pu, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
