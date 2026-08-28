import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cas extends byi<bwr> {
   public static final int c = 100;
   private long d;

   public cas() {
      super(ImmutableMap.of(cft.b, cfu.a, cft.J, cfu.c));
   }

   @Override
   protected boolean a(arn $$0, bwr $$1) {
      if ($$1.bZ()) {
         return false;
      } else {
         bxr<?> $$2 = $$1.eb();
         jr $$3 = $$2.c(cft.b).get();
         if ($$0.aj() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cft.J);
            if ($$4.isPresent()) {
               long $$5 = $$0.ae() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dym $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dt(), 2.0) && $$6.a(awz.T) && !$$6.c(dkn.c);
         }
      }
   }

   @Override
   protected boolean a(arn $$0, bwr $$1, long $$2) {
      Optional<jr> $$3 = $$1.eb().c(cft.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jj $$4 = $$3.get().b();
         return $$1.eb().c(crz.e) && $$1.dC() > (double)$$4.v() + 0.4 && $$4.a($$1.dt(), 1.14);
      }
   }

   @Override
   protected void d(arn $$0, bwr $$1, long $$2) {
      if ($$2 > this.d) {
         bxr<?> $$3 = $$1.eb();
         if ($$3.a(cft.w)) {
            Set<jr> $$4 = $$3.c(cft.w).get();
            Optional<List<bwr>> $$5;
            if ($$3.a(cft.g)) {
               $$5 = $$3.c(cft.g);
            } else {
               $$5 = Optional.empty();
            }

            bzg.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.eb().c(cft.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(arn $$0, bwr $$1, long $$2) {
      if ($$1.fQ()) {
         $$1.fR();
         this.d = $$2 + 40L;
      }
   }
}
