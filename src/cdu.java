import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdu extends cdy<btn> {
   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.h, ccs.g, ccs.M, ccs.am, ccs.au, ccs.ak, new ccs[]{ccs.al, ccs.ao, ccs.an, ccs.as, ccs.at, ccs.aw});
   }

   @Override
   protected void a(aqu $$0, btn $$1) {
      buq<?> $$2 = $$1.dT();
      $$2.a(ccs.aw, c($$0, $$1));
      Optional<btp> $$3 = Optional.empty();
      Optional<clh> $$4 = Optional.empty();
      Optional<clh> $$5 = Optional.empty();
      Optional<cln> $$6 = Optional.empty();
      Optional<btn> $$7 = Optional.empty();
      Optional<cmx> $$8 = Optional.empty();
      Optional<cmx> $$9 = Optional.empty();
      int $$10 = 0;
      List<clm> $$11 = Lists.newArrayList();
      List<clm> $$12 = Lists.newArrayList();
      ccu $$13 = $$2.c(ccs.h).orElse(ccu.a());

      for (btn $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof clh) {
            clh $$15 = (clh)$$14;
            if ($$15.o_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gl()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof clq $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cln) {
            cln $$17 = (cln)$$14;
            if ($$17.o_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gl()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cmx) {
            cmx $$18 = (cmx)$$14;
            if ($$8.isEmpty() && !clo.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.R_() && clo.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cku) && !($$14 instanceof ciu)) {
            if ($$7.isEmpty() && clo.a($$14.am())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((btp)$$14);
         }
      }

      for (btn $$20 : $$2.c(ccs.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof clm) {
            clm $$21 = (clm)$$20;
            if ($$21.gl()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(ccs.M, $$3);
      $$2.a(ccs.ak, $$4);
      $$2.a(ccs.al, $$5);
      $$2.a(ccs.ar, $$7);
      $$2.a(ccs.am, $$8);
      $$2.a(ccs.au, $$9);
      $$2.a(ccs.an, $$12);
      $$2.a(ccs.ao, $$11);
      $$2.a(ccs.as, $$11.size());
      $$2.a(ccs.at, $$10);
   }

   private static Optional<jd> c(aqu $$0, btn $$1) {
      return jd.a($$1.do(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aqu $$0, jd $$1) {
      dtc $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awe.W);
      return $$3 && $$2.a(dga.oh) ? dgm.g($$2) : $$3;
   }
}
