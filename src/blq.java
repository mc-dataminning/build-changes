import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class blq<E extends biy> extends blr<E> {
   private final apy<csk> m;
   private final float n;
   private final List<blr.a> o = new ArrayList<>();
   private boolean p;

   public blq(bfz $$0, int $$1, int $$2, float $$3, Function<E, aot> $$4, apy<csk> $$5, float $$6, BiPredicate<E, gv> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(aki $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.ee().i() < this.n;
   }

   @Override
   protected Optional<blr.a> a(aki $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         gv.a $$1 = new gv.a();

         while (!this.h.isEmpty()) {
            Optional<blr.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               blr.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), hb.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
