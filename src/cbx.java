import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cbx extends bzn<bxw> {
   public static final int c = 100;
   private long d;

   public cbx() {
      super(ImmutableMap.of(cgy.b, cgz.a, cgy.J, cgz.c));
   }

   @Override
   protected boolean a(aru $$0, bxw $$1) {
      if ($$1.bY()) {
         return false;
      } else {
         byw<?> $$2 = $$1.ec();
         jf $$3 = $$2.c(cgy.b).get();
         if ($$0.aj() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cgy.J);
            if ($$4.isPresent()) {
               long $$5 = $$0.ae() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            ebg $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dt(), 2.0) && $$6.a(axg.T) && !$$6.c(dmx.c);
         }
      }
   }

   @Override
   protected boolean a(aru $$0, bxw $$1, long $$2) {
      Optional<jf> $$3 = $$1.ec().c(cgy.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iw $$4 = $$3.get().b();
         return $$1.ec().c(ctt.e) && $$1.dC() > (double)$$4.v() + 0.4 && $$4.a($$1.dt(), 1.14);
      }
   }

   @Override
   protected void d(aru $$0, bxw $$1, long $$2) {
      if ($$2 > this.d) {
         byw<?> $$3 = $$1.ec();
         if ($$3.a(cgy.w)) {
            Set<jf> $$4 = $$3.c(cgy.w).get();
            Optional<List<bxw>> $$5;
            if ($$3.a(cgy.g)) {
               $$5 = $$3.c(cgy.g);
            } else {
               $$5 = Optional.empty();
            }

            cal.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.ec().c(cgy.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aru $$0, bxw $$1, long $$2) {
      if ($$1.fR()) {
         $$1.fS();
         this.d = $$2 + 40L;
      }
   }
}
