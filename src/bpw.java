import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bpw extends bnm<blv> {
   public static final int c = 100;
   private long d;

   public bpw() {
      super(ImmutableMap.of(bux.b, buy.a, bux.H, buy.c));
   }

   @Override
   protected boolean a(amp $$0, blv $$1) {
      if ($$1.bO()) {
         return false;
      } else {
         bmv<?> $$2 = $$1.dO();
         id $$3 = $$2.c(bux.b).get();
         if ($$0.ad() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bux.H);
            if ($$4.isPresent()) {
               long $$5 = $$0.W() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dip $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dk(), 2.0) && $$6.a(arr.R) && !$$6.c(cvs.c);
         }
      }
   }

   @Override
   protected boolean a(amp $$0, blv $$1, long $$2) {
      Optional<id> $$3 = $$1.dO().c(bux.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hv $$4 = $$3.get().b();
         return $$1.dO().c(cgd.e) && $$1.dt() > (double)$$4.v() + 0.4 && $$4.a($$1.dk(), 1.14);
      }
   }

   @Override
   protected void d(amp $$0, blv $$1, long $$2) {
      if ($$2 > this.d) {
         bmv<?> $$3 = $$1.dO();
         if ($$3.a(bux.v)) {
            Set<id> $$4 = $$3.c(bux.v).get();
            Optional<List<blv>> $$5;
            if ($$3.a(bux.g)) {
               $$5 = $$3.c(bux.g);
            } else {
               $$5 = Optional.empty();
            }

            bok.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dO().c(bux.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(amp $$0, blv $$1, long $$2) {
      if ($$1.fD()) {
         $$1.fE();
         this.d = $$2 + 40L;
      }
   }
}
