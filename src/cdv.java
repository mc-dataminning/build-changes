import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdv extends cdz<btp> {
   @Override
   public Set<cct<?>> a() {
      return ImmutableSet.of(cct.h, cct.g, cct.M, cct.am, cct.au, cct.ak, new cct[]{cct.al, cct.ao, cct.an, cct.as, cct.at, cct.aw});
   }

   @Override
   protected void a(arf $$0, btp $$1) {
      bur<?> $$2 = $$1.dS();
      $$2.a(cct.aw, c($$0, $$1));
      Optional<btr> $$3 = Optional.empty();
      Optional<clh> $$4 = Optional.empty();
      Optional<clh> $$5 = Optional.empty();
      Optional<cln> $$6 = Optional.empty();
      Optional<btp> $$7 = Optional.empty();
      Optional<cmx> $$8 = Optional.empty();
      Optional<cmx> $$9 = Optional.empty();
      int $$10 = 0;
      List<clm> $$11 = Lists.newArrayList();
      List<clm> $$12 = Lists.newArrayList();
      ccv $$13 = $$2.c(cct.h).orElse(ccv.a());

      for (btp $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof clh) {
            clh $$15 = (clh)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.u()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gw()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof clq $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cln) {
            cln $$17 = (cln)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gr()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cmx) {
            cmx $$18 = (cmx)$$14;
            if ($$8.isEmpty() && !clo.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && clo.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cku) && !($$14 instanceof civ)) {
            if ($$7.isEmpty() && clo.a($$14.ak())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((btr)$$14);
         }
      }

      for (btp $$20 : $$2.c(cct.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof clm) {
            clm $$21 = (clm)$$20;
            if ($$21.gr()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cct.M, $$3);
      $$2.a(cct.ak, $$4);
      $$2.a(cct.al, $$5);
      $$2.a(cct.ar, $$7);
      $$2.a(cct.am, $$8);
      $$2.a(cct.au, $$9);
      $$2.a(cct.an, $$12);
      $$2.a(cct.ao, $$11);
      $$2.a(cct.as, $$11.size());
      $$2.a(cct.at, $$10);
   }

   private static Optional<iz> c(arf $$0, btp $$1) {
      return iz.a($$1.dp(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arf $$0, iz $$1) {
      dsc $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awp.V);
      return $$3 && $$2.a(dfb.oh) ? dfn.g($$2) : $$3;
   }
}
