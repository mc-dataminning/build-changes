import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class boy extends bmp<bky> {
   public static final int c = 100;
   private long d;

   public boy() {
      super(ImmutableMap.of(btz.b, bua.a, btz.H, bua.c));
   }

   @Override
   protected boolean a(ama $$0, bky $$1) {
      if ($$1.bN()) {
         return false;
      } else {
         bly<?> $$2 = $$1.dN();
         ia $$3 = $$2.c(btz.b).get();
         if ($$0.ac() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(btz.H);
            if ($$4.isPresent()) {
               long $$5 = $$0.V() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dgw $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dj(), 2.0) && $$6.a(arc.R) && !$$6.c(cum.c);
         }
      }
   }

   @Override
   protected boolean a(ama $$0, bky $$1, long $$2) {
      Optional<ia> $$3 = $$1.dN().c(btz.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ht $$4 = $$3.get().b();
         return $$1.dN().c(cex.e) && $$1.ds() > (double)$$4.v() + 0.4 && $$4.a($$1.dj(), 1.14);
      }
   }

   @Override
   protected void d(ama $$0, bky $$1, long $$2) {
      if ($$2 > this.d) {
         bly<?> $$3 = $$1.dN();
         if ($$3.a(btz.v)) {
            Set<ia> $$4 = $$3.c(btz.v).get();
            Optional<List<bky>> $$5;
            if ($$3.a(btz.g)) {
               $$5 = $$3.c(btz.g);
            } else {
               $$5 = Optional.empty();
            }

            bnn.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dN().c(btz.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(ama $$0, bky $$1, long $$2) {
      if ($$1.fD()) {
         $$1.fE();
         this.d = $$2 + 40L;
      }
   }
}
