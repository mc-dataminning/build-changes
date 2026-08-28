import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class byq extends byr {
   private static final List<cui> c = ImmutableList.of(cuq.pv, cuq.vl);

   @Override
   protected void a(are $$0, cmi $$1) {
      Optional<jh> $$2 = $$1.dS().c(ccr.c);
      if (!$$2.isEmpty()) {
         jh $$3 = $$2.get();
         dsa $$4 = $$0.a_($$3.b());
         if ($$4.a(dez.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(are $$0, cmi $$1, jh $$2, dsa $$3) {
      iz $$4 = $$2.b();
      if ($$3.c(dgi.e) == 8) {
         $$3 = dgi.a($$1, $$3, (dbw)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      brb $$8 = $$1.y();
      int $$9 = $$8.b();
      dsa $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cun $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.g());
         if ($$13 != -1) {
            int $$14 = $$12.I();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dgi.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dgi.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(are $$0, dsa $$1, iz $$2, dsa $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cmi $$0) {
      brb $$1 = $$0.y();
      if ($$1.a_(cuq.px) <= 36) {
         int $$2 = $$1.a_(cuq.pw);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cuq.pw, $$6);
            cun $$7 = $$1.b(new cun(cuq.px, $$5));
            if (!$$7.e()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
