import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bwm<E extends btt> extends bwn<E> {
   private final axf<dfb> m;
   private final float n;
   private final List<bwn.a> o = new ArrayList<>();
   private boolean p;

   public bwm(bqh $$0, int $$1, int $$2, float $$3, Function<E, avz> $$4, axf<dfb> $$5, float $$6, BiPredicate<E, iz> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(arf $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.el().i() < this.n;
   }

   @Override
   protected Optional<bwn.a> a(arf $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         iz.a $$1 = new iz.a();

         while (!this.h.isEmpty()) {
            Optional<bwn.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bwn.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), je.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
