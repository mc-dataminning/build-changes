import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class buv extends bsl<bqt> {
   public static final int c = 100;
   private long d;

   public buv() {
      super(ImmutableMap.of(bzw.b, bzx.a, bzw.I, bzx.c));
   }

   @Override
   protected boolean a(apu $$0, bqt $$1) {
      if ($$1.bO()) {
         return false;
      } else {
         bru<?> $$2 = $$1.dP();
         im $$3 = $$2.c(bzw.b).get();
         if ($$0.ae() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bzw.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.Y() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dpi $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dk(), 2.0) && $$6.a(ave.R) && !$$6.c(dca.c);
         }
      }
   }

   @Override
   protected boolean a(apu $$0, bqt $$1, long $$2) {
      Optional<im> $$3 = $$1.dP().c(bzw.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         id $$4 = $$3.get().b();
         return $$1.dP().c(clp.e) && $$1.dt() > (double)$$4.v() + 0.4 && $$4.a($$1.dk(), 1.14);
      }
   }

   @Override
   protected void d(apu $$0, bqt $$1, long $$2) {
      if ($$2 > this.d) {
         bru<?> $$3 = $$1.dP();
         if ($$3.a(bzw.v)) {
            Set<im> $$4 = $$3.c(bzw.v).get();
            Optional<List<bqt>> $$5;
            if ($$3.a(bzw.g)) {
               $$5 = $$3.c(bzw.g);
            } else {
               $$5 = Optional.empty();
            }

            btj.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dP().c(bzw.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(apu $$0, bqt $$1, long $$2) {
      if ($$1.fI()) {
         $$1.fJ();
         this.d = $$2 + 40L;
      }
   }
}
