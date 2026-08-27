import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bws extends bww<bmo> {
   @Override
   public Set<bvq<?>> a() {
      return ImmutableSet.of(bvq.h, bvq.g, bvq.M, bvq.am, bvq.au, bvq.ak, new bvq[]{bvq.al, bvq.ao, bvq.an, bvq.as, bvq.at, bvq.aw});
   }

   @Override
   protected void a(ane $$0, bmo $$1) {
      bno<?> $$2 = $$1.dN();
      $$2.a(bvq.aw, c($$0, $$1));
      Optional<bmq> $$3 = Optional.empty();
      Optional<cea> $$4 = Optional.empty();
      Optional<cea> $$5 = Optional.empty();
      Optional<ceg> $$6 = Optional.empty();
      Optional<bmo> $$7 = Optional.empty();
      Optional<cfq> $$8 = Optional.empty();
      Optional<cfq> $$9 = Optional.empty();
      int $$10 = 0;
      List<cef> $$11 = Lists.newArrayList();
      List<cef> $$12 = Lists.newArrayList();
      bvs $$13 = $$2.c(bvq.h).orElse(bvs.a());

      for (bmo $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cea) {
            cea $$15 = (cea)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.w()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gl()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cej $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof ceg) {
            ceg $$17 = (ceg)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gg()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cfq) {
            cfq $$18 = (cfq)$$14;
            if ($$8.isEmpty() && !ceh.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.P_() && ceh.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cdn) && !($$14 instanceof cbp)) {
            if ($$7.isEmpty() && ceh.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bmq)$$14);
         }
      }

      for (bmo $$20 : $$2.c(bvq.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cef) {
            cef $$21 = (cef)$$20;
            if ($$21.gg()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bvq.M, $$3);
      $$2.a(bvq.ak, $$4);
      $$2.a(bvq.al, $$5);
      $$2.a(bvq.ar, $$7);
      $$2.a(bvq.am, $$8);
      $$2.a(bvq.au, $$9);
      $$2.a(bvq.an, $$12);
      $$2.a(bvq.ao, $$11);
      $$2.a(bvq.as, $$11.size());
      $$2.a(bvq.at, $$10);
   }

   private static Optional<hx> c(ane $$0, bmo $$1) {
      return hx.a($$1.dl(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(ane $$0, hx $$1) {
      djp $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(asi.V);
      return $$3 && $$2.a(cxa.oh) ? cxm.g($$2) : $$3;
   }
}
