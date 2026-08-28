import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfb extends cff<buv> {
   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.of(cdz.h, cdz.g, cdz.M, cdz.am, cdz.au, cdz.ak, new cdz[]{cdz.al, cdz.ao, cdz.an, cdz.as, cdz.at, cdz.aw});
   }

   @Override
   protected void a(arm $$0, buv $$1) {
      bvx<?> $$2 = $$1.ed();
      $$2.a(cdz.aw, c($$0, $$1));
      Optional<bux> $$3 = Optional.empty();
      Optional<cmq> $$4 = Optional.empty();
      Optional<cmq> $$5 = Optional.empty();
      Optional<cmw> $$6 = Optional.empty();
      Optional<buv> $$7 = Optional.empty();
      Optional<coh> $$8 = Optional.empty();
      Optional<coh> $$9 = Optional.empty();
      int $$10 = 0;
      List<cmv> $$11 = Lists.newArrayList();
      List<cmv> $$12 = Lists.newArrayList();
      ceb $$13 = $$2.c(cdz.h).orElse(ceb.a());

      for (buv $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cmq) {
            cmq $$15 = (cmq)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gw()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cmz $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cmw) {
            cmw $$17 = (cmw)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gw()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof coh) {
            coh $$18 = (coh)$$14;
            if ($$8.isEmpty() && !cmx.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.R_() && cmx.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cmd) && !($$14 instanceof ckd)) {
            if ($$7.isEmpty() && cmx.a($$14.aq())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bux)$$14);
         }
      }

      for (buv $$20 : $$2.c(cdz.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cmv) {
            cmv $$21 = (cmv)$$20;
            if ($$21.gw()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cdz.M, $$3);
      $$2.a(cdz.ak, $$4);
      $$2.a(cdz.al, $$5);
      $$2.a(cdz.ar, $$7);
      $$2.a(cdz.am, $$8);
      $$2.a(cdz.au, $$9);
      $$2.a(cdz.an, $$12);
      $$2.a(cdz.ao, $$11);
      $$2.a(cdz.as, $$11.size());
      $$2.a(cdz.at, $$10);
   }

   private static Optional<jg> c(arm $$0, buv $$1) {
      return jg.a($$1.dx(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(arm $$0, jg $$1) {
      dvd $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(awz.W);
      return $$3 && $$2.a(dia.oh) ? dim.h($$2) : $$3;
   }
}
