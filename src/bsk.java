import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsk extends bqa<boi> {
   public static final int c = 100;
   private long d;

   public bsk() {
      super(ImmutableMap.of(bxl.b, bxm.a, bxl.I, bxm.c));
   }

   @Override
   protected boolean a(aow $$0, boi $$1) {
      if ($$1.bO()) {
         return false;
      } else {
         bpj<?> $$2 = $$1.dO();
         ii $$3 = $$2.c(bxl.b).get();
         if ($$0.ad() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bxl.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.X() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dlj $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dk(), 2.0) && $$6.a(aua.R) && !$$6.c(cyl.c);
         }
      }
   }

   @Override
   protected boolean a(aow $$0, boi $$1, long $$2) {
      Optional<ii> $$3 = $$1.dO().c(bxl.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hz $$4 = $$3.get().b();
         return $$1.dO().c(ciy.e) && $$1.dt() > (double)$$4.v() + 0.4 && $$4.a($$1.dk(), 1.14);
      }
   }

   @Override
   protected void d(aow $$0, boi $$1, long $$2) {
      if ($$2 > this.d) {
         bpj<?> $$3 = $$1.dO();
         if ($$3.a(bxl.v)) {
            Set<ii> $$4 = $$3.c(bxl.v).get();
            Optional<List<boi>> $$5;
            if ($$3.a(bxl.g)) {
               $$5 = $$3.c(bxl.g);
            } else {
               $$5 = Optional.empty();
            }

            bqy.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dO().c(bxl.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aow $$0, boi $$1, long $$2) {
      if ($$1.fD()) {
         $$1.fE();
         this.d = $$2 + 40L;
      }
   }
}
