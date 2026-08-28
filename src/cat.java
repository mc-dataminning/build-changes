import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class cat extends bxy<cpi> {
   private Set<cxk> c = ImmutableSet.of();

   public cat() {
      super(ImmutableMap.of(cfj.q, cfk.a, cfj.h, cfk.a));
   }

   protected boolean a(ash $$0, cpi $$1) {
      return bya.a($$1.eb(), cfj.q, bvq.bD);
   }

   protected boolean a(ash $$0, cpi $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ash $$0, cpi $$1, long $$2) {
      cpi $$3 = (cpi)$$1.eb().c(cfj.q).get();
      bya.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(ash $$0, cpi $$1, long $$2) {
      cpi $$3 = (cpi)$$1.eb().c(cfj.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bya.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gD() && ($$1.gw().b() == cpl.g || $$3.gE())) {
            a($$1, cpi.cc.keySet(), $$3);
         }

         if ($$3.gw().b() == cpl.g && $$1.t().a_(cxs.pS) > cxs.pS.h() / 2) {
            a($$1, ImmutableSet.of(cxs.pS), $$3);
         }

         if (!this.c.isEmpty() && $$1.t().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(ash $$0, cpi $$1, long $$2) {
      $$1.eb().b(cfj.q);
   }

   private static Set<cxk> a(cpi $$0, cpi $$1) {
      ImmutableSet<cxk> $$2 = $$1.gw().b().d();
      ImmutableSet<cxk> $$3 = $$0.gw().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cpi $$0, Set<cxk> $$1, bwf $$2) {
      btp $$3 = $$0.t();
      cxo $$4 = cxo.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cxo $$6;
         cxk $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.f()) {
               $$7 = $$6.h();
               if ($$1.contains($$7)) {
                  if ($$6.L() > $$6.k() / 2) {
                     $$8 = $$6.L() / 2;
                     break label28;
                  }

                  if ($$6.L() > 24) {
                     $$8 = $$6.L() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new cxo($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bya.a($$0, $$4, $$2.dt());
      }
   }
}
