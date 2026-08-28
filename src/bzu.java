import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bzu extends bwz<coi> {
   private Set<cwl> c = ImmutableSet.of();

   public bzu() {
      super(ImmutableMap.of(cek.q, cel.a, cek.h, cel.a));
   }

   protected boolean a(arc $$0, coi $$1) {
      return bxb.a($$1.ec(), cek.q, bur.bD);
   }

   protected boolean a(arc $$0, coi $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arc $$0, coi $$1, long $$2) {
      coi $$3 = (coi)$$1.ec().c(cek.q).get();
      bxb.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arc $$0, coi $$1, long $$2) {
      coi $$3 = (coi)$$1.ec().c(cek.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bxb.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gG() && ($$1.gz().b() == col.g || $$3.gH())) {
            a($$1, coi.cb.keySet(), $$3);
         }

         if ($$3.gz().b() == col.g && $$1.t().a_(cwt.qb) > cwt.qb.h() / 2) {
            a($$1, ImmutableSet.of(cwt.qb), $$3);
         }

         if (!this.c.isEmpty() && $$1.t().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arc $$0, coi $$1, long $$2) {
      $$1.ec().b(cek.q);
   }

   private static Set<cwl> a(coi $$0, coi $$1) {
      ImmutableSet<cwl> $$2 = $$1.gz().b().d();
      ImmutableSet<cwl> $$3 = $$0.gz().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(coi $$0, Set<cwl> $$1, bvg $$2) {
      bsq $$3 = $$0.t();
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
         bxb.a($$0, $$4, $$2.du());
      }
   }
}
