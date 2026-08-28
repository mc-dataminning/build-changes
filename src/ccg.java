import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccg extends bzw<byf> {
   public static final int c = 100;
   private long d;

   public ccg() {
      super(ImmutableMap.of(chh.b, chi.a, chh.J, chi.c));
   }

   @Override
   protected boolean a(asb $$0, byf $$1) {
      if ($$1.bY()) {
         return false;
      } else {
         bzf<?> $$2 = $$1.ec();
         jf $$3 = $$2.c(chh.b).get();
         if ($$0.aj() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(chh.J);
            if ($$4.isPresent()) {
               long $$5 = $$0.ae() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            ebq $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dt(), 2.0) && $$6.a(axn.T) && !$$6.c(dnh.c);
         }
      }
   }

   @Override
   protected boolean a(asb $$0, byf $$1, long $$2) {
      Optional<jf> $$3 = $$1.ec().c(chh.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iw $$4 = $$3.get().b();
         return $$1.ec().c(cuc.e) && $$1.dC() > (double)$$4.v() + 0.4 && $$4.a($$1.dt(), 1.14);
      }
   }

   @Override
   protected void d(asb $$0, byf $$1, long $$2) {
      if ($$2 > this.d) {
         bzf<?> $$3 = $$1.ec();
         if ($$3.a(chh.w)) {
            Set<jf> $$4 = $$3.c(chh.w).get();
            Optional<List<byf>> $$5;
            if ($$3.a(chh.g)) {
               $$5 = $$3.c(chh.g);
            } else {
               $$5 = Optional.empty();
            }

            cau.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.ec().c(chh.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(asb $$0, byf $$1, long $$2) {
      if ($$1.fR()) {
         $$1.fS();
         this.d = $$2 + 40L;
      }
   }
}
