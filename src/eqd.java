import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface eqd<T> {
   kl<T> a();

   T b();

   T a(T var1, Stream<cun> var2);

   Stream<cun> a(T var1);

   default void a(cun $$0, T $$1, Stream<cun> $$2) {
      T $$3 = $$0.a(this.a(), $$1);
      T $$4 = this.a($$3, $$2);
      $$0.b(this.a(), $$4);
   }

   default void a(cun $$0, Stream<cun> $$1) {
      this.a($$0, this.b(), $$1);
   }

   default void a(cun $$0, UnaryOperator<cun> $$1) {
      T $$2 = $$0.a(this.a());
      if ($$2 != null) {
         UnaryOperator<cun> $$3 = $$1x -> $$1x.e() ? $$1x : $$1.apply($$1x);
         this.a($$0, this.a($$2).map($$3));
      }
   }
}
