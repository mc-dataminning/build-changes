import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwi extends bwm<bmf> {
   @Override
   public Set<bvh<?>> a() {
      return ImmutableSet.of(bvh.h, bvh.g, bvh.L, bvh.al, bvh.at, bvh.aj, new bvh[]{bvh.ak, bvh.an, bvh.am, bvh.ar, bvh.as, bvh.av});
   }

   @Override
   protected void a(amz $$0, bmf $$1) {
      bnf<?> $$2 = $$1.dO();
      $$2.a(bvh.av, c($$0, $$1));
      Optional<bmh> $$3 = Optional.empty();
      Optional<cdl> $$4 = Optional.empty();
      Optional<cdl> $$5 = Optional.empty();
      Optional<cdr> $$6 = Optional.empty();
      Optional<bmf> $$7 = Optional.empty();
      Optional<cfb> $$8 = Optional.empty();
      Optional<cfb> $$9 = Optional.empty();
      int $$10 = 0;
      List<cdq> $$11 = Lists.newArrayList();
      List<cdq> $$12 = Lists.newArrayList();
      bvj $$13 = $$2.c(bvh.h).orElse(bvj.a());

      for (bmf $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cdl) {
            cdl $$15 = (cdl)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.w()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gk()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cdu $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cdr) {
            cdr $$17 = (cdr)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gf()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cfb) {
            cfb $$18 = (cfb)$$14;
            if ($$8.isEmpty() && !cds.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.P_() && cds.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cda) && !($$14 instanceof cbc)) {
            if ($$7.isEmpty() && cds.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bmh)$$14);
         }
      }

      for (bmf $$20 : $$2.c(bvh.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cdq) {
            cdq $$21 = (cdq)$$20;
            if ($$21.gf()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bvh.L, $$3);
      $$2.a(bvh.aj, $$4);
      $$2.a(bvh.ak, $$5);
      $$2.a(bvh.aq, $$7);
      $$2.a(bvh.al, $$8);
      $$2.a(bvh.at, $$9);
      $$2.a(bvh.am, $$12);
      $$2.a(bvh.an, $$11);
      $$2.a(bvh.ar, $$11.size());
      $$2.a(bvh.as, $$10);
   }

   private static Optional<hx> c(amz $$0, bmf $$1) {
      return hx.a($$1.dm(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(amz $$0, hx $$1) {
      dja $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(asb.V);
      return $$3 && $$2.a(cwl.oh) ? cwx.g($$2) : $$3;
   }
}
