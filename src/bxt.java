import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bxt extends bvj<btq> {
   public static final int c = 100;
   private long d;

   public bxt() {
      super(ImmutableMap.of(ccu.b, ccv.a, ccu.I, ccv.c));
   }

   @Override
   protected boolean a(arf $$0, btq $$1) {
      if ($$1.bR()) {
         return false;
      } else {
         bus<?> $$2 = $$1.dS();
         jh $$3 = $$2.c(ccu.b).get();
         if ($$0.af() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(ccu.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.Z() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dsd $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dn(), 2.0) && $$6.a(awp.R) && !$$6.c(det.c);
         }
      }
   }

   @Override
   protected boolean a(arf $$0, btq $$1, long $$2) {
      Optional<jh> $$3 = $$1.dS().c(ccu.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iz $$4 = $$3.get().b();
         return $$1.dS().c(coo.e) && $$1.dw() > (double)$$4.v() + 0.4 && $$4.a($$1.dn(), 1.14);
      }
   }

   @Override
   protected void d(arf $$0, btq $$1, long $$2) {
      if ($$2 > this.d) {
         bus<?> $$3 = $$1.dS();
         if ($$3.a(ccu.v)) {
            Set<jh> $$4 = $$3.c(ccu.v).get();
            Optional<List<btq>> $$5;
            if ($$3.a(ccu.g)) {
               $$5 = $$3.c(ccu.g);
            } else {
               $$5 = Optional.empty();
            }

            bwh.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dS().c(ccu.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(arf $$0, btq $$1, long $$2) {
      if ($$1.fL()) {
         $$1.fM();
         this.d = $$2 + 40L;
      }
   }
}
