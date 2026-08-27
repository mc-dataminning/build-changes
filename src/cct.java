import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cct extends ccx<bso> {
   @Override
   public Set<cbr<?>> a() {
      return ImmutableSet.of(cbr.h, cbr.g, cbr.M, cbr.am, cbr.au, cbr.ak, new cbr[]{cbr.al, cbr.ao, cbr.an, cbr.as, cbr.at, cbr.aw});
   }

   @Override
   protected void a(aqt $$0, bso $$1) {
      btp<?> $$2 = $$1.dZ();
      $$2.a(cbr.aw, c($$0, $$1));
      Optional<bsq> $$3 = Optional.empty();
      Optional<cki> $$4 = Optional.empty();
      Optional<cki> $$5 = Optional.empty();
      Optional<cko> $$6 = Optional.empty();
      Optional<bso> $$7 = Optional.empty();
      Optional<cly> $$8 = Optional.empty();
      Optional<cly> $$9 = Optional.empty();
      int $$10 = 0;
      List<ckn> $$11 = Lists.newArrayList();
      List<ckn> $$12 = Lists.newArrayList();
      cbt $$13 = $$2.c(cbr.h).orElse(cbt.a());

      for (bso $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cki) {
            cki $$15 = (cki)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gE()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof ckr $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cko) {
            cko $$17 = (cko)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gz()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cly) {
            cly $$18 = (cly)$$14;
            if ($$8.isEmpty() && !ckp.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.O_() && ckp.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cjv) && !($$14 instanceof chu)) {
            if ($$7.isEmpty() && ckp.a($$14.ak())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bsq)$$14);
         }
      }

      for (bso $$20 : $$2.c(cbr.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof ckn) {
            ckn $$21 = (ckn)$$20;
            if ($$21.gz()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cbr.M, $$3);
      $$2.a(cbr.ak, $$4);
      $$2.a(cbr.al, $$5);
      $$2.a(cbr.ar, $$7);
      $$2.a(cbr.am, $$8);
      $$2.a(cbr.au, $$9);
      $$2.a(cbr.an, $$12);
      $$2.a(cbr.ao, $$11);
      $$2.a(cbr.as, $$11.size());
      $$2.a(cbr.at, $$10);
   }

   private static Optional<ir> c(aqt $$0, bso $$1) {
      return ir.a($$1.du(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aqt $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awe.V);
      return $$3 && $$2.a(dfe.pg) ? dfq.g($$2) : $$3;
   }
}
