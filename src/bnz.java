import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bnz<E extends bli> extends boa<E> {
   private final arv<cva> m;
   private final float n;
   private final List<boa.a> o = new ArrayList<>();
   private boolean p;

   public bnz(bii $$0, int $$1, int $$2, float $$3, Function<E, aqq> $$4, arv<cva> $$5, float $$6, BiPredicate<E, ht> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(ame $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.eh().i() < this.n;
   }

   @Override
   protected Optional<boa.a> a(ame $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         ht.a $$1 = new ht.a();

         while (!this.h.isEmpty()) {
            Optional<boa.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               boa.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), hx.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
