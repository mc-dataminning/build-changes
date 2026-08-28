import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxe<E extends bum> extends bxf<E> {
   private final axj<dhj> m;
   private final float n;
   private final List<bxf.a> o = new ArrayList<>();
   private boolean p;

   public bxe(bra $$0, int $$1, int $$2, float $$3, Function<E, awd> $$4, axj<dhj> $$5, float $$6, BiPredicate<E, je> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(arh $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.dV().i() < this.n;
   }

   @Override
   protected Optional<bxf.a> a(arh $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         je.a $$1 = new je.a();

         while (!this.h.isEmpty()) {
            Optional<bxf.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bxf.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), jj.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
