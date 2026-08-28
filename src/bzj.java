import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzj extends bwz<bvg> {
   public static final int c = 100;
   private long d;

   public bzj() {
      super(ImmutableMap.of(cek.b, cel.a, cek.I, cel.c));
   }

   @Override
   protected boolean a(arc $$0, bvg $$1) {
      if ($$1.bZ()) {
         return false;
      } else {
         bwi<?> $$2 = $$1.ec();
         jq $$3 = $$2.c(cek.b).get();
         if ($$0.ai() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cek.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.ad() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dwx $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.du(), 2.0) && $$6.a(awp.T) && !$$6.c(djf.c);
         }
      }
   }

   @Override
   protected boolean a(arc $$0, bvg $$1, long $$2) {
      Optional<jq> $$3 = $$1.ec().c(cek.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ji $$4 = $$3.get().b();
         return $$1.ec().c(cqo.e) && $$1.dD() > (double)$$4.v() + 0.4 && $$4.a($$1.du(), 1.14);
      }
   }

   @Override
   protected void d(arc $$0, bvg $$1, long $$2) {
      if ($$2 > this.d) {
         bwi<?> $$3 = $$1.ec();
         if ($$3.a(cek.v)) {
            Set<jq> $$4 = $$3.c(cek.v).get();
            Optional<List<bvg>> $$5;
            if ($$3.a(cek.g)) {
               $$5 = $$3.c(cek.g);
            } else {
               $$5 = Optional.empty();
            }

            bxx.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.ec().c(cek.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(arc $$0, bvg $$1, long $$2) {
      if ($$1.fR()) {
         $$1.fS();
         this.d = $$2 + 40L;
      }
   }
}
