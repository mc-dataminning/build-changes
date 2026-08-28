import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cij extends cin<byf> {
   @Override
   public Set<chh<?>> a() {
      return ImmutableSet.of(chh.h, chh.g, chh.N, chh.an, chh.av, chh.al, new chh[]{chh.am, chh.ap, chh.ao, chh.at, chh.au, chh.ax});
   }

   @Override
   protected void a(asb $$0, byf $$1) {
      bzf<?> $$2 = $$1.ec();
      $$2.a(chh.ax, c($$0, $$1));
      Optional<byh> $$3 = Optional.empty();
      Optional<cqr> $$4 = Optional.empty();
      Optional<cqr> $$5 = Optional.empty();
      Optional<cqx> $$6 = Optional.empty();
      Optional<byf> $$7 = Optional.empty();
      Optional<csi> $$8 = Optional.empty();
      Optional<csi> $$9 = Optional.empty();
      int $$10 = 0;
      List<cqw> $$11 = Lists.newArrayList();
      List<cqw> $$12 = Lists.newArrayList();
      chj $$13 = $$2.c(chh.h).orElse(chj.a());

      for (byf $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cqr) {
            cqr $$15 = (cqr)$$14;
            if ($$15.e_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.p()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gv()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cra $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cqx) {
            cqx $$17 = (cqx)$$14;
            if ($$17.e_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gv()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof csi) {
            csi $$18 = (csi)$$14;
            if ($$8.isEmpty() && !cqy.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.ak() && cqy.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cqb) && !($$14 instanceof coa)) {
            if ($$7.isEmpty() && cqy.a($$14.an())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((byh)$$14);
         }
      }

      for (byf $$20 : $$2.c(chh.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cqw) {
            cqw $$21 = (cqw)$$20;
            if ($$21.gv()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(chh.N, $$3);
      $$2.a(chh.al, $$4);
      $$2.a(chh.am, $$5);
      $$2.a(chh.as, $$7);
      $$2.a(chh.an, $$8);
      $$2.a(chh.av, $$9);
      $$2.a(chh.ao, $$12);
      $$2.a(chh.ap, $$11);
      $$2.a(chh.at, $$11.size());
      $$2.a(chh.au, $$10);
   }

   private static Optional<iw> c(asb $$0, byf $$1) {
      return iw.a($$1.dv(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(asb $$0, iw $$1) {
      ebq $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(axn.X);
      return $$3 && $$2.a(dnq.oN) ? doe.h($$2) : $$3;
   }
}
