import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class btn<E extends bqv> extends bto<E> {
   private final avt<dch> m;
   private final float n;
   private final List<bto.a> o = new ArrayList<>();
   private boolean p;

   public btn(bnq $$0, int $$1, int $$2, float $$3, Function<E, aun> $$4, avt<dch> $$5, float $$6, BiPredicate<E, id> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(apu $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.ei().i() < this.n;
   }

   @Override
   protected Optional<bto.a> a(apu $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         id.a $$1 = new id.a();

         while (!this.h.isEmpty()) {
            Optional<bto.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bto.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), ij.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
