import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface ezq<T> {
   kj<T> a();

   T b();

   T a(T var1, Stream<czn> var2);

   Stream<czn> a(T var1);

   default void a(czn $$0, T $$1, Stream<czn> $$2) {
      T $$3 = $$0.a(this.a(), $$1);
      T $$4 = this.a($$3, $$2);
      $$0.b(this.a(), $$4);
   }

   default void a(czn $$0, Stream<czn> $$1) {
      this.a($$0, this.b(), $$1);
   }

   default void a(czn $$0, UnaryOperator<czn> $$1) {
      T $$2 = $$0.a(this.a());
      if ($$2 != null) {
         UnaryOperator<czn> $$3 = $$1x -> {
            if ($$1x.f()) {
               return $$1x;
            } else {
               czn $$2x = $$1.apply($$1x);
               $$2x.f($$2x.k());
               return $$2x;
            }
         };
         this.a($$0, this.a($$2).map($$3));
      }
   }
}
