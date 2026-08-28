import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bvw<E extends btd> extends bvx<E> {
   private final awm<dfh> m;
   private final float n;
   private final List<bvx.a> o = new ArrayList<>();
   private boolean p;

   public bvw(bpr $$0, int $$1, int $$2, float $$3, Function<E, avg> $$4, awm<dfh> $$5, float $$6, BiPredicate<E, ja> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(aqm $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.dT().i() < this.n;
   }

   @Override
   protected Optional<bvx.a> a(aqm $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         ja.a $$1 = new ja.a();

         while (!this.h.isEmpty()) {
            Optional<bvx.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bvx.a $$3 = $$2.get();
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
