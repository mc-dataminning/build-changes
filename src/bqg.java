import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bqg extends bnw<bmf> {
   public static final int c = 100;
   private long d;

   public bqg() {
      super(ImmutableMap.of(bvh.b, bvi.a, bvh.H, bvi.c));
   }

   @Override
   protected boolean a(amz $$0, bmf $$1) {
      if ($$1.bO()) {
         return false;
      } else {
         bnf<?> $$2 = $$1.dO();
         ig $$3 = $$2.c(bvh.b).get();
         if ($$0.ae() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bvh.H);
            if ($$4.isPresent()) {
               long $$5 = $$0.X() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dja $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dk(), 2.0) && $$6.a(asb.R) && !$$6.c(cwc.c);
         }
      }
   }

   @Override
   protected boolean a(amz $$0, bmf $$1, long $$2) {
      Optional<ig> $$3 = $$1.dO().c(bvh.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hx $$4 = $$3.get().b();
         return $$1.dO().c(cgn.e) && $$1.dt() > (double)$$4.v() + 0.4 && $$4.a($$1.dk(), 1.14);
      }
   }

   @Override
   protected void d(amz $$0, bmf $$1, long $$2) {
      if ($$2 > this.d) {
         bnf<?> $$3 = $$1.dO();
         if ($$3.a(bvh.v)) {
            Set<ig> $$4 = $$3.c(bvh.v).get();
            Optional<List<bmf>> $$5;
            if ($$3.a(bvh.g)) {
               $$5 = $$3.c(bvh.g);
            } else {
               $$5 = Optional.empty();
            }

            bou.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dO().c(bvh.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(amz $$0, bmf $$1, long $$2) {
      if ($$1.fD()) {
         $$1.fE();
         this.d = $$2 + 40L;
      }
   }
}
