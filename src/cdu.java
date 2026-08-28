import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdu extends cdy<bto> {
   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.h, ccs.g, ccs.M, ccs.am, ccs.au, ccs.ak, new ccs[]{ccs.al, ccs.ao, ccs.an, ccs.as, ccs.at, ccs.aw});
   }

   @Override
   protected void a(are $$0, bto $$1) {
      buq<?> $$2 = $$1.dS();
      $$2.a(ccs.aw, c($$0, $$1));
      Optional<btq> $$3 = Optional.empty();
      Optional<clg> $$4 = Optional.empty();
      Optional<clg> $$5 = Optional.empty();
      Optional<clm> $$6 = Optional.empty();
      Optional<bto> $$7 = Optional.empty();
      Optional<cmw> $$8 = Optional.empty();
      Optional<cmw> $$9 = Optional.empty();
      int $$10 = 0;
      List<cll> $$11 = Lists.newArrayList();
      List<cll> $$12 = Lists.newArrayList();
      ccu $$13 = $$2.c(ccs.h).orElse(ccu.a());

      for (bto $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof clg) {
            clg $$15 = (clg)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.u()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gw()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof clp $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof clm) {
            clm $$17 = (clm)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gr()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cmw) {
            cmw $$18 = (cmw)$$14;
            if ($$8.isEmpty() && !cln.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && cln.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof ckt) && !($$14 instanceof ciu)) {
            if ($$7.isEmpty() && cln.a($$14.ak())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((btq)$$14);
         }
      }

      for (bto $$20 : $$2.c(ccs.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cll) {
            cll $$21 = (cll)$$20;
            if ($$21.gr()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(ccs.M, $$3);
      $$2.a(ccs.ak, $$4);
      $$2.a(ccs.al, $$5);
      $$2.a(ccs.ar, $$7);
      $$2.a(ccs.am, $$8);
      $$2.a(ccs.au, $$9);
      $$2.a(ccs.an, $$12);
      $$2.a(ccs.ao, $$11);
      $$2.a(ccs.as, $$11.size());
      $$2.a(ccs.at, $$10);
   }

   private static Optional<iz> c(are $$0, bto $$1) {
      return iz.a($$1.dp(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(are $$0, iz $$1) {
      dsb $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awo.V);
      return $$3 && $$2.a(dfa.oh) ? dfm.g($$2) : $$3;
   }
}
