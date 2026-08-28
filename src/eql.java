import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface eql<T> {
   km<T> a();

   T b();

   T a(T var1, Stream<cua> var2);

   Stream<cua> a(T var1);

   default void a(cua $$0, T $$1, Stream<cua> $$2) {
      T $$3 = $$0.a(this.a(), $$1);
      T $$4 = this.a($$3, $$2);
      $$0.b(this.a(), $$4);
   }

   default void a(cua $$0, Stream<cua> $$1) {
      this.a($$0, this.b(), $$1);
   }

   default void a(cua $$0, UnaryOperator<cua> $$1) {
      T $$2 = $$0.a(this.a());
      if ($$2 != null) {
         UnaryOperator<cua> $$3 = $$1x -> {
            if ($$1x.e()) {
               return $$1x;
            } else {
               cua $$2x = $$1.apply($$1x);
               $$2x.f($$2x.j());
               return $$2x;
            }
         };
         this.a($$0, this.a($$2).map($$3));
      }
   }
}
