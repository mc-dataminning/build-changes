import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cep extends cet<buk> {
   @Override
   public Set<cdn<?>> a() {
      return ImmutableSet.of(cdn.h, cdn.g, cdn.M, cdn.am, cdn.au, cdn.ak, new cdn[]{cdn.al, cdn.ao, cdn.an, cdn.as, cdn.at, cdn.aw});
   }

   @Override
   protected void a(arh $$0, buk $$1) {
      bvl<?> $$2 = $$1.dX();
      $$2.a(cdn.aw, c($$0, $$1));
      Optional<bum> $$3 = Optional.empty();
      Optional<cme> $$4 = Optional.empty();
      Optional<cme> $$5 = Optional.empty();
      Optional<cmk> $$6 = Optional.empty();
      Optional<buk> $$7 = Optional.empty();
      Optional<cnu> $$8 = Optional.empty();
      Optional<cnu> $$9 = Optional.empty();
      int $$10 = 0;
      List<cmj> $$11 = Lists.newArrayList();
      List<cmj> $$12 = Lists.newArrayList();
      cdp $$13 = $$2.c(cdn.h).orElse(cdp.a());

      for (buk $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cme) {
            cme $$15 = (cme)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gq()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cmn $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cmk) {
            cmk $$17 = (cmk)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gq()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cnu) {
            cnu $$18 = (cnu)$$14;
            if ($$8.isEmpty() && !cml.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.P_() && cml.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof clr) && !($$14 instanceof cjr)) {
            if ($$7.isEmpty() && cml.a($$14.ao())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bum)$$14);
         }
      }

      for (buk $$20 : $$2.c(cdn.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cmj) {
            cmj $$21 = (cmj)$$20;
            if ($$21.gq()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cdn.M, $$3);
      $$2.a(cdn.ak, $$4);
      $$2.a(cdn.al, $$5);
      $$2.a(cdn.ar, $$7);
      $$2.a(cdn.am, $$8);
      $$2.a(cdn.au, $$9);
      $$2.a(cdn.an, $$12);
      $$2.a(cdn.ao, $$11);
      $$2.a(cdn.as, $$11.size());
      $$2.a(cdn.at, $$10);
   }

   private static Optional<je> c(arh $$0, buk $$1) {
      return je.a($$1.ds(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arh $$0, je $$1) {
      duo $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awt.W);
      return $$3 && $$2.a(dhl.oh) ? dhx.h($$2) : $$3;
   }
}
