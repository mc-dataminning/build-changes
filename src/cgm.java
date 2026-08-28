import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgm extends cgq<bwg> {
   @Override
   public Set<cfk<?>> a() {
      return ImmutableSet.of(cfk.h, cfk.g, cfk.M, cfk.am, cfk.au, cfk.ak, new cfk[]{cfk.al, cfk.ao, cfk.an, cfk.as, cfk.at, cfk.aw});
   }

   @Override
   protected void a(ash $$0, bwg $$1) {
      bxi<?> $$2 = $$1.ec();
      $$2.a(cfk.aw, c($$0, $$1));
      Optional<bwi> $$3 = Optional.empty();
      Optional<cof> $$4 = Optional.empty();
      Optional<cof> $$5 = Optional.empty();
      Optional<col> $$6 = Optional.empty();
      Optional<bwg> $$7 = Optional.empty();
      Optional<cpx> $$8 = Optional.empty();
      Optional<cpx> $$9 = Optional.empty();
      int $$10 = 0;
      List<cok> $$11 = Lists.newArrayList();
      List<cok> $$12 = Lists.newArrayList();
      cfm $$13 = $$2.c(cfk.h).orElse(cfm.a());

      for (bwg $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cof) {
            cof $$15 = (cof)$$14;
            if ($$15.e_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gp()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cop $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof col) {
            col $$17 = (col)$$14;
            if ($$17.e_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.go()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cpx) {
            cpx $$18 = (cpx)$$14;
            if ($$8.isEmpty() && !com.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.aa_() && com.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cno) && !($$14 instanceof clo)) {
            if ($$7.isEmpty() && com.a($$14.aq())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bwi)$$14);
         }
      }

      for (bwg $$20 : $$2.c(cfk.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cok) {
            cok $$21 = (cok)$$20;
            if ($$21.go()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cfk.M, $$3);
      $$2.a(cfk.ak, $$4);
      $$2.a(cfk.al, $$5);
      $$2.a(cfk.ar, $$7);
      $$2.a(cfk.am, $$8);
      $$2.a(cfk.au, $$9);
      $$2.a(cfk.an, $$12);
      $$2.a(cfk.ao, $$11);
      $$2.a(cfk.as, $$11.size());
      $$2.a(cfk.at, $$10);
   }

   private static Optional<jh> c(ash $$0, bwg $$1) {
      return jh.a($$1.dw(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(ash $$0, jh $$1) {
      dxv $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(axu.X);
      return $$3 && $$2.a(dko.oC) ? dlb.h($$2) : $$3;
   }
}
