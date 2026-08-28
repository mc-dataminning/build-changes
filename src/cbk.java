import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cbk extends bza<bxj> {
   public static final int c = 100;
   private long d;

   public cbk() {
      super(ImmutableMap.of(cgl.b, cgm.a, cgl.J, cgm.c));
   }

   @Override
   protected boolean a(arq $$0, bxj $$1) {
      if ($$1.bX()) {
         return false;
      } else {
         byj<?> $$2 = $$1.eb();
         je $$3 = $$2.c(cgl.b).get();
         if ($$0.aj() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cgl.J);
            if ($$4.isPresent()) {
               long $$5 = $$0.ae() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            eao $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.ds(), 2.0) && $$6.a(axc.T) && !$$6.c(dmf.c);
         }
      }
   }

   @Override
   protected boolean a(arq $$0, bxj $$1, long $$2) {
      Optional<je> $$3 = $$1.eb().c(cgl.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iv $$4 = $$3.get().b();
         return $$1.eb().c(ctd.e) && $$1.dB() > (double)$$4.v() + 0.4 && $$4.a($$1.ds(), 1.14);
      }
   }

   @Override
   protected void d(arq $$0, bxj $$1, long $$2) {
      if ($$2 > this.d) {
         byj<?> $$3 = $$1.eb();
         if ($$3.a(cgl.w)) {
            Set<je> $$4 = $$3.c(cgl.w).get();
            Optional<List<bxj>> $$5;
            if ($$3.a(cgl.g)) {
               $$5 = $$3.c(cgl.g);
            } else {
               $$5 = Optional.empty();
            }

            bzy.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.eb().c(cgl.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(arq $$0, bxj $$1, long $$2) {
      if ($$1.fQ()) {
         $$1.fR();
         this.d = $$2 + 40L;
      }
   }
}
