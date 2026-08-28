import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgl extends cgp<bwf> {
   @Override
   public Set<cfj<?>> a() {
      return ImmutableSet.of(cfj.h, cfj.g, cfj.M, cfj.am, cfj.au, cfj.ak, new cfj[]{cfj.al, cfj.ao, cfj.an, cfj.as, cfj.at, cfj.aw});
   }

   @Override
   protected void a(ash $$0, bwf $$1) {
      bxh<?> $$2 = $$1.ec();
      $$2.a(cfj.aw, c($$0, $$1));
      Optional<bwh> $$3 = Optional.empty();
      Optional<coe> $$4 = Optional.empty();
      Optional<coe> $$5 = Optional.empty();
      Optional<cok> $$6 = Optional.empty();
      Optional<bwf> $$7 = Optional.empty();
      Optional<cpw> $$8 = Optional.empty();
      Optional<cpw> $$9 = Optional.empty();
      int $$10 = 0;
      List<coj> $$11 = Lists.newArrayList();
      List<coj> $$12 = Lists.newArrayList();
      cfl $$13 = $$2.c(cfj.h).orElse(cfl.a());

      for (bwf $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof coe) {
            coe $$15 = (coe)$$14;
            if ($$15.e_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gp()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof coo $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cok) {
            cok $$17 = (cok)$$14;
            if ($$17.e_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.go()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cpw) {
            cpw $$18 = (cpw)$$14;
            if ($$8.isEmpty() && !col.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.aa_() && col.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cnn) && !($$14 instanceof cln)) {
            if ($$7.isEmpty() && col.a($$14.aq())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bwh)$$14);
         }
      }

      for (bwf $$20 : $$2.c(cfj.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof coj) {
            coj $$21 = (coj)$$20;
            if ($$21.go()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cfj.M, $$3);
      $$2.a(cfj.ak, $$4);
      $$2.a(cfj.al, $$5);
      $$2.a(cfj.ar, $$7);
      $$2.a(cfj.am, $$8);
      $$2.a(cfj.au, $$9);
      $$2.a(cfj.an, $$12);
      $$2.a(cfj.ao, $$11);
      $$2.a(cfj.as, $$11.size());
      $$2.a(cfj.at, $$10);
   }

   private static Optional<jh> c(ash $$0, bwf $$1) {
      return jh.a($$1.dw(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(ash $$0, jh $$1) {
      dxu $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(axu.X);
      return $$3 && $$2.a(dkn.oC) ? dla.h($$2) : $$3;
   }
}
