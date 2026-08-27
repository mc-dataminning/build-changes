import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwc extends bts<bsa> {
   public static final int c = 100;
   private long d;

   public bwc() {
      super(ImmutableMap.of(cbd.b, cbe.a, cbd.I, cbe.c));
   }

   @Override
   protected boolean a(aqh $$0, bsa $$1) {
      if ($$1.bP()) {
         return false;
      } else {
         btb<?> $$2 = $$1.dQ();
         iv $$3 = $$2.c(cbd.b).get();
         if ($$0.ae() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cbd.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.Y() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dqh $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dl(), 2.0) && $$6.a(avr.R) && !$$6.c(dcx.c);
         }
      }
   }

   @Override
   protected boolean a(aqh $$0, bsa $$1, long $$2) {
      Optional<iv> $$3 = $$1.dQ().c(cbd.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         in $$4 = $$3.get().b();
         return $$1.dQ().c(cmw.e) && $$1.du() > (double)$$4.v() + 0.4 && $$4.a($$1.dl(), 1.14);
      }
   }

   @Override
   protected void d(aqh $$0, bsa $$1, long $$2) {
      if ($$2 > this.d) {
         btb<?> $$3 = $$1.dQ();
         if ($$3.a(cbd.v)) {
            Set<iv> $$4 = $$3.c(cbd.v).get();
            Optional<List<bsa>> $$5;
            if ($$3.a(cbd.g)) {
               $$5 = $$3.c(cbd.g);
            } else {
               $$5 = Optional.empty();
            }

            buq.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dQ().c(cbd.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aqh $$0, bsa $$1, long $$2) {
      if ($$1.fJ()) {
         $$1.fK();
         this.d = $$2 + 40L;
      }
   }
}
