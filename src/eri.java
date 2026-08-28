import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface eri<T> {
   kp<T> a();

   T b();

   T a(T var1, Stream<cuo> var2);

   Stream<cuo> a(T var1);

   default void a(cuo $$0, T $$1, Stream<cuo> $$2) {
      T $$3 = $$0.a(this.a(), $$1);
      T $$4 = this.a($$3, $$2);
      $$0.b(this.a(), $$4);
   }

   default void a(cuo $$0, Stream<cuo> $$1) {
      this.a($$0, this.b(), $$1);
   }

   default void a(cuo $$0, UnaryOperator<cuo> $$1) {
      T $$2 = $$0.a(this.a());
      if ($$2 != null) {
         UnaryOperator<cuo> $$3 = $$1x -> {
            if ($$1x.e()) {
               return $$1x;
            } else {
               cuo $$2x = $$1.apply($$1x);
               $$2x.f($$2x.j());
               return $$2x;
            }
         };
         this.a($$0, this.a($$2).map($$3));
      }
   }
}
