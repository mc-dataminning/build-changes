import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class caj extends bxz<bwg> {
   public static final int c = 100;
   private long d;

   public caj() {
      super(ImmutableMap.of(cfk.b, cfl.a, cfk.I, cfl.c));
   }

   @Override
   protected boolean a(ash $$0, bwg $$1) {
      if ($$1.bZ()) {
         return false;
      } else {
         bxi<?> $$2 = $$1.ec();
         jp $$3 = $$2.c(cfk.b).get();
         if ($$0.ah() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cfk.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.ac() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dxv $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.du(), 2.0) && $$6.a(axu.T) && !$$6.c(dkf.c);
         }
      }
   }

   @Override
   protected boolean a(ash $$0, bwg $$1, long $$2) {
      Optional<jp> $$3 = $$1.ec().c(cfk.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get().b();
         return $$1.ec().c(cro.e) && $$1.dD() > (double)$$4.v() + 0.4 && $$4.a($$1.du(), 1.14);
      }
   }

   @Override
   protected void d(ash $$0, bwg $$1, long $$2) {
      if ($$2 > this.d) {
         bxi<?> $$3 = $$1.ec();
         if ($$3.a(cfk.v)) {
            Set<jp> $$4 = $$3.c(cfk.v).get();
            Optional<List<bwg>> $$5;
            if ($$3.a(cfk.g)) {
               $$5 = $$3.c(cfk.g);
            } else {
               $$5 = Optional.empty();
            }

            byx.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.ec().c(cfk.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(ash $$0, bwg $$1, long $$2) {
      if ($$1.fR()) {
         $$1.fS();
         this.d = $$2 + 40L;
      }
   }
}
