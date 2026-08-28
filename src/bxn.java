import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bxn extends bvd<btk> {
   public static final int c = 100;
   private long d;

   public bxn() {
      super(ImmutableMap.of(cco.b, ccp.a, cco.I, ccp.c));
   }

   @Override
   protected boolean a(arb $$0, btk $$1) {
      if ($$1.bR()) {
         return false;
      } else {
         bum<?> $$2 = $$1.dS();
         jh $$3 = $$2.c(cco.b).get();
         if ($$0.af() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cco.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.Z() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            drx $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dn(), 2.0) && $$6.a(awl.R) && !$$6.c(den.c);
         }
      }
   }

   @Override
   protected boolean a(arb $$0, btk $$1, long $$2) {
      Optional<jh> $$3 = $$1.dS().c(cco.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iz $$4 = $$3.get().b();
         return $$1.dS().c(coh.e) && $$1.dw() > (double)$$4.v() + 0.4 && $$4.a($$1.dn(), 1.14);
      }
   }

   @Override
   protected void d(arb $$0, btk $$1, long $$2) {
      if ($$2 > this.d) {
         bum<?> $$3 = $$1.dS();
         if ($$3.a(cco.v)) {
            Set<jh> $$4 = $$3.c(cco.v).get();
            Optional<List<btk>> $$5;
            if ($$3.a(cco.g)) {
               $$5 = $$3.c(cco.g);
            } else {
               $$5 = Optional.empty();
            }

            bwb.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dS().c(cco.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(arb $$0, btk $$1, long $$2) {
      if ($$1.fL()) {
         $$1.fM();
         this.d = $$2 + 40L;
      }
   }
}
