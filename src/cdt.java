import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdt extends cdx<btn> {
   @Override
   public Set<ccr<?>> a() {
      return ImmutableSet.of(ccr.h, ccr.g, ccr.M, ccr.am, ccr.au, ccr.ak, new ccr[]{ccr.al, ccr.ao, ccr.an, ccr.as, ccr.at, ccr.aw});
   }

   @Override
   protected void a(are $$0, btn $$1) {
      bup<?> $$2 = $$1.dS();
      $$2.a(ccr.aw, c($$0, $$1));
      Optional<btp> $$3 = Optional.empty();
      Optional<clf> $$4 = Optional.empty();
      Optional<clf> $$5 = Optional.empty();
      Optional<cll> $$6 = Optional.empty();
      Optional<btn> $$7 = Optional.empty();
      Optional<cmv> $$8 = Optional.empty();
      Optional<cmv> $$9 = Optional.empty();
      int $$10 = 0;
      List<clk> $$11 = Lists.newArrayList();
      List<clk> $$12 = Lists.newArrayList();
      cct $$13 = $$2.c(ccr.h).orElse(cct.a());

      for (btn $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof clf) {
            clf $$15 = (clf)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.u()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gw()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof clo $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cll) {
            cll $$17 = (cll)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gr()) {
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
         } else if (!$$3.isEmpty() || !($$14 instanceof cks) && !($$14 instanceof cit)) {
            if ($$7.isEmpty() && clm.a($$14.ak())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((btp)$$14);
         }
      }

      for (btn $$20 : $$2.c(ccr.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof clk) {
            clk $$21 = (clk)$$20;
            if ($$21.gr()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(ccr.M, $$3);
      $$2.a(ccr.ak, $$4);
      $$2.a(ccr.al, $$5);
      $$2.a(ccr.ar, $$7);
      $$2.a(ccr.am, $$8);
      $$2.a(ccr.au, $$9);
      $$2.a(ccr.an, $$12);
      $$2.a(ccr.ao, $$11);
      $$2.a(ccr.as, $$11.size());
      $$2.a(ccr.at, $$10);
   }

   private static Optional<iz> c(are $$0, btn $$1) {
      return iz.a($$1.dp(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(are $$0, iz $$1) {
      dsa $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awo.V);
      return $$3 && $$2.a(dez.oh) ? dfl.g($$2) : $$3;
   }
}
