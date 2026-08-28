import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bzv extends bxa<cof> {
   private Set<cwi> c = ImmutableSet.of();

   public bzv() {
      super(ImmutableMap.of(cel.q, cem.a, cel.h, cem.a));
   }

   protected boolean a(arp $$0, cof $$1) {
      return bxc.a($$1.eb(), cel.q, bus.bz);
   }

   protected boolean a(arp $$0, cof $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arp $$0, cof $$1, long $$2) {
      cof $$3 = (cof)$$1.eb().c(cel.q).get();
      bxc.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arp $$0, cof $$1, long $$2) {
      cof $$3 = (cof)$$1.eb().c(cel.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bxc.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gD() && ($$1.gx().b() == coi.g || $$3.gE())) {
            a($$1, cof.cb.keySet(), $$3);
         }

         if ($$3.gx().b() == coi.g && $$1.v().a_(cwq.px) > cwq.px.h() / 2) {
            a($$1, ImmutableSet.of(cwq.px), $$3);
         }

         if (!this.c.isEmpty() && $$1.v().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arp $$0, cof $$1, long $$2) {
      $$1.eb().b(cel.q);
   }

   private static Set<cwi> a(cof $$0, cof $$1) {
      ImmutableSet<cwi> $$2 = $$1.gx().b().d();
      ImmutableSet<cwi> $$3 = $$0.gx().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cof $$0, Set<cwi> $$1, bvh $$2) {
      bsr $$3 = $$0.v();
      cwm $$4 = cwm.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cwm $$6;
         cwi $$7;
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
         $$4 = new cwm($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bxc.a($$0, $$4, $$2.dt());
      }
   }
}
