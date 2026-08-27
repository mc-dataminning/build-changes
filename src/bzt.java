import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzt extends bzx<bpo> {
   @Override
   public Set<byr<?>> a() {
      return ImmutableSet.of(byr.h, byr.g, byr.M, byr.am, byr.au, byr.ak, new byr[]{byr.al, byr.ao, byr.an, byr.as, byr.at, byr.aw});
   }

   @Override
   protected void a(apf $$0, bpo $$1) {
      bqp<?> $$2 = $$1.dP();
      $$2.a(byr.aw, c($$0, $$1));
      Optional<bpq> $$3 = Optional.empty();
      Optional<chc> $$4 = Optional.empty();
      Optional<chc> $$5 = Optional.empty();
      Optional<chi> $$6 = Optional.empty();
      Optional<bpo> $$7 = Optional.empty();
      Optional<cis> $$8 = Optional.empty();
      Optional<cis> $$9 = Optional.empty();
      int $$10 = 0;
      List<chh> $$11 = Lists.newArrayList();
      List<chh> $$12 = Lists.newArrayList();
      byt $$13 = $$2.c(byr.h).orElse(byt.a());

      for (bpo $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof chc) {
            chc $$15 = (chc)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.s()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gt()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof chl $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof chi) {
            chi $$17 = (chi)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.go()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cis) {
            cis $$18 = (cis)$$14;
            if ($$8.isEmpty() && !chj.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && chj.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cgp) && !($$14 instanceof cer)) {
            if ($$7.isEmpty() && chj.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bpq)$$14);
         }
      }

      for (bpo $$20 : $$2.c(byr.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof chh) {
            chh $$21 = (chh)$$20;
            if ($$21.go()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(byr.M, $$3);
      $$2.a(byr.ak, $$4);
      $$2.a(byr.al, $$5);
      $$2.a(byr.ar, $$7);
      $$2.a(byr.am, $$8);
      $$2.a(byr.au, $$9);
      $$2.a(byr.an, $$12);
      $$2.a(byr.ao, $$11);
      $$2.a(byr.as, $$11.size());
      $$2.a(byr.at, $$10);
   }

   private static Optional<ib> c(apf $$0, bpo $$1) {
      return ib.a($$1.dm(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(apf $$0, ib $$1) {
      dmz $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(aun.V);
      return $$3 && $$2.a(dac.oh) ? dao.g($$2) : $$3;
   }
}
