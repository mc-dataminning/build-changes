import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdx extends ceb<btr> {
   @Override
   public Set<ccv<?>> a() {
      return ImmutableSet.of(ccv.h, ccv.g, ccv.M, ccv.am, ccv.au, ccv.ak, new ccv[]{ccv.al, ccv.ao, ccv.an, ccv.as, ccv.at, ccv.aw});
   }

   @Override
   protected void a(arf $$0, btr $$1) {
      but<?> $$2 = $$1.dS();
      $$2.a(ccv.aw, c($$0, $$1));
      Optional<btt> $$3 = Optional.empty();
      Optional<clj> $$4 = Optional.empty();
      Optional<clj> $$5 = Optional.empty();
      Optional<clp> $$6 = Optional.empty();
      Optional<btr> $$7 = Optional.empty();
      Optional<cmz> $$8 = Optional.empty();
      Optional<cmz> $$9 = Optional.empty();
      int $$10 = 0;
      List<clo> $$11 = Lists.newArrayList();
      List<clo> $$12 = Lists.newArrayList();
      ccx $$13 = $$2.c(ccv.h).orElse(ccx.a());

      for (btr $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof clj) {
            clj $$15 = (clj)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.u()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gw()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cls $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof clp) {
            clp $$17 = (clp)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gr()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cmz) {
            cmz $$18 = (cmz)$$14;
            if ($$8.isEmpty() && !clq.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && clq.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof ckw) && !($$14 instanceof cix)) {
            if ($$7.isEmpty() && clq.a($$14.ak())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((btt)$$14);
         }
      }

      for (btr $$20 : $$2.c(ccv.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof clo) {
            clo $$21 = (clo)$$20;
            if ($$21.gr()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(ccv.M, $$3);
      $$2.a(ccv.ak, $$4);
      $$2.a(ccv.al, $$5);
      $$2.a(ccv.ar, $$7);
      $$2.a(ccv.am, $$8);
      $$2.a(ccv.au, $$9);
      $$2.a(ccv.an, $$12);
      $$2.a(ccv.ao, $$11);
      $$2.a(ccv.as, $$11.size());
      $$2.a(ccv.at, $$10);
   }

   private static Optional<iz> c(arf $$0, btr $$1) {
      return iz.a($$1.dp(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arf $$0, iz $$1) {
      dse $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awp.V);
      return $$3 && $$2.a(dfd.oh) ? dfp.g($$2) : $$3;
   }
}
