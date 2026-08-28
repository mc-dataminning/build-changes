import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdw extends cea<btq> {
   @Override
   public Set<ccu<?>> a() {
      return ImmutableSet.of(ccu.h, ccu.g, ccu.M, ccu.am, ccu.au, ccu.ak, new ccu[]{ccu.al, ccu.ao, ccu.an, ccu.as, ccu.at, ccu.aw});
   }

   @Override
   protected void a(arf $$0, btq $$1) {
      bus<?> $$2 = $$1.dS();
      $$2.a(ccu.aw, c($$0, $$1));
      Optional<bts> $$3 = Optional.empty();
      Optional<cli> $$4 = Optional.empty();
      Optional<cli> $$5 = Optional.empty();
      Optional<clo> $$6 = Optional.empty();
      Optional<btq> $$7 = Optional.empty();
      Optional<cmy> $$8 = Optional.empty();
      Optional<cmy> $$9 = Optional.empty();
      int $$10 = 0;
      List<cln> $$11 = Lists.newArrayList();
      List<cln> $$12 = Lists.newArrayList();
      ccw $$13 = $$2.c(ccu.h).orElse(ccw.a());

      for (btq $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cli) {
            cli $$15 = (cli)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.u()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gw()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof clr $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof clo) {
            clo $$17 = (clo)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gr()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cmy) {
            cmy $$18 = (cmy)$$14;
            if ($$8.isEmpty() && !clp.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && clp.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof ckv) && !($$14 instanceof ciw)) {
            if ($$7.isEmpty() && clp.a($$14.ak())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bts)$$14);
         }
      }

      for (btq $$20 : $$2.c(ccu.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cln) {
            cln $$21 = (cln)$$20;
            if ($$21.gr()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(ccu.M, $$3);
      $$2.a(ccu.ak, $$4);
      $$2.a(ccu.al, $$5);
      $$2.a(ccu.ar, $$7);
      $$2.a(ccu.am, $$8);
      $$2.a(ccu.au, $$9);
      $$2.a(ccu.an, $$12);
      $$2.a(ccu.ao, $$11);
      $$2.a(ccu.as, $$11.size());
      $$2.a(ccu.at, $$10);
   }

   private static Optional<iz> c(arf $$0, btq $$1) {
      return iz.a($$1.dp(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arf $$0, iz $$1) {
      dsd $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awp.V);
      return $$3 && $$2.a(dfc.oh) ? dfo.g($$2) : $$3;
   }
}
