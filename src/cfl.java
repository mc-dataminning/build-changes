import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfl extends cfp<bvf> {
   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.of(cej.h, cej.g, cej.M, cej.am, cej.au, cej.ak, new cej[]{cej.al, cej.ao, cej.an, cej.as, cej.at, cej.aw});
   }

   @Override
   protected void a(arc $$0, bvf $$1) {
      bwh<?> $$2 = $$1.ec();
      $$2.a(cej.aw, c($$0, $$1));
      Optional<bvh> $$3 = Optional.empty();
      Optional<cnd> $$4 = Optional.empty();
      Optional<cnd> $$5 = Optional.empty();
      Optional<cnj> $$6 = Optional.empty();
      Optional<bvf> $$7 = Optional.empty();
      Optional<cov> $$8 = Optional.empty();
      Optional<cov> $$9 = Optional.empty();
      int $$10 = 0;
      List<cni> $$11 = Lists.newArrayList();
      List<cni> $$12 = Lists.newArrayList();
      cel $$13 = $$2.c(cej.h).orElse(cel.a());

      for (bvf $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cnd) {
            cnd $$15 = (cnd)$$14;
            if ($$15.e_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gq()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cnm $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cnj) {
            cnj $$17 = (cnj)$$14;
            if ($$17.e_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gp()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cov) {
            cov $$18 = (cov)$$14;
            if ($$8.isEmpty() && !cnk.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.Z_() && cnk.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cmn) && !($$14 instanceof ckn)) {
            if ($$7.isEmpty() && cnk.a($$14.aq())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bvh)$$14);
         }
      }

      for (bvf $$20 : $$2.c(cej.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cni) {
            cni $$21 = (cni)$$20;
            if ($$21.gp()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cej.M, $$3);
      $$2.a(cej.ak, $$4);
      $$2.a(cej.al, $$5);
      $$2.a(cej.ar, $$7);
      $$2.a(cej.am, $$8);
      $$2.a(cej.au, $$9);
      $$2.a(cej.an, $$12);
      $$2.a(cej.ao, $$11);
      $$2.a(cej.as, $$11.size());
      $$2.a(cej.at, $$10);
   }

   private static Optional<ji> c(arc $$0, bvf $$1) {
      return ji.a($$1.dw(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arc $$0, ji $$1) {
      dwv $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awo.X);
      return $$3 && $$2.a(djm.oJ) ? djz.h($$2) : $$3;
   }
}
