import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bqh extends bnm<cee> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<cmc> e = ImmutableSet.of();

   public bqh() {
      super(ImmutableMap.of(bux.q, buy.a, bux.h, buy.a));
   }

   protected boolean a(amp $$0, cee $$1) {
      return bno.a($$1.dO(), bux.q, blj.bg);
   }

   protected boolean a(amp $$0, cee $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(amp $$0, cee $$1, long $$2) {
      cee $$3 = (cee)$$1.dO().c(bux.q).get();
      bno.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(amp $$0, cee $$1, long $$2) {
      cee $$3 = (cee)$$1.dO().c(bux.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bno.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gw() && ($$1.gp().b() == ceh.g || $$3.gx())) {
            a($$1, cee.bW.keySet(), $$3);
         }

         if ($$3.gp().b() == ceh.g && $$1.A().a_(cmk.pt) > cmk.pt.l() / 2) {
            a($$1, ImmutableSet.of(cmk.pt), $$3);
         }

         if (!this.e.isEmpty() && $$1.A().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(amp $$0, cee $$1, long $$2) {
      $$1.dO().b(bux.q);
   }

   private static Set<cmc> a(cee $$0, cee $$1) {
      ImmutableSet<cmc> $$2 = $$1.gp().b().d();
      ImmutableSet<cmc> $$3 = $$0.gp().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cee $$0, Set<cmc> $$1, blv $$2) {
      bjt $$3 = $$0.A();
      cmh $$4 = cmh.f;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cmh $$6;
         cmc $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.b()) {
               $$7 = $$6.d();
               if ($$1.contains($$7)) {
                  if ($$6.L() > $$6.g() / 2) {
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
         $$4 = new cmh($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bno.a($$0, $$4, $$2.dk());
      }
   }
}
