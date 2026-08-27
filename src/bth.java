import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bth extends btl<bjg> {
   @Override
   public Set<bsh<?>> a() {
      return ImmutableSet.of(bsh.h, bsh.g, bsh.L, bsh.al, bsh.at, bsh.aj, new bsh[]{bsh.ak, bsh.an, bsh.am, bsh.ar, bsh.as, bsh.av});
   }

   @Override
   protected void a(akq $$0, bjg $$1) {
      bkg<?> $$2 = $$1.dN();
      $$2.a(bsh.av, c($$0, $$1));
      Optional<bji> $$3 = Optional.empty();
      Optional<cae> $$4 = Optional.empty();
      Optional<cae> $$5 = Optional.empty();
      Optional<cak> $$6 = Optional.empty();
      Optional<bjg> $$7 = Optional.empty();
      Optional<cbu> $$8 = Optional.empty();
      Optional<cbu> $$9 = Optional.empty();
      int $$10 = 0;
      List<caj> $$11 = Lists.newArrayList();
      List<caj> $$12 = Lists.newArrayList();
      bsj $$13 = $$2.c(bsh.h).orElse(bsj.a());

      for (bjg $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cae) {
            cae $$15 = (cae)$$14;
            if ($$15.m_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gj()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof can $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cak) {
            cak $$17 = (cak)$$14;
            if ($$17.m_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.ge()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cbu) {
            cbu $$18 = (cbu)$$14;
            if ($$8.isEmpty() && !cal.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.M_() && cal.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof bzz) && !($$14 instanceof byb)) {
            if ($$7.isEmpty() && cal.a($$14.ag())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bji)$$14);
         }
      }

      for (bjg $$20 : $$2.c(bsh.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof caj) {
            caj $$21 = (caj)$$20;
            if ($$21.ge()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bsh.L, $$3);
      $$2.a(bsh.aj, $$4);
      $$2.a(bsh.ak, $$5);
      $$2.a(bsh.aq, $$7);
      $$2.a(bsh.al, $$8);
      $$2.a(bsh.at, $$9);
      $$2.a(bsh.am, $$12);
      $$2.a(bsh.an, $$11);
      $$2.a(bsh.ar, $$11.size());
      $$2.a(bsh.as, $$10);
   }

   private static Optional<gw> c(akq $$0, bjg $$1) {
      return gw.a($$1.dl(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(akq $$0, gw $$1) {
      dfj $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(aps.V);
      return $$3 && $$2.a(csw.oh) ? cti.g($$2) : $$3;
   }
}
