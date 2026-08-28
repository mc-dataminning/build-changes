import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface eqf<T> {
   kl<T> a();

   T b();

   T a(T var1, Stream<cup> var2);

   Stream<cup> a(T var1);

   default void a(cup $$0, T $$1, Stream<cup> $$2) {
      T $$3 = $$0.a(this.a(), $$1);
      T $$4 = this.a($$3, $$2);
      $$0.b(this.a(), $$4);
   }

   default void a(cup $$0, Stream<cup> $$1) {
      this.a($$0, this.b(), $$1);
   }

   default void a(cup $$0, UnaryOperator<cup> $$1) {
      T $$2 = $$0.a(this.a());
      if ($$2 != null) {
         UnaryOperator<cup> $$3 = $$1x -> $$1x.e() ? $$1x : $$1.apply($$1x);
         this.a($$0, this.a($$2).map($$3));
      }
   }
}
