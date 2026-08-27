import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bqp extends bof<bmo> {
   public static final int c = 100;
   private long d;

   public bqp() {
      super(ImmutableMap.of(bvq.b, bvr.a, bvq.I, bvr.c));
   }

   @Override
   protected boolean a(ane $$0, bmo $$1) {
      if ($$1.bO()) {
         return false;
      } else {
         bno<?> $$2 = $$1.dN();
         ig $$3 = $$2.c(bvq.b).get();
         if ($$0.ae() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bvq.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.X() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            djp $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dj(), 2.0) && $$6.a(asi.R) && !$$6.c(cwr.c);
         }
      }
   }

   @Override
   protected boolean a(ane $$0, bmo $$1, long $$2) {
      Optional<ig> $$3 = $$1.dN().c(bvq.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hx $$4 = $$3.get().b();
         return $$1.dN().c(chc.e) && $$1.ds() > (double)$$4.v() + 0.4 && $$4.a($$1.dj(), 1.14);
      }
   }

   @Override
   protected void d(ane $$0, bmo $$1, long $$2) {
      if ($$2 > this.d) {
         bno<?> $$3 = $$1.dN();
         if ($$3.a(bvq.v)) {
            Set<ig> $$4 = $$3.c(bvq.v).get();
            Optional<List<bmo>> $$5;
            if ($$3.a(bvq.g)) {
               $$5 = $$3.c(bvq.g);
            } else {
               $$5 = Optional.empty();
            }

            bpd.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dN().c(bvq.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(ane $$0, bmo $$1, long $$2) {
      if ($$1.fD()) {
         $$1.fE();
         this.d = $$2 + 40L;
      }
   }
}
