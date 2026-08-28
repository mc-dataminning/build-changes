import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bxr extends bvh<btn> {
   public static final int c = 100;
   private long d;

   public bxr() {
      super(ImmutableMap.of(ccs.b, cct.a, ccs.I, cct.c));
   }

   @Override
   protected boolean a(aqu $$0, btn $$1) {
      if ($$1.bS()) {
         return false;
      } else {
         buq<?> $$2 = $$1.dU();
         jl $$3 = $$2.c(ccs.b).get();
         if ($$0.af() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(ccs.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.Z() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dtc $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dn(), 2.0) && $$6.a(awe.R) && !$$6.c(dfr.c);
         }
      }
   }

   @Override
   protected boolean a(aqu $$0, btn $$1, long $$2) {
      Optional<jl> $$3 = $$1.dU().c(ccs.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jd $$4 = $$3.get().b();
         return $$1.dU().c(com.e) && $$1.dw() > (double)$$4.v() + 0.4 && $$4.a($$1.dn(), 1.14);
      }
   }

   @Override
   protected void d(aqu $$0, btn $$1, long $$2) {
      if ($$2 > this.d) {
         buq<?> $$3 = $$1.dU();
         if ($$3.a(ccs.v)) {
            Set<jl> $$4 = $$3.c(ccs.v).get();
            Optional<List<btn>> $$5;
            if ($$3.a(ccs.g)) {
               $$5 = $$3.c(ccs.g);
            } else {
               $$5 = Optional.empty();
            }

            bwf.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dU().c(ccs.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aqu $$0, btn $$1, long $$2) {
      if ($$1.fI()) {
         $$1.fJ();
         this.d = $$2 + 40L;
      }
   }
}
