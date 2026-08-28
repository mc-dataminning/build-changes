import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bzv<E extends bxe> extends bzw<E> {
   private final axr<dma> m;
   private final float n;
   private final List<bzw.a> o = new ArrayList<>();
   private boolean p;

   public bzv(btm $$0, int $$1, int $$2, float $$3, Function<E, awm> $$4, axr<dma> $$5, float $$6, BiPredicate<E, iu> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(arq $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.dY().i() < this.n;
   }

   @Override
   protected Optional<bzw.a> a(arq $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         iu.a $$1 = new iu.a();

         while (!this.h.isEmpty()) {
            Optional<bzw.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bzw.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.a(), ja.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
