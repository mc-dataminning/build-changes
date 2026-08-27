import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bta extends bte<biy> {
   @Override
   public Set<bsa<?>> a() {
      return ImmutableSet.of(bsa.h, bsa.g, bsa.L, bsa.al, bsa.at, bsa.aj, new bsa[]{bsa.ak, bsa.an, bsa.am, bsa.ar, bsa.as, bsa.av});
   }

   @Override
   protected void a(akk $$0, biy $$1) {
      bjz<?> $$2 = $$1.dM();
      $$2.a(bsa.av, c($$0, $$1));
      Optional<bja> $$3 = Optional.empty();
      Optional<bzx> $$4 = Optional.empty();
      Optional<bzx> $$5 = Optional.empty();
      Optional<cad> $$6 = Optional.empty();
      Optional<biy> $$7 = Optional.empty();
      Optional<cbn> $$8 = Optional.empty();
      Optional<cbn> $$9 = Optional.empty();
      int $$10 = 0;
      List<cac> $$11 = Lists.newArrayList();
      List<cac> $$12 = Lists.newArrayList();
      bsc $$13 = $$2.c(bsa.h).orElse(bsc.a());

      for (biy $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof bzx) {
            bzx $$15 = (bzx)$$14;
            if ($$15.i_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.q()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gf()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cag $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cad) {
            cad $$17 = (cad)$$14;
            if ($$17.i_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.ga()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cbn) {
            cbn $$18 = (cbn)$$14;
            if ($$8.isEmpty() && !cae.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.G_() && cae.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof bzs) && !($$14 instanceof bxu)) {
            if ($$7.isEmpty() && cae.a($$14.ag())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bja)$$14);
         }
      }

      for (biy $$20 : $$2.c(bsa.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cac) {
            cac $$21 = (cac)$$20;
            if ($$21.ga()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bsa.L, $$3);
      $$2.a(bsa.aj, $$4);
      $$2.a(bsa.ak, $$5);
      $$2.a(bsa.aq, $$7);
      $$2.a(bsa.al, $$8);
      $$2.a(bsa.at, $$9);
      $$2.a(bsa.am, $$12);
      $$2.a(bsa.an, $$11);
      $$2.a(bsa.ar, $$11.size());
      $$2.a(bsa.as, $$10);
   }

   private static Optional<gu> c(akk $$0, biy $$1) {
      return gu.a($$1.dk(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(akk $$0, gu $$1) {
      dfa $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(apl.V);
      return $$3 && $$2.a(csn.oh) ? csz.g($$2) : $$3;
   }
}
