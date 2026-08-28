import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cai extends bxy<bwf> {
   public static final int c = 100;
   private long d;

   public cai() {
      super(ImmutableMap.of(cfj.b, cfk.a, cfj.I, cfk.c));
   }

   @Override
   protected boolean a(ash $$0, bwf $$1) {
      if ($$1.bZ()) {
         return false;
      } else {
         bxh<?> $$2 = $$1.eb();
         jp $$3 = $$2.c(cfj.b).get();
         if ($$0.ah() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cfj.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.ac() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dxu $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dt(), 2.0) && $$6.a(axu.T) && !$$6.c(dke.c);
         }
      }
   }

   @Override
   protected boolean a(ash $$0, bwf $$1, long $$2) {
      Optional<jp> $$3 = $$1.eb().c(cfj.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get().b();
         return $$1.eb().c(crn.e) && $$1.dC() > (double)$$4.v() + 0.4 && $$4.a($$1.dt(), 1.14);
      }
   }

   @Override
   protected void d(ash $$0, bwf $$1, long $$2) {
      if ($$2 > this.d) {
         bxh<?> $$3 = $$1.eb();
         if ($$3.a(cfj.v)) {
            Set<jp> $$4 = $$3.c(cfj.v).get();
            Optional<List<bwf>> $$5;
            if ($$3.a(cfj.g)) {
               $$5 = $$3.c(cfj.g);
            } else {
               $$5 = Optional.empty();
            }

            byw.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.eb().c(cfj.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(ash $$0, bwf $$1, long $$2) {
      if ($$1.fP()) {
         $$1.fQ();
         this.d = $$2 + 40L;
      }
   }
}
