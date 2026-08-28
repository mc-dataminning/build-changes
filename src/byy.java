import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class byy extends bwo<buv> {
   public static final int c = 100;
   private long d;

   public byy() {
      super(ImmutableMap.of(cdz.b, cea.a, cdz.I, cea.c));
   }

   @Override
   protected boolean a(arm $$0, buv $$1) {
      if ($$1.ca()) {
         return false;
      } else {
         bvx<?> $$2 = $$1.ed();
         jo $$3 = $$2.c(cdz.b).get();
         if ($$0.ag() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cdz.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.aa() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dvd $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dv(), 2.0) && $$6.a(awz.S) && !$$6.c(dhr.c);
         }
      }
   }

   @Override
   protected boolean a(arm $$0, buv $$1, long $$2) {
      Optional<jo> $$3 = $$1.ed().c(cdz.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jg $$4 = $$3.get().b();
         return $$1.ed().c(cpz.e) && $$1.dE() > (double)$$4.v() + 0.4 && $$4.a($$1.dv(), 1.14);
      }
   }

   @Override
   protected void d(arm $$0, buv $$1, long $$2) {
      if ($$2 > this.d) {
         bvx<?> $$3 = $$1.ed();
         if ($$3.a(cdz.v)) {
            Set<jo> $$4 = $$3.c(cdz.v).get();
            Optional<List<buv>> $$5;
            if ($$3.a(cdz.g)) {
               $$5 = $$3.c(cdz.g);
            } else {
               $$5 = Optional.empty();
            }

            bxm.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.ed().c(cdz.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(arm $$0, buv $$1, long $$2) {
      if ($$1.fT()) {
         $$1.fU();
         this.d = $$2 + 40L;
      }
   }
}
