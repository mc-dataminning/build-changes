import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bxb extends bur<bsy> {
   public static final int c = 100;
   private long d;

   public bxb() {
      super(ImmutableMap.of(ccc.b, ccd.a, ccc.I, ccd.c));
   }

   @Override
   protected boolean a(aqk $$0, bsy $$1) {
      if ($$1.bR()) {
         return false;
      } else {
         bua<?> $$2 = $$1.dT();
         ji $$3 = $$2.c(ccc.b).get();
         if ($$0.af() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(ccc.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.Z() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dsh $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dn(), 2.0) && $$6.a(avu.R) && !$$6.c(dey.c);
         }
      }
   }

   @Override
   protected boolean a(aqk $$0, bsy $$1, long $$2) {
      Optional<ji> $$3 = $$1.dT().c(ccc.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ja $$4 = $$3.get().b();
         return $$1.dT().c(cnw.e) && $$1.dw() > (double)$$4.v() + 0.4 && $$4.a($$1.dn(), 1.14);
      }
   }

   @Override
   protected void d(aqk $$0, bsy $$1, long $$2) {
      if ($$2 > this.d) {
         bua<?> $$3 = $$1.dT();
         if ($$3.a(ccc.v)) {
            Set<ji> $$4 = $$3.c(ccc.v).get();
            Optional<List<bsy>> $$5;
            if ($$3.a(ccc.g)) {
               $$5 = $$3.c(ccc.g);
            } else {
               $$5 = Optional.empty();
            }

            bvp.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dT().c(ccc.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aqk $$0, bsy $$1, long $$2) {
      if ($$1.fH()) {
         $$1.fI();
         this.d = $$2 + 40L;
      }
   }
}
