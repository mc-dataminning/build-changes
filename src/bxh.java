import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxh<E extends bup> extends bxi<E> {
   private final axl<dhm> m;
   private final float n;
   private final List<bxi.a> o = new ArrayList<>();
   private boolean p;

   public bxh(brd $$0, int $$1, int $$2, float $$3, Function<E, awf> $$4, axl<dhm> $$5, float $$6, BiPredicate<E, jf> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(arj $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.dV().i() < this.n;
   }

   @Override
   protected Optional<bxi.a> a(arj $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         jf.a $$1 = new jf.a();

         while (!this.h.isEmpty()) {
            Optional<bxi.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bxi.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), jk.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
