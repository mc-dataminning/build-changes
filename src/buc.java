import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class buc extends brh<cih> {
   private Set<cqh> c = ImmutableSet.of();

   public buc() {
      super(ImmutableMap.of(bys.q, byt.a, bys.h, byt.a));
   }

   protected boolean a(apf $$0, cih $$1) {
      return brj.a($$1.dP(), bys.q, bpd.bj);
   }

   protected boolean a(apf $$0, cih $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(apf $$0, cih $$1, long $$2) {
      cih $$3 = (cih)$$1.dP().c(bys.q).get();
      brj.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(apf $$0, cih $$1, long $$2) {
      cih $$3 = (cih)$$1.dP().c(bys.q).get();
      if (!($$1.g($$3) > 5.0)) {
         brj.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gF() && ($$1.gy().b() == cik.g || $$3.gG())) {
            a($$1, cih.ca.keySet(), $$3);
         }

         if ($$3.gy().b() == cik.g && $$1.y().a_(cqp.pv) > cqp.pv.n() / 2) {
            a($$1, ImmutableSet.of(cqp.pv), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(apf $$0, cih $$1, long $$2) {
      $$1.dP().b(bys.q);
   }

   private static Set<cqh> a(cih $$0, cih $$1) {
      ImmutableSet<cqh> $$2 = $$1.gy().b().d();
      ImmutableSet<cqh> $$3 = $$0.gy().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cih $$0, Set<cqh> $$1, bpp $$2) {
      bnm $$3 = $$0.y();
      cqm $$4 = cqm.h;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cqm $$6;
         cqh $$7;
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
         $$4 = new cqm($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         brj.a($$0, $$4, $$2.dk());
      }
   }
}
