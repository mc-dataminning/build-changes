import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bxp extends bvf<btl> {
   public static final int c = 100;
   private long d;

   public bxp() {
      super(ImmutableMap.of(ccq.b, ccr.a, ccq.I, ccr.c));
   }

   @Override
   protected boolean a(aqt $$0, btl $$1) {
      if ($$1.bS()) {
         return false;
      } else {
         buo<?> $$2 = $$1.dU();
         jl $$3 = $$2.c(ccq.b).get();
         if ($$0.af() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(ccq.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.Z() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dta $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.do(), 2.0) && $$6.a(awd.R) && !$$6.c(dfp.c);
         }
      }
   }

   @Override
   protected boolean a(aqt $$0, btl $$1, long $$2) {
      Optional<jl> $$3 = $$1.dU().c(ccq.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jd $$4 = $$3.get().b();
         return $$1.dU().c(cok.e) && $$1.dx() > (double)$$4.v() + 0.4 && $$4.a($$1.do(), 1.14);
      }
   }

   @Override
   protected void d(aqt $$0, btl $$1, long $$2) {
      if ($$2 > this.d) {
         buo<?> $$3 = $$1.dU();
         if ($$3.a(ccq.v)) {
            Set<jl> $$4 = $$3.c(ccq.v).get();
            Optional<List<btl>> $$5;
            if ($$3.a(ccq.g)) {
               $$5 = $$3.c(ccq.g);
            } else {
               $$5 = Optional.empty();
            }

            bwd.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dU().c(ccq.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aqt $$0, btl $$1, long $$2) {
      if ($$1.fI()) {
         $$1.fJ();
         this.d = $$2 + 40L;
      }
   }
}
