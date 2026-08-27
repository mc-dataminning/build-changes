import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccf extends ccj<bsa> {
   @Override
   public Set<cbd<?>> a() {
      return ImmutableSet.of(cbd.h, cbd.g, cbd.M, cbd.am, cbd.au, cbd.ak, new cbd[]{cbd.al, cbd.ao, cbd.an, cbd.as, cbd.at, cbd.aw});
   }

   @Override
   protected void a(aqh $$0, bsa $$1) {
      btb<?> $$2 = $$1.dQ();
      $$2.a(cbd.aw, c($$0, $$1));
      Optional<bsc> $$3 = Optional.empty();
      Optional<cjr> $$4 = Optional.empty();
      Optional<cjr> $$5 = Optional.empty();
      Optional<cjx> $$6 = Optional.empty();
      Optional<bsa> $$7 = Optional.empty();
      Optional<clh> $$8 = Optional.empty();
      Optional<clh> $$9 = Optional.empty();
      int $$10 = 0;
      List<cjw> $$11 = Lists.newArrayList();
      List<cjw> $$12 = Lists.newArrayList();
      cbf $$13 = $$2.c(cbd.h).orElse(cbf.a());

      for (bsa $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cjr) {
            cjr $$15 = (cjr)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.u()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gv()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cka $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cjx) {
            cjx $$17 = (cjx)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gq()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof clh) {
            clh $$18 = (clh)$$14;
            if ($$8.isEmpty() && !cjy.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && cjy.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cje) && !($$14 instanceof chf)) {
            if ($$7.isEmpty() && cjy.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bsc)$$14);
         }
      }

      for (bsa $$20 : $$2.c(cbd.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cjw) {
            cjw $$21 = (cjw)$$20;
            if ($$21.gq()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cbd.M, $$3);
      $$2.a(cbd.ak, $$4);
      $$2.a(cbd.al, $$5);
      $$2.a(cbd.ar, $$7);
      $$2.a(cbd.am, $$8);
      $$2.a(cbd.au, $$9);
      $$2.a(cbd.an, $$12);
      $$2.a(cbd.ao, $$11);
      $$2.a(cbd.as, $$11.size());
      $$2.a(cbd.at, $$10);
   }

   private static Optional<in> c(aqh $$0, bsa $$1) {
      return in.a($$1.dn(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aqh $$0, in $$1) {
      dqh $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(avr.V);
      return $$3 && $$2.a(ddg.oh) ? dds.g($$2) : $$3;
   }
}
