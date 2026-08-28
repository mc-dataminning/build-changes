import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cge extends cgi<bvy> {
   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.of(cfc.h, cfc.g, cfc.M, cfc.am, cfc.au, cfc.ak, new cfc[]{cfc.al, cfc.ao, cfc.an, cfc.as, cfc.at, cfc.aw});
   }

   @Override
   protected void a(ard $$0, bvy $$1) {
      bxa<?> $$2 = $$1.ea();
      $$2.a(cfc.aw, c($$0, $$1));
      Optional<bwa> $$3 = Optional.empty();
      Optional<cnz> $$4 = Optional.empty();
      Optional<cnz> $$5 = Optional.empty();
      Optional<cof> $$6 = Optional.empty();
      Optional<bvy> $$7 = Optional.empty();
      Optional<cpr> $$8 = Optional.empty();
      Optional<cpr> $$9 = Optional.empty();
      int $$10 = 0;
      List<coe> $$11 = Lists.newArrayList();
      List<coe> $$12 = Lists.newArrayList();
      cfe $$13 = $$2.c(cfc.h).orElse(cfe.a());

      for (bvy $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cnz) {
            cnz $$15 = (cnz)$$14;
            if ($$15.n_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.x()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gt()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof coi $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cof) {
            cof $$17 = (cof)$$14;
            if ($$17.n_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.t()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cpr) {
            cpr $$18 = (cpr)$$14;
            if ($$8.isEmpty() && !cog.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.U_() && cog.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cnj) && !($$14 instanceof clj)) {
            if ($$7.isEmpty() && cog.a($$14.aq())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bwa)$$14);
         }
      }

      for (bvy $$20 : $$2.c(cfc.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof coe) {
            coe $$21 = (coe)$$20;
            if ($$21.t()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cfc.M, $$3);
      $$2.a(cfc.ak, $$4);
      $$2.a(cfc.al, $$5);
      $$2.a(cfc.ar, $$7);
      $$2.a(cfc.am, $$8);
      $$2.a(cfc.au, $$9);
      $$2.a(cfc.an, $$12);
      $$2.a(cfc.ao, $$11);
      $$2.a(cfc.as, $$11.size());
      $$2.a(cfc.at, $$10);
   }

   private static Optional<ji> c(ard $$0, bvy $$1) {
      return ji.a($$1.du(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(ard $$0, ji $$1) {
      dxq $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awp.X);
      return $$3 && $$2.a(dkg.oJ) ? dkt.h($$2) : $$3;
   }
}
