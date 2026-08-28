import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bzx<E extends bxg> extends bzy<E> {
   private final axr<dmf> m;
   private final float n;
   private final List<bzy.a> o = new ArrayList<>();
   private boolean p;

   public bzx(bto $$0, int $$1, int $$2, float $$3, Function<E, awm> $$4, axr<dmf> $$5, float $$6, BiPredicate<E, iu> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(arq $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.dY().i() < this.n;
   }

   @Override
   protected Optional<bzy.a> a(arq $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         iu.a $$1 = new iu.a();

         while (!this.h.isEmpty()) {
            Optional<bzy.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bzy.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.a(), ja.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
