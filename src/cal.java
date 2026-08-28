import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class cal extends bxq<cpa> {
   private Set<cxc> c = ImmutableSet.of();

   public cal() {
      super(ImmutableMap.of(cfb.q, cfc.a, cfb.h, cfc.a));
   }

   protected boolean a(arx $$0, cpa $$1) {
      return bxs.a($$1.ec(), cfb.q, bvi.bD);
   }

   protected boolean a(arx $$0, cpa $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arx $$0, cpa $$1, long $$2) {
      cpa $$3 = (cpa)$$1.ec().c(cfb.q).get();
      bxs.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arx $$0, cpa $$1, long $$2) {
      cpa $$3 = (cpa)$$1.ec().c(cfb.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bxs.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gF() && ($$1.gy().b() == cpd.g || $$3.gG())) {
            a($$1, cpa.cc.keySet(), $$3);
         }

         if ($$3.gy().b() == cpd.g && $$1.t().a_(cxk.qb) > cxk.qb.h() / 2) {
            a($$1, ImmutableSet.of(cxk.qb), $$3);
         }

         if (!this.c.isEmpty() && $$1.t().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arx $$0, cpa $$1, long $$2) {
      $$1.ec().b(cfb.q);
   }

   private static Set<cxc> a(cpa $$0, cpa $$1) {
      ImmutableSet<cxc> $$2 = $$1.gy().b().d();
      ImmutableSet<cxc> $$3 = $$0.gy().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cpa $$0, Set<cxc> $$1, bvx $$2) {
      bth $$3 = $$0.t();
      cxg $$4 = cxg.j;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cxg $$6;
         cxc $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.f()) {
               $$7 = $$6.h();
               if ($$1.contains($$7)) {
                  if ($$6.M() > $$6.k() / 2) {
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
         $$4 = new cxg($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bxs.a($$0, $$4, $$2.du());
      }
   }
}
