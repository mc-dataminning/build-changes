import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface fae<T> {
   kj<T> a();

   T b();

   T a(T var1, Stream<czy> var2);

   Stream<czy> a(T var1);

   default void a(czy $$0, T $$1, Stream<czy> $$2) {
      T $$3 = $$0.a(this.a(), $$1);
      T $$4 = this.a($$3, $$2);
      $$0.b(this.a(), $$4);
   }

   default void a(czy $$0, Stream<czy> $$1) {
      this.a($$0, this.b(), $$1);
   }

   default void a(czy $$0, UnaryOperator<czy> $$1) {
      T $$2 = $$0.a(this.a());
      if ($$2 != null) {
         UnaryOperator<czy> $$3 = $$1x -> {
            if ($$1x.f()) {
               return $$1x;
            } else {
               czy $$2x = $$1.apply($$1x);
               $$2x.f($$2x.k());
               return $$2x;
            }
         };
         this.a($$0, this.a($$2).map($$3));
      }
   }
}
