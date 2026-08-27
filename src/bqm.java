import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bqm extends boc<bml> {
   public static final int c = 100;
   private long d;

   public bqm() {
      super(ImmutableMap.of(bvn.b, bvo.a, bvn.H, bvo.c));
   }

   @Override
   protected boolean a(and $$0, bml $$1) {
      if ($$1.bO()) {
         return false;
      } else {
         bnl<?> $$2 = $$1.dO();
         ig $$3 = $$2.c(bvn.b).get();
         if ($$0.ae() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bvn.H);
            if ($$4.isPresent()) {
               long $$5 = $$0.X() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            djh $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dk(), 2.0) && $$6.a(ash.R) && !$$6.c(cwj.c);
         }
      }
   }

   @Override
   protected boolean a(and $$0, bml $$1, long $$2) {
      Optional<ig> $$3 = $$1.dO().c(bvn.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hx $$4 = $$3.get().b();
         return $$1.dO().c(cgu.e) && $$1.dt() > (double)$$4.v() + 0.4 && $$4.a($$1.dk(), 1.14);
      }
   }

   @Override
   protected void d(and $$0, bml $$1, long $$2) {
      if ($$2 > this.d) {
         bnl<?> $$3 = $$1.dO();
         if ($$3.a(bvn.v)) {
            Set<ig> $$4 = $$3.c(bvn.v).get();
            Optional<List<bml>> $$5;
            if ($$3.a(bvn.g)) {
               $$5 = $$3.c(bvn.g);
            } else {
               $$5 = Optional.empty();
            }

            bpa.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dO().c(bvn.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(and $$0, bml $$1, long $$2) {
      if ($$1.fD()) {
         $$1.fE();
         this.d = $$2 + 40L;
      }
   }
}
