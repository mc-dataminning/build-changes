import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzc extends bzg<box> {
   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.of(bya.h, bya.g, bya.M, bya.am, bya.au, bya.ak, new bya[]{bya.al, bya.ao, bya.an, bya.as, bya.at, bya.aw});
   }

   @Override
   protected void a(apa $$0, box $$1) {
      bpy<?> $$2 = $$1.dM();
      $$2.a(bya.aw, c($$0, $$1));
      Optional<boz> $$3 = Optional.empty();
      Optional<cgk> $$4 = Optional.empty();
      Optional<cgk> $$5 = Optional.empty();
      Optional<cgq> $$6 = Optional.empty();
      Optional<box> $$7 = Optional.empty();
      Optional<cia> $$8 = Optional.empty();
      Optional<cia> $$9 = Optional.empty();
      int $$10 = 0;
      List<cgp> $$11 = Lists.newArrayList();
      List<cgp> $$12 = Lists.newArrayList();
      byc $$13 = $$2.c(bya.h).orElse(byc.a());

      for (box $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cgk) {
            cgk $$15 = (cgk)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.w()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gr()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cgt $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cgq) {
            cgq $$17 = (cgq)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gm()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cia) {
            cia $$18 = (cia)$$14;
            if ($$8.isEmpty() && !cgr.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.P_() && cgr.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cfx) && !($$14 instanceof cdz)) {
            if ($$7.isEmpty() && cgr.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((boz)$$14);
         }
      }

      for (box $$20 : $$2.c(bya.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cgp) {
            cgp $$21 = (cgp)$$20;
            if ($$21.gm()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bya.M, $$3);
      $$2.a(bya.ak, $$4);
      $$2.a(bya.al, $$5);
      $$2.a(bya.ar, $$7);
      $$2.a(bya.am, $$8);
      $$2.a(bya.au, $$9);
      $$2.a(bya.an, $$12);
      $$2.a(bya.ao, $$11);
      $$2.a(bya.as, $$11.size());
      $$2.a(bya.at, $$10);
   }

   private static Optional<ib> c(apa $$0, box $$1) {
      return ib.a($$1.dj(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(apa $$0, ib $$1) {
      dme $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(aue.V);
      return $$3 && $$2.a(czh.oh) ? czt.g($$2) : $$3;
   }
}
