import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class brc<E extends bok> extends brd<E> {
   private final aup<cys> m;
   private final float n;
   private final List<brd.a> o = new ArrayList<>();
   private boolean p;

   public brc(blh $$0, int $$1, int $$2, float $$3, Function<E, atk> $$4, aup<cys> $$5, float $$6, BiPredicate<E, hz> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(aow $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.eh().i() < this.n;
   }

   @Override
   protected Optional<brd.a> a(aow $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         hz.a $$1 = new hz.a();

         while (!this.h.isEmpty()) {
            Optional<brd.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               brd.a $$3 = $$2.get();
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
