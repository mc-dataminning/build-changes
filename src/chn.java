import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chn extends chr<bxj> {
   @Override
   public Set<cgl<?>> a() {
      return ImmutableSet.of(cgl.h, cgl.g, cgl.N, cgl.an, cgl.av, cgl.al, new cgl[]{cgl.am, cgl.ap, cgl.ao, cgl.at, cgl.au, cgl.ax});
   }

   @Override
   protected void a(arq $$0, bxj $$1) {
      byj<?> $$2 = $$1.eb();
      $$2.a(cgl.ax, c($$0, $$1));
      Optional<bxl> $$3 = Optional.empty();
      Optional<cpv> $$4 = Optional.empty();
      Optional<cpv> $$5 = Optional.empty();
      Optional<cqb> $$6 = Optional.empty();
      Optional<bxj> $$7 = Optional.empty();
      Optional<crm> $$8 = Optional.empty();
      Optional<crm> $$9 = Optional.empty();
      int $$10 = 0;
      List<cqa> $$11 = Lists.newArrayList();
      List<cqa> $$12 = Lists.newArrayList();
      cgn $$13 = $$2.c(cgl.h).orElse(cgn.a());

      for (bxj $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cpv) {
            cpv $$15 = (cpv)$$14;
            if ($$15.n_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.x()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gu()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cqe $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cqb) {
            cqb $$17 = (cqb)$$14;
            if ($$17.n_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.t()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof crm) {
            crm $$18 = (crm)$$14;
            if ($$8.isEmpty() && !cqc.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.V_() && cqc.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cpf) && !($$14 instanceof cne)) {
            if ($$7.isEmpty() && cqc.a($$14.an())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bxl)$$14);
         }
      }

      for (bxj $$20 : $$2.c(cgl.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cqa) {
            cqa $$21 = (cqa)$$20;
            if ($$21.t()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cgl.N, $$3);
      $$2.a(cgl.al, $$4);
      $$2.a(cgl.am, $$5);
      $$2.a(cgl.as, $$7);
      $$2.a(cgl.an, $$8);
      $$2.a(cgl.av, $$9);
      $$2.a(cgl.ao, $$12);
      $$2.a(cgl.ap, $$11);
      $$2.a(cgl.at, $$11.size());
      $$2.a(cgl.au, $$10);
   }

   private static Optional<iv> c(arq $$0, bxj $$1) {
      return iv.a($$1.du(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arq $$0, iv $$1) {
      eat $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(axc.X);
      return $$3 && $$2.a(dmt.oN) ? dnh.h($$2) : $$3;
   }
}
