import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfg extends cfk<bva> {
   @Override
   public Set<cee<?>> a() {
      return ImmutableSet.of(cee.h, cee.g, cee.M, cee.am, cee.au, cee.ak, new cee[]{cee.al, cee.ao, cee.an, cee.as, cee.at, cee.aw});
   }

   @Override
   protected void a(arn $$0, bva $$1) {
      bwc<?> $$2 = $$1.ed();
      $$2.a(cee.aw, c($$0, $$1));
      Optional<bvc> $$3 = Optional.empty();
      Optional<cmv> $$4 = Optional.empty();
      Optional<cmv> $$5 = Optional.empty();
      Optional<cnb> $$6 = Optional.empty();
      Optional<bva> $$7 = Optional.empty();
      Optional<com> $$8 = Optional.empty();
      Optional<com> $$9 = Optional.empty();
      int $$10 = 0;
      List<cna> $$11 = Lists.newArrayList();
      List<cna> $$12 = Lists.newArrayList();
      ceg $$13 = $$2.c(cee.h).orElse(ceg.a());

      for (bva $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cmv) {
            cmv $$15 = (cmv)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gv()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cne $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cnb) {
            cnb $$17 = (cnb)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gv()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof com) {
            com $$18 = (com)$$14;
            if ($$8.isEmpty() && !cnc.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.R_() && cnc.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cmi) && !($$14 instanceof cki)) {
            if ($$7.isEmpty() && cnc.a($$14.ar())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bvc)$$14);
         }
      }

      for (bva $$20 : $$2.c(cee.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cna) {
            cna $$21 = (cna)$$20;
            if ($$21.gv()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cee.M, $$3);
      $$2.a(cee.ak, $$4);
      $$2.a(cee.al, $$5);
      $$2.a(cee.ar, $$7);
      $$2.a(cee.am, $$8);
      $$2.a(cee.au, $$9);
      $$2.a(cee.an, $$12);
      $$2.a(cee.ao, $$11);
      $$2.a(cee.as, $$11.size());
      $$2.a(cee.at, $$10);
   }

   private static Optional<jh> c(arn $$0, bva $$1) {
      return jh.a($$1.dx(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arn $$0, jh $$1) {
      dvj $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(axa.W);
      return $$3 && $$2.a(dig.oh) ? dis.h($$2) : $$3;
   }
}
