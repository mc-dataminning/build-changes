import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzh extends bwx<bve> {
   public static final int c = 100;
   private long d;

   public bzh() {
      super(ImmutableMap.of(cei.b, cej.a, cei.I, cej.c));
   }

   @Override
   protected boolean a(arq $$0, bve $$1) {
      if ($$1.cb()) {
         return false;
      } else {
         bwg<?> $$2 = $$1.ee();
         jp $$3 = $$2.c(cei.b).get();
         if ($$0.ag() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cei.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.aa() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dvo $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dw(), 2.0) && $$6.a(axd.S) && !$$6.c(dic.c);
         }
      }
   }

   @Override
   protected boolean a(arq $$0, bve $$1, long $$2) {
      Optional<jp> $$3 = $$1.ee().c(cei.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get().b();
         return $$1.ee().c(cqi.e) && $$1.dF() > (double)$$4.v() + 0.4 && $$4.a($$1.dw(), 1.14);
      }
   }

   @Override
   protected void d(arq $$0, bve $$1, long $$2) {
      if ($$2 > this.d) {
         bwg<?> $$3 = $$1.ee();
         if ($$3.a(cei.v)) {
            Set<jp> $$4 = $$3.c(cei.v).get();
            Optional<List<bve>> $$5;
            if ($$3.a(cei.g)) {
               $$5 = $$3.c(cei.g);
            } else {
               $$5 = Optional.empty();
            }

            bxv.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.ee().c(cei.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(arq $$0, bve $$1, long $$2) {
      if ($$1.fU()) {
         $$1.fV();
         this.d = $$2 + 40L;
      }
   }
}
