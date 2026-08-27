import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsz extends bqp<box> {
   public static final int c = 100;
   private long d;

   public bsz() {
      super(ImmutableMap.of(bya.b, byb.a, bya.I, byb.c));
   }

   @Override
   protected boolean a(apa $$0, box $$1) {
      if ($$1.bL()) {
         return false;
      } else {
         bpy<?> $$2 = $$1.dM();
         ik $$3 = $$2.c(bya.b).get();
         if ($$0.ad() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bya.I);
            if ($$4.isPresent()) {
               long $$5 = $$0.X() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            dme $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dh(), 2.0) && $$6.a(aue.R) && !$$6.c(cyy.c);
         }
      }
   }

   @Override
   protected boolean a(apa $$0, box $$1, long $$2) {
      Optional<ik> $$3 = $$1.dM().c(bya.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ib $$4 = $$3.get().b();
         return $$1.dM().c(cjn.e) && $$1.dq() > (double)$$4.v() + 0.4 && $$4.a($$1.dh(), 1.14);
      }
   }

   @Override
   protected void d(apa $$0, box $$1, long $$2) {
      if ($$2 > this.d) {
         bpy<?> $$3 = $$1.dM();
         if ($$3.a(bya.v)) {
            Set<ik> $$4 = $$3.c(bya.v).get();
            Optional<List<box>> $$5;
            if ($$3.a(bya.g)) {
               $$5 = $$3.c(bya.g);
            } else {
               $$5 = Optional.empty();
            }

            brn.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.dM().c(bya.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(apa $$0, box $$1, long $$2) {
      if ($$1.fF()) {
         $$1.fG();
         this.d = $$2 + 40L;
      }
   }
}
