import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgh extends cgl<bwb> {
   @Override
   public Set<cff<?>> a() {
      return ImmutableSet.of(cff.h, cff.g, cff.M, cff.am, cff.au, cff.ak, new cff[]{cff.al, cff.ao, cff.an, cff.as, cff.at, cff.aw});
   }

   @Override
   protected void a(ash $$0, bwb $$1) {
      bxd<?> $$2 = $$1.eb();
      $$2.a(cff.aw, c($$0, $$1));
      Optional<bwd> $$3 = Optional.empty();
      Optional<coa> $$4 = Optional.empty();
      Optional<coa> $$5 = Optional.empty();
      Optional<cog> $$6 = Optional.empty();
      Optional<bwb> $$7 = Optional.empty();
      Optional<cps> $$8 = Optional.empty();
      Optional<cps> $$9 = Optional.empty();
      int $$10 = 0;
      List<cof> $$11 = Lists.newArrayList();
      List<cof> $$12 = Lists.newArrayList();
      cfh $$13 = $$2.c(cff.h).orElse(cfh.a());

      for (bwb $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof coa) {
            coa $$15 = (coa)$$14;
            if ($$15.e_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gn()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof coj $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cog) {
            cog $$17 = (cog)$$14;
            if ($$17.e_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gm()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cps) {
            cps $$18 = (cps)$$14;
            if ($$8.isEmpty() && !coh.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.aa_() && coh.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cnj) && !($$14 instanceof clj)) {
            if ($$7.isEmpty() && coh.a($$14.aq())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bwd)$$14);
         }
      }

      for (bwb $$20 : $$2.c(cff.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cof) {
            cof $$21 = (cof)$$20;
            if ($$21.gm()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cff.M, $$3);
      $$2.a(cff.ak, $$4);
      $$2.a(cff.al, $$5);
      $$2.a(cff.ar, $$7);
      $$2.a(cff.am, $$8);
      $$2.a(cff.au, $$9);
      $$2.a(cff.an, $$12);
      $$2.a(cff.ao, $$11);
      $$2.a(cff.as, $$11.size());
      $$2.a(cff.at, $$10);
   }

   private static Optional<jh> c(ash $$0, bwb $$1) {
      return jh.a($$1.dv(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(ash $$0, jh $$1) {
      dxn $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(axu.X);
      return $$3 && $$2.a(dkg.oC) ? dkt.h($$2) : $$3;
   }
}
