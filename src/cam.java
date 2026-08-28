import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class cam extends bxr<cpd> {
   private Set<cxd> c = ImmutableSet.of();

   public cam() {
      super(ImmutableMap.of(cfc.q, cfd.a, cfc.h, cfd.a));
   }

   protected boolean a(ard $$0, cpd $$1) {
      return bxt.a($$1.ea(), cfc.q, bvi.bC);
   }

   protected boolean a(ard $$0, cpd $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ard $$0, cpd $$1, long $$2) {
      cpd $$3 = (cpd)$$1.ea().c(cfc.q).get();
      bxt.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(ard $$0, cpd $$1, long $$2) {
      cpd $$3 = (cpd)$$1.ea().c(cfc.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bxt.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gI() && ($$1.gA().b() == cpg.g || $$3.gJ())) {
            a($$1, cpd.bI.keySet(), $$3);
         }

         if ($$3.gA().b() == cpg.g && $$1.n().a_(cxl.qd) > cxl.qd.h() / 2) {
            a($$1, ImmutableSet.of(cxl.qd), $$3);
         }

         if (!this.c.isEmpty() && $$1.n().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(ard $$0, cpd $$1, long $$2) {
      $$1.ea().b(cfc.q);
   }

   private static Set<cxd> a(cpd $$0, cpd $$1) {
      ImmutableSet<cxd> $$2 = $$1.gA().b().d();
      ImmutableSet<cxd> $$3 = $$0.gA().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cpd $$0, Set<cxd> $$1, bvy $$2) {
      btf $$3 = $$0.n();
      cxh $$4 = cxh.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cxh $$6;
         cxd $$7;
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
         $$4 = new cxh($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bxt.a($$0, $$4, $$2.ds());
      }
   }
}
