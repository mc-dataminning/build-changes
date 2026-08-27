import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class boy<E extends bmh> extends boz<E> {
   private final asq<cwj> m;
   private final float n;
   private final List<boz.a> o = new ArrayList<>();
   private boolean p;

   public boy(bjg $$0, int $$1, int $$2, float $$3, Function<E, arl> $$4, asq<cwj> $$5, float $$6, BiPredicate<E, hx> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(amz $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.eg().i() < this.n;
   }

   @Override
   protected Optional<boz.a> a(amz $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         hx.a $$1 = new hx.a();

         while (!this.h.isEmpty()) {
            Optional<boz.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               boz.a $$3 = $$2.get();
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
