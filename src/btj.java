import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class btj extends btn<bji> {
   @Override
   public Set<bsj<?>> a() {
      return ImmutableSet.of(bsj.h, bsj.g, bsj.L, bsj.al, bsj.at, bsj.aj, new bsj[]{bsj.ak, bsj.an, bsj.am, bsj.ar, bsj.as, bsj.av});
   }

   @Override
   protected void a(aks $$0, bji $$1) {
      bki<?> $$2 = $$1.dN();
      $$2.a(bsj.av, c($$0, $$1));
      Optional<bjk> $$3 = Optional.empty();
      Optional<cag> $$4 = Optional.empty();
      Optional<cag> $$5 = Optional.empty();
      Optional<cam> $$6 = Optional.empty();
      Optional<bji> $$7 = Optional.empty();
      Optional<cbw> $$8 = Optional.empty();
      Optional<cbw> $$9 = Optional.empty();
      int $$10 = 0;
      List<cal> $$11 = Lists.newArrayList();
      List<cal> $$12 = Lists.newArrayList();
      bsl $$13 = $$2.c(bsj.h).orElse(bsl.a());

      for (bji $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof cag) {
            cag $$15 = (cag)$$14;
            if ($$15.m_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gj()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cap $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cam) {
            cam $$17 = (cam)$$14;
            if ($$17.m_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.ge()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cbw) {
            cbw $$18 = (cbw)$$14;
            if ($$8.isEmpty() && !can.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.M_() && can.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cab) && !($$14 instanceof byd)) {
            if ($$7.isEmpty() && can.a($$14.ag())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bjk)$$14);
         }
      }

      for (bji $$20 : $$2.c(bsj.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cal) {
            cal $$21 = (cal)$$20;
            if ($$21.ge()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bsj.L, $$3);
      $$2.a(bsj.aj, $$4);
      $$2.a(bsj.ak, $$5);
      $$2.a(bsj.aq, $$7);
      $$2.a(bsj.al, $$8);
      $$2.a(bsj.at, $$9);
      $$2.a(bsj.am, $$12);
      $$2.a(bsj.an, $$11);
      $$2.a(bsj.ar, $$11.size());
      $$2.a(bsj.as, $$10);
   }

   private static Optional<gw> c(aks $$0, bji $$1) {
      return gw.a($$1.dl(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aks $$0, gw $$1) {
      dfl $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(apu.V);
      return $$3 && $$2.a(csy.oh) ? ctk.g($$2) : $$3;
   }
}
