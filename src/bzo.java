import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bzo extends bwt<cny> {
   private Set<cvx> c = ImmutableSet.of();

   public bzo() {
      super(ImmutableMap.of(cee.q, cef.a, cee.h, cef.a));
   }

   protected boolean a(arn $$0, cny $$1) {
      return bwv.a($$1.ed(), cee.q, bul.bj);
   }

   protected boolean a(arn $$0, cny $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arn $$0, cny $$1, long $$2) {
      cny $$3 = (cny)$$1.ed().c(cee.q).get();
      bwv.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arn $$0, cny $$1, long $$2) {
      cny $$3 = (cny)$$1.ed().c(cee.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bwv.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gL() && ($$1.gE().b() == cob.g || $$3.gM())) {
            a($$1, cny.cb.keySet(), $$3);
         }

         if ($$3.gE().b() == cob.g && $$1.y().a_(cwf.px) > cwf.px.h() / 2) {
            a($$1, ImmutableSet.of(cwf.px), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arn $$0, cny $$1, long $$2) {
      $$1.ed().b(cee.q);
   }

   private static Set<cvx> a(cny $$0, cny $$1) {
      ImmutableSet<cvx> $$2 = $$1.gE().b().d();
      ImmutableSet<cvx> $$3 = $$0.gE().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cny $$0, Set<cvx> $$1, bva $$2) {
      bsk $$3 = $$0.y();
      cwb $$4 = cwb.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cwb $$6;
         cvx $$7;
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
         $$4 = new cwb($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bwv.a($$0, $$4, $$2.dv());
      }
   }
}
