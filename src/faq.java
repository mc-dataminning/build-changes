import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface faq<T> {
   kk<T> a();

   T b();

   T a(T var1, Stream<dak> var2);

   Stream<dak> a(T var1);

   default void a(dak $$0, T $$1, Stream<dak> $$2) {
      T $$3 = $$0.a(this.a(), $$1);
      T $$4 = this.a($$3, $$2);
      $$0.b(this.a(), $$4);
   }

   default void a(dak $$0, Stream<dak> $$1) {
      this.a($$0, this.b(), $$1);
   }

   default void a(dak $$0, UnaryOperator<dak> $$1) {
      T $$2 = $$0.a(this.a());
      if ($$2 != null) {
         UnaryOperator<dak> $$3 = $$1x -> {
            if ($$1x.f()) {
               return $$1x;
            } else {
               dak $$2x = $$1.apply($$1x);
               $$2x.f($$2x.k());
               return $$2x;
            }
         };
         this.a($$0, this.a($$2).map($$3));
      }
   }
}
