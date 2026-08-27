import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bpg extends bmx<blg> {
   public static final int c = 100;
   private long d;

   public bpg() {
      super(ImmutableMap.of(buh.b, bui.a, buh.H, bui.c));
   }

   @Override
   protected boolean a(ame $$0, blg $$1) {
      if ($$1.bO()) {
         return false;
      } else {
         bmg<?> $$2 = $$1.dP();
         ia $$3 = $$2.c(buh.b).get();
         if ($$0.ad() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(buh.H);
            if ($$4.isPresent()) {
               long $$5 = $$0.W() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dhi $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dl(), 2.0) && $$6.a(arg.R) && !$$6.c(cut.c);
         }
      }
   }

   @Override
   protected boolean a(ame $$0, blg $$1, long $$2) {
      Optional<ia> $$3 = $$1.dP().c(buh.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ht $$4 = $$3.get().b();
         return $$1.dP().c(cff.e) && $$1.du() > (double)$$4.v() + 0.4 && $$4.a($$1.dl(), 1.14);
      }
   }

   @Override
   protected void d(ame $$0, blg $$1, long $$2) {
      if ($$2 > this.d) {
         bmg<?> $$3 = $$1.dP();
         if ($$3.a(buh.v)) {
            Set<ia> $$4 = $$3.c(buh.v).get();
            Optional<List<blg>> $$5;
            if ($$3.a(buh.g)) {
               $$5 = $$3.c(buh.g);
            } else {
               $$5 = Optional.empty();
            }

            bnv.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dP().c(buh.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(ame $$0, blg $$1, long $$2) {
      if ($$1.fE()) {
         $$1.fF();
         this.d = $$2 + 40L;
      }
   }
}
