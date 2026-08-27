import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsy extends btc<biw> {
   @Override
   public Set<bry<?>> a() {
      return ImmutableSet.of(bry.h, bry.g, bry.L, bry.al, bry.at, bry.aj, new bry[]{bry.ak, bry.an, bry.am, bry.ar, bry.as, bry.av});
   }

   @Override
   protected void a(aki $$0, biw $$1) {
      bjx<?> $$2 = $$1.dM();
      $$2.a(bry.av, c($$0, $$1));
      Optional<biy> $$3 = Optional.empty();
      Optional<bzv> $$4 = Optional.empty();
      Optional<bzv> $$5 = Optional.empty();
      Optional<cab> $$6 = Optional.empty();
      Optional<biw> $$7 = Optional.empty();
      Optional<cbl> $$8 = Optional.empty();
      Optional<cbl> $$9 = Optional.empty();
      int $$10 = 0;
      List<caa> $$11 = Lists.newArrayList();
      List<caa> $$12 = Lists.newArrayList();
      bsa $$13 = $$2.c(bry.h).orElse(bsa.a());

      for (biw $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof bzv) {
            bzv $$15 = (bzv)$$14;
            if ($$15.i_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.q()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gf()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cae $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cab) {
            cab $$17 = (cab)$$14;
            if ($$17.i_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.ga()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cbl) {
            cbl $$18 = (cbl)$$14;
            if ($$8.isEmpty() && !cac.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.G_() && cac.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof bzq) && !($$14 instanceof bxs)) {
            if ($$7.isEmpty() && cac.a($$14.ag())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((biy)$$14);
         }
      }

      for (biw $$20 : $$2.c(bry.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof caa) {
            caa $$21 = (caa)$$20;
            if ($$21.ga()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bry.L, $$3);
      $$2.a(bry.aj, $$4);
      $$2.a(bry.ak, $$5);
      $$2.a(bry.aq, $$7);
      $$2.a(bry.al, $$8);
      $$2.a(bry.at, $$9);
      $$2.a(bry.am, $$12);
      $$2.a(bry.an, $$11);
      $$2.a(bry.ar, $$11.size());
      $$2.a(bry.as, $$10);
   }

   private static Optional<gv> c(aki $$0, biw $$1) {
      return gv.a($$1.dk(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aki $$0, gv $$1) {
      dey $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(apj.V);
      return $$3 && $$2.a(csl.oh) ? csx.g($$2) : $$3;
   }
}
