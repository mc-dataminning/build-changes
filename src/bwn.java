import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bwn extends bts<cku> {
   private Set<csu> c = ImmutableSet.of();

   public bwn() {
      super(ImmutableMap.of(cbd.q, cbe.a, cbd.h, cbe.a));
   }

   protected boolean a(aqh $$0, cku $$1) {
      return btu.a($$1.dQ(), cbd.q, brn.bi);
   }

   protected boolean a(aqh $$0, cku $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqh $$0, cku $$1, long $$2) {
      cku $$3 = (cku)$$1.dQ().c(cbd.q).get();
      btu.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aqh $$0, cku $$1, long $$2) {
      cku $$3 = (cku)$$1.dQ().c(cbd.q).get();
      if (!($$1.g($$3) > 5.0)) {
         btu.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gH() && ($$1.gA().b() == ckx.g || $$3.gI())) {
            a($$1, cku.cb.keySet(), $$3);
         }

         if ($$3.gA().b() == ckx.g && $$1.y().a_(ctc.pw) > ctc.pw.p() / 2) {
            a($$1, ImmutableSet.of(ctc.pw), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aqh $$0, cku $$1, long $$2) {
      $$1.dQ().b(cbd.q);
   }

   private static Set<csu> a(cku $$0, cku $$1) {
      ImmutableSet<csu> $$2 = $$1.gA().b().d();
      ImmutableSet<csu> $$3 = $$0.gA().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cku $$0, Set<csu> $$1, bsa $$2) {
      bpv $$3 = $$0.y();
      csz $$4 = csz.i;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         csz $$6;
         csu $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.d()) {
               $$7 = $$6.f();
               if ($$1.contains($$7)) {
                  if ($$6.G() > $$6.i() / 2) {
                     $$8 = $$6.G() / 2;
                     break label28;
                  }

                  if ($$6.G() > 24) {
                     $$8 = $$6.G() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new csz($$7, $$8);
         break;
      }

      if (!$$4.d()) {
         btu.a($$0, $$4, $$2.dl());
      }
   }
}
