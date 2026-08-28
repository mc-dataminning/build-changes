import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface eqh<T> {
   kl<T> a();

   T b();

   T a(T var1, Stream<cur> var2);

   Stream<cur> a(T var1);

   default void a(cur $$0, T $$1, Stream<cur> $$2) {
      T $$3 = $$0.a(this.a(), $$1);
      T $$4 = this.a($$3, $$2);
      $$0.b(this.a(), $$4);
   }

   default void a(cur $$0, Stream<cur> $$1) {
      this.a($$0, this.b(), $$1);
   }

   default void a(cur $$0, UnaryOperator<cur> $$1) {
      T $$2 = $$0.a(this.a());
      if ($$2 != null) {
         UnaryOperator<cur> $$3 = $$1x -> $$1x.e() ? $$1x : $$1.apply($$1x);
         this.a($$0, this.a($$2).map($$3));
      }
   }
}
