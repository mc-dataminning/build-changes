import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class cci extends bzn<crl> {
   private Set<czw> c = ImmutableSet.of();

   public cci() {
      super(ImmutableMap.of(cgy.r, cgz.a, cgy.h, cgz.a));
   }

   protected boolean a(aru $$0, crl $$1) {
      return bzp.a($$1.ec(), cgy.r, bxe.bE);
   }

   protected boolean a(aru $$0, crl $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aru $$0, crl $$1, long $$2) {
      crl $$3 = (crl)$$1.ec().c(cgy.r).get();
      bzp.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aru $$0, crl $$1, long $$2) {
      crl $$3 = (crl)$$1.ec().c(cgy.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bzp.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         boolean $$4 = $$1.gC().b().a(cro.g);
         if ($$1.gL() && ($$4 || $$3.gM())) {
            a($$1, crl.bL.keySet(), $$3);
         }

         if ($$4 && $$1.n().a_(dae.qk) > dae.qk.g() / 2) {
            a($$1, ImmutableSet.of(dae.qk), $$3);
         }

         if (!this.c.isEmpty() && $$1.n().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aru $$0, crl $$1, long $$2) {
      $$1.ec().b(cgy.r);
   }

   private static Set<czw> a(crl $$0, crl $$1) {
      ImmutableSet<czw> $$2 = $$1.gC().b().a().d();
      ImmutableSet<czw> $$3 = $$0.gC().b().a().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(crl $$0, Set<czw> $$1, bxw $$2) {
      bva $$3 = $$0.n();
      daa $$4 = daa.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         daa $$6;
         czw $$7;
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
         $$4 = new daa($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bzp.a($$0, $$4, $$2.dt());
      }
   }
}
