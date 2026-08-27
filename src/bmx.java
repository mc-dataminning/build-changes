import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bmx extends bko<biw> {
   public static final int c = 100;
   private long d;

   public bmx() {
      super(ImmutableMap.of(bry.b, brz.a, bry.H, brz.c));
   }

   @Override
   protected boolean a(aki $$0, biw $$1) {
      if ($$1.bN()) {
         return false;
      } else {
         bjx<?> $$2 = $$1.dM();
         he $$3 = $$2.c(bry.b).get();
         if ($$0.ac() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bry.H);
            if ($$4.isPresent()) {
               long $$5 = $$0.V() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dey $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.di(), 2.0) && $$6.a(apj.R) && !$$6.c(csd.b);
         }
      }
   }

   @Override
   protected boolean a(aki $$0, biw $$1, long $$2) {
      Optional<he> $$3 = $$1.dM().c(bry.b);
      if (!$$3.isPresent()) {
         return false;
      } else {
         gv $$4 = $$3.get().b();
         return $$1.dM().c(ccw.e) && $$1.dr() > (double)$$4.v() + 0.4 && $$4.a($$1.di(), 1.14);
      }
   }

   @Override
   protected void d(aki $$0, biw $$1, long $$2) {
      if ($$2 > this.d) {
         bjx<?> $$3 = $$1.dM();
         if ($$3.a(bry.v)) {
            Set<he> $$4 = $$3.c(bry.v).get();
            Optional<List<biw>> $$5;
            if ($$3.a(bry.g)) {
               $$5 = $$3.c(bry.g);
            } else {
               $$5 = Optional.empty();
            }

            blm.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dM().c(bry.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aki $$0, biw $$1, long $$2) {
      if ($$1.fB()) {
         $$1.fC();
         this.d = $$2 + 40L;
      }
   }
}
