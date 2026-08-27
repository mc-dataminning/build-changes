import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bvy extends bwc<blv> {
   @Override
   public Set<bux<?>> a() {
      return ImmutableSet.of(bux.h, bux.g, bux.L, bux.al, bux.at, bux.aj, new bux[]{bux.ak, bux.an, bux.am, bux.ar, bux.as, bux.av});
   }

   @Override
   protected void a(amp $$0, blv $$1) {
      bmv<?> $$2 = $$1.dO();
      $$2.a(bux.av, c($$0, $$1));
      Optional<blx> $$3 = Optional.empty();
      Optional<cdb> $$4 = Optional.empty();
      Optional<cdb> $$5 = Optional.empty();
      Optional<cdh> $$6 = Optional.empty();
      Optional<blv> $$7 = Optional.empty();
      Optional<cer> $$8 = Optional.empty();
      Optional<cer> $$9 = Optional.empty();
      int $$10 = 0;
      List<cdg> $$11 = Lists.newArrayList();
      List<cdg> $$12 = Lists.newArrayList();
      buz $$13 = $$2.c(bux.h).orElse(buz.a());

      for (blv $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cdb) {
            cdb $$15 = (cdb)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.w()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gk()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cdk $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cdh) {
            cdh $$17 = (cdh)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gf()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cer) {
            cer $$18 = (cer)$$14;
            if ($$8.isEmpty() && !cdi.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.P_() && cdi.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof ccq) && !($$14 instanceof cas)) {
            if ($$7.isEmpty() && cdi.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((blx)$$14);
         }
      }

      for (blv $$20 : $$2.c(bux.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cdg) {
            cdg $$21 = (cdg)$$20;
            if ($$21.gf()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bux.L, $$3);
      $$2.a(bux.aj, $$4);
      $$2.a(bux.ak, $$5);
      $$2.a(bux.aq, $$7);
      $$2.a(bux.al, $$8);
      $$2.a(bux.at, $$9);
      $$2.a(bux.am, $$12);
      $$2.a(bux.an, $$11);
      $$2.a(bux.ar, $$11.size());
      $$2.a(bux.as, $$10);
   }

   private static Optional<hv> c(amp $$0, blv $$1) {
      return hv.a($$1.dm(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(amp $$0, hv $$1) {
      dip $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(arr.V);
      return $$3 && $$2.a(cwb.oh) ? cwn.g($$2) : $$3;
   }
}
