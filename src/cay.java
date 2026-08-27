import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cay extends cbc<bqt> {
   @Override
   public Set<bzw<?>> a() {
      return ImmutableSet.of(bzw.h, bzw.g, bzw.M, bzw.am, bzw.au, bzw.ak, new bzw[]{bzw.al, bzw.ao, bzw.an, bzw.as, bzw.at, bzw.aw});
   }

   @Override
   protected void a(apu $$0, bqt $$1) {
      bru<?> $$2 = $$1.dP();
      $$2.a(bzw.aw, c($$0, $$1));
      Optional<bqv> $$3 = Optional.empty();
      Optional<cik> $$4 = Optional.empty();
      Optional<cik> $$5 = Optional.empty();
      Optional<ciq> $$6 = Optional.empty();
      Optional<bqt> $$7 = Optional.empty();
      Optional<cka> $$8 = Optional.empty();
      Optional<cka> $$9 = Optional.empty();
      int $$10 = 0;
      List<cip> $$11 = Lists.newArrayList();
      List<cip> $$12 = Lists.newArrayList();
      bzy $$13 = $$2.c(bzw.h).orElse(bzy.a());

      for (bqt $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cik) {
            cik $$15 = (cik)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.u()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gt()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cit $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof ciq) {
            ciq $$17 = (ciq)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.go()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cka) {
            cka $$18 = (cka)$$14;
            if ($$8.isEmpty() && !cir.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && cir.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof chx) && !($$14 instanceof cfy)) {
            if ($$7.isEmpty() && cir.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bqv)$$14);
         }
      }

      for (bqt $$20 : $$2.c(bzw.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cip) {
            cip $$21 = (cip)$$20;
            if ($$21.go()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bzw.M, $$3);
      $$2.a(bzw.ak, $$4);
      $$2.a(bzw.al, $$5);
      $$2.a(bzw.ar, $$7);
      $$2.a(bzw.am, $$8);
      $$2.a(bzw.au, $$9);
      $$2.a(bzw.an, $$12);
      $$2.a(bzw.ao, $$11);
      $$2.a(bzw.as, $$11.size());
      $$2.a(bzw.at, $$10);
   }

   private static Optional<id> c(apu $$0, bqt $$1) {
      return id.a($$1.dm(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(apu $$0, id $$1) {
      dpi $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(ave.V);
      return $$3 && $$2.a(dcj.oh) ? dcv.g($$2) : $$3;
   }
}
