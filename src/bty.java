import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bty<E extends brg> extends btz<E> {
   private final awd<dcv> m;
   private final float n;
   private final List<btz.a> o = new ArrayList<>();
   private boolean p;

   public bty(bob $$0, int $$1, int $$2, float $$3, Function<E, auy> $$4, awd<dcv> $$5, float $$6, BiPredicate<E, im> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(aqe $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.ej().i() < this.n;
   }

   @Override
   protected Optional<btz.a> a(aqe $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         im.a $$1 = new im.a();

         while (!this.h.isEmpty()) {
            Optional<btz.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               btz.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), ir.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
