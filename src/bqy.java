import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bqy<E extends boi> extends bqz<E> {
   private final auo<cyo> m;
   private final float n;
   private final List<bqz.a> o = new ArrayList<>();
   private boolean p;

   public bqy(blf $$0, int $$1, int $$2, float $$3, Function<E, atj> $$4, auo<cyo> $$5, float $$6, BiPredicate<E, hz> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(aov $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.eh().i() < this.n;
   }

   @Override
   protected Optional<bqz.a> a(aov $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         hz.a $$1 = new hz.a();

         while (!this.h.isEmpty()) {
            Optional<bqz.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bqz.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), ie.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
