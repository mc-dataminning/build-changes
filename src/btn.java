import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class btn extends btr<bjm> {
   @Override
   public Set<bsn<?>> a() {
      return ImmutableSet.of(bsn.h, bsn.g, bsn.L, bsn.al, bsn.at, bsn.aj, new bsn[]{bsn.ak, bsn.an, bsn.am, bsn.ar, bsn.as, bsn.av});
   }

   @Override
   protected void a(akt $$0, bjm $$1) {
      bkm<?> $$2 = $$1.dN();
      $$2.a(bsn.av, c($$0, $$1));
      Optional<bjo> $$3 = Optional.empty();
      Optional<cak> $$4 = Optional.empty();
      Optional<cak> $$5 = Optional.empty();
      Optional<caq> $$6 = Optional.empty();
      Optional<bjm> $$7 = Optional.empty();
      Optional<cca> $$8 = Optional.empty();
      Optional<cca> $$9 = Optional.empty();
      int $$10 = 0;
      List<cap> $$11 = Lists.newArrayList();
      List<cap> $$12 = Lists.newArrayList();
      bsp $$13 = $$2.c(bsn.h).orElse(bsp.a());

      for (bjm $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cak) {
            cak $$15 = (cak)$$14;
            if ($$15.m_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gk()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cat $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof caq) {
            caq $$17 = (caq)$$14;
            if ($$17.m_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gf()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cca) {
            cca $$18 = (cca)$$14;
            if ($$8.isEmpty() && !car.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.M_() && car.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof caf) && !($$14 instanceof byh)) {
            if ($$7.isEmpty() && car.a($$14.ag())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bjo)$$14);
         }
      }

      for (bjm $$20 : $$2.c(bsn.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cap) {
            cap $$21 = (cap)$$20;
            if ($$21.gf()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bsn.L, $$3);
      $$2.a(bsn.aj, $$4);
      $$2.a(bsn.ak, $$5);
      $$2.a(bsn.aq, $$7);
      $$2.a(bsn.al, $$8);
      $$2.a(bsn.at, $$9);
      $$2.a(bsn.am, $$12);
      $$2.a(bsn.an, $$11);
      $$2.a(bsn.ar, $$11.size());
      $$2.a(bsn.as, $$10);
   }

   private static Optional<gw> c(akt $$0, bjm $$1) {
      return gw.a($$1.dl(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(akt $$0, gw $$1) {
      dfd $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(apv.V);
      return $$3 && $$2.a(cte.oh) ? ctq.g($$2) : $$3;
   }
}
