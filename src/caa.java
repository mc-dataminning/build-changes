import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class caa extends bxq<bvx> {
   public static final int c = 100;
   private long d;

   public caa() {
      super(ImmutableMap.of(cfb.b, cfc.a, cfb.I, cfc.c));
   }

   @Override
   protected boolean a(arx $$0, bvx $$1) {
      if ($$1.bZ()) {
         return false;
      } else {
         bwz<?> $$2 = $$1.ec();
         jp $$3 = $$2.c(cfb.b).get();
         if ($$0.ai() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cfb.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.ad() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dxo $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.du(), 2.0) && $$6.a(axk.T) && !$$6.c(djw.c);
         }
      }
   }

   @Override
   protected boolean a(arx $$0, bvx $$1, long $$2) {
      Optional<jp> $$3 = $$1.ec().c(cfb.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get().b();
         return $$1.ec().c(crf.e) && $$1.dD() > (double)$$4.v() + 0.4 && $$4.a($$1.du(), 1.14);
      }
   }

   @Override
   protected void d(arx $$0, bvx $$1, long $$2) {
      if ($$2 > this.d) {
         bwz<?> $$3 = $$1.ec();
         if ($$3.a(cfb.v)) {
            Set<jp> $$4 = $$3.c(cfb.v).get();
            Optional<List<bvx>> $$5;
            if ($$3.a(cfb.g)) {
               $$5 = $$3.c(cfb.g);
            } else {
               $$5 = Optional.empty();
            }

            byo.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.ec().c(cfb.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(arx $$0, bvx $$1, long $$2) {
      if ($$1.fR()) {
         $$1.fS();
         this.d = $$2 + 40L;
      }
   }
}
