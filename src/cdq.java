import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdq extends cdu<btk> {
   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.of(cco.h, cco.g, cco.M, cco.am, cco.au, cco.ak, new cco[]{cco.al, cco.ao, cco.an, cco.as, cco.at, cco.aw});
   }

   @Override
   protected void a(arb $$0, btk $$1) {
      bum<?> $$2 = $$1.dS();
      $$2.a(cco.aw, c($$0, $$1));
      Optional<btm> $$3 = Optional.empty();
      Optional<clc> $$4 = Optional.empty();
      Optional<clc> $$5 = Optional.empty();
      Optional<cli> $$6 = Optional.empty();
      Optional<btk> $$7 = Optional.empty();
      Optional<cms> $$8 = Optional.empty();
      Optional<cms> $$9 = Optional.empty();
      int $$10 = 0;
      List<clh> $$11 = Lists.newArrayList();
      List<clh> $$12 = Lists.newArrayList();
      ccq $$13 = $$2.c(cco.h).orElse(ccq.a());

      for (btk $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof clc) {
            clc $$15 = (clc)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.u()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gw()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cll $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cli) {
            cli $$17 = (cli)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gr()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cms) {
            cms $$18 = (cms)$$14;
            if ($$8.isEmpty() && !clj.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && clj.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof ckp) && !($$14 instanceof ciq)) {
            if ($$7.isEmpty() && clj.a($$14.ak())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((btm)$$14);
         }
      }

      for (btk $$20 : $$2.c(cco.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof clh) {
            clh $$21 = (clh)$$20;
            if ($$21.gr()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cco.M, $$3);
      $$2.a(cco.ak, $$4);
      $$2.a(cco.al, $$5);
      $$2.a(cco.ar, $$7);
      $$2.a(cco.am, $$8);
      $$2.a(cco.au, $$9);
      $$2.a(cco.an, $$12);
      $$2.a(cco.ao, $$11);
      $$2.a(cco.as, $$11.size());
      $$2.a(cco.at, $$10);
   }

   private static Optional<iz> c(arb $$0, btk $$1) {
      return iz.a($$1.dp(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arb $$0, iz $$1) {
      drx $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awl.V);
      return $$3 && $$2.a(dew.oh) ? dfi.g($$2) : $$3;
   }
}
