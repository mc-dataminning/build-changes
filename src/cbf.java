import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cbf extends byv<bxe> {
   public static final int c = 100;
   private long d;

   public cbf() {
      super(ImmutableMap.of(cgg.b, cgh.a, cgg.J, cgh.c));
   }

   @Override
   protected boolean a(arq $$0, bxe $$1) {
      if ($$1.bZ()) {
         return false;
      } else {
         bye<?> $$2 = $$1.ec();
         jd $$3 = $$2.c(cgg.b).get();
         if ($$0.aj() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cgg.J);
            if ($$4.isPresent()) {
               long $$5 = $$0.ae() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            eah $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dt(), 2.0) && $$6.a(axc.T) && !$$6.c(dly.c);
         }
      }
   }

   @Override
   protected boolean a(arq $$0, bxe $$1, long $$2) {
      Optional<jd> $$3 = $$1.ec().c(cgg.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iu $$4 = $$3.get().b();
         return $$1.ec().c(csw.e) && $$1.dC() > (double)$$4.v() + 0.4 && $$4.a($$1.dt(), 1.14);
      }
   }

   @Override
   protected void d(arq $$0, bxe $$1, long $$2) {
      if ($$2 > this.d) {
         bye<?> $$3 = $$1.ec();
         if ($$3.a(cgg.w)) {
            Set<jd> $$4 = $$3.c(cgg.w).get();
            Optional<List<bxe>> $$5;
            if ($$3.a(cgg.g)) {
               $$5 = $$3.c(cgg.g);
            } else {
               $$5 = Optional.empty();
            }

            bzt.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.ec().c(cgg.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(arq $$0, bxe $$1, long $$2) {
      if ($$1.fR()) {
         $$1.fS();
         this.d = $$2 + 40L;
      }
   }
}
