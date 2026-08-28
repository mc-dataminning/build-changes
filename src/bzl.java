import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzl extends bxb<bvi> {
   public static final int c = 100;
   private long d;

   public bzl() {
      super(ImmutableMap.of(cem.b, cen.a, cem.I, cen.c));
   }

   @Override
   protected boolean a(ard $$0, bvi $$1) {
      if ($$1.bZ()) {
         return false;
      } else {
         bwk<?> $$2 = $$1.eb();
         jq $$3 = $$2.c(cem.b).get();
         if ($$0.ai() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cem.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.ad() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dwy $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dt(), 2.0) && $$6.a(awp.T) && !$$6.c(djg.c);
         }
      }
   }

   @Override
   protected boolean a(ard $$0, bvi $$1, long $$2) {
      Optional<jq> $$3 = $$1.eb().c(cem.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ji $$4 = $$3.get().b();
         return $$1.eb().c(cqp.e) && $$1.dC() > (double)$$4.v() + 0.4 && $$4.a($$1.dt(), 1.14);
      }
   }

   @Override
   protected void d(ard $$0, bvi $$1, long $$2) {
      if ($$2 > this.d) {
         bwk<?> $$3 = $$1.eb();
         if ($$3.a(cem.v)) {
            Set<jq> $$4 = $$3.c(cem.v).get();
            Optional<List<bvi>> $$5;
            if ($$3.a(cem.g)) {
               $$5 = $$3.c(cem.g);
            } else {
               $$5 = Optional.empty();
            }

            bxz.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.eb().c(cem.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(ard $$0, bvi $$1, long $$2) {
      if ($$1.fR()) {
         $$1.fS();
         this.d = $$2 + 40L;
      }
   }
}
