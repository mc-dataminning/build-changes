import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwt extends buj<bsq> {
   public static final int c = 100;
   private long d;

   public bwt() {
      super(ImmutableMap.of(cbu.b, cbv.a, cbu.I, cbv.c));
   }

   @Override
   protected boolean a(aqn $$0, bsq $$1) {
      if ($$1.bR()) {
         return false;
      } else {
         bts<?> $$2 = $$1.dS();
         iw $$3 = $$2.c(cbu.b).get();
         if ($$0.ae() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cbu.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.Y() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            drd $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dn(), 2.0) && $$6.a(avx.R) && !$$6.c(ddt.c);
         }
      }
   }

   @Override
   protected boolean a(aqn $$0, bsq $$1, long $$2) {
      Optional<iw> $$3 = $$1.dS().c(cbu.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         io $$4 = $$3.get().b();
         return $$1.dS().c(cnn.e) && $$1.dw() > (double)$$4.v() + 0.4 && $$4.a($$1.dn(), 1.14);
      }
   }

   @Override
   protected void d(aqn $$0, bsq $$1, long $$2) {
      if ($$2 > this.d) {
         bts<?> $$3 = $$1.dS();
         if ($$3.a(cbu.v)) {
            Set<iw> $$4 = $$3.c(cbu.v).get();
            Optional<List<bsq>> $$5;
            if ($$3.a(cbu.g)) {
               $$5 = $$3.c(cbu.g);
            } else {
               $$5 = Optional.empty();
            }

            bvh.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dS().c(cbu.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aqn $$0, bsq $$1, long $$2) {
      if ($$1.fL()) {
         $$1.fM();
         this.d = $$2 + 40L;
      }
   }
}
