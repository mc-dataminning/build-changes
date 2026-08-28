import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ces extends cew<bun> {
   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.of(cdq.h, cdq.g, cdq.M, cdq.am, cdq.au, cdq.ak, new cdq[]{cdq.al, cdq.ao, cdq.an, cdq.as, cdq.at, cdq.aw});
   }

   @Override
   protected void a(arj $$0, bun $$1) {
      bvo<?> $$2 = $$1.dY();
      $$2.a(cdq.aw, c($$0, $$1));
      Optional<bup> $$3 = Optional.empty();
      Optional<cmh> $$4 = Optional.empty();
      Optional<cmh> $$5 = Optional.empty();
      Optional<cmn> $$6 = Optional.empty();
      Optional<bun> $$7 = Optional.empty();
      Optional<cnx> $$8 = Optional.empty();
      Optional<cnx> $$9 = Optional.empty();
      int $$10 = 0;
      List<cmm> $$11 = Lists.newArrayList();
      List<cmm> $$12 = Lists.newArrayList();
      cds $$13 = $$2.c(cdq.h).orElse(cds.a());

      for (bun $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cmh) {
            cmh $$15 = (cmh)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gp()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cmq $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cmn) {
            cmn $$17 = (cmn)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gp()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cnx) {
            cnx $$18 = (cnx)$$14;
            if ($$8.isEmpty() && !cmo.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.Q_() && cmo.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof clu) && !($$14 instanceof cju)) {
            if ($$7.isEmpty() && cmo.a($$14.ao())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bup)$$14);
         }
      }

      for (bun $$20 : $$2.c(cdq.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cmm) {
            cmm $$21 = (cmm)$$20;
            if ($$21.gp()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cdq.M, $$3);
      $$2.a(cdq.ak, $$4);
      $$2.a(cdq.al, $$5);
      $$2.a(cdq.ar, $$7);
      $$2.a(cdq.am, $$8);
      $$2.a(cdq.au, $$9);
      $$2.a(cdq.an, $$12);
      $$2.a(cdq.ao, $$11);
      $$2.a(cdq.as, $$11.size());
      $$2.a(cdq.at, $$10);
   }

   private static Optional<jf> c(arj $$0, bun $$1) {
      return jf.a($$1.ds(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arj $$0, jf $$1) {
      dus $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awv.W);
      return $$3 && $$2.a(dho.oh) ? dia.h($$2) : $$3;
   }
}
