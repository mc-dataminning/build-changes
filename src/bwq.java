import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwq extends bug<bso> {
   public static final int c = 100;
   private long d;

   public bwq() {
      super(ImmutableMap.of(cbr.b, cbs.a, cbr.I, cbs.c));
   }

   @Override
   protected boolean a(aqt $$0, bso $$1) {
      if ($$1.bW()) {
         return false;
      } else {
         btp<?> $$2 = $$1.dZ();
         iz $$3 = $$2.c(cbr.b).get();
         if ($$0.af() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cbr.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.Z() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dtc $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.ds(), 2.0) && $$6.a(awe.R) && !$$6.c(deu.c);
         }
      }
   }

   @Override
   protected boolean a(aqt $$0, bso $$1, long $$2) {
      Optional<iz> $$3 = $$1.dZ().c(cbr.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ir $$4 = $$3.get().b();
         return $$1.dZ().c(cnq.e) && $$1.dB() > (double)$$4.v() + 0.4 && $$4.a($$1.ds(), 1.14);
      }
   }

   @Override
   protected void d(aqt $$0, bso $$1, long $$2) {
      if ($$2 > this.d) {
         btp<?> $$3 = $$1.dZ();
         if ($$3.a(cbr.v)) {
            Set<iz> $$4 = $$3.c(cbr.v).get();
            Optional<List<bso>> $$5;
            if ($$3.a(cbr.g)) {
               $$5 = $$3.c(cbr.g);
            } else {
               $$5 = Optional.empty();
            }

            bve.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dZ().c(cbr.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aqt $$0, bso $$1, long $$2) {
      if ($$1.fU()) {
         $$1.fV();
         this.d = $$2 + 40L;
      }
   }
}
