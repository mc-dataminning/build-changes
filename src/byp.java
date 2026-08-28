import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class byp extends bwf<bun> {
   public static final int c = 100;
   private long d;

   public byp() {
      super(ImmutableMap.of(cdq.b, cdr.a, cdq.I, cdr.c));
   }

   @Override
   protected boolean a(arj $$0, bun $$1) {
      if ($$1.bW()) {
         return false;
      } else {
         bvo<?> $$2 = $$1.dY();
         jn $$3 = $$2.c(cdq.b).get();
         if ($$0.ag() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cdq.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.aa() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dus $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dq(), 2.0) && $$6.a(awv.S) && !$$6.c(dhf.c);
         }
      }
   }

   @Override
   protected boolean a(arj $$0, bun $$1, long $$2) {
      Optional<jn> $$3 = $$1.dY().c(cdq.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jf $$4 = $$3.get().b();
         return $$1.dY().c(cpp.e) && $$1.dz() > (double)$$4.v() + 0.4 && $$4.a($$1.dq(), 1.14);
      }
   }

   @Override
   protected void d(arj $$0, bun $$1, long $$2) {
      if ($$2 > this.d) {
         bvo<?> $$3 = $$1.dY();
         if ($$3.a(cdq.v)) {
            Set<jn> $$4 = $$3.c(cdq.v).get();
            Optional<List<bun>> $$5;
            if ($$3.a(cdq.g)) {
               $$5 = $$3.c(cdq.g);
            } else {
               $$5 = Optional.empty();
            }

            bxd.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dY().c(cdq.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(arj $$0, bun $$1, long $$2) {
      if ($$1.fN()) {
         $$1.fO();
         this.d = $$2 + 40L;
      }
   }
}
