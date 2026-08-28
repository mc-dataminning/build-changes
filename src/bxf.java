import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bxf extends buv<btc> {
   public static final int c = 100;
   private long d;

   public bxf() {
      super(ImmutableMap.of(ccg.b, cch.a, ccg.I, cch.c));
   }

   @Override
   protected boolean a(aqm $$0, btc $$1) {
      if ($$1.bT()) {
         return false;
      } else {
         bue<?> $$2 = $$1.dV();
         ji $$3 = $$2.c(ccg.b).get();
         if ($$0.af() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(ccg.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.Z() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dsl $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dp(), 2.0) && $$6.a(avw.R) && !$$6.c(dfb.c);
         }
      }
   }

   @Override
   protected boolean a(aqm $$0, btc $$1, long $$2) {
      Optional<ji> $$3 = $$1.dV().c(ccg.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ja $$4 = $$3.get().b();
         return $$1.dV().c(coa.e) && $$1.dy() > (double)$$4.v() + 0.4 && $$4.a($$1.dp(), 1.14);
      }
   }

   @Override
   protected void d(aqm $$0, btc $$1, long $$2) {
      if ($$2 > this.d) {
         bue<?> $$3 = $$1.dV();
         if ($$3.a(ccg.v)) {
            Set<ji> $$4 = $$3.c(ccg.v).get();
            Optional<List<btc>> $$5;
            if ($$3.a(ccg.g)) {
               $$5 = $$3.c(ccg.g);
            } else {
               $$5 = Optional.empty();
            }

            bvt.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dV().c(ccg.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aqm $$0, btc $$1, long $$2) {
      if ($$1.fJ()) {
         $$1.fK();
         this.d = $$2 + 40L;
      }
   }
}
