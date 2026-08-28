import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class byb extends bvg<cmi> {
   private Set<cui> c = ImmutableSet.of();

   public byb() {
      super(ImmutableMap.of(ccr.q, ccs.a, ccr.h, ccs.a));
   }

   protected boolean a(are $$0, cmi $$1) {
      return bvi.a($$1.dS(), ccr.q, bsy.bj);
   }

   protected boolean a(are $$0, cmi $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(are $$0, cmi $$1, long $$2) {
      cmi $$3 = (cmi)$$1.dS().c(ccr.q).get();
      bvi.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(are $$0, cmi $$1, long $$2) {
      cmi $$3 = (cmi)$$1.dS().c(ccr.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bvi.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gI() && ($$1.gB().b() == cml.g || $$3.gJ())) {
            a($$1, cmi.cb.keySet(), $$3);
         }

         if ($$3.gB().b() == cml.g && $$1.y().a_(cuq.pw) > cuq.pw.q() / 2) {
            a($$1, ImmutableSet.of(cuq.pw), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(are $$0, cmi $$1, long $$2) {
      $$1.dS().b(ccr.q);
   }

   private static Set<cui> a(cmi $$0, cmi $$1) {
      ImmutableSet<cui> $$2 = $$1.gB().b().d();
      ImmutableSet<cui> $$3 = $$0.gB().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cmi $$0, Set<cui> $$1, btn $$2) {
      brb $$3 = $$0.y();
      cun $$4 = cun.l;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cun $$6;
         cui $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.e()) {
               $$7 = $$6.g();
               if ($$1.contains($$7)) {
                  if ($$6.I() > $$6.j() / 2) {
                     $$8 = $$6.I() / 2;
                     break label28;
                  }

                  if ($$6.I() > 24) {
                     $$8 = $$6.I() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new cun($$7, $$8);
         break;
      }

      if (!$$4.e()) {
         bvi.a($$0, $$4, $$2.dn());
      }
   }
}
