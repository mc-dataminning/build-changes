import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class btq extends brg<bpo> {
   public static final int c = 100;
   private long d;

   public btq() {
      super(ImmutableMap.of(byr.b, bys.a, byr.I, bys.c));
   }

   @Override
   protected boolean a(apf $$0, bpo $$1) {
      if ($$1.bO()) {
         return false;
      } else {
         bqp<?> $$2 = $$1.dP();
         ik $$3 = $$2.c(byr.b).get();
         if ($$0.ad() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(byr.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.X() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dmz $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dk(), 2.0) && $$6.a(aun.R) && !$$6.c(czt.c);
         }
      }
   }

   @Override
   protected boolean a(apf $$0, bpo $$1, long $$2) {
      Optional<ik> $$3 = $$1.dP().c(byr.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ib $$4 = $$3.get().b();
         return $$1.dP().c(ckh.e) && $$1.dt() > (double)$$4.v() + 0.4 && $$4.a($$1.dk(), 1.14);
      }
   }

   @Override
   protected void d(apf $$0, bpo $$1, long $$2) {
      if ($$2 > this.d) {
         bqp<?> $$3 = $$1.dP();
         if ($$3.a(byr.v)) {
            Set<ik> $$4 = $$3.c(byr.v).get();
            Optional<List<bpo>> $$5;
            if ($$3.a(byr.g)) {
               $$5 = $$3.c(byr.g);
            } else {
               $$5 = Optional.empty();
            }

            bse.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dP().c(byr.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(apf $$0, bpo $$1, long $$2) {
      if ($$1.fI()) {
         $$1.fJ();
         this.d = $$2 + 40L;
      }
   }
}
