import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class btk extends bqp<chn> {
   private Set<cpl> c = ImmutableSet.of();

   public btk() {
      super(ImmutableMap.of(bya.q, byb.a, bya.h, byb.a));
   }

   protected boolean a(apa $$0, chn $$1) {
      return bqr.a($$1.dM(), bya.q, bol.bh);
   }

   protected boolean a(apa $$0, chn $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(apa $$0, chn $$1, long $$2) {
      chn $$3 = (chn)$$1.dM().c(bya.q).get();
      bqr.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(apa $$0, chn $$1, long $$2) {
      chn $$3 = (chn)$$1.dM().c(bya.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bqr.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gD() && ($$1.gw().b() == chq.g || $$3.gE())) {
            a($$1, chn.bY.keySet(), $$3);
         }

         if ($$3.gw().b() == chq.g && $$1.A().a_(cpt.pv) > cpt.pv.n() / 2) {
            a($$1, ImmutableSet.of(cpt.pv), $$3);
         }

         if (!this.c.isEmpty() && $$1.A().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(apa $$0, chn $$1, long $$2) {
      $$1.dM().b(bya.q);
   }

   private static Set<cpl> a(chn $$0, chn $$1) {
      ImmutableSet<cpl> $$2 = $$1.gw().b().d();
      ImmutableSet<cpl> $$3 = $$0.gw().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(chn $$0, Set<cpl> $$1, box $$2) {
      bmu $$3 = $$0.A();
      cpq $$4 = cpq.h;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cpq $$6;
         cpl $$7;
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
         $$4 = new cpq($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bqr.a($$0, $$4, $$2.dh());
      }
   }
}
