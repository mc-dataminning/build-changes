import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzk extends bxa<bvh> {
   public static final int c = 100;
   private long d;

   public bzk() {
      super(ImmutableMap.of(cel.b, cem.a, cel.I, cem.c));
   }

   @Override
   protected boolean a(arp $$0, bvh $$1) {
      if ($$1.bZ()) {
         return false;
      } else {
         bwj<?> $$2 = $$1.eb();
         jp $$3 = $$2.c(cel.b).get();
         if ($$0.ag() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cel.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.ab() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dvv $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dt(), 2.0) && $$6.a(axc.S) && !$$6.c(dij.c);
         }
      }
   }

   @Override
   protected boolean a(arp $$0, bvh $$1, long $$2) {
      Optional<jp> $$3 = $$1.eb().c(cel.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get().b();
         return $$1.eb().c(cql.e) && $$1.dC() > (double)$$4.v() + 0.4 && $$4.a($$1.dt(), 1.14);
      }
   }

   @Override
   protected void d(arp $$0, bvh $$1, long $$2) {
      if ($$2 > this.d) {
         bwj<?> $$3 = $$1.eb();
         if ($$3.a(cel.v)) {
            Set<jp> $$4 = $$3.c(cel.v).get();
            Optional<List<bvh>> $$5;
            if ($$3.a(cel.g)) {
               $$5 = $$3.c(cel.g);
            } else {
               $$5 = Optional.empty();
            }

            bxy.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.eb().c(cel.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(arp $$0, bvh $$1, long $$2) {
      if ($$1.fP()) {
         $$1.fQ();
         this.d = $$2 + 40L;
      }
   }
}
