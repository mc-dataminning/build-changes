import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzd extends bwt<bva> {
   public static final int c = 100;
   private long d;

   public bzd() {
      super(ImmutableMap.of(cee.b, cef.a, cee.I, cef.c));
   }

   @Override
   protected boolean a(arn $$0, bva $$1) {
      if ($$1.ca()) {
         return false;
      } else {
         bwc<?> $$2 = $$1.ed();
         jp $$3 = $$2.c(cee.b).get();
         if ($$0.ag() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cee.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.aa() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dvj $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dv(), 2.0) && $$6.a(axa.S) && !$$6.c(dhx.c);
         }
      }
   }

   @Override
   protected boolean a(arn $$0, bva $$1, long $$2) {
      Optional<jp> $$3 = $$1.ed().c(cee.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get().b();
         return $$1.ed().c(cqe.e) && $$1.dE() > (double)$$4.v() + 0.4 && $$4.a($$1.dv(), 1.14);
      }
   }

   @Override
   protected void d(arn $$0, bva $$1, long $$2) {
      if ($$2 > this.d) {
         bwc<?> $$3 = $$1.ed();
         if ($$3.a(cee.v)) {
            Set<jp> $$4 = $$3.c(cee.v).get();
            Optional<List<bva>> $$5;
            if ($$3.a(cee.g)) {
               $$5 = $$3.c(cee.g);
            } else {
               $$5 = Optional.empty();
            }

            bxr.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.ed().c(cee.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(arn $$0, bva $$1, long $$2) {
      if ($$1.fT()) {
         $$1.fU();
         this.d = $$2 + 40L;
      }
   }
}
