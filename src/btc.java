import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class btc extends btg<bjb> {
   @Override
   public Set<bsc<?>> a() {
      return ImmutableSet.of(bsc.h, bsc.g, bsc.L, bsc.al, bsc.at, bsc.aj, new bsc[]{bsc.ak, bsc.an, bsc.am, bsc.ar, bsc.as, bsc.av});
   }

   @Override
   protected void a(akn $$0, bjb $$1) {
      bkb<?> $$2 = $$1.dM();
      $$2.a(bsc.av, c($$0, $$1));
      Optional<bjd> $$3 = Optional.empty();
      Optional<bzz> $$4 = Optional.empty();
      Optional<bzz> $$5 = Optional.empty();
      Optional<caf> $$6 = Optional.empty();
      Optional<bjb> $$7 = Optional.empty();
      Optional<cbp> $$8 = Optional.empty();
      Optional<cbp> $$9 = Optional.empty();
      int $$10 = 0;
      List<cae> $$11 = Lists.newArrayList();
      List<cae> $$12 = Lists.newArrayList();
      bse $$13 = $$2.c(bsc.h).orElse(bse.a());

      for (bjb $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof bzz) {
            bzz $$15 = (bzz)$$14;
            if ($$15.i_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.q()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gg()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cai $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof caf) {
            caf $$17 = (caf)$$14;
            if ($$17.i_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gb()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cbp) {
            cbp $$18 = (cbp)$$14;
            if ($$8.isEmpty() && !cag.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.G_() && cag.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof bzu) && !($$14 instanceof bxw)) {
            if ($$7.isEmpty() && cag.a($$14.ag())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bjd)$$14);
         }
      }

      for (bjb $$20 : $$2.c(bsc.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cae) {
            cae $$21 = (cae)$$20;
            if ($$21.gb()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bsc.L, $$3);
      $$2.a(bsc.aj, $$4);
      $$2.a(bsc.ak, $$5);
      $$2.a(bsc.aq, $$7);
      $$2.a(bsc.al, $$8);
      $$2.a(bsc.at, $$9);
      $$2.a(bsc.am, $$12);
      $$2.a(bsc.an, $$11);
      $$2.a(bsc.ar, $$11.size());
      $$2.a(bsc.as, $$10);
   }

   private static Optional<gw> c(akn $$0, bjb $$1) {
      return gw.a($$1.dk(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(akn $$0, gw $$1) {
      dfe $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(apo.V);
      return $$3 && $$2.a(csr.oh) ? ctd.g($$2) : $$3;
   }
}
