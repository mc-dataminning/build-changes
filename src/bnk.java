import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bnk extends bkq<cba> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<cit> e = ImmutableSet.of();

   public bnk() {
      super(ImmutableMap.of(bsa.q, bsb.a, bsa.h, bsb.a));
   }

   protected boolean a(akk $$0, cba $$1) {
      return bks.a($$1.dM(), bsa.q, bim.bf);
   }

   protected boolean a(akk $$0, cba $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(akk $$0, cba $$1, long $$2) {
      cba $$3 = (cba)$$1.dM().c(bsa.q).get();
      bks.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(akk $$0, cba $$1, long $$2) {
      cba $$3 = (cba)$$1.dM().c(bsa.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bks.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gr() && ($$1.gk().b() == cbd.g || $$3.gs())) {
            a($$1, cba.bW.keySet(), $$3);
         }

         if ($$3.gk().b() == cbd.g && $$1.t().a_(cjb.oI) > cjb.oI.l() / 2) {
            a($$1, ImmutableSet.of(cjb.oI), $$3);
         }

         if (!this.e.isEmpty() && $$1.t().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(akk $$0, cba $$1, long $$2) {
      $$1.dM().b(bsa.q);
   }

   private static Set<cit> a(cba $$0, cba $$1) {
      ImmutableSet<cit> $$2 = $$1.gk().b().d();
      ImmutableSet<cit> $$3 = $$0.gk().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cba $$0, Set<cit> $$1, biy $$2) {
      bgx $$3 = $$0.t();
      ciy $$4 = ciy.b;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         ciy $$6;
         cit $$7;
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
         $$4 = new ciy($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bks.a($$0, $$4, $$2.di());
      }
   }
}
