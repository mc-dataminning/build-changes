import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bvt<E extends bta> extends bvu<E> {
   private final awk<dff> m;
   private final float n;
   private final List<bvu.a> o = new ArrayList<>();
   private boolean p;

   public bvt(bpo $$0, int $$1, int $$2, float $$3, Function<E, ave> $$4, awk<dff> $$5, float $$6, BiPredicate<E, ja> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(aqk $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.dS().i() < this.n;
   }

   @Override
   protected Optional<bvu.a> a(aqk $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         ja.a $$1 = new ja.a();

         while (!this.h.isEmpty()) {
            Optional<bvu.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bvu.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), jf.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
