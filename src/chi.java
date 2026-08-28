import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chi extends chm<bxe> {
   @Override
   public Set<cgg<?>> a() {
      return ImmutableSet.of(cgg.h, cgg.g, cgg.N, cgg.an, cgg.av, cgg.al, new cgg[]{cgg.am, cgg.ap, cgg.ao, cgg.at, cgg.au, cgg.ax});
   }

   @Override
   protected void a(arq $$0, bxe $$1) {
      bye<?> $$2 = $$1.ec();
      $$2.a(cgg.ax, c($$0, $$1));
      Optional<bxg> $$3 = Optional.empty();
      Optional<cpl> $$4 = Optional.empty();
      Optional<cpl> $$5 = Optional.empty();
      Optional<cpr> $$6 = Optional.empty();
      Optional<bxe> $$7 = Optional.empty();
      Optional<crc> $$8 = Optional.empty();
      Optional<crc> $$9 = Optional.empty();
      int $$10 = 0;
      List<cpq> $$11 = Lists.newArrayList();
      List<cpq> $$12 = Lists.newArrayList();
      cgi $$13 = $$2.c(cgg.h).orElse(cgi.a());

      for (bxe $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cpl) {
            cpl $$15 = (cpl)$$14;
            if ($$15.n_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.x()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gs()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cpu $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cpr) {
            cpr $$17 = (cpr)$$14;
            if ($$17.n_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.t()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof crc) {
            crc $$18 = (crc)$$14;
            if ($$8.isEmpty() && !cps.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.V_() && cps.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cov) && !($$14 instanceof cmu)) {
            if ($$7.isEmpty() && cps.a($$14.aq())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bxg)$$14);
         }
      }

      for (bxe $$20 : $$2.c(cgg.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cpq) {
            cpq $$21 = (cpq)$$20;
            if ($$21.t()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cgg.N, $$3);
      $$2.a(cgg.al, $$4);
      $$2.a(cgg.am, $$5);
      $$2.a(cgg.as, $$7);
      $$2.a(cgg.an, $$8);
      $$2.a(cgg.av, $$9);
      $$2.a(cgg.ao, $$12);
      $$2.a(cgg.ap, $$11);
      $$2.a(cgg.at, $$11.size());
      $$2.a(cgg.au, $$10);
   }

   private static Optional<iu> c(arq $$0, bxe $$1) {
      return iu.a($$1.dv(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arq $$0, iu $$1) {
      eah $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(axc.X);
      return $$3 && $$2.a(dmh.oN) ? dmv.h($$2) : $$3;
   }
}
