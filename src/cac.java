import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class cac<E extends bxl> extends cad<E> {
   private final axr<dmm> m;
   private final float n;
   private final List<cad.a> o = new ArrayList<>();
   private boolean p;

   public cac(btr $$0, int $$1, int $$2, float $$3, Function<E, awm> $$4, axr<dmm> $$5, float $$6, BiPredicate<E, iv> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(arq $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.dX().i() < this.n;
   }

   @Override
   protected Optional<cad.a> a(arq $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         iv.a $$1 = new iv.a();

         while (!this.h.isEmpty()) {
            Optional<cad.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               cad.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.a(), jb.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
