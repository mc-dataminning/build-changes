import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwn extends bwr<bmk> {
   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.of(bvm.h, bvm.g, bvm.L, bvm.al, bvm.at, bvm.aj, new bvm[]{bvm.ak, bvm.an, bvm.am, bvm.ar, bvm.as, bvm.av});
   }

   @Override
   protected void a(and $$0, bmk $$1) {
      bnk<?> $$2 = $$1.dO();
      $$2.a(bvm.av, c($$0, $$1));
      Optional<bmm> $$3 = Optional.empty();
      Optional<cdr> $$4 = Optional.empty();
      Optional<cdr> $$5 = Optional.empty();
      Optional<cdx> $$6 = Optional.empty();
      Optional<bmk> $$7 = Optional.empty();
      Optional<cfh> $$8 = Optional.empty();
      Optional<cfh> $$9 = Optional.empty();
      int $$10 = 0;
      List<cdw> $$11 = Lists.newArrayList();
      List<cdw> $$12 = Lists.newArrayList();
      bvo $$13 = $$2.c(bvm.h).orElse(bvo.a());

      for (bmk $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cdr) {
            cdr $$15 = (cdr)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.w()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gk()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cea $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cdx) {
            cdx $$17 = (cdx)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gf()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cfh) {
            cfh $$18 = (cfh)$$14;
            if ($$8.isEmpty() && !cdy.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.P_() && cdy.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cdf) && !($$14 instanceof cbh)) {
            if ($$7.isEmpty() && cdy.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bmm)$$14);
         }
      }

      for (bmk $$20 : $$2.c(bvm.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cdw) {
            cdw $$21 = (cdw)$$20;
            if ($$21.gf()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bvm.L, $$3);
      $$2.a(bvm.aj, $$4);
      $$2.a(bvm.ak, $$5);
      $$2.a(bvm.aq, $$7);
      $$2.a(bvm.al, $$8);
      $$2.a(bvm.at, $$9);
      $$2.a(bvm.am, $$12);
      $$2.a(bvm.an, $$11);
      $$2.a(bvm.ar, $$11.size());
      $$2.a(bvm.as, $$10);
   }

   private static Optional<hx> c(and $$0, bmk $$1) {
      return hx.a($$1.dm(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(and $$0, hx $$1) {
      djg $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(asg.V);
      return $$3 && $$2.a(cwr.oh) ? cxd.g($$2) : $$3;
   }
}
