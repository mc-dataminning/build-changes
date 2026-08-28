import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class byp extends byq {
   private static final List<cuj> c = ImmutableList.of(cur.pv, cur.vl);

   @Override
   protected void a(aqt $$0, cmi $$1) {
      Optional<jl> $$2 = $$1.dU().c(ccq.c);
      if (!$$2.isEmpty()) {
         jl $$3 = $$2.get();
         dta $$4 = $$0.a_($$3.b());
         if ($$4.a(dfy.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aqt $$0, cmi $$1, jl $$2, dta $$3) {
      jd $$4 = $$2.b();
      if ($$3.c(dhh.e) == 8) {
         $$3 = dhh.a($$1, $$3, (dcu)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      bqz $$8 = $$1.x();
      int $$9 = $$8.b();
      dta $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         cuo $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.g());
         if ($$13 != -1) {
            int $$14 = $$12.H();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dhh.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dhh.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aqt $$0, dta $$1, jd $$2, dta $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cmi $$0) {
      bqz $$1 = $$0.x();
      if ($$1.a_(cur.px) <= 36) {
         int $$2 = $$1.a_(cur.pw);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(cur.pw, $$6);
            cuo $$7 = $$1.b(new cuo(cur.px, $$5));
            if (!$$7.e()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
