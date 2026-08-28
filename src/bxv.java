import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxv<E extends bvc> extends bxw<E> {
   private final axq<die> m;
   private final float n;
   private final List<bxw.a> o = new ArrayList<>();
   private boolean p;

   public bxv(bro $$0, int $$1, int $$2, float $$3, Function<E, awk> $$4, axq<die> $$5, float $$6, BiPredicate<E, jh> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(arn $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.ea().i() < this.n;
   }

   @Override
   protected Optional<bxw.a> a(arn $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         jh.a $$1 = new jh.a();

         while (!this.h.isEmpty()) {
            Optional<bxw.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bxw.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), jm.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
