import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class cap extends bxu<cpe> {
   private Set<cxg> c = ImmutableSet.of();

   public cap() {
      super(ImmutableMap.of(cff.q, cfg.a, cff.h, cfg.a));
   }

   protected boolean a(ash $$0, cpe $$1) {
      return bxw.a($$1.eb(), cff.q, bvm.bD);
   }

   protected boolean a(ash $$0, cpe $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ash $$0, cpe $$1, long $$2) {
      cpe $$3 = (cpe)$$1.eb().c(cff.q).get();
      bxw.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(ash $$0, cpe $$1, long $$2) {
      cpe $$3 = (cpe)$$1.eb().c(cff.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bxw.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gD() && ($$1.gw().b() == cph.g || $$3.gE())) {
            a($$1, cpe.cc.keySet(), $$3);
         }

         if ($$3.gw().b() == cph.g && $$1.t().a_(cxo.pS) > cxo.pS.h() / 2) {
            a($$1, ImmutableSet.of(cxo.pS), $$3);
         }

         if (!this.c.isEmpty() && $$1.t().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(ash $$0, cpe $$1, long $$2) {
      $$1.eb().b(cff.q);
   }

   private static Set<cxg> a(cpe $$0, cpe $$1) {
      ImmutableSet<cxg> $$2 = $$1.gw().b().d();
      ImmutableSet<cxg> $$3 = $$0.gw().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cpe $$0, Set<cxg> $$1, bwb $$2) {
      btl $$3 = $$0.t();
      cxk $$4 = cxk.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cxk $$6;
         cxg $$7;
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
         $$4 = new cxk($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bxw.a($$0, $$4, $$2.dt());
      }
   }
}
