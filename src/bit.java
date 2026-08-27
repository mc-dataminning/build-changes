import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bit<E extends bgb> extends biu<E> {
   private final anl<cpn> m;
   private final float n;
   private final List<biu.a> o = new ArrayList<>();
   private boolean p;

   public bit(bdi $$0, int $$1, int $$2, float $$3, Function<E, amg> $$4, anl<cpn> $$5, float $$6, BiPredicate<E, gu> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(aif $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.ec().i() < this.n;
   }

   @Override
   protected Optional<biu.a> a(aif $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         gu.a $$1 = new gu.a();

         while (!this.h.isEmpty()) {
            Optional<biu.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               biu.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.b(), ha.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
