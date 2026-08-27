import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bvg extends bsw<bre> {
   public static final int c = 100;
   private long d;

   public bvg() {
      super(ImmutableMap.of(cah.b, cai.a, cah.I, cai.c));
   }

   @Override
   protected boolean a(aqe $$0, bre $$1) {
      if ($$1.bP()) {
         return false;
      } else {
         bsf<?> $$2 = $$1.dQ();
         iu $$3 = $$2.c(cah.b).get();
         if ($$0.ae() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cah.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.Y() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dpy $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dl(), 2.0) && $$6.a(avo.R) && !$$6.c(dco.c);
         }
      }
   }

   @Override
   protected boolean a(aqe $$0, bre $$1, long $$2) {
      Optional<iu> $$3 = $$1.dQ().c(cah.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         im $$4 = $$3.get().b();
         return $$1.dQ().c(cma.e) && $$1.du() > (double)$$4.v() + 0.4 && $$4.a($$1.dl(), 1.14);
      }
   }

   @Override
   protected void d(aqe $$0, bre $$1, long $$2) {
      if ($$2 > this.d) {
         bsf<?> $$3 = $$1.dQ();
         if ($$3.a(cah.v)) {
            Set<iu> $$4 = $$3.c(cah.v).get();
            Optional<List<bre>> $$5;
            if ($$3.a(cah.g)) {
               $$5 = $$3.c(cah.g);
            } else {
               $$5 = Optional.empty();
            }

            btu.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dQ().c(cah.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aqe $$0, bre $$1, long $$2) {
      if ($$1.fJ()) {
         $$1.fK();
         this.d = $$2 + 40L;
      }
   }
}
