import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccw extends cda<bsq> {
   @Override
   public Set<cbu<?>> a() {
      return ImmutableSet.of(cbu.h, cbu.g, cbu.M, cbu.am, cbu.au, cbu.ak, new cbu[]{cbu.al, cbu.ao, cbu.an, cbu.as, cbu.at, cbu.aw});
   }

   @Override
   protected void a(aqn $$0, bsq $$1) {
      bts<?> $$2 = $$1.dS();
      $$2.a(cbu.aw, c($$0, $$1));
      Optional<bss> $$3 = Optional.empty();
      Optional<cki> $$4 = Optional.empty();
      Optional<cki> $$5 = Optional.empty();
      Optional<cko> $$6 = Optional.empty();
      Optional<bsq> $$7 = Optional.empty();
      Optional<cly> $$8 = Optional.empty();
      Optional<cly> $$9 = Optional.empty();
      int $$10 = 0;
      List<ckn> $$11 = Lists.newArrayList();
      List<ckn> $$12 = Lists.newArrayList();
      cbw $$13 = $$2.c(cbu.h).orElse(cbw.a());

      for (bsq $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cki) {
            cki $$15 = (cki)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.u()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gv()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof ckr $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cko) {
            cko $$17 = (cko)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gq()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cly) {
            cly $$18 = (cly)$$14;
            if ($$8.isEmpty() && !ckp.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && ckp.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cjv) && !($$14 instanceof chw)) {
            if ($$7.isEmpty() && ckp.a($$14.ak())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bss)$$14);
         }
      }

      for (bsq $$20 : $$2.c(cbu.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof ckn) {
            ckn $$21 = (ckn)$$20;
            if ($$21.gq()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cbu.M, $$3);
      $$2.a(cbu.ak, $$4);
      $$2.a(cbu.al, $$5);
      $$2.a(cbu.ar, $$7);
      $$2.a(cbu.am, $$8);
      $$2.a(cbu.au, $$9);
      $$2.a(cbu.an, $$12);
      $$2.a(cbu.ao, $$11);
      $$2.a(cbu.as, $$11.size());
      $$2.a(cbu.at, $$10);
   }

   private static Optional<io> c(aqn $$0, bsq $$1) {
      return io.a($$1.dp(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aqn $$0, io $$1) {
      drd $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(avx.V);
      return $$3 && $$2.a(dec.oh) ? deo.g($$2) : $$3;
   }
}
