import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bnj extends bkp<caz> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<cis> e = ImmutableSet.of();

   public bnj() {
      super(ImmutableMap.of(brz.q, bsa.a, brz.h, bsa.a));
   }

   protected boolean a(akk $$0, caz $$1) {
      return bkr.a($$1.dM(), brz.q, bim.bf);
   }

   protected boolean a(akk $$0, caz $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(akk $$0, caz $$1, long $$2) {
      caz $$3 = (caz)$$1.dM().c(brz.q).get();
      bkr.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(akk $$0, caz $$1, long $$2) {
      caz $$3 = (caz)$$1.dM().c(brz.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bkr.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gs() && ($$1.gl().b() == cbc.g || $$3.gt())) {
            a($$1, caz.bW.keySet(), $$3);
         }

         if ($$3.gl().b() == cbc.g && $$1.t().a_(cja.oI) > cja.oI.l() / 2) {
            a($$1, ImmutableSet.of(cja.oI), $$3);
         }

         if (!this.e.isEmpty() && $$1.t().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(akk $$0, caz $$1, long $$2) {
      $$1.dM().b(brz.q);
   }

   private static Set<cis> a(caz $$0, caz $$1) {
      ImmutableSet<cis> $$2 = $$1.gl().b().d();
      ImmutableSet<cis> $$3 = $$0.gl().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(caz $$0, Set<cis> $$1, biy $$2) {
      bgx $$3 = $$0.t();
      cix $$4 = cix.b;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cix $$6;
         cis $$7;
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
         $$4 = new cix($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bkr.a($$0, $$4, $$2.di());
      }
   }
}
