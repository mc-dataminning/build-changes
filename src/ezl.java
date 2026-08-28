import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface ezl<T> {
   kj<T> a();

   T b();

   T a(T var1, Stream<czk> var2);

   Stream<czk> a(T var1);

   default void a(czk $$0, T $$1, Stream<czk> $$2) {
      T $$3 = $$0.a(this.a(), $$1);
      T $$4 = this.a($$3, $$2);
      $$0.b(this.a(), $$4);
   }

   default void a(czk $$0, Stream<czk> $$1) {
      this.a($$0, this.b(), $$1);
   }

   default void a(czk $$0, UnaryOperator<czk> $$1) {
      T $$2 = $$0.a(this.a());
      if ($$2 != null) {
         UnaryOperator<czk> $$3 = $$1x -> {
            if ($$1x.f()) {
               return $$1x;
            } else {
               czk $$2x = $$1.apply($$1x);
               $$2x.f($$2x.k());
               return $$2x;
            }
         };
         this.a($$0, this.a($$2).map($$3));
      }
   }
}
