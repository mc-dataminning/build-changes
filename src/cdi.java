import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdi extends cdm<btc> {
   @Override
   public Set<ccg<?>> a() {
      return ImmutableSet.of(ccg.h, ccg.g, ccg.M, ccg.am, ccg.au, ccg.ak, new ccg[]{ccg.al, ccg.ao, ccg.an, ccg.as, ccg.at, ccg.aw});
   }

   @Override
   protected void a(aqm $$0, btc $$1) {
      bue<?> $$2 = $$1.dV();
      $$2.a(ccg.aw, c($$0, $$1));
      Optional<bte> $$3 = Optional.empty();
      Optional<ckv> $$4 = Optional.empty();
      Optional<ckv> $$5 = Optional.empty();
      Optional<clb> $$6 = Optional.empty();
      Optional<btc> $$7 = Optional.empty();
      Optional<cml> $$8 = Optional.empty();
      Optional<cml> $$9 = Optional.empty();
      int $$10 = 0;
      List<cla> $$11 = Lists.newArrayList();
      List<cla> $$12 = Lists.newArrayList();
      cci $$13 = $$2.c(ccg.h).orElse(cci.a());

      for (btc $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof ckv) {
            ckv $$15 = (ckv)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gt()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cle $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof clb) {
            clb $$17 = (clb)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.go()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cml) {
            cml $$18 = (cml)$$14;
            if ($$8.isEmpty() && !clc.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && clc.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cki) && !($$14 instanceof cii)) {
            if ($$7.isEmpty() && clc.a($$14.am())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bte)$$14);
         }
      }

      for (btc $$20 : $$2.c(ccg.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cla) {
            cla $$21 = (cla)$$20;
            if ($$21.go()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(ccg.M, $$3);
      $$2.a(ccg.ak, $$4);
      $$2.a(ccg.al, $$5);
      $$2.a(ccg.ar, $$7);
      $$2.a(ccg.am, $$8);
      $$2.a(ccg.au, $$9);
      $$2.a(ccg.an, $$12);
      $$2.a(ccg.ao, $$11);
      $$2.a(ccg.as, $$11.size());
      $$2.a(ccg.at, $$10);
   }

   private static Optional<ja> c(aqm $$0, btc $$1) {
      return ja.a($$1.dr(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aqm $$0, ja $$1) {
      dsl $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(avw.V);
      return $$3 && $$2.a(dfk.oh) ? dfw.g($$2) : $$3;
   }
}
