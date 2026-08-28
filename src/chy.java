import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chy extends cic<bxu> {
   @Override
   public Set<cgw<?>> a() {
      return ImmutableSet.of(cgw.h, cgw.g, cgw.N, cgw.an, cgw.av, cgw.al, new cgw[]{cgw.am, cgw.ap, cgw.ao, cgw.at, cgw.au, cgw.ax});
   }

   @Override
   protected void a(ars $$0, bxu $$1) {
      byu<?> $$2 = $$1.ec();
      $$2.a(cgw.ax, c($$0, $$1));
      Optional<bxw> $$3 = Optional.empty();
      Optional<cqg> $$4 = Optional.empty();
      Optional<cqg> $$5 = Optional.empty();
      Optional<cqm> $$6 = Optional.empty();
      Optional<bxu> $$7 = Optional.empty();
      Optional<crx> $$8 = Optional.empty();
      Optional<crx> $$9 = Optional.empty();
      int $$10 = 0;
      List<cql> $$11 = Lists.newArrayList();
      List<cql> $$12 = Lists.newArrayList();
      cgy $$13 = $$2.c(cgw.h).orElse(cgy.a());

      for (bxu $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cqg) {
            cqg $$15 = (cqg)$$14;
            if ($$15.n_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.x()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gv()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cqp $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cqm) {
            cqm $$17 = (cqm)$$14;
            if ($$17.n_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.t()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof crx) {
            crx $$18 = (crx)$$14;
            if ($$8.isEmpty() && !cqn.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.Z_() && cqn.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cpq) && !($$14 instanceof cnp)) {
            if ($$7.isEmpty() && cqn.a($$14.an())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bxw)$$14);
         }
      }

      for (bxu $$20 : $$2.c(cgw.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cql) {
            cql $$21 = (cql)$$20;
            if ($$21.t()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cgw.N, $$3);
      $$2.a(cgw.al, $$4);
      $$2.a(cgw.am, $$5);
      $$2.a(cgw.as, $$7);
      $$2.a(cgw.an, $$8);
      $$2.a(cgw.av, $$9);
      $$2.a(cgw.ao, $$12);
      $$2.a(cgw.ap, $$11);
      $$2.a(cgw.at, $$11.size());
      $$2.a(cgw.au, $$10);
   }

   private static Optional<iv> c(ars $$0, bxu $$1) {
      return iv.a($$1.dv(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(ars $$0, iv $$1) {
      ebe $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(axe.X);
      return $$3 && $$2.a(dne.oN) ? dns.h($$2) : $$3;
   }
}
