import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwr extends buh<bso> {
   public static final int c = 100;
   private long d;

   public bwr() {
      super(ImmutableMap.of(cbs.b, cbt.a, cbs.I, cbt.c));
   }

   @Override
   protected boolean a(aqm $$0, bso $$1) {
      if ($$1.bR()) {
         return false;
      } else {
         btq<?> $$2 = $$1.dS();
         iw $$3 = $$2.c(cbs.b).get();
         if ($$0.ae() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cbs.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.Y() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            drb $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dn(), 2.0) && $$6.a(avw.R) && !$$6.c(ddr.c);
         }
      }
   }

   @Override
   protected boolean a(aqm $$0, bso $$1, long $$2) {
      Optional<iw> $$3 = $$1.dS().c(cbs.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         io $$4 = $$3.get().b();
         return $$1.dS().c(cnl.e) && $$1.dw() > (double)$$4.v() + 0.4 && $$4.a($$1.dn(), 1.14);
      }
   }

   @Override
   protected void d(aqm $$0, bso $$1, long $$2) {
      if ($$2 > this.d) {
         btq<?> $$3 = $$1.dS();
         if ($$3.a(cbs.v)) {
            Set<iw> $$4 = $$3.c(cbs.v).get();
            Optional<List<bso>> $$5;
            if ($$3.a(cbs.g)) {
               $$5 = $$3.c(cbs.g);
            } else {
               $$5 = Optional.empty();
            }

            bvf.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dS().c(cbs.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aqm $$0, bso $$1, long $$2) {
      if ($$1.fL()) {
         $$1.fM();
         this.d = $$2 + 40L;
      }
   }
}
