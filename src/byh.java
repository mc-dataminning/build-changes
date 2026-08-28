import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class byh extends bvx<buf> {
   public static final int c = 100;
   private long d;

   public byh() {
      super(ImmutableMap.of(cdi.b, cdj.a, cdi.I, cdj.c));
   }

   @Override
   protected boolean a(arg $$0, buf $$1) {
      if ($$1.bW()) {
         return false;
      } else {
         bvg<?> $$2 = $$1.dX();
         jm $$3 = $$2.c(cdi.b).get();
         if ($$0.ag() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cdi.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.aa() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dua $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dq(), 2.0) && $$6.a(aws.S) && !$$6.c(dgo.c);
         }
      }
   }

   @Override
   protected boolean a(arg $$0, buf $$1, long $$2) {
      Optional<jm> $$3 = $$1.dX().c(cdi.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         je $$4 = $$3.get().b();
         return $$1.dX().c(cpg.e) && $$1.dz() > (double)$$4.v() + 0.4 && $$4.a($$1.dq(), 1.14);
      }
   }

   @Override
   protected void d(arg $$0, buf $$1, long $$2) {
      if ($$2 > this.d) {
         bvg<?> $$3 = $$1.dX();
         if ($$3.a(cdi.v)) {
            Set<jm> $$4 = $$3.c(cdi.v).get();
            Optional<List<buf>> $$5;
            if ($$3.a(cdi.g)) {
               $$5 = $$3.c(cdi.g);
            } else {
               $$5 = Optional.empty();
            }

            bwv.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dX().c(cdi.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(arg $$0, buf $$1, long $$2) {
      if ($$1.fL()) {
         $$1.fM();
         this.d = $$2 + 40L;
      }
   }
}
