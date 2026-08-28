import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bzk<E extends bwt> extends bzl<E> {
   private final axp<dku> m;
   private final float n;
   private final List<bzl.a> o = new ArrayList<>();
   private boolean p;

   public bzk(btb $$0, int $$1, int $$2, float $$3, Function<E, awj> $$4, axp<dku> $$5, float $$6, BiPredicate<E, jj> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(arn $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.dY().i() < this.n;
   }

   @Override
   protected Optional<bzl.a> a(arn $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         jj.a $$1 = new jj.a();

         while (!this.h.isEmpty()) {
            Optional<bzl.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bzl.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.a(), jo.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
