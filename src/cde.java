import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cde extends cdi<bsy> {
   @Override
   public Set<ccc<?>> a() {
      return ImmutableSet.of(ccc.h, ccc.g, ccc.M, ccc.am, ccc.au, ccc.ak, new ccc[]{ccc.al, ccc.ao, ccc.an, ccc.as, ccc.at, ccc.aw});
   }

   @Override
   protected void a(aqk $$0, bsy $$1) {
      bua<?> $$2 = $$1.dT();
      $$2.a(ccc.aw, c($$0, $$1));
      Optional<bta> $$3 = Optional.empty();
      Optional<ckr> $$4 = Optional.empty();
      Optional<ckr> $$5 = Optional.empty();
      Optional<ckx> $$6 = Optional.empty();
      Optional<bsy> $$7 = Optional.empty();
      Optional<cmh> $$8 = Optional.empty();
      Optional<cmh> $$9 = Optional.empty();
      int $$10 = 0;
      List<ckw> $$11 = Lists.newArrayList();
      List<ckw> $$12 = Lists.newArrayList();
      cce $$13 = $$2.c(ccc.h).orElse(cce.a());

      for (bsy $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof ckr) {
            ckr $$15 = (ckr)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.u()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gt()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cla $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof ckx) {
            ckx $$17 = (ckx)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.go()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cmh) {
            cmh $$18 = (cmh)$$14;
            if ($$8.isEmpty() && !cky.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && cky.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cke) && !($$14 instanceof cie)) {
            if ($$7.isEmpty() && cky.a($$14.ak())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bta)$$14);
         }
      }

      for (bsy $$20 : $$2.c(ccc.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof ckw) {
            ckw $$21 = (ckw)$$20;
            if ($$21.go()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(ccc.M, $$3);
      $$2.a(ccc.ak, $$4);
      $$2.a(ccc.al, $$5);
      $$2.a(ccc.ar, $$7);
      $$2.a(ccc.am, $$8);
      $$2.a(ccc.au, $$9);
      $$2.a(ccc.an, $$12);
      $$2.a(ccc.ao, $$11);
      $$2.a(ccc.as, $$11.size());
      $$2.a(ccc.at, $$10);
   }

   private static Optional<ja> c(aqk $$0, bsy $$1) {
      return ja.a($$1.dp(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aqk $$0, ja $$1) {
      dsh $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(avu.V);
      return $$3 && $$2.a(dfh.oh) ? dft.g($$2) : $$3;
   }
}
