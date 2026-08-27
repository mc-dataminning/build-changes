import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bni extends bkz<bji> {
   public static final int c = 100;
   private long d;

   public bni() {
      super(ImmutableMap.of(bsj.b, bsk.a, bsj.H, bsk.c));
   }

   @Override
   protected boolean a(aks $$0, bji $$1) {
      if ($$1.bN()) {
         return false;
      } else {
         bki<?> $$2 = $$1.dN();
         hf $$3 = $$2.c(bsj.b).get();
         if ($$0.ac() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bsj.H);
            if ($$4.isPresent()) {
               long $$5 = $$0.V() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dfl $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dj(), 2.0) && $$6.a(apu.R) && !$$6.c(csq.b);
         }
      }
   }

   @Override
   protected boolean a(aks $$0, bji $$1, long $$2) {
      Optional<hf> $$3 = $$1.dN().c(bsj.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         gw $$4 = $$3.get().b();
         return $$1.dN().c(cdh.e) && $$1.ds() > (double)$$4.v() + 0.4 && $$4.a($$1.dj(), 1.14);
      }
   }

   @Override
   protected void d(aks $$0, bji $$1, long $$2) {
      if ($$2 > this.d) {
         bki<?> $$3 = $$1.dN();
         if ($$3.a(bsj.v)) {
            Set<hf> $$4 = $$3.c(bsj.v).get();
            Optional<List<bji>> $$5;
            if ($$3.a(bsj.g)) {
               $$5 = $$3.c(bsj.g);
            } else {
               $$5 = Optional.empty();
            }

            blx.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dN().c(bsj.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aks $$0, bji $$1, long $$2) {
      if ($$1.fC()) {
         $$1.fD();
         this.d = $$2 + 40L;
      }
   }
}
