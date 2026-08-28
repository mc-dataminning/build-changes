import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bzt extends bwy<cog> {
   private Set<cwj> c = ImmutableSet.of();

   public bzt() {
      super(ImmutableMap.of(cej.q, cek.a, cej.h, cek.a));
   }

   protected boolean a(arc $$0, cog $$1) {
      return bxa.a($$1.ec(), cej.q, buq.bC);
   }

   protected boolean a(arc $$0, cog $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arc $$0, cog $$1, long $$2) {
      cog $$3 = (cog)$$1.ec().c(cej.q).get();
      bxa.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arc $$0, cog $$1, long $$2) {
      cog $$3 = (cog)$$1.ec().c(cej.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bxa.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gG() && ($$1.gz().b() == coj.g || $$3.gH())) {
            a($$1, cog.cb.keySet(), $$3);
         }

         if ($$3.gz().b() == coj.g && $$1.t().a_(cwr.qb) > cwr.qb.h() / 2) {
            a($$1, ImmutableSet.of(cwr.qb), $$3);
         }

         if (!this.c.isEmpty() && $$1.t().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arc $$0, cog $$1, long $$2) {
      $$1.ec().b(cej.q);
   }

   private static Set<cwj> a(cog $$0, cog $$1) {
      ImmutableSet<cwj> $$2 = $$1.gz().b().d();
      ImmutableSet<cwj> $$3 = $$0.gz().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cog $$0, Set<cwj> $$1, bvf $$2) {
      bsp $$3 = $$0.t();
      cwn $$4 = cwn.j;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cwn $$6;
         cwj $$7;
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
         $$4 = new cwn($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bxa.a($$0, $$4, $$2.du());
      }
   }
}
