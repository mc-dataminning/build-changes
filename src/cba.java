import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cba extends byq<bwz> {
   public static final int c = 100;
   private long d;

   public cba() {
      super(ImmutableMap.of(cgb.b, cgc.a, cgb.J, cgc.c));
   }

   @Override
   protected boolean a(aro $$0, bwz $$1) {
      if ($$1.bZ()) {
         return false;
      } else {
         bxz<?> $$2 = $$1.eb();
         jd $$3 = $$2.c(cgb.b).get();
         if ($$0.aj() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cgb.J);
            if ($$4.isPresent()) {
               long $$5 = $$0.ae() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dzo $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dt(), 2.0) && $$6.a(axa.T) && !$$6.c(dln.c);
         }
      }
   }

   @Override
   protected boolean a(aro $$0, bwz $$1, long $$2) {
      Optional<jd> $$3 = $$1.eb().c(cgb.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iu $$4 = $$3.get().b();
         return $$1.eb().c(csl.e) && $$1.dC() > (double)$$4.v() + 0.4 && $$4.a($$1.dt(), 1.14);
      }
   }

   @Override
   protected void d(aro $$0, bwz $$1, long $$2) {
      if ($$2 > this.d) {
         bxz<?> $$3 = $$1.eb();
         if ($$3.a(cgb.w)) {
            Set<jd> $$4 = $$3.c(cgb.w).get();
            Optional<List<bwz>> $$5;
            if ($$3.a(cgb.g)) {
               $$5 = $$3.c(cgb.g);
            } else {
               $$5 = Optional.empty();
            }

            bzo.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.eb().c(cgb.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aro $$0, bwz $$1, long $$2) {
      if ($$1.fQ()) {
         $$1.fR();
         this.d = $$2 + 40L;
      }
   }
}
