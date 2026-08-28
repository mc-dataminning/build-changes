import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdh extends cdl<btb> {
   @Override
   public Set<ccf<?>> a() {
      return ImmutableSet.of(ccf.h, ccf.g, ccf.M, ccf.am, ccf.au, ccf.ak, new ccf[]{ccf.al, ccf.ao, ccf.an, ccf.as, ccf.at, ccf.aw});
   }

   @Override
   protected void a(aqm $$0, btb $$1) {
      bud<?> $$2 = $$1.dU();
      $$2.a(ccf.aw, c($$0, $$1));
      Optional<btd> $$3 = Optional.empty();
      Optional<cku> $$4 = Optional.empty();
      Optional<cku> $$5 = Optional.empty();
      Optional<cla> $$6 = Optional.empty();
      Optional<btb> $$7 = Optional.empty();
      Optional<cmk> $$8 = Optional.empty();
      Optional<cmk> $$9 = Optional.empty();
      int $$10 = 0;
      List<ckz> $$11 = Lists.newArrayList();
      List<ckz> $$12 = Lists.newArrayList();
      cch $$13 = $$2.c(ccf.h).orElse(cch.a());

      for (btb $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cku) {
            cku $$15 = (cku)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.u()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gu()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cld $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cla) {
            cla $$17 = (cla)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gp()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cmk) {
            cmk $$18 = (cmk)$$14;
            if ($$8.isEmpty() && !clb.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && clb.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof ckh) && !($$14 instanceof cih)) {
            if ($$7.isEmpty() && clb.a($$14.al())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((btd)$$14);
         }
      }

      for (btb $$20 : $$2.c(ccf.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof ckz) {
            ckz $$21 = (ckz)$$20;
            if ($$21.gp()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(ccf.M, $$3);
      $$2.a(ccf.ak, $$4);
      $$2.a(ccf.al, $$5);
      $$2.a(ccf.ar, $$7);
      $$2.a(ccf.am, $$8);
      $$2.a(ccf.au, $$9);
      $$2.a(ccf.an, $$12);
      $$2.a(ccf.ao, $$11);
      $$2.a(ccf.as, $$11.size());
      $$2.a(ccf.at, $$10);
   }

   private static Optional<ja> c(aqm $$0, btb $$1) {
      return ja.a($$1.dq(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aqm $$0, ja $$1) {
      dsk $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(avw.V);
      return $$3 && $$2.a(dfj.oh) ? dfv.g($$2) : $$3;
   }
}
