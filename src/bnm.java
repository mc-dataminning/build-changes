import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bnm extends bks<cbc> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<civ> e = ImmutableSet.of();

   public bnm() {
      super(ImmutableMap.of(bsc.q, bsd.a, bsc.h, bsd.a));
   }

   protected boolean a(akn $$0, cbc $$1) {
      return bku.a($$1.dM(), bsc.q, bip.bf);
   }

   protected boolean a(akn $$0, cbc $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(akn $$0, cbc $$1, long $$2) {
      cbc $$3 = (cbc)$$1.dM().c(bsc.q).get();
      bku.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(akn $$0, cbc $$1, long $$2) {
      cbc $$3 = (cbc)$$1.dM().c(bsc.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bku.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gs() && ($$1.gl().b() == cbf.g || $$3.gt())) {
            a($$1, cbc.bW.keySet(), $$3);
         }

         if ($$3.gl().b() == cbf.g && $$1.t().a_(cjd.oI) > cjd.oI.l() / 2) {
            a($$1, ImmutableSet.of(cjd.oI), $$3);
         }

         if (!this.e.isEmpty() && $$1.t().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(akn $$0, cbc $$1, long $$2) {
      $$1.dM().b(bsc.q);
   }

   private static Set<civ> a(cbc $$0, cbc $$1) {
      ImmutableSet<civ> $$2 = $$1.gl().b().d();
      ImmutableSet<civ> $$3 = $$0.gl().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cbc $$0, Set<civ> $$1, bjb $$2) {
      bha $$3 = $$0.t();
      cja $$4 = cja.b;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cja $$6;
         civ $$7;
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
         $$4 = new cja($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bku.a($$0, $$4, $$2.di());
      }
   }
}
