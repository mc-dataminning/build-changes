import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccu extends ccy<bso> {
   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.of(cbs.h, cbs.g, cbs.M, cbs.am, cbs.au, cbs.ak, new cbs[]{cbs.al, cbs.ao, cbs.an, cbs.as, cbs.at, cbs.aw});
   }

   @Override
   protected void a(aqm $$0, bso $$1) {
      btq<?> $$2 = $$1.dS();
      $$2.a(cbs.aw, c($$0, $$1));
      Optional<bsq> $$3 = Optional.empty();
      Optional<ckg> $$4 = Optional.empty();
      Optional<ckg> $$5 = Optional.empty();
      Optional<ckm> $$6 = Optional.empty();
      Optional<bso> $$7 = Optional.empty();
      Optional<clw> $$8 = Optional.empty();
      Optional<clw> $$9 = Optional.empty();
      int $$10 = 0;
      List<ckl> $$11 = Lists.newArrayList();
      List<ckl> $$12 = Lists.newArrayList();
      cbu $$13 = $$2.c(cbs.h).orElse(cbu.a());

      for (bso $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof ckg) {
            ckg $$15 = (ckg)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.u()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gv()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof ckp $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof ckm) {
            ckm $$17 = (ckm)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gq()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof clw) {
            clw $$18 = (clw)$$14;
            if ($$8.isEmpty() && !ckn.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && ckn.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cjt) && !($$14 instanceof chu)) {
            if ($$7.isEmpty() && ckn.a($$14.ak())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bsq)$$14);
         }
      }

      for (bso $$20 : $$2.c(cbs.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof ckl) {
            ckl $$21 = (ckl)$$20;
            if ($$21.gq()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cbs.M, $$3);
      $$2.a(cbs.ak, $$4);
      $$2.a(cbs.al, $$5);
      $$2.a(cbs.ar, $$7);
      $$2.a(cbs.am, $$8);
      $$2.a(cbs.au, $$9);
      $$2.a(cbs.an, $$12);
      $$2.a(cbs.ao, $$11);
      $$2.a(cbs.as, $$11.size());
      $$2.a(cbs.at, $$10);
   }

   private static Optional<io> c(aqm $$0, bso $$1) {
      return io.a($$1.dp(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aqm $$0, io $$1) {
      drb $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(avw.V);
      return $$3 && $$2.a(dea.oh) ? dem.g($$2) : $$3;
   }
}
