import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bvm extends bvq<bll> {
   @Override
   public Set<bum<?>> a() {
      return ImmutableSet.of(bum.h, bum.g, bum.L, bum.al, bum.at, bum.aj, new bum[]{bum.ak, bum.an, bum.am, bum.ar, bum.as, bum.av});
   }

   @Override
   protected void a(ami $$0, bll $$1) {
      bml<?> $$2 = $$1.dP();
      $$2.a(bum.av, c($$0, $$1));
      Optional<bln> $$3 = Optional.empty();
      Optional<ccj> $$4 = Optional.empty();
      Optional<ccj> $$5 = Optional.empty();
      Optional<ccp> $$6 = Optional.empty();
      Optional<bll> $$7 = Optional.empty();
      Optional<cdz> $$8 = Optional.empty();
      Optional<cdz> $$9 = Optional.empty();
      int $$10 = 0;
      List<cco> $$11 = Lists.newArrayList();
      List<cco> $$12 = Lists.newArrayList();
      buo $$13 = $$2.c(bum.h).orElse(buo.a());

      for (bll $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof ccj) {
            ccj $$15 = (ccj)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.w()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gl()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof ccs $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof ccp) {
            ccp $$17 = (ccp)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gg()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cdz) {
            cdz $$18 = (cdz)$$14;
            if ($$8.isEmpty() && !ccq.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.P_() && ccq.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cce) && !($$14 instanceof cag)) {
            if ($$7.isEmpty() && ccq.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bln)$$14);
         }
      }

      for (bll $$20 : $$2.c(bum.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cco) {
            cco $$21 = (cco)$$20;
            if ($$21.gg()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bum.L, $$3);
      $$2.a(bum.aj, $$4);
      $$2.a(bum.ak, $$5);
      $$2.a(bum.aq, $$7);
      $$2.a(bum.al, $$8);
      $$2.a(bum.at, $$9);
      $$2.a(bum.am, $$12);
      $$2.a(bum.an, $$11);
      $$2.a(bum.ar, $$11.size());
      $$2.a(bum.as, $$10);
   }

   private static Optional<hx> c(ami $$0, bll $$1) {
      return hx.a($$1.dn(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(ami $$0, hx $$1) {
      dhn $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(ark.V);
      return $$3 && $$2.a(cvh.oh) ? cvt.g($$2) : $$3;
   }
}
