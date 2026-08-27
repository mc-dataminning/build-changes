import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwo extends bws<bml> {
   @Override
   public Set<bvn<?>> a() {
      return ImmutableSet.of(bvn.h, bvn.g, bvn.L, bvn.al, bvn.at, bvn.aj, new bvn[]{bvn.ak, bvn.an, bvn.am, bvn.ar, bvn.as, bvn.av});
   }

   @Override
   protected void a(and $$0, bml $$1) {
      bnl<?> $$2 = $$1.dO();
      $$2.a(bvn.av, c($$0, $$1));
      Optional<bmn> $$3 = Optional.empty();
      Optional<cds> $$4 = Optional.empty();
      Optional<cds> $$5 = Optional.empty();
      Optional<cdy> $$6 = Optional.empty();
      Optional<bml> $$7 = Optional.empty();
      Optional<cfi> $$8 = Optional.empty();
      Optional<cfi> $$9 = Optional.empty();
      int $$10 = 0;
      List<cdx> $$11 = Lists.newArrayList();
      List<cdx> $$12 = Lists.newArrayList();
      bvp $$13 = $$2.c(bvn.h).orElse(bvp.a());

      for (bml $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cds) {
            cds $$15 = (cds)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.w()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gk()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof ceb $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cdy) {
            cdy $$17 = (cdy)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gf()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cfi) {
            cfi $$18 = (cfi)$$14;
            if ($$8.isEmpty() && !cdz.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.P_() && cdz.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cdg) && !($$14 instanceof cbi)) {
            if ($$7.isEmpty() && cdz.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bmn)$$14);
         }
      }

      for (bml $$20 : $$2.c(bvn.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cdx) {
            cdx $$21 = (cdx)$$20;
            if ($$21.gf()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bvn.L, $$3);
      $$2.a(bvn.aj, $$4);
      $$2.a(bvn.ak, $$5);
      $$2.a(bvn.aq, $$7);
      $$2.a(bvn.al, $$8);
      $$2.a(bvn.at, $$9);
      $$2.a(bvn.am, $$12);
      $$2.a(bvn.an, $$11);
      $$2.a(bvn.ar, $$11.size());
      $$2.a(bvn.as, $$10);
   }

   private static Optional<hx> c(and $$0, bml $$1) {
      return hx.a($$1.dm(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(and $$0, hx $$1) {
      djh $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(ash.V);
      return $$3 && $$2.a(cws.oh) ? cxe.g($$2) : $$3;
   }
}
