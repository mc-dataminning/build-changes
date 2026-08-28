import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cia extends cie<bxw> {
   @Override
   public Set<cgy<?>> a() {
      return ImmutableSet.of(cgy.h, cgy.g, cgy.N, cgy.an, cgy.av, cgy.al, new cgy[]{cgy.am, cgy.ap, cgy.ao, cgy.at, cgy.au, cgy.ax});
   }

   @Override
   protected void a(aru $$0, bxw $$1) {
      byw<?> $$2 = $$1.ec();
      $$2.a(cgy.ax, c($$0, $$1));
      Optional<bxy> $$3 = Optional.empty();
      Optional<cqi> $$4 = Optional.empty();
      Optional<cqi> $$5 = Optional.empty();
      Optional<cqo> $$6 = Optional.empty();
      Optional<bxw> $$7 = Optional.empty();
      Optional<crz> $$8 = Optional.empty();
      Optional<crz> $$9 = Optional.empty();
      int $$10 = 0;
      List<cqn> $$11 = Lists.newArrayList();
      List<cqn> $$12 = Lists.newArrayList();
      cha $$13 = $$2.c(cgy.h).orElse(cha.a());

      for (bxw $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cqi) {
            cqi $$15 = (cqi)$$14;
            if ($$15.n_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.x()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gv()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cqr $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cqo) {
            cqo $$17 = (cqo)$$14;
            if ($$17.n_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.t()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof crz) {
            crz $$18 = (crz)$$14;
            if ($$8.isEmpty() && !cqp.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.Z_() && cqp.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cps) && !($$14 instanceof cnr)) {
            if ($$7.isEmpty() && cqp.a($$14.an())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bxy)$$14);
         }
      }

      for (bxw $$20 : $$2.c(cgy.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cqn) {
            cqn $$21 = (cqn)$$20;
            if ($$21.t()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cgy.N, $$3);
      $$2.a(cgy.al, $$4);
      $$2.a(cgy.am, $$5);
      $$2.a(cgy.as, $$7);
      $$2.a(cgy.an, $$8);
      $$2.a(cgy.av, $$9);
      $$2.a(cgy.ao, $$12);
      $$2.a(cgy.ap, $$11);
      $$2.a(cgy.at, $$11.size());
      $$2.a(cgy.au, $$10);
   }

   private static Optional<iw> c(aru $$0, bxw $$1) {
      return iw.a($$1.dv(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aru $$0, iw $$1) {
      ebg $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(axg.X);
      return $$3 && $$2.a(dng.oN) ? dnu.h($$2) : $$3;
   }
}
