import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bph<E extends bmq> extends bpi<E> {
   private final asx<cwy> m;
   private final float n;
   private final List<bpi.a> o = new ArrayList<>();
   private boolean p;

   public bph(bjn $$0, int $$1, int $$2, float $$3, Function<E, ars> $$4, asx<cwy> $$5, float $$6, BiPredicate<E, hx> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(ane $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.eg().i() < this.n;
   }

   @Override
   protected Optional<bpi.a> a(ane $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         hx.a $$1 = new hx.a();

         while (!this.h.isEmpty()) {
            Optional<bpi.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bpi.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), ic.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
