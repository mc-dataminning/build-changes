import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bye extends bvj<cml> {
   private Set<cul> c = ImmutableSet.of();

   public bye() {
      super(ImmutableMap.of(ccu.q, ccv.a, ccu.h, ccv.a));
   }

   protected boolean a(arf $$0, cml $$1) {
      return bvl.a($$1.dS(), ccu.q, btb.bj);
   }

   protected boolean a(arf $$0, cml $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arf $$0, cml $$1, long $$2) {
      cml $$3 = (cml)$$1.dS().c(ccu.q).get();
      bvl.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arf $$0, cml $$1, long $$2) {
      cml $$3 = (cml)$$1.dS().c(ccu.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bvl.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gI() && ($$1.gB().b() == cmo.g || $$3.gJ())) {
            a($$1, cml.cb.keySet(), $$3);
         }

         if ($$3.gB().b() == cmo.g && $$1.y().a_(cut.pw) > cut.pw.q() / 2) {
            a($$1, ImmutableSet.of(cut.pw), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arf $$0, cml $$1, long $$2) {
      $$1.dS().b(ccu.q);
   }

   private static Set<cul> a(cml $$0, cml $$1) {
      ImmutableSet<cul> $$2 = $$1.gB().b().d();
      ImmutableSet<cul> $$3 = $$0.gB().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cml $$0, Set<cul> $$1, btq $$2) {
      bre $$3 = $$0.y();
      cuq $$4 = cuq.l;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cuq $$6;
         cul $$7;
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
         $$4 = new cuq($$7, $$8);
         break;
      }

      if (!$$4.e()) {
         bvl.a($$0, $$4, $$2.dn());
      }
   }
}
