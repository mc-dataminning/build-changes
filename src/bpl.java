import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bpl extends bnc<bll> {
   public static final int c = 100;
   private long d;

   public bpl() {
      super(ImmutableMap.of(bum.b, bun.a, bum.H, bun.c));
   }

   @Override
   protected boolean a(ami $$0, bll $$1) {
      if ($$1.bO()) {
         return false;
      } else {
         bml<?> $$2 = $$1.dP();
         ie $$3 = $$2.c(bum.b).get();
         if ($$0.ad() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bum.H);
            if ($$4.isPresent()) {
               long $$5 = $$0.W() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dhn $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dl(), 2.0) && $$6.a(ark.R) && !$$6.c(cuy.c);
         }
      }
   }

   @Override
   protected boolean a(ami $$0, bll $$1, long $$2) {
      Optional<ie> $$3 = $$1.dP().c(bum.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hx $$4 = $$3.get().b();
         return $$1.dP().c(cfk.e) && $$1.du() > (double)$$4.v() + 0.4 && $$4.a($$1.dl(), 1.14);
      }
   }

   @Override
   protected void d(ami $$0, bll $$1, long $$2) {
      if ($$2 > this.d) {
         bml<?> $$3 = $$1.dP();
         if ($$3.a(bum.v)) {
            Set<ie> $$4 = $$3.c(bum.v).get();
            Optional<List<bll>> $$5;
            if ($$3.a(bum.g)) {
               $$5 = $$3.c(bum.g);
            } else {
               $$5 = Optional.empty();
            }

            boa.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dP().c(bum.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(ami $$0, bll $$1, long $$2) {
      if ($$1.fE()) {
         $$1.fF();
         this.d = $$2 + 40L;
      }
   }
}
