import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface eqa<T> {
   kl<T> a();

   T b();

   T a(T var1, Stream<cuk> var2);

   Stream<cuk> a(T var1);

   default void a(cuk $$0, T $$1, Stream<cuk> $$2) {
      T $$3 = $$0.a(this.a(), $$1);
      T $$4 = this.a($$3, $$2);
      $$0.b(this.a(), $$4);
   }

   default void a(cuk $$0, Stream<cuk> $$1) {
      this.a($$0, this.b(), $$1);
   }

   default void a(cuk $$0, UnaryOperator<cuk> $$1) {
      T $$2 = $$0.a(this.a());
      if ($$2 != null) {
         UnaryOperator<cuk> $$3 = $$1x -> $$1x.e() ? $$1x : $$1.apply($$1x);
         this.a($$0, this.a($$2).map($$3));
      }
   }
}
