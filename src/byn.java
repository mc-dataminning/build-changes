import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class byn extends byr<boi> {
   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.of(bxl.h, bxl.g, bxl.M, bxl.am, bxl.au, bxl.ak, new bxl[]{bxl.al, bxl.ao, bxl.an, bxl.as, bxl.at, bxl.aw});
   }

   @Override
   protected void a(aow $$0, boi $$1) {
      bpj<?> $$2 = $$1.dO();
      $$2.a(bxl.aw, c($$0, $$1));
      Optional<bok> $$3 = Optional.empty();
      Optional<cfv> $$4 = Optional.empty();
      Optional<cfv> $$5 = Optional.empty();
      Optional<cgb> $$6 = Optional.empty();
      Optional<boi> $$7 = Optional.empty();
      Optional<chl> $$8 = Optional.empty();
      Optional<chl> $$9 = Optional.empty();
      int $$10 = 0;
      List<cga> $$11 = Lists.newArrayList();
      List<cga> $$12 = Lists.newArrayList();
      bxn $$13 = $$2.c(bxl.h).orElse(bxn.a());

      for (boi $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cfv) {
            cfv $$15 = (cfv)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.w()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gm()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cge $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cgb) {
            cgb $$17 = (cgb)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gh()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof chl) {
            chl $$18 = (chl)$$14;
            if ($$8.isEmpty() && !cgc.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.P_() && cgc.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cfi) && !($$14 instanceof cdk)) {
            if ($$7.isEmpty() && cgc.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bok)$$14);
         }
      }

      for (boi $$20 : $$2.c(bxl.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cga) {
            cga $$21 = (cga)$$20;
            if ($$21.gh()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bxl.M, $$3);
      $$2.a(bxl.ak, $$4);
      $$2.a(bxl.al, $$5);
      $$2.a(bxl.ar, $$7);
      $$2.a(bxl.am, $$8);
      $$2.a(bxl.au, $$9);
      $$2.a(bxl.an, $$12);
      $$2.a(bxl.ao, $$11);
      $$2.a(bxl.as, $$11.size());
      $$2.a(bxl.at, $$10);
   }

   private static Optional<hz> c(aow $$0, boi $$1) {
      return hz.a($$1.dm(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aow $$0, hz $$1) {
      dlj $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(aua.V);
      return $$3 && $$2.a(cyu.oh) ? czg.g($$2) : $$3;
   }
}
