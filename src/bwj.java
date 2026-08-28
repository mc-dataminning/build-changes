import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bwj<E extends btp> extends bwk<E> {
   private final awu<dfy> m;
   private final float n;
   private final List<bwk.a> o = new ArrayList<>();
   private boolean p;

   public bwj(bqc $$0, int $$1, int $$2, float $$3, Function<E, avo> $$4, awu<dfy> $$5, float $$6, BiPredicate<E, jd> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(aqu $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.dR().i() < this.n;
   }

   @Override
   protected Optional<bwk.a> a(aqu $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         jd.a $$1 = new jd.a();

         while (!this.h.isEmpty()) {
            Optional<bwk.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bwk.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), ji.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
