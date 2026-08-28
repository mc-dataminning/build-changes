import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chg extends chk<bxc> {
   @Override
   public Set<cge<?>> a() {
      return ImmutableSet.of(cge.h, cge.g, cge.N, cge.an, cge.av, cge.al, new cge[]{cge.am, cge.ap, cge.ao, cge.at, cge.au, cge.ax});
   }

   @Override
   protected void a(arq $$0, bxc $$1) {
      byc<?> $$2 = $$1.eb();
      $$2.a(cge.ax, c($$0, $$1));
      Optional<bxe> $$3 = Optional.empty();
      Optional<cph> $$4 = Optional.empty();
      Optional<cph> $$5 = Optional.empty();
      Optional<cpn> $$6 = Optional.empty();
      Optional<bxc> $$7 = Optional.empty();
      Optional<cqy> $$8 = Optional.empty();
      Optional<cqy> $$9 = Optional.empty();
      int $$10 = 0;
      List<cpm> $$11 = Lists.newArrayList();
      List<cpm> $$12 = Lists.newArrayList();
      cgg $$13 = $$2.c(cge.h).orElse(cgg.a());

      for (bxc $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cph) {
            cph $$15 = (cph)$$14;
            if ($$15.n_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.x()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gr()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cpq $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cpn) {
            cpn $$17 = (cpn)$$14;
            if ($$17.n_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.t()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cqy) {
            cqy $$18 = (cqy)$$14;
            if ($$8.isEmpty() && !cpo.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.U_() && cpo.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cor) && !($$14 instanceof cmq)) {
            if ($$7.isEmpty() && cpo.a($$14.aq())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bxe)$$14);
         }
      }

      for (bxc $$20 : $$2.c(cge.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cpm) {
            cpm $$21 = (cpm)$$20;
            if ($$21.t()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cge.N, $$3);
      $$2.a(cge.al, $$4);
      $$2.a(cge.am, $$5);
      $$2.a(cge.as, $$7);
      $$2.a(cge.an, $$8);
      $$2.a(cge.av, $$9);
      $$2.a(cge.ao, $$12);
      $$2.a(cge.ap, $$11);
      $$2.a(cge.at, $$11.size());
      $$2.a(cge.au, $$10);
   }

   private static Optional<iu> c(arq $$0, bxc $$1) {
      return iu.a($$1.dv(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arq $$0, iu $$1) {
      dzz $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(axc.X);
      return $$3 && $$2.a(dmc.oK) ? dmp.h($$2) : $$3;
   }
}
