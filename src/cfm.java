import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfm extends cfq<bvg> {
   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.of(cek.h, cek.g, cek.M, cek.am, cek.au, cek.ak, new cek[]{cek.al, cek.ao, cek.an, cek.as, cek.at, cek.aw});
   }

   @Override
   protected void a(ard $$0, bvg $$1) {
      bwi<?> $$2 = $$1.eb();
      $$2.a(cek.aw, c($$0, $$1));
      Optional<bvi> $$3 = Optional.empty();
      Optional<cne> $$4 = Optional.empty();
      Optional<cne> $$5 = Optional.empty();
      Optional<cnk> $$6 = Optional.empty();
      Optional<bvg> $$7 = Optional.empty();
      Optional<cow> $$8 = Optional.empty();
      Optional<cow> $$9 = Optional.empty();
      int $$10 = 0;
      List<cnj> $$11 = Lists.newArrayList();
      List<cnj> $$12 = Lists.newArrayList();
      cem $$13 = $$2.c(cek.h).orElse(cem.a());

      for (bvg $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cne) {
            cne $$15 = (cne)$$14;
            if ($$15.e_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gt()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cnn $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cnk) {
            cnk $$17 = (cnk)$$14;
            if ($$17.e_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gs()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cow) {
            cow $$18 = (cow)$$14;
            if ($$8.isEmpty() && !cnl.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.Z_() && cnl.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cmo) && !($$14 instanceof cko)) {
            if ($$7.isEmpty() && cnl.a($$14.aq())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bvi)$$14);
         }
      }

      for (bvg $$20 : $$2.c(cek.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cnj) {
            cnj $$21 = (cnj)$$20;
            if ($$21.gs()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cek.M, $$3);
      $$2.a(cek.ak, $$4);
      $$2.a(cek.al, $$5);
      $$2.a(cek.ar, $$7);
      $$2.a(cek.am, $$8);
      $$2.a(cek.au, $$9);
      $$2.a(cek.an, $$12);
      $$2.a(cek.ao, $$11);
      $$2.a(cek.as, $$11.size());
      $$2.a(cek.at, $$10);
   }

   private static Optional<ji> c(ard $$0, bvg $$1) {
      return ji.a($$1.dv(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(ard $$0, ji $$1) {
      dww $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awp.X);
      return $$3 && $$2.a(djn.oJ) ? dka.h($$2) : $$3;
   }
}
