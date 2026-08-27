import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bub extends brg<cif> {
   private Set<cqf> c = ImmutableSet.of();

   public bub() {
      super(ImmutableMap.of(byr.q, bys.a, byr.h, bys.a));
   }

   protected boolean a(apf $$0, cif $$1) {
      return bri.a($$1.dP(), byr.q, bpc.bi);
   }

   protected boolean a(apf $$0, cif $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(apf $$0, cif $$1, long $$2) {
      cif $$3 = (cif)$$1.dP().c(byr.q).get();
      bri.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(apf $$0, cif $$1, long $$2) {
      cif $$3 = (cif)$$1.dP().c(byr.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bri.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gF() && ($$1.gy().b() == cii.g || $$3.gG())) {
            a($$1, cif.ca.keySet(), $$3);
         }

         if ($$3.gy().b() == cii.g && $$1.y().a_(cqn.pv) > cqn.pv.n() / 2) {
            a($$1, ImmutableSet.of(cqn.pv), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(apf $$0, cif $$1, long $$2) {
      $$1.dP().b(byr.q);
   }

   private static Set<cqf> a(cif $$0, cif $$1) {
      ImmutableSet<cqf> $$2 = $$1.gy().b().d();
      ImmutableSet<cqf> $$3 = $$0.gy().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cif $$0, Set<cqf> $$1, bpo $$2) {
      bnl $$3 = $$0.y();
      cqk $$4 = cqk.h;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cqk $$6;
         cqf $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.b()) {
               $$7 = $$6.d();
               if ($$1.contains($$7)) {
                  if ($$6.M() > $$6.g() / 2) {
                     $$8 = $$6.M() / 2;
                     break label28;
                  }

                  if ($$6.M() > 24) {
                     $$8 = $$6.M() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new cqk($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bri.a($$0, $$4, $$2.dk());
      }
   }
}
