import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cek extends ceo<buf> {
   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.of(cdi.h, cdi.g, cdi.M, cdi.am, cdi.au, cdi.ak, new cdi[]{cdi.al, cdi.ao, cdi.an, cdi.as, cdi.at, cdi.aw});
   }

   @Override
   protected void a(arg $$0, buf $$1) {
      bvg<?> $$2 = $$1.dX();
      $$2.a(cdi.aw, c($$0, $$1));
      Optional<buh> $$3 = Optional.empty();
      Optional<clz> $$4 = Optional.empty();
      Optional<clz> $$5 = Optional.empty();
      Optional<cmf> $$6 = Optional.empty();
      Optional<buf> $$7 = Optional.empty();
      Optional<cnp> $$8 = Optional.empty();
      Optional<cnp> $$9 = Optional.empty();
      int $$10 = 0;
      List<cme> $$11 = Lists.newArrayList();
      List<cme> $$12 = Lists.newArrayList();
      cdk $$13 = $$2.c(cdi.h).orElse(cdk.a());

      for (buf $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof clz) {
            clz $$15 = (clz)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gp()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cmi $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cmf) {
            cmf $$17 = (cmf)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gp()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cnp) {
            cnp $$18 = (cnp)$$14;
            if ($$8.isEmpty() && !cmg.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.P_() && cmg.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof clm) && !($$14 instanceof cjm)) {
            if ($$7.isEmpty() && cmg.a($$14.ao())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((buh)$$14);
         }
      }

      for (buf $$20 : $$2.c(cdi.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cme) {
            cme $$21 = (cme)$$20;
            if ($$21.gp()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cdi.M, $$3);
      $$2.a(cdi.ak, $$4);
      $$2.a(cdi.al, $$5);
      $$2.a(cdi.ar, $$7);
      $$2.a(cdi.am, $$8);
      $$2.a(cdi.au, $$9);
      $$2.a(cdi.an, $$12);
      $$2.a(cdi.ao, $$11);
      $$2.a(cdi.as, $$11.size());
      $$2.a(cdi.at, $$10);
   }

   private static Optional<je> c(arg $$0, buf $$1) {
      return je.a($$1.ds(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arg $$0, je $$1) {
      dua $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(aws.W);
      return $$3 && $$2.a(dgx.oh) ? dhj.h($$2) : $$3;
   }
}
