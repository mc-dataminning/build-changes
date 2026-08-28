import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfo extends cfs<bvi> {
   @Override
   public Set<cem<?>> a() {
      return ImmutableSet.of(cem.h, cem.g, cem.M, cem.am, cem.au, cem.ak, new cem[]{cem.al, cem.ao, cem.an, cem.as, cem.at, cem.aw});
   }

   @Override
   protected void a(ard $$0, bvi $$1) {
      bwk<?> $$2 = $$1.eb();
      $$2.a(cem.aw, c($$0, $$1));
      Optional<bvk> $$3 = Optional.empty();
      Optional<cng> $$4 = Optional.empty();
      Optional<cng> $$5 = Optional.empty();
      Optional<cnm> $$6 = Optional.empty();
      Optional<bvi> $$7 = Optional.empty();
      Optional<coy> $$8 = Optional.empty();
      Optional<coy> $$9 = Optional.empty();
      int $$10 = 0;
      List<cnl> $$11 = Lists.newArrayList();
      List<cnl> $$12 = Lists.newArrayList();
      ceo $$13 = $$2.c(cem.h).orElse(ceo.a());

      for (bvi $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cng) {
            cng $$15 = (cng)$$14;
            if ($$15.e_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gt()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cnp $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cnm) {
            cnm $$17 = (cnm)$$14;
            if ($$17.e_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gs()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof coy) {
            coy $$18 = (coy)$$14;
            if ($$8.isEmpty() && !cnn.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.Z_() && cnn.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cmq) && !($$14 instanceof ckq)) {
            if ($$7.isEmpty() && cnn.a($$14.aq())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bvk)$$14);
         }
      }

      for (bvi $$20 : $$2.c(cem.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cnl) {
            cnl $$21 = (cnl)$$20;
            if ($$21.gs()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cem.M, $$3);
      $$2.a(cem.ak, $$4);
      $$2.a(cem.al, $$5);
      $$2.a(cem.ar, $$7);
      $$2.a(cem.am, $$8);
      $$2.a(cem.au, $$9);
      $$2.a(cem.an, $$12);
      $$2.a(cem.ao, $$11);
      $$2.a(cem.as, $$11.size());
      $$2.a(cem.at, $$10);
   }

   private static Optional<ji> c(ard $$0, bvi $$1) {
      return ji.a($$1.dv(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(ard $$0, ji $$1) {
      dwy $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awp.X);
      return $$3 && $$2.a(djp.oJ) ? dkc.h($$2) : $$3;
   }
}
