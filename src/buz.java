import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class buz extends bvd<bky> {
   @Override
   public Set<btz<?>> a() {
      return ImmutableSet.of(btz.h, btz.g, btz.L, btz.al, btz.at, btz.aj, new btz[]{btz.ak, btz.an, btz.am, btz.ar, btz.as, btz.av});
   }

   @Override
   protected void a(ama $$0, bky $$1) {
      bly<?> $$2 = $$1.dN();
      $$2.a(btz.av, c($$0, $$1));
      Optional<bla> $$3 = Optional.empty();
      Optional<cbw> $$4 = Optional.empty();
      Optional<cbw> $$5 = Optional.empty();
      Optional<ccc> $$6 = Optional.empty();
      Optional<bky> $$7 = Optional.empty();
      Optional<cdm> $$8 = Optional.empty();
      Optional<cdm> $$9 = Optional.empty();
      int $$10 = 0;
      List<ccb> $$11 = Lists.newArrayList();
      List<ccb> $$12 = Lists.newArrayList();
      bub $$13 = $$2.c(btz.h).orElse(bub.a());

      for (bky $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cbw) {
            cbw $$15 = (cbw)$$14;
            if ($$15.n_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gk()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof ccf $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof ccc) {
            ccc $$17 = (ccc)$$14;
            if ($$17.n_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gf()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cdm) {
            cdm $$18 = (cdm)$$14;
            if ($$8.isEmpty() && !ccd.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && ccd.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cbr) && !($$14 instanceof bzt)) {
            if ($$7.isEmpty() && ccd.a($$14.ag())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bla)$$14);
         }
      }

      for (bky $$20 : $$2.c(btz.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof ccb) {
            ccb $$21 = (ccb)$$20;
            if ($$21.gf()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(btz.L, $$3);
      $$2.a(btz.aj, $$4);
      $$2.a(btz.ak, $$5);
      $$2.a(btz.aq, $$7);
      $$2.a(btz.al, $$8);
      $$2.a(btz.at, $$9);
      $$2.a(btz.am, $$12);
      $$2.a(btz.an, $$11);
      $$2.a(btz.ar, $$11.size());
      $$2.a(btz.as, $$10);
   }

   private static Optional<ht> c(ama $$0, bky $$1) {
      return ht.a($$1.dl(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(ama $$0, ht $$1) {
      dgw $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(arc.V);
      return $$3 && $$2.a(cuv.oh) ? cvh.g($$2) : $$3;
   }
}
