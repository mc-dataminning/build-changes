import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class cbo extends byt<cqk> {
   private Set<cyu> c = ImmutableSet.of();

   public cbo() {
      super(ImmutableMap.of(cge.r, cgf.a, cge.h, cgf.a));
   }

   protected boolean a(arq $$0, cqk $$1) {
      return byv.a($$1.eb(), cge.r, bwm.bD);
   }

   protected boolean a(arq $$0, cqk $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arq $$0, cqk $$1, long $$2) {
      cqk $$3 = (cqk)$$1.eb().c(cge.r).get();
      byv.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arq $$0, cqk $$1, long $$2) {
      cqk $$3 = (cqk)$$1.eb().c(cge.r).get();
      if (!($$1.g($$3) > 5.0)) {
         byv.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         boolean $$4 = $$1.gy().b().a(cqn.g);
         if ($$1.gH() && ($$4 || $$3.gI())) {
            a($$1, cqk.bI.keySet(), $$3);
         }

         if ($$4 && $$1.n().a_(czc.qh) > czc.qh.g() / 2) {
            a($$1, ImmutableSet.of(czc.qh), $$3);
         }

         if (!this.c.isEmpty() && $$1.n().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arq $$0, cqk $$1, long $$2) {
      $$1.eb().b(cge.r);
   }

   private static Set<cyu> a(cqk $$0, cqk $$1) {
      ImmutableSet<cyu> $$2 = $$1.gy().b().a().d();
      ImmutableSet<cyu> $$3 = $$0.gy().b().a().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cqk $$0, Set<cyu> $$1, bxc $$2) {
      bui $$3 = $$0.n();
      cyy $$4 = cyy.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cyy $$6;
         cyu $$7;
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
         $$4 = new cyy($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         byv.a($$0, $$4, $$2.dt());
      }
   }
}
