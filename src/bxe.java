import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bxe extends buu<btb> {
   public static final int c = 100;
   private long d;

   public bxe() {
      super(ImmutableMap.of(ccf.b, ccg.a, ccf.I, ccg.c));
   }

   @Override
   protected boolean a(aqm $$0, btb $$1) {
      if ($$1.bS()) {
         return false;
      } else {
         bud<?> $$2 = $$1.dU();
         ji $$3 = $$2.c(ccf.b).get();
         if ($$0.af() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(ccf.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.Z() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dsk $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.do(), 2.0) && $$6.a(avw.R) && !$$6.c(dfa.c);
         }
      }
   }

   @Override
   protected boolean a(aqm $$0, btb $$1, long $$2) {
      Optional<ji> $$3 = $$1.dU().c(ccf.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ja $$4 = $$3.get().b();
         return $$1.dU().c(cnz.e) && $$1.dx() > (double)$$4.v() + 0.4 && $$4.a($$1.do(), 1.14);
      }
   }

   @Override
   protected void d(aqm $$0, btb $$1, long $$2) {
      if ($$2 > this.d) {
         bud<?> $$3 = $$1.dU();
         if ($$3.a(ccf.v)) {
            Set<ji> $$4 = $$3.c(ccf.v).get();
            Optional<List<btb>> $$5;
            if ($$3.a(ccf.g)) {
               $$5 = $$3.c(ccf.g);
            } else {
               $$5 = Optional.empty();
            }

            bvs.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dU().c(ccf.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aqm $$0, btb $$1, long $$2) {
      if ($$1.fI()) {
         $$1.fJ();
         this.d = $$2 + 40L;
      }
   }
}
