import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ccg extends bzl<crj> {
   private Set<czu> c = ImmutableSet.of();

   public ccg() {
      super(ImmutableMap.of(cgw.r, cgx.a, cgw.h, cgx.a));
   }

   protected boolean a(ars $$0, crj $$1) {
      return bzn.a($$1.ec(), cgw.r, bxc.bE);
   }

   protected boolean a(ars $$0, crj $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ars $$0, crj $$1, long $$2) {
      crj $$3 = (crj)$$1.ec().c(cgw.r).get();
      bzn.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(ars $$0, crj $$1, long $$2) {
      crj $$3 = (crj)$$1.ec().c(cgw.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bzn.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         boolean $$4 = $$1.gC().b().a(crm.g);
         if ($$1.gL() && ($$4 || $$3.gM())) {
            a($$1, crj.bL.keySet(), $$3);
         }

         if ($$4 && $$1.n().a_(dac.qk) > dac.qk.g() / 2) {
            a($$1, ImmutableSet.of(dac.qk), $$3);
         }

         if (!this.c.isEmpty() && $$1.n().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(ars $$0, crj $$1, long $$2) {
      $$1.ec().b(cgw.r);
   }

   private static Set<czu> a(crj $$0, crj $$1) {
      ImmutableSet<czu> $$2 = $$1.gC().b().a().d();
      ImmutableSet<czu> $$3 = $$0.gC().b().a().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(crj $$0, Set<czu> $$1, bxu $$2) {
      buy $$3 = $$0.n();
      czy $$4 = czy.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         czy $$6;
         czu $$7;
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
         $$4 = new czy($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bzn.a($$0, $$4, $$2.dt());
      }
   }
}
