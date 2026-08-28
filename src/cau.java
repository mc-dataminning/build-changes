import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class cau extends bxz<cpj> {
   private Set<cxl> c = ImmutableSet.of();

   public cau() {
      super(ImmutableMap.of(cfk.q, cfl.a, cfk.h, cfl.a));
   }

   protected boolean a(ash $$0, cpj $$1) {
      return byb.a($$1.ec(), cfk.q, bvr.bD);
   }

   protected boolean a(ash $$0, cpj $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ash $$0, cpj $$1, long $$2) {
      cpj $$3 = (cpj)$$1.ec().c(cfk.q).get();
      byb.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(ash $$0, cpj $$1, long $$2) {
      cpj $$3 = (cpj)$$1.ec().c(cfk.q).get();
      if (!($$1.g($$3) > 5.0)) {
         byb.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gF() && ($$1.gy().b() == cpm.g || $$3.gG())) {
            a($$1, cpj.cc.keySet(), $$3);
         }

         if ($$3.gy().b() == cpm.g && $$1.t().a_(cxt.pS) > cxt.pS.h() / 2) {
            a($$1, ImmutableSet.of(cxt.pS), $$3);
         }

         if (!this.c.isEmpty() && $$1.t().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(ash $$0, cpj $$1, long $$2) {
      $$1.ec().b(cfk.q);
   }

   private static Set<cxl> a(cpj $$0, cpj $$1) {
      ImmutableSet<cxl> $$2 = $$1.gy().b().d();
      ImmutableSet<cxl> $$3 = $$0.gy().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cpj $$0, Set<cxl> $$1, bwg $$2) {
      btq $$3 = $$0.t();
      cxp $$4 = cxp.j;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cxp $$6;
         cxl $$7;
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
         $$4 = new cxp($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         byb.a($$0, $$4, $$2.du());
      }
   }
}
