import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bzu extends bwz<coh> {
   private Set<cwk> c = ImmutableSet.of();

   public bzu() {
      super(ImmutableMap.of(cek.q, cel.a, cek.h, cel.a));
   }

   protected boolean a(ard $$0, coh $$1) {
      return bxb.a($$1.eb(), cek.q, bur.bC);
   }

   protected boolean a(ard $$0, coh $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ard $$0, coh $$1, long $$2) {
      coh $$3 = (coh)$$1.eb().c(cek.q).get();
      bxb.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(ard $$0, coh $$1, long $$2) {
      coh $$3 = (coh)$$1.eb().c(cek.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bxb.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gJ() && ($$1.gC().b() == cok.g || $$3.gK())) {
            a($$1, coh.cb.keySet(), $$3);
         }

         if ($$3.gC().b() == cok.g && $$1.t().a_(cws.qb) > cws.qb.h() / 2) {
            a($$1, ImmutableSet.of(cws.qb), $$3);
         }

         if (!this.c.isEmpty() && $$1.t().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(ard $$0, coh $$1, long $$2) {
      $$1.eb().b(cek.q);
   }

   private static Set<cwk> a(coh $$0, coh $$1) {
      ImmutableSet<cwk> $$2 = $$1.gC().b().d();
      ImmutableSet<cwk> $$3 = $$0.gC().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(coh $$0, Set<cwk> $$1, bvg $$2) {
      bsq $$3 = $$0.t();
      cwo $$4 = cwo.j;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cwo $$6;
         cwk $$7;
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
         $$4 = new cwo($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bxb.a($$0, $$4, $$2.dt());
      }
   }
}
