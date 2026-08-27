import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cbj extends cbn<bre> {
   @Override
   public Set<cah<?>> a() {
      return ImmutableSet.of(cah.h, cah.g, cah.M, cah.am, cah.au, cah.ak, new cah[]{cah.al, cah.ao, cah.an, cah.as, cah.at, cah.aw});
   }

   @Override
   protected void a(aqe $$0, bre $$1) {
      bsf<?> $$2 = $$1.dQ();
      $$2.a(cah.aw, c($$0, $$1));
      Optional<brg> $$3 = Optional.empty();
      Optional<civ> $$4 = Optional.empty();
      Optional<civ> $$5 = Optional.empty();
      Optional<cjb> $$6 = Optional.empty();
      Optional<bre> $$7 = Optional.empty();
      Optional<ckl> $$8 = Optional.empty();
      Optional<ckl> $$9 = Optional.empty();
      int $$10 = 0;
      List<cja> $$11 = Lists.newArrayList();
      List<cja> $$12 = Lists.newArrayList();
      caj $$13 = $$2.c(cah.h).orElse(caj.a());

      for (bre $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof civ) {
            civ $$15 = (civ)$$14;
            if ($$15.p_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.u()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gv()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof cje $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cjb) {
            cjb $$17 = (cjb)$$14;
            if ($$17.p_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gq()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof ckl) {
            ckl $$18 = (ckl)$$14;
            if ($$8.isEmpty() && !cjc.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.N_() && cjc.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof cii) && !($$14 instanceof cgj)) {
            if ($$7.isEmpty() && cjc.a($$14.ai())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((brg)$$14);
         }
      }

      for (bre $$20 : $$2.c(cah.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cja) {
            cja $$21 = (cja)$$20;
            if ($$21.gq()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(cah.M, $$3);
      $$2.a(cah.ak, $$4);
      $$2.a(cah.al, $$5);
      $$2.a(cah.ar, $$7);
      $$2.a(cah.am, $$8);
      $$2.a(cah.au, $$9);
      $$2.a(cah.an, $$12);
      $$2.a(cah.ao, $$11);
      $$2.a(cah.as, $$11.size());
      $$2.a(cah.at, $$10);
   }

   private static Optional<im> c(aqe $$0, bre $$1) {
      return im.a($$1.dn(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aqe $$0, im $$1) {
      dpy $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(avo.V);
      return $$3 && $$2.a(dcx.oh) ? ddj.g($$2) : $$3;
   }
}
