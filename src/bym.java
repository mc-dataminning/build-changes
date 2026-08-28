import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bym extends bwc<buk> {
   public static final int c = 100;
   private long d;

   public bym() {
      super(ImmutableMap.of(cdn.b, cdo.a, cdn.I, cdo.c));
   }

   @Override
   protected boolean a(arh $$0, buk $$1) {
      if ($$1.bW()) {
         return false;
      } else {
         bvl<?> $$2 = $$1.dX();
         jm $$3 = $$2.c(cdn.b).get();
         if ($$0.ag() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cdn.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.aa() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            duo $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dq(), 2.0) && $$6.a(awt.S) && !$$6.c(dhc.c);
         }
      }
   }

   @Override
   protected boolean a(arh $$0, buk $$1, long $$2) {
      Optional<jm> $$3 = $$1.dX().c(cdn.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         je $$4 = $$3.get().b();
         return $$1.dX().c(cpm.e) && $$1.dz() > (double)$$4.v() + 0.4 && $$4.a($$1.dq(), 1.14);
      }
   }

   @Override
   protected void d(arh $$0, buk $$1, long $$2) {
      if ($$2 > this.d) {
         bvl<?> $$3 = $$1.dX();
         if ($$3.a(cdn.v)) {
            Set<jm> $$4 = $$3.c(cdn.v).get();
            Optional<List<buk>> $$5;
            if ($$3.a(cdn.g)) {
               $$5 = $$3.c(cdn.g);
            } else {
               $$5 = Optional.empty();
            }

            bxa.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dX().c(cdn.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(arh $$0, buk $$1, long $$2) {
      if ($$1.fM()) {
         $$1.fN();
         this.d = $$2 + 40L;
      }
   }
}
