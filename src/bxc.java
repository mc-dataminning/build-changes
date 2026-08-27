import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bxc extends bxd {
   private static final List<csu> c = ImmutableList.of(ctc.pv, ctc.vl);

   @Override
   protected void a(aqh $$0, cku $$1) {
      Optional<iv> $$2 = $$1.dQ().c(cbd.c);
      if (!$$2.isEmpty()) {
         iv $$3 = $$2.get();
         dqh $$4 = $$0.a_($$3.b());
         if ($$4.a(ddg.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aqh $$0, cku $$1, iv $$2, dqh $$3) {
      in $$4 = $$2.b();
      if ($$3.c(dep.e) == 8) {
         $$3 = dep.a($$1, $$3, (dad)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bpv $$8 = $$1.y();
      int $$9 = $$8.b();
      dqh $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         csz $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.f());
         if ($$13 != -1) {
            int $$14 = $$12.G();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dep.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dep.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aqh $$0, dqh $$1, in $$2, dqh $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cku $$0) {
      bpv $$1 = $$0.y();
      if ($$1.a_(ctc.px) <= 36) {
         int $$2 = $$1.a_(ctc.pw);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(ctc.pw, $$6);
            csz $$7 = $$1.b(new csz(ctc.px, $$5));
            if (!$$7.d()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
