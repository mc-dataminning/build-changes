import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bqr extends bnw<ceo> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<cmm> e = ImmutableSet.of();

   public bqr() {
      super(ImmutableMap.of(bvh.q, bvi.a, bvh.h, bvi.a));
   }

   protected boolean a(amz $$0, ceo $$1) {
      return bny.a($$1.dO(), bvh.q, blt.bg);
   }

   protected boolean a(amz $$0, ceo $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(amz $$0, ceo $$1, long $$2) {
      ceo $$3 = (ceo)$$1.dO().c(bvh.q).get();
      bny.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(amz $$0, ceo $$1, long $$2) {
      ceo $$3 = (ceo)$$1.dO().c(bvh.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bny.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gw() && ($$1.gp().b() == cer.g || $$3.gx())) {
            a($$1, ceo.bW.keySet(), $$3);
         }

         if ($$3.gp().b() == cer.g && $$1.A().a_(cmu.pt) > cmu.pt.l() / 2) {
            a($$1, ImmutableSet.of(cmu.pt), $$3);
         }

         if (!this.e.isEmpty() && $$1.A().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(amz $$0, ceo $$1, long $$2) {
      $$1.dO().b(bvh.q);
   }

   private static Set<cmm> a(ceo $$0, ceo $$1) {
      ImmutableSet<cmm> $$2 = $$1.gp().b().d();
      ImmutableSet<cmm> $$3 = $$0.gp().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(ceo $$0, Set<cmm> $$1, bmf $$2) {
      bkd $$3 = $$0.A();
      cmr $$4 = cmr.f;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cmr $$6;
         cmm $$7;
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
         $$4 = new cmr($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bny.a($$0, $$4, $$2.dk());
      }
   }
}
