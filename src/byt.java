import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class byt<E extends bwa> extends byu<E> {
   private final axf<dke> m;
   private final float n;
   private final List<byu.a> o = new ArrayList<>();
   private boolean p;

   public byt(bsj $$0, int $$1, int $$2, float $$3, Function<E, avz> $$4, axf<dke> $$5, float $$6, BiPredicate<E, ji> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(ard $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.dX().i() < this.n;
   }

   @Override
   protected Optional<byu.a> a(ard $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         ji.a $$1 = new ji.a();

         while (!this.h.isEmpty()) {
            Optional<byu.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               byu.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.a(), jn.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
