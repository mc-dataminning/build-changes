import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bza<E extends bwh> extends bzb<E> {
   private final ayk<dkl> m;
   private final float n;
   private final List<bzb.a> o = new ArrayList<>();
   private boolean p;

   public bza(bst $$0, int $$1, int $$2, float $$3, Function<E, axe> $$4, ayk<dkl> $$5, float $$6, BiPredicate<E, jh> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(ash $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.dY().i() < this.n;
   }

   @Override
   protected Optional<bzb.a> a(ash $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         jh.a $$1 = new jh.a();

         while (!this.h.isEmpty()) {
            Optional<bzb.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bzb.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), jm.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
