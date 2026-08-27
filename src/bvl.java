import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bvl<E extends bss> extends bvm<E> {
   private final awm<dea> m;
   private final float n;
   private final List<bvm.a> o = new ArrayList<>();
   private boolean p;

   public bvl(bph $$0, int $$1, int $$2, float $$3, Function<E, avh> $$4, awm<dea> $$5, float $$6, BiPredicate<E, io> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(aqn $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.el().i() < this.n;
   }

   @Override
   protected Optional<bvm.a> a(aqn $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         io.a $$1 = new io.a();

         while (!this.h.isEmpty()) {
            Optional<bvm.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bvm.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), it.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
