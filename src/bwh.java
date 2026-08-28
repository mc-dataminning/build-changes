import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bwh<E extends btn> extends bwi<E> {
   private final awt<dfw> m;
   private final float n;
   private final List<bwi.a> o = new ArrayList<>();
   private boolean p;

   public bwh(bqb $$0, int $$1, int $$2, float $$3, Function<E, avn> $$4, awt<dfw> $$5, float $$6, BiPredicate<E, jd> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(aqt $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.dT().i() < this.n;
   }

   @Override
   protected Optional<bwi.a> a(aqt $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         jd.a $$1 = new jd.a();

         while (!this.h.isEmpty()) {
            Optional<bwi.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bwi.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), ji.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
