import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class boj extends bma<bkj> {
   public static final int c = 100;
   private long d;

   public boj() {
      super(ImmutableMap.of(btk.b, btl.a, btk.H, btl.c));
   }

   @Override
   protected boolean a(alq $$0, bkj $$1) {
      if ($$1.bN()) {
         return false;
      } else {
         blj<?> $$2 = $$1.dN();
         ia $$3 = $$2.c(btk.b).get();
         if ($$0.ac() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(btk.H);
            if ($$4.isPresent()) {
               long $$5 = $$0.V() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dgb $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dj(), 2.0) && $$6.a(aqs.R) && !$$6.c(ctt.c);
         }
      }
   }

   @Override
   protected boolean a(alq $$0, bkj $$1, long $$2) {
      Optional<ia> $$3 = $$1.dN().c(btk.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ht $$4 = $$3.get().b();
         return $$1.dN().c(cei.e) && $$1.ds() > (double)$$4.v() + 0.4 && $$4.a($$1.dj(), 1.14);
      }
   }

   @Override
   protected void d(alq $$0, bkj $$1, long $$2) {
      if ($$2 > this.d) {
         blj<?> $$3 = $$1.dN();
         if ($$3.a(btk.v)) {
            Set<ia> $$4 = $$3.c(btk.v).get();
            Optional<List<bkj>> $$5;
            if ($$3.a(btk.g)) {
               $$5 = $$3.c(btk.g);
            } else {
               $$5 = Optional.empty();
            }

            bmy.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dN().c(btk.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(alq $$0, bkj $$1, long $$2) {
      if ($$1.fD()) {
         $$1.fE();
         this.d = $$2 + 40L;
      }
   }
}
