import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfk extends cfo<bve> {
   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.of(cei.h, cei.g, cei.M, cei.am, cei.au, cei.ak, new cei[]{cei.al, cei.ao, cei.an, cei.as, cei.at, cei.aw});
   }

   @Override
   protected void a(arq $$0, bve $$1) {
      bwg<?> $$2 = $$1.ee();
      $$2.a(cei.aw, c($$0, $$1));
      Optional<bvg> $$3 = Optional.empty();
      Optional<cmz> $$4 = Optional.empty();
      Optional<cmz> $$5 = Optional.empty();
      Optional<cnf> $$6 = Optional.empty();
      Optional<bve> $$7 = Optional.empty();
      Optional<cor> $$8 = Optional.empty();
      Optional<cor> $$9 = Optional.empty();
      int $$10 = 0;
      List<cne> $$11 = Lists.newArrayList();
      List<cne> $$12 = Lists.newArrayList();
      cek $$13 = $$2.c(cei.h).orElse(cek.a());

      for (bve $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cmz) {
            cmz $$15 = (cmz)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gw()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cni $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cnf) {
            cnf $$17 = (cnf)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gw()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cor) {
            cor $$18 = (cor)$$14;
            if ($$8.isEmpty() && !cng.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.R_() && cng.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cmm) && !($$14 instanceof ckm)) {
            if ($$7.isEmpty() && cng.a($$14.ar())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bvg)$$14);
         }
      }

      for (bve $$20 : $$2.c(cei.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cne) {
            cne $$21 = (cne)$$20;
            if ($$21.gw()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cei.M, $$3);
      $$2.a(cei.ak, $$4);
      $$2.a(cei.al, $$5);
      $$2.a(cei.ar, $$7);
      $$2.a(cei.am, $$8);
      $$2.a(cei.au, $$9);
      $$2.a(cei.an, $$12);
      $$2.a(cei.ao, $$11);
      $$2.a(cei.as, $$11.size());
      $$2.a(cei.at, $$10);
   }

   private static Optional<jh> c(arq $$0, bve $$1) {
      return jh.a($$1.dy(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arq $$0, jh $$1) {
      dvo $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(axd.W);
      return $$3 && $$2.a(dil.oh) ? dix.h($$2) : $$3;
   }
}
