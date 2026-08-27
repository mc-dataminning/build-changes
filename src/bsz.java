import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsz extends btd<biy> {
   @Override
   public Set<brz<?>> a() {
      return ImmutableSet.of(brz.h, brz.g, brz.L, brz.al, brz.at, brz.aj, new brz[]{brz.ak, brz.an, brz.am, brz.ar, brz.as, brz.av});
   }

   @Override
   protected void a(akk $$0, biy $$1) {
      bjy<?> $$2 = $$1.dM();
      $$2.a(brz.av, c($$0, $$1));
      Optional<bja> $$3 = Optional.empty();
      Optional<bzw> $$4 = Optional.empty();
      Optional<bzw> $$5 = Optional.empty();
      Optional<cac> $$6 = Optional.empty();
      Optional<biy> $$7 = Optional.empty();
      Optional<cbm> $$8 = Optional.empty();
      Optional<cbm> $$9 = Optional.empty();
      int $$10 = 0;
      List<cab> $$11 = Lists.newArrayList();
      List<cab> $$12 = Lists.newArrayList();
      bsb $$13 = $$2.c(brz.h).orElse(bsb.a());

      for (biy $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof bzw) {
            bzw $$15 = (bzw)$$14;
            if ($$15.i_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.q()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gg()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof caf $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cac) {
            cac $$17 = (cac)$$14;
            if ($$17.i_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gb()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cbm) {
            cbm $$18 = (cbm)$$14;
            if ($$8.isEmpty() && !cad.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.G_() && cad.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof bzr) && !($$14 instanceof bxt)) {
            if ($$7.isEmpty() && cad.a($$14.ag())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bja)$$14);
         }
      }

      for (biy $$20 : $$2.c(brz.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cab) {
            cab $$21 = (cab)$$20;
            if ($$21.gb()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(brz.L, $$3);
      $$2.a(brz.aj, $$4);
      $$2.a(brz.ak, $$5);
      $$2.a(brz.aq, $$7);
      $$2.a(brz.al, $$8);
      $$2.a(brz.at, $$9);
      $$2.a(brz.am, $$12);
      $$2.a(brz.an, $$11);
      $$2.a(brz.ar, $$11.size());
      $$2.a(brz.as, $$10);
   }

   private static Optional<gu> c(akk $$0, biy $$1) {
      return gu.a($$1.dk(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(akk $$0, gu $$1) {
      dez $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(apl.V);
      return $$3 && $$2.a(csm.oh) ? csy.g($$2) : $$3;
   }
}
