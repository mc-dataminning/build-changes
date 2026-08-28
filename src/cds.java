import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cds extends cdw<btl> {
   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.of(ccq.h, ccq.g, ccq.M, ccq.am, ccq.au, ccq.ak, new ccq[]{ccq.al, ccq.ao, ccq.an, ccq.as, ccq.at, ccq.aw});
   }

   @Override
   protected void a(aqt $$0, btl $$1) {
      buo<?> $$2 = $$1.dU();
      $$2.a(ccq.aw, c($$0, $$1));
      Optional<btn> $$3 = Optional.empty();
      Optional<clf> $$4 = Optional.empty();
      Optional<clf> $$5 = Optional.empty();
      Optional<cll> $$6 = Optional.empty();
      Optional<btl> $$7 = Optional.empty();
      Optional<cmv> $$8 = Optional.empty();
      Optional<cmv> $$9 = Optional.empty();
      int $$10 = 0;
      List<clk> $$11 = Lists.newArrayList();
      List<clk> $$12 = Lists.newArrayList();
      ccs $$13 = $$2.c(ccq.h).orElse(ccs.a());

      for (btl $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof clf) {
            clf $$15 = (clf)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gn()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof clo $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cll) {
            cll $$17 = (cll)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gn()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cmv) {
            cmv $$18 = (cmv)$$14;
            if ($$8.isEmpty() && !clm.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && clm.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cks) && !($$14 instanceof cis)) {
            if ($$7.isEmpty() && clm.a($$14.am())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((btn)$$14);
         }
      }

      for (btl $$20 : $$2.c(ccq.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof clk) {
            clk $$21 = (clk)$$20;
            if ($$21.gn()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(ccq.M, $$3);
      $$2.a(ccq.ak, $$4);
      $$2.a(ccq.al, $$5);
      $$2.a(ccq.ar, $$7);
      $$2.a(ccq.am, $$8);
      $$2.a(ccq.au, $$9);
      $$2.a(ccq.an, $$12);
      $$2.a(ccq.ao, $$11);
      $$2.a(ccq.as, $$11.size());
      $$2.a(ccq.at, $$10);
   }

   private static Optional<jd> c(aqt $$0, btl $$1) {
      return jd.a($$1.dq(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aqt $$0, jd $$1) {
      dta $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awd.V);
      return $$3 && $$2.a(dfy.oh) ? dgk.g($$2) : $$3;
   }
}
