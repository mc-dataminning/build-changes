import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bnb extends bks<bjb> {
   public static final int c = 100;
   private long d;

   public bnb() {
      super(ImmutableMap.of(bsc.b, bsd.a, bsc.H, bsd.c));
   }

   @Override
   protected boolean a(akn $$0, bjb $$1) {
      if ($$1.bN()) {
         return false;
      } else {
         bkb<?> $$2 = $$1.dM();
         hf $$3 = $$2.c(bsc.b).get();
         if ($$0.ac() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bsc.H);
            if ($$4.isPresent()) {
               long $$5 = $$0.V() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dfe $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.di(), 2.0) && $$6.a(apo.R) && !$$6.c(csj.b);
         }
      }
   }

   @Override
   protected boolean a(akn $$0, bjb $$1, long $$2) {
      Optional<hf> $$3 = $$1.dM().c(bsc.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         gw $$4 = $$3.get().b();
         return $$1.dM().c(cda.e) && $$1.dr() > (double)$$4.v() + 0.4 && $$4.a($$1.di(), 1.14);
      }
   }

   @Override
   protected void d(akn $$0, bjb $$1, long $$2) {
      if ($$2 > this.d) {
         bkb<?> $$3 = $$1.dM();
         if ($$3.a(bsc.v)) {
            Set<hf> $$4 = $$3.c(bsc.v).get();
            Optional<List<bjb>> $$5;
            if ($$3.a(bsc.g)) {
               $$5 = $$3.c(bsc.g);
            } else {
               $$5 = Optional.empty();
            }

            blq.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dM().c(bsc.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(akn $$0, bjb $$1, long $$2) {
      if ($$1.fB()) {
         $$1.fC();
         this.d = $$2 + 40L;
      }
   }
}
