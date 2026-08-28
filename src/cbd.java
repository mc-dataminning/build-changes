import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cbd extends byt<bxc> {
   public static final int c = 100;
   private long d;

   public cbd() {
      super(ImmutableMap.of(cge.b, cgf.a, cge.J, cgf.c));
   }

   @Override
   protected boolean a(arq $$0, bxc $$1) {
      if ($$1.bZ()) {
         return false;
      } else {
         byc<?> $$2 = $$1.eb();
         jd $$3 = $$2.c(cge.b).get();
         if ($$0.aj() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cge.J);
            if ($$4.isPresent()) {
               long $$5 = $$0.ae() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dzz $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dt(), 2.0) && $$6.a(axc.T) && !$$6.c(dlt.c);
         }
      }
   }

   @Override
   protected boolean a(arq $$0, bxc $$1, long $$2) {
      Optional<jd> $$3 = $$1.eb().c(cge.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iu $$4 = $$3.get().b();
         return $$1.eb().c(csr.e) && $$1.dC() > (double)$$4.v() + 0.4 && $$4.a($$1.dt(), 1.14);
      }
   }

   @Override
   protected void d(arq $$0, bxc $$1, long $$2) {
      if ($$2 > this.d) {
         byc<?> $$3 = $$1.eb();
         if ($$3.a(cge.w)) {
            Set<jd> $$4 = $$3.c(cge.w).get();
            Optional<List<bxc>> $$5;
            if ($$3.a(cge.g)) {
               $$5 = $$3.c(cge.g);
            } else {
               $$5 = Optional.empty();
            }

            bzr.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.eb().c(cge.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(arq $$0, bxc $$1, long $$2) {
      if ($$1.fQ()) {
         $$1.fR();
         this.d = $$2 + 40L;
      }
   }
}
