import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bmz extends bkq<biy> {
   public static final int c = 100;
   private long d;

   public bmz() {
      super(ImmutableMap.of(bsa.b, bsb.a, bsa.H, bsb.c));
   }

   @Override
   protected boolean a(akk $$0, biy $$1) {
      if ($$1.bN()) {
         return false;
      } else {
         bjz<?> $$2 = $$1.dM();
         hd $$3 = $$2.c(bsa.b).get();
         if ($$0.ac() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bsa.H);
            if ($$4.isPresent()) {
               long $$5 = $$0.V() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dfa $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.di(), 2.0) && $$6.a(apl.R) && !$$6.c(csf.b);
         }
      }
   }

   @Override
   protected boolean a(akk $$0, biy $$1, long $$2) {
      Optional<hd> $$3 = $$1.dM().c(bsa.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         gu $$4 = $$3.get().b();
         return $$1.dM().c(ccy.e) && $$1.dr() > (double)$$4.v() + 0.4 && $$4.a($$1.di(), 1.14);
      }
   }

   @Override
   protected void d(akk $$0, biy $$1, long $$2) {
      if ($$2 > this.d) {
         bjz<?> $$3 = $$1.dM();
         if ($$3.a(bsa.v)) {
            Set<hd> $$4 = $$3.c(bsa.v).get();
            Optional<List<biy>> $$5;
            if ($$3.a(bsa.g)) {
               $$5 = $$3.c(bsa.g);
            } else {
               $$5 = Optional.empty();
            }

            blo.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dM().c(bsa.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(akk $$0, biy $$1, long $$2) {
      if ($$1.fB()) {
         $$1.fC();
         this.d = $$2 + 40L;
      }
   }
}
