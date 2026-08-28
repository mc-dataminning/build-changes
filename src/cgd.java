import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgd extends cgh<bvx> {
   @Override
   public Set<cfb<?>> a() {
      return ImmutableSet.of(cfb.h, cfb.g, cfb.M, cfb.am, cfb.au, cfb.ak, new cfb[]{cfb.al, cfb.ao, cfb.an, cfb.as, cfb.at, cfb.aw});
   }

   @Override
   protected void a(arx $$0, bvx $$1) {
      bwz<?> $$2 = $$1.ec();
      $$2.a(cfb.aw, c($$0, $$1));
      Optional<bvz> $$3 = Optional.empty();
      Optional<cnw> $$4 = Optional.empty();
      Optional<cnw> $$5 = Optional.empty();
      Optional<coc> $$6 = Optional.empty();
      Optional<bvx> $$7 = Optional.empty();
      Optional<cpo> $$8 = Optional.empty();
      Optional<cpo> $$9 = Optional.empty();
      int $$10 = 0;
      List<cob> $$11 = Lists.newArrayList();
      List<cob> $$12 = Lists.newArrayList();
      cfd $$13 = $$2.c(cfb.h).orElse(cfd.a());

      for (bvx $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cnw) {
            cnw $$15 = (cnw)$$14;
            if ($$15.e_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gp()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cof $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof coc) {
            coc $$17 = (coc)$$14;
            if ($$17.e_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.go()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cpo) {
            cpo $$18 = (cpo)$$14;
            if ($$8.isEmpty() && !cod.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.aa_() && cod.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cnf) && !($$14 instanceof clf)) {
            if ($$7.isEmpty() && cod.a($$14.aq())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bvz)$$14);
         }
      }

      for (bvx $$20 : $$2.c(cfb.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cob) {
            cob $$21 = (cob)$$20;
            if ($$21.go()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cfb.M, $$3);
      $$2.a(cfb.ak, $$4);
      $$2.a(cfb.al, $$5);
      $$2.a(cfb.ar, $$7);
      $$2.a(cfb.am, $$8);
      $$2.a(cfb.au, $$9);
      $$2.a(cfb.an, $$12);
      $$2.a(cfb.ao, $$11);
      $$2.a(cfb.as, $$11.size());
      $$2.a(cfb.at, $$10);
   }

   private static Optional<jh> c(arx $$0, bvx $$1) {
      return jh.a($$1.dw(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arx $$0, jh $$1) {
      dxo $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(axk.X);
      return $$3 && $$2.a(dkf.oJ) ? dks.h($$2) : $$3;
   }
}
