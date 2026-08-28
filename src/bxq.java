import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxq<E extends bux> extends bxr<E> {
   private final axp<dhy> m;
   private final float n;
   private final List<bxr.a> o = new ArrayList<>();
   private boolean p;

   public bxq(brj $$0, int $$1, int $$2, float $$3, Function<E, awj> $$4, axp<dhy> $$5, float $$6, BiPredicate<E, jg> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(arm $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.ea().i() < this.n;
   }

   @Override
   protected Optional<bxr.a> a(arm $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         jg.a $$1 = new jg.a();

         while (!this.h.isEmpty()) {
            Optional<bxr.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bxr.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), jl.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
