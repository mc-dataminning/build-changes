import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bzs<E extends bxb> extends bzt<E> {
   private final axp<dlu> m;
   private final float n;
   private final List<bzt.a> o = new ArrayList<>();
   private boolean p;

   public bzs(btj $$0, int $$1, int $$2, float $$3, Function<E, awk> $$4, axp<dlu> $$5, float $$6, BiPredicate<E, iu> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(aro $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.dY().i() < this.n;
   }

   @Override
   protected Optional<bzt.a> a(aro $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         iu.a $$1 = new iu.a();

         while (!this.h.isEmpty()) {
            Optional<bzt.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bzt.a $$3 = $$2.get();
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
