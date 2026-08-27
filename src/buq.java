import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class buq extends bsg<bqo> {
   public static final int c = 100;
   private long d;

   public buq() {
      super(ImmutableMap.of(bzr.b, bzs.a, bzr.I, bzs.c));
   }

   @Override
   protected boolean a(aps $$0, bqo $$1) {
      if ($$1.bO()) {
         return false;
      } else {
         brp<?> $$2 = $$1.dP();
         ik $$3 = $$2.c(bzr.b).get();
         if ($$0.ae() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bzr.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.Y() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            doz $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dk(), 2.0) && $$6.a(avc.R) && !$$6.c(dbr.c);
         }
      }
   }

   @Override
   protected boolean a(aps $$0, bqo $$1, long $$2) {
      Optional<ik> $$3 = $$1.dP().c(bzr.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ib $$4 = $$3.get().b();
         return $$1.dP().c(cli.e) && $$1.dt() > (double)$$4.v() + 0.4 && $$4.a($$1.dk(), 1.14);
      }
   }

   @Override
   protected void d(aps $$0, bqo $$1, long $$2) {
      if ($$2 > this.d) {
         brp<?> $$3 = $$1.dP();
         if ($$3.a(bzr.v)) {
            Set<ik> $$4 = $$3.c(bzr.v).get();
            Optional<List<bqo>> $$5;
            if ($$3.a(bzr.g)) {
               $$5 = $$3.c(bzr.g);
            } else {
               $$5 = Optional.empty();
            }

            bte.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dP().c(bzr.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aps $$0, bqo $$1, long $$2) {
      if ($$1.fI()) {
         $$1.fJ();
         this.d = $$2 + 40L;
      }
   }
}
