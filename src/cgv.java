import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgv extends cgz<bwr> {
   @Override
   public Set<cft<?>> a() {
      return ImmutableSet.of(cft.h, cft.g, cft.N, cft.an, cft.av, cft.al, new cft[]{cft.am, cft.ap, cft.ao, cft.at, cft.au, cft.ax});
   }

   @Override
   protected void a(arn $$0, bwr $$1) {
      bxr<?> $$2 = $$1.eb();
      $$2.a(cft.ax, c($$0, $$1));
      Optional<bwt> $$3 = Optional.empty();
      Optional<cor> $$4 = Optional.empty();
      Optional<cor> $$5 = Optional.empty();
      Optional<cox> $$6 = Optional.empty();
      Optional<bwr> $$7 = Optional.empty();
      Optional<cqi> $$8 = Optional.empty();
      Optional<cqi> $$9 = Optional.empty();
      int $$10 = 0;
      List<cow> $$11 = Lists.newArrayList();
      List<cow> $$12 = Lists.newArrayList();
      cfv $$13 = $$2.c(cft.h).orElse(cfv.a());

      for (bwr $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cor) {
            cor $$15 = (cor)$$14;
            if ($$15.n_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.x()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gr()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cpa $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cox) {
            cox $$17 = (cox)$$14;
            if ($$17.n_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.t()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cqi) {
            cqi $$18 = (cqi)$$14;
            if ($$8.isEmpty() && !coy.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.U_() && coy.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof coa) && !($$14 instanceof cma)) {
            if ($$7.isEmpty() && coy.a($$14.aq())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bwt)$$14);
         }
      }

      for (bwr $$20 : $$2.c(cft.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cow) {
            cow $$21 = (cow)$$20;
            if ($$21.t()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cft.N, $$3);
      $$2.a(cft.al, $$4);
      $$2.a(cft.am, $$5);
      $$2.a(cft.as, $$7);
      $$2.a(cft.an, $$8);
      $$2.a(cft.av, $$9);
      $$2.a(cft.ao, $$12);
      $$2.a(cft.ap, $$11);
      $$2.a(cft.at, $$11.size());
      $$2.a(cft.au, $$10);
   }

   private static Optional<jj> c(arn $$0, bwr $$1) {
      return jj.a($$1.dv(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arn $$0, jj $$1) {
      dym $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awz.X);
      return $$3 && $$2.a(dkw.oJ) ? dlj.h($$2) : $$3;
   }
}
