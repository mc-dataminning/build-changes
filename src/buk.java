import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class buk extends buo<bkj> {
   @Override
   public Set<btk<?>> a() {
      return ImmutableSet.of(btk.h, btk.g, btk.L, btk.al, btk.at, btk.aj, new btk[]{btk.ak, btk.an, btk.am, btk.ar, btk.as, btk.av});
   }

   @Override
   protected void a(alq $$0, bkj $$1) {
      blj<?> $$2 = $$1.dN();
      $$2.a(btk.av, c($$0, $$1));
      Optional<bkl> $$3 = Optional.empty();
      Optional<cbh> $$4 = Optional.empty();
      Optional<cbh> $$5 = Optional.empty();
      Optional<cbn> $$6 = Optional.empty();
      Optional<bkj> $$7 = Optional.empty();
      Optional<ccx> $$8 = Optional.empty();
      Optional<ccx> $$9 = Optional.empty();
      int $$10 = 0;
      List<cbm> $$11 = Lists.newArrayList();
      List<cbm> $$12 = Lists.newArrayList();
      btm $$13 = $$2.c(btk.h).orElse(btm.a());

      for (bkj $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cbh) {
            cbh $$15 = (cbh)$$14;
            if ($$15.n_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gk()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cbq $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cbn) {
            cbn $$17 = (cbn)$$14;
            if ($$17.n_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gf()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof ccx) {
            ccx $$18 = (ccx)$$14;
            if ($$8.isEmpty() && !cbo.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && cbo.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cbc) && !($$14 instanceof bze)) {
            if ($$7.isEmpty() && cbo.a($$14.ag())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bkl)$$14);
         }
      }

      for (bkj $$20 : $$2.c(btk.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cbm) {
            cbm $$21 = (cbm)$$20;
            if ($$21.gf()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(btk.L, $$3);
      $$2.a(btk.aj, $$4);
      $$2.a(btk.ak, $$5);
      $$2.a(btk.aq, $$7);
      $$2.a(btk.al, $$8);
      $$2.a(btk.at, $$9);
      $$2.a(btk.am, $$12);
      $$2.a(btk.an, $$11);
      $$2.a(btk.ar, $$11.size());
      $$2.a(btk.as, $$10);
   }

   private static Optional<ht> c(alq $$0, bkj $$1) {
      return ht.a($$1.dl(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(alq $$0, ht $$1) {
      dgb $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(aqs.V);
      return $$3 && $$2.a(cuc.oh) ? cuo.g($$2) : $$3;
   }
}
