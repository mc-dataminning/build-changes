import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class blr<E extends bja> extends bls<E> {
   private final aqa<csl> m;
   private final float n;
   private final List<bls.a> o = new ArrayList<>();
   private boolean p;

   public blr(bgb $$0, int $$1, int $$2, float $$3, Function<E, aov> $$4, aqa<csl> $$5, float $$6, BiPredicate<E, gu> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(akk $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.ee().i() < this.n;
   }

   @Override
   protected Optional<bls.a> a(akk $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         gu.a $$1 = new gu.a();

         while (!this.h.isEmpty()) {
            Optional<bls.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bls.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), ha.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
