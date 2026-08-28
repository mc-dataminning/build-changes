import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bzw extends bxb<coj> {
   private Set<cwm> c = ImmutableSet.of();

   public bzw() {
      super(ImmutableMap.of(cem.q, cen.a, cem.h, cen.a));
   }

   protected boolean a(ard $$0, coj $$1) {
      return bxd.a($$1.eb(), cem.q, but.bC);
   }

   protected boolean a(ard $$0, coj $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ard $$0, coj $$1, long $$2) {
      coj $$3 = (coj)$$1.eb().c(cem.q).get();
      bxd.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(ard $$0, coj $$1, long $$2) {
      coj $$3 = (coj)$$1.eb().c(cem.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bxd.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gJ() && ($$1.gC().b() == com.g || $$3.gK())) {
            a($$1, coj.cb.keySet(), $$3);
         }

         if ($$3.gC().b() == com.g && $$1.t().a_(cwu.qb) > cwu.qb.h() / 2) {
            a($$1, ImmutableSet.of(cwu.qb), $$3);
         }

         if (!this.c.isEmpty() && $$1.t().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(ard $$0, coj $$1, long $$2) {
      $$1.eb().b(cem.q);
   }

   private static Set<cwm> a(coj $$0, coj $$1) {
      ImmutableSet<cwm> $$2 = $$1.gC().b().d();
      ImmutableSet<cwm> $$3 = $$0.gC().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(coj $$0, Set<cwm> $$1, bvi $$2) {
      bss $$3 = $$0.t();
      cwq $$4 = cwq.j;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cwq $$6;
         cwm $$7;
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
         $$4 = new cwq($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bxd.a($$0, $$4, $$2.dt());
      }
   }
}
