import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bsj<E extends bpr> extends bsk<E> {
   private final avd<dac> m;
   private final float n;
   private final List<bsk.a> o = new ArrayList<>();
   private boolean p;

   public bsj(bmo $$0, int $$1, int $$2, float $$3, Function<E, atx> $$4, avd<dac> $$5, float $$6, BiPredicate<E, ib> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(apf $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.ei().i() < this.n;
   }

   @Override
   protected Optional<bsk.a> a(apf $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         ib.a $$1 = new ib.a();

         while (!this.h.isEmpty()) {
            Optional<bsk.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bsk.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), ih.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
