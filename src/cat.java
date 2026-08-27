import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cat extends cax<bqo> {
   @Override
   public Set<bzr<?>> a() {
      return ImmutableSet.of(bzr.h, bzr.g, bzr.M, bzr.am, bzr.au, bzr.ak, new bzr[]{bzr.al, bzr.ao, bzr.an, bzr.as, bzr.at, bzr.aw});
   }

   @Override
   protected void a(aps $$0, bqo $$1) {
      brp<?> $$2 = $$1.dP();
      $$2.a(bzr.aw, c($$0, $$1));
      Optional<bqq> $$3 = Optional.empty();
      Optional<cid> $$4 = Optional.empty();
      Optional<cid> $$5 = Optional.empty();
      Optional<cij> $$6 = Optional.empty();
      Optional<bqo> $$7 = Optional.empty();
      Optional<cjt> $$8 = Optional.empty();
      Optional<cjt> $$9 = Optional.empty();
      int $$10 = 0;
      List<cii> $$11 = Lists.newArrayList();
      List<cii> $$12 = Lists.newArrayList();
      bzt $$13 = $$2.c(bzr.h).orElse(bzt.a());

      for (bqo $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cid) {
            cid $$15 = (cid)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.u()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gt()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cim $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cij) {
            cij $$17 = (cij)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.go()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cjt) {
            cjt $$18 = (cjt)$$14;
            if ($$8.isEmpty() && !cik.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && cik.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof chq) && !($$14 instanceof cfr)) {
            if ($$7.isEmpty() && cik.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bqq)$$14);
         }
      }

      for (bqo $$20 : $$2.c(bzr.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cii) {
            cii $$21 = (cii)$$20;
            if ($$21.go()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bzr.M, $$3);
      $$2.a(bzr.ak, $$4);
      $$2.a(bzr.al, $$5);
      $$2.a(bzr.ar, $$7);
      $$2.a(bzr.am, $$8);
      $$2.a(bzr.au, $$9);
      $$2.a(bzr.an, $$12);
      $$2.a(bzr.ao, $$11);
      $$2.a(bzr.as, $$11.size());
      $$2.a(bzr.at, $$10);
   }

   private static Optional<ib> c(aps $$0, bqo $$1) {
      return ib.a($$1.dm(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aps $$0, ib $$1) {
      doz $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(avc.V);
      return $$3 && $$2.a(dca.oh) ? dcm.g($$2) : $$3;
   }
}
