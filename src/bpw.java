import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bpw extends bnc<cdm> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<clj> e = ImmutableSet.of();

   public bpw() {
      super(ImmutableMap.of(bum.q, bun.a, bum.h, bun.a));
   }

   protected boolean a(ami $$0, cdm $$1) {
      return bne.a($$1.dP(), bum.q, bkz.bf);
   }

   protected boolean a(ami $$0, cdm $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ami $$0, cdm $$1, long $$2) {
      cdm $$3 = (cdm)$$1.dP().c(bum.q).get();
      bne.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(ami $$0, cdm $$1, long $$2) {
      cdm $$3 = (cdm)$$1.dP().c(bum.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bne.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gx() && ($$1.gq().b() == cdp.g || $$3.gy())) {
            a($$1, cdm.bW.keySet(), $$3);
         }

         if ($$3.gq().b() == cdp.g && $$1.A().a_(clr.pt) > clr.pt.l() / 2) {
            a($$1, ImmutableSet.of(clr.pt), $$3);
         }

         if (!this.e.isEmpty() && $$1.A().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(ami $$0, cdm $$1, long $$2) {
      $$1.dP().b(bum.q);
   }

   private static Set<clj> a(cdm $$0, cdm $$1) {
      ImmutableSet<clj> $$2 = $$1.gq().b().d();
      ImmutableSet<clj> $$3 = $$0.gq().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cdm $$0, Set<clj> $$1, bll $$2) {
      bjj $$3 = $$0.A();
      clo $$4 = clo.b;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         clo $$6;
         clj $$7;
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
         $$4 = new clo($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bne.a($$0, $$4, $$2.dl());
      }
   }
}
