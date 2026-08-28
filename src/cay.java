import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class cay<E extends byh> extends caz<E> {
   private final ayc<dno> m;
   private final float n;
   private final List<caz.a> o = new ArrayList<>();
   private boolean p;

   public cay(bun $$0, int $$1, int $$2, float $$3, Function<E, awx> $$4, ayc<dno> $$5, float $$6, BiPredicate<E, iw> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(asb $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.dY().i() < this.n;
   }

   @Override
   protected Optional<caz.a> a(asb $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         iw.a $$1 = new iw.a();

         while (!this.h.isEmpty()) {
            Optional<caz.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               caz.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.a(), jc.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
