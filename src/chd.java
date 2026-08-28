import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chd extends chh<bwz> {
   @Override
   public Set<cgb<?>> a() {
      return ImmutableSet.of(cgb.h, cgb.g, cgb.N, cgb.an, cgb.av, cgb.al, new cgb[]{cgb.am, cgb.ap, cgb.ao, cgb.at, cgb.au, cgb.ax});
   }

   @Override
   protected void a(aro $$0, bwz $$1) {
      bxz<?> $$2 = $$1.eb();
      $$2.a(cgb.ax, c($$0, $$1));
      Optional<bxb> $$3 = Optional.empty();
      Optional<cpb> $$4 = Optional.empty();
      Optional<cpb> $$5 = Optional.empty();
      Optional<cph> $$6 = Optional.empty();
      Optional<bwz> $$7 = Optional.empty();
      Optional<cqs> $$8 = Optional.empty();
      Optional<cqs> $$9 = Optional.empty();
      int $$10 = 0;
      List<cpg> $$11 = Lists.newArrayList();
      List<cpg> $$12 = Lists.newArrayList();
      cgd $$13 = $$2.c(cgb.h).orElse(cgd.a());

      for (bwz $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cpb) {
            cpb $$15 = (cpb)$$14;
            if ($$15.n_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.x()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gr()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cpk $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cph) {
            cph $$17 = (cph)$$14;
            if ($$17.n_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.t()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cqs) {
            cqs $$18 = (cqs)$$14;
            if ($$8.isEmpty() && !cpi.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.U_() && cpi.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cok) && !($$14 instanceof cmk)) {
            if ($$7.isEmpty() && cpi.a($$14.aq())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bxb)$$14);
         }
      }

      for (bwz $$20 : $$2.c(cgb.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cpg) {
            cpg $$21 = (cpg)$$20;
            if ($$21.t()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cgb.N, $$3);
      $$2.a(cgb.al, $$4);
      $$2.a(cgb.am, $$5);
      $$2.a(cgb.as, $$7);
      $$2.a(cgb.an, $$8);
      $$2.a(cgb.av, $$9);
      $$2.a(cgb.ao, $$12);
      $$2.a(cgb.ap, $$11);
      $$2.a(cgb.at, $$11.size());
      $$2.a(cgb.au, $$10);
   }

   private static Optional<iu> c(aro $$0, bwz $$1) {
      return iu.a($$1.dv(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aro $$0, iu $$1) {
      dzo $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(axa.X);
      return $$3 && $$2.a(dlw.oJ) ? dmj.h($$2) : $$3;
   }
}
