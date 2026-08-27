import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class blz<E extends bji> extends bma<E> {
   private final aqi<csv> m;
   private final float n;
   private final List<bma.a> o = new ArrayList<>();
   private boolean p;

   public blz(bgj $$0, int $$1, int $$2, float $$3, Function<E, apd> $$4, aqi<csv> $$5, float $$6, BiPredicate<E, gw> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(akr $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.ef().i() < this.n;
   }

   @Override
   protected Optional<bma.a> a(akr $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         gw.a $$1 = new gw.a();

         while (!this.h.isEmpty()) {
            Optional<bma.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bma.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), hc.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
