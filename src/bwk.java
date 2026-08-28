import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bwk<E extends btr> extends bwl<E> {
   private final axf<dez> m;
   private final float n;
   private final List<bwl.a> o = new ArrayList<>();
   private boolean p;

   public bwk(bqf $$0, int $$1, int $$2, float $$3, Function<E, avz> $$4, axf<dez> $$5, float $$6, BiPredicate<E, iz> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(arf $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.el().i() < this.n;
   }

   @Override
   protected Optional<bwl.a> a(arf $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         iz.a $$1 = new iz.a();

         while (!this.h.isEmpty()) {
            Optional<bwl.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bwl.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), je.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
