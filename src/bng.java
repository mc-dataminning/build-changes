import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bng extends bkx<bjg> {
   public static final int c = 100;
   private long d;

   public bng() {
      super(ImmutableMap.of(bsh.b, bsi.a, bsh.H, bsi.c));
   }

   @Override
   protected boolean a(akq $$0, bjg $$1) {
      if ($$1.bN()) {
         return false;
      } else {
         bkg<?> $$2 = $$1.dN();
         hd $$3 = $$2.c(bsh.b).get();
         if ($$0.ac() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bsh.H);
            if ($$4.isPresent()) {
               long $$5 = $$0.V() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dfj $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dj(), 2.0) && $$6.a(aps.R) && !$$6.c(cso.b);
         }
      }
   }

   @Override
   protected boolean a(akq $$0, bjg $$1, long $$2) {
      Optional<hd> $$3 = $$1.dN().c(bsh.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         gw $$4 = $$3.get().b();
         return $$1.dN().c(cdf.e) && $$1.ds() > (double)$$4.v() + 0.4 && $$4.a($$1.dj(), 1.14);
      }
   }

   @Override
   protected void d(akq $$0, bjg $$1, long $$2) {
      if ($$2 > this.d) {
         bkg<?> $$3 = $$1.dN();
         if ($$3.a(bsh.v)) {
            Set<hd> $$4 = $$3.c(bsh.v).get();
            Optional<List<bjg>> $$5;
            if ($$3.a(bsh.g)) {
               $$5 = $$3.c(bsh.g);
            } else {
               $$5 = Optional.empty();
            }

            blv.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dN().c(bsh.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(akq $$0, bjg $$1, long $$2) {
      if ($$1.fC()) {
         $$1.fD();
         this.d = $$2 + 40L;
      }
   }
}
