import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ccr extends bzw<cru> {
   private Set<dag> c = ImmutableSet.of();

   public ccr() {
      super(ImmutableMap.of(chh.r, chi.a, chh.h, chi.a));
   }

   protected boolean a(asb $$0, cru $$1) {
      return bzy.a($$1.ec(), chh.r, bxn.bE);
   }

   protected boolean a(asb $$0, cru $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(asb $$0, cru $$1, long $$2) {
      cru $$3 = (cru)$$1.ec().c(chh.r).get();
      bzy.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(asb $$0, cru $$1, long $$2) {
      cru $$3 = (cru)$$1.ec().c(chh.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bzy.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         boolean $$4 = $$1.gC().b().a(crx.g);
         if ($$1.gL() && ($$4 || $$3.gM())) {
            a($$1, cru.bL.keySet(), $$3);
         }

         if ($$4 && $$1.n().a_(dao.qk) > dao.qk.g() / 2) {
            a($$1, ImmutableSet.of(dao.qk), $$3);
         }

         if (!this.c.isEmpty() && $$1.n().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(asb $$0, cru $$1, long $$2) {
      $$1.ec().b(chh.r);
   }

   private static Set<dag> a(cru $$0, cru $$1) {
      ImmutableSet<dag> $$2 = $$1.gC().b().a().d();
      ImmutableSet<dag> $$3 = $$0.gC().b().a().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cru $$0, Set<dag> $$1, byf $$2) {
      bvj $$3 = $$0.n();
      dak $$4 = dak.l;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         dak $$6;
         dag $$7;
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
         $$4 = new dak($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bzy.a($$0, $$4, $$2.dt());
      }
   }
}
