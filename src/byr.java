import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class byr extends bys {
   private static final List<cul> c = ImmutableList.of(cut.pv, cut.vl);

   @Override
   protected void a(aqu $$0, cmk $$1) {
      Optional<jl> $$2 = $$1.dT().c(ccs.c);
      if (!$$2.isEmpty()) {
         jl $$3 = $$2.get();
         dtc $$4 = $$0.a_($$3.b());
         if ($$4.a(dga.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aqu $$0, cmk $$1, jl $$2, dtc $$3) {
      jd $$4 = $$2.b();
      if ($$3.c(dhj.e) == 8) {
         $$3 = dhj.a($$1, $$3, (dcw)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bra $$8 = $$1.x();
      int $$9 = $$8.b();
      dtc $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cuq $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.g());
         if ($$13 != -1) {
            int $$14 = $$12.H();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dhj.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dhj.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aqu $$0, dtc $$1, jd $$2, dtc $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cmk $$0) {
      bra $$1 = $$0.x();
      if ($$1.a_(cut.px) <= 36) {
         int $$2 = $$1.a_(cut.pw);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cut.pw, $$6);
            cuq $$7 = $$1.b(new cuq(cut.px, $$5));
            if (!$$7.e()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
