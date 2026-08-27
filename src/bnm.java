import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bnm extends bld<bjm> {
   public static final int c = 100;
   private long d;

   public bnm() {
      super(ImmutableMap.of(bsn.b, bso.a, bsn.H, bso.c));
   }

   @Override
   protected boolean a(akt $$0, bjm $$1) {
      if ($$1.bN()) {
         return false;
      } else {
         bkm<?> $$2 = $$1.dN();
         hd $$3 = $$2.c(bsn.b).get();
         if ($$0.ac() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bsn.H);
            if ($$4.isPresent()) {
               long $$5 = $$0.V() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dfd $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dj(), 2.0) && $$6.a(apv.R) && !$$6.c(csv.c);
         }
      }
   }

   @Override
   protected boolean a(akt $$0, bjm $$1, long $$2) {
      Optional<hd> $$3 = $$1.dN().c(bsn.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         gw $$4 = $$3.get().b();
         return $$1.dN().c(cdl.e) && $$1.ds() > (double)$$4.v() + 0.4 && $$4.a($$1.dj(), 1.14);
      }
   }

   @Override
   protected void d(akt $$0, bjm $$1, long $$2) {
      if ($$2 > this.d) {
         bkm<?> $$3 = $$1.dN();
         if ($$3.a(bsn.v)) {
            Set<hd> $$4 = $$3.c(bsn.v).get();
            Optional<List<bjm>> $$5;
            if ($$3.a(bsn.g)) {
               $$5 = $$3.c(bsn.g);
            } else {
               $$5 = Optional.empty();
            }

            bmb.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dN().c(bsn.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(akt $$0, bjm $$1, long $$2) {
      if ($$1.fD()) {
         $$1.fE();
         this.d = $$2 + 40L;
      }
   }
}
