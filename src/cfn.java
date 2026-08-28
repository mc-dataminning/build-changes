import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfn extends cfr<bvh> {
   @Override
   public Set<cel<?>> a() {
      return ImmutableSet.of(cel.h, cel.g, cel.M, cel.am, cel.au, cel.ak, new cel[]{cel.al, cel.ao, cel.an, cel.as, cel.at, cel.aw});
   }

   @Override
   protected void a(ard $$0, bvh $$1) {
      bwj<?> $$2 = $$1.eb();
      $$2.a(cel.aw, c($$0, $$1));
      Optional<bvj> $$3 = Optional.empty();
      Optional<cnf> $$4 = Optional.empty();
      Optional<cnf> $$5 = Optional.empty();
      Optional<cnl> $$6 = Optional.empty();
      Optional<bvh> $$7 = Optional.empty();
      Optional<cox> $$8 = Optional.empty();
      Optional<cox> $$9 = Optional.empty();
      int $$10 = 0;
      List<cnk> $$11 = Lists.newArrayList();
      List<cnk> $$12 = Lists.newArrayList();
      cen $$13 = $$2.c(cel.h).orElse(cen.a());

      for (bvh $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cnf) {
            cnf $$15 = (cnf)$$14;
            if ($$15.e_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gt()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cno $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cnl) {
            cnl $$17 = (cnl)$$14;
            if ($$17.e_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gs()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cox) {
            cox $$18 = (cox)$$14;
            if ($$8.isEmpty() && !cnm.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.Z_() && cnm.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cmp) && !($$14 instanceof ckp)) {
            if ($$7.isEmpty() && cnm.a($$14.aq())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bvj)$$14);
         }
      }

      for (bvh $$20 : $$2.c(cel.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cnk) {
            cnk $$21 = (cnk)$$20;
            if ($$21.gs()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cel.M, $$3);
      $$2.a(cel.ak, $$4);
      $$2.a(cel.al, $$5);
      $$2.a(cel.ar, $$7);
      $$2.a(cel.am, $$8);
      $$2.a(cel.au, $$9);
      $$2.a(cel.an, $$12);
      $$2.a(cel.ao, $$11);
      $$2.a(cel.as, $$11.size());
      $$2.a(cel.at, $$10);
   }

   private static Optional<ji> c(ard $$0, bvh $$1) {
      return ji.a($$1.dv(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(ard $$0, ji $$1) {
      dwx $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awp.X);
      return $$3 && $$2.a(djo.oJ) ? dkb.h($$2) : $$3;
   }
}
