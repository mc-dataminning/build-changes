import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzu extends bzy<bpp> {
   @Override
   public Set<bys<?>> a() {
      return ImmutableSet.of(bys.h, bys.g, bys.M, bys.am, bys.au, bys.ak, new bys[]{bys.al, bys.ao, bys.an, bys.as, bys.at, bys.aw});
   }

   @Override
   protected void a(apf $$0, bpp $$1) {
      bqq<?> $$2 = $$1.dP();
      $$2.a(bys.aw, c($$0, $$1));
      Optional<bpr> $$3 = Optional.empty();
      Optional<che> $$4 = Optional.empty();
      Optional<che> $$5 = Optional.empty();
      Optional<chk> $$6 = Optional.empty();
      Optional<bpp> $$7 = Optional.empty();
      Optional<ciu> $$8 = Optional.empty();
      Optional<ciu> $$9 = Optional.empty();
      int $$10 = 0;
      List<chj> $$11 = Lists.newArrayList();
      List<chj> $$12 = Lists.newArrayList();
      byu $$13 = $$2.c(bys.h).orElse(byu.a());

      for (bpp $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof che) {
            che $$15 = (che)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.s()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gt()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof chn $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof chk) {
            chk $$17 = (chk)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.go()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof ciu) {
            ciu $$18 = (ciu)$$14;
            if ($$8.isEmpty() && !chl.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && chl.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cgr) && !($$14 instanceof ces)) {
            if ($$7.isEmpty() && chl.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bpr)$$14);
         }
      }

      for (bpp $$20 : $$2.c(bys.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof chj) {
            chj $$21 = (chj)$$20;
            if ($$21.go()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bys.M, $$3);
      $$2.a(bys.ak, $$4);
      $$2.a(bys.al, $$5);
      $$2.a(bys.ar, $$7);
      $$2.a(bys.am, $$8);
      $$2.a(bys.au, $$9);
      $$2.a(bys.an, $$12);
      $$2.a(bys.ao, $$11);
      $$2.a(bys.as, $$11.size());
      $$2.a(bys.at, $$10);
   }

   private static Optional<ib> c(apf $$0, bpp $$1) {
      return ib.a($$1.dm(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(apf $$0, ib $$1) {
      dnb $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(aun.V);
      return $$3 && $$2.a(dae.oh) ? daq.g($$2) : $$3;
   }
}
