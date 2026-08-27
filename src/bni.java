import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bni extends bko<cay> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<cir> e = ImmutableSet.of();

   public bni() {
      super(ImmutableMap.of(bry.q, brz.a, bry.h, brz.a));
   }

   protected boolean a(aki $$0, cay $$1) {
      return bkq.a($$1.dM(), bry.q, bik.bf);
   }

   protected boolean a(aki $$0, cay $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aki $$0, cay $$1, long $$2) {
      cay $$3 = (cay)$$1.dM().c(bry.q).get();
      bkq.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(aki $$0, cay $$1, long $$2) {
      cay $$3 = (cay)$$1.dM().c(bry.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bkq.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gr() && ($$1.gk().b() == cbb.g || $$3.gs())) {
            a($$1, cay.bW.keySet(), $$3);
         }

         if ($$3.gk().b() == cbb.g && $$1.t().a_(ciz.oI) > ciz.oI.l() / 2) {
            a($$1, ImmutableSet.of(ciz.oI), $$3);
         }

         if (!this.e.isEmpty() && $$1.t().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(aki $$0, cay $$1, long $$2) {
      $$1.dM().b(bry.q);
   }

   private static Set<cir> a(cay $$0, cay $$1) {
      ImmutableSet<cir> $$2 = $$1.gk().b().d();
      ImmutableSet<cir> $$3 = $$0.gk().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cay $$0, Set<cir> $$1, biw $$2) {
      bgv $$3 = $$0.t();
      ciw $$4 = ciw.b;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         ciw $$6;
         cir $$7;
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
         $$4 = new ciw($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bkq.a($$0, $$4, $$2.di());
      }
   }
}
