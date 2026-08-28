import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bzv extends bxa<coi> {
   private Set<cwl> c = ImmutableSet.of();

   public bzv() {
      super(ImmutableMap.of(cel.q, cem.a, cel.h, cem.a));
   }

   protected boolean a(ard $$0, coi $$1) {
      return bxc.a($$1.eb(), cel.q, bus.bC);
   }

   protected boolean a(ard $$0, coi $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ard $$0, coi $$1, long $$2) {
      coi $$3 = (coi)$$1.eb().c(cel.q).get();
      bxc.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(ard $$0, coi $$1, long $$2) {
      coi $$3 = (coi)$$1.eb().c(cel.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bxc.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gJ() && ($$1.gC().b() == col.g || $$3.gK())) {
            a($$1, coi.cb.keySet(), $$3);
         }

         if ($$3.gC().b() == col.g && $$1.t().a_(cwt.qb) > cwt.qb.h() / 2) {
            a($$1, ImmutableSet.of(cwt.qb), $$3);
         }

         if (!this.c.isEmpty() && $$1.t().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(ard $$0, coi $$1, long $$2) {
      $$1.eb().b(cel.q);
   }

   private static Set<cwl> a(coi $$0, coi $$1) {
      ImmutableSet<cwl> $$2 = $$1.gC().b().d();
      ImmutableSet<cwl> $$3 = $$0.gC().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(coi $$0, Set<cwl> $$1, bvh $$2) {
      bsr $$3 = $$0.t();
      cwp $$4 = cwp.j;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cwp $$6;
         cwl $$7;
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
         $$4 = new cwp($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bxc.a($$0, $$4, $$2.dt());
      }
   }
}
