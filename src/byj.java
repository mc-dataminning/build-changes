import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class byj extends byn<bog> {
   @Override
   public Set<bxh<?>> a() {
      return ImmutableSet.of(bxh.h, bxh.g, bxh.M, bxh.am, bxh.au, bxh.ak, new bxh[]{bxh.al, bxh.ao, bxh.an, bxh.as, bxh.at, bxh.aw});
   }

   @Override
   protected void a(aov $$0, bog $$1) {
      bpf<?> $$2 = $$1.dO();
      $$2.a(bxh.aw, c($$0, $$1));
      Optional<boi> $$3 = Optional.empty();
      Optional<cfr> $$4 = Optional.empty();
      Optional<cfr> $$5 = Optional.empty();
      Optional<cfx> $$6 = Optional.empty();
      Optional<bog> $$7 = Optional.empty();
      Optional<chh> $$8 = Optional.empty();
      Optional<chh> $$9 = Optional.empty();
      int $$10 = 0;
      List<cfw> $$11 = Lists.newArrayList();
      List<cfw> $$12 = Lists.newArrayList();
      bxj $$13 = $$2.c(bxh.h).orElse(bxj.a());

      for (bog $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cfr) {
            cfr $$15 = (cfr)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.w()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gm()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cga $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cfx) {
            cfx $$17 = (cfx)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gh()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof chh) {
            chh $$18 = (chh)$$14;
            if ($$8.isEmpty() && !cfy.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.P_() && cfy.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cfe) && !($$14 instanceof cdg)) {
            if ($$7.isEmpty() && cfy.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((boi)$$14);
         }
      }

      for (bog $$20 : $$2.c(bxh.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cfw) {
            cfw $$21 = (cfw)$$20;
            if ($$21.gh()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bxh.M, $$3);
      $$2.a(bxh.ak, $$4);
      $$2.a(bxh.al, $$5);
      $$2.a(bxh.ar, $$7);
      $$2.a(bxh.am, $$8);
      $$2.a(bxh.au, $$9);
      $$2.a(bxh.an, $$12);
      $$2.a(bxh.ao, $$11);
      $$2.a(bxh.as, $$11.size());
      $$2.a(bxh.at, $$10);
   }

   private static Optional<hz> c(aov $$0, bog $$1) {
      return hz.a($$1.dm(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aov $$0, hz $$1) {
      dlf $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(atz.V);
      return $$3 && $$2.a(cyq.oh) ? czc.g($$2) : $$3;
   }
}
