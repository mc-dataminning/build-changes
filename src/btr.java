import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class btr extends brh<bpp> {
   public static final int c = 100;
   private long d;

   public btr() {
      super(ImmutableMap.of(bys.b, byt.a, bys.I, byt.c));
   }

   @Override
   protected boolean a(apf $$0, bpp $$1) {
      if ($$1.bO()) {
         return false;
      } else {
         bqq<?> $$2 = $$1.dP();
         ik $$3 = $$2.c(bys.b).get();
         if ($$0.ad() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bys.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.X() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dnb $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dk(), 2.0) && $$6.a(aun.R) && !$$6.c(czv.c);
         }
      }
   }

   @Override
   protected boolean a(apf $$0, bpp $$1, long $$2) {
      Optional<ik> $$3 = $$1.dP().c(bys.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ib $$4 = $$3.get().b();
         return $$1.dP().c(ckj.e) && $$1.dt() > (double)$$4.v() + 0.4 && $$4.a($$1.dk(), 1.14);
      }
   }

   @Override
   protected void d(apf $$0, bpp $$1, long $$2) {
      if ($$2 > this.d) {
         bqq<?> $$3 = $$1.dP();
         if ($$3.a(bys.v)) {
            Set<ik> $$4 = $$3.c(bys.v).get();
            Optional<List<bpp>> $$5;
            if ($$3.a(bys.g)) {
               $$5 = $$3.c(bys.g);
            } else {
               $$5 = Optional.empty();
            }

            bsf.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dP().c(bys.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(apf $$0, bpp $$1, long $$2) {
      if ($$1.fI()) {
         $$1.fJ();
         this.d = $$2 + 40L;
      }
   }
}
