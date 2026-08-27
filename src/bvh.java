import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bvh extends bvl<blg> {
   @Override
   public Set<buh<?>> a() {
      return ImmutableSet.of(buh.h, buh.g, buh.L, buh.al, buh.at, buh.aj, new buh[]{buh.ak, buh.an, buh.am, buh.ar, buh.as, buh.av});
   }

   @Override
   protected void a(ame $$0, blg $$1) {
      bmg<?> $$2 = $$1.dP();
      $$2.a(buh.av, c($$0, $$1));
      Optional<bli> $$3 = Optional.empty();
      Optional<cce> $$4 = Optional.empty();
      Optional<cce> $$5 = Optional.empty();
      Optional<cck> $$6 = Optional.empty();
      Optional<blg> $$7 = Optional.empty();
      Optional<cdu> $$8 = Optional.empty();
      Optional<cdu> $$9 = Optional.empty();
      int $$10 = 0;
      List<ccj> $$11 = Lists.newArrayList();
      List<ccj> $$12 = Lists.newArrayList();
      buj $$13 = $$2.c(buh.h).orElse(buj.a());

      for (blg $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cce) {
            cce $$15 = (cce)$$14;
            if ($$15.n_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.w()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gl()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof ccn $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cck) {
            cck $$17 = (cck)$$14;
            if ($$17.n_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gg()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cdu) {
            cdu $$18 = (cdu)$$14;
            if ($$8.isEmpty() && !ccl.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.O_() && ccl.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cbz) && !($$14 instanceof cab)) {
            if ($$7.isEmpty() && ccl.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bli)$$14);
         }
      }

      for (blg $$20 : $$2.c(buh.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof ccj) {
            ccj $$21 = (ccj)$$20;
            if ($$21.gg()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(buh.L, $$3);
      $$2.a(buh.aj, $$4);
      $$2.a(buh.ak, $$5);
      $$2.a(buh.aq, $$7);
      $$2.a(buh.al, $$8);
      $$2.a(buh.at, $$9);
      $$2.a(buh.am, $$12);
      $$2.a(buh.an, $$11);
      $$2.a(buh.ar, $$11.size());
      $$2.a(buh.as, $$10);
   }

   private static Optional<ht> c(ame $$0, blg $$1) {
      return ht.a($$1.dn(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(ame $$0, ht $$1) {
      dhi $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(arg.V);
      return $$3 && $$2.a(cvc.oh) ? cvo.g($$2) : $$3;
   }
}
