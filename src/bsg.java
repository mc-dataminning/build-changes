import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsg extends bpw<bog> {
   public static final int c = 100;
   private long d;

   public bsg() {
      super(ImmutableMap.of(bxh.b, bxi.a, bxh.I, bxi.c));
   }

   @Override
   protected boolean a(aov $$0, bog $$1) {
      if ($$1.bO()) {
         return false;
      } else {
         bpf<?> $$2 = $$1.dO();
         ii $$3 = $$2.c(bxh.b).get();
         if ($$0.ae() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bxh.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.X() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dlf $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dk(), 2.0) && $$6.a(atz.R) && !$$6.c(cyh.c);
         }
      }
   }

   @Override
   protected boolean a(aov $$0, bog $$1, long $$2) {
      Optional<ii> $$3 = $$1.dO().c(bxh.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hz $$4 = $$3.get().b();
         return $$1.dO().c(ciu.e) && $$1.dt() > (double)$$4.v() + 0.4 && $$4.a($$1.dk(), 1.14);
      }
   }

   @Override
   protected void d(aov $$0, bog $$1, long $$2) {
      if ($$2 > this.d) {
         bpf<?> $$3 = $$1.dO();
         if ($$3.a(bxh.v)) {
            Set<ii> $$4 = $$3.c(bxh.v).get();
            Optional<List<bog>> $$5;
            if ($$3.a(bxh.g)) {
               $$5 = $$3.c(bxh.g);
            } else {
               $$5 = Optional.empty();
            }

            bqu.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dO().c(bxh.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aov $$0, bog $$1, long $$2) {
      if ($$1.fD()) {
         $$1.fE();
         this.d = $$2 + 40L;
      }
   }
}
