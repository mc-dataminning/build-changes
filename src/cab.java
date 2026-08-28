import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cab extends bxr<bvy> {
   public static final int c = 100;
   private long d;

   public cab() {
      super(ImmutableMap.of(cfc.b, cfd.a, cfc.I, cfd.c));
   }

   @Override
   protected boolean a(ard $$0, bvy $$1) {
      if ($$1.bY()) {
         return false;
      } else {
         bxa<?> $$2 = $$1.ea();
         jq $$3 = $$2.c(cfc.b).get();
         if ($$0.aj() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cfc.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.ae() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dxq $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.ds(), 2.0) && $$6.a(awp.T) && !$$6.c(djx.c);
         }
      }
   }

   @Override
   protected boolean a(ard $$0, bvy $$1, long $$2) {
      Optional<jq> $$3 = $$1.ea().c(cfc.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ji $$4 = $$3.get().b();
         return $$1.ea().c(cri.e) && $$1.dB() > (double)$$4.v() + 0.4 && $$4.a($$1.ds(), 1.14);
      }
   }

   @Override
   protected void d(ard $$0, bvy $$1, long $$2) {
      if ($$2 > this.d) {
         bxa<?> $$3 = $$1.ea();
         if ($$3.a(cfc.v)) {
            Set<jq> $$4 = $$3.c(cfc.v).get();
            Optional<List<bvy>> $$5;
            if ($$3.a(cfc.g)) {
               $$5 = $$3.c(cfc.g);
            } else {
               $$5 = Optional.empty();
            }

            byp.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.ea().c(cfc.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(ard $$0, bvy $$1, long $$2) {
      if ($$1.fT()) {
         $$1.fU();
         this.d = $$2 + 40L;
      }
   }
}
