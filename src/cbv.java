import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cbv extends bzl<bxu> {
   public static final int c = 100;
   private long d;

   public cbv() {
      super(ImmutableMap.of(cgw.b, cgx.a, cgw.J, cgx.c));
   }

   @Override
   protected boolean a(ars $$0, bxu $$1) {
      if ($$1.bY()) {
         return false;
      } else {
         byu<?> $$2 = $$1.ec();
         je $$3 = $$2.c(cgw.b).get();
         if ($$0.aj() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cgw.J);
            if ($$4.isPresent()) {
               long $$5 = $$0.ae() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            ebe $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dt(), 2.0) && $$6.a(axe.T) && !$$6.c(dmv.c);
         }
      }
   }

   @Override
   protected boolean a(ars $$0, bxu $$1, long $$2) {
      Optional<je> $$3 = $$1.ec().c(cgw.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iv $$4 = $$3.get().b();
         return $$1.ec().c(ctr.e) && $$1.dC() > (double)$$4.v() + 0.4 && $$4.a($$1.dt(), 1.14);
      }
   }

   @Override
   protected void d(ars $$0, bxu $$1, long $$2) {
      if ($$2 > this.d) {
         byu<?> $$3 = $$1.ec();
         if ($$3.a(cgw.w)) {
            Set<je> $$4 = $$3.c(cgw.w).get();
            Optional<List<bxu>> $$5;
            if ($$3.a(cgw.g)) {
               $$5 = $$3.c(cgw.g);
            } else {
               $$5 = Optional.empty();
            }

            caj.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.ec().c(cgw.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(ars $$0, bxu $$1, long $$2) {
      if ($$1.fR()) {
         $$1.fS();
         this.d = $$2 + 40L;
      }
   }
}
