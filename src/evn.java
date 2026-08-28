import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface evn<T> {
   ku<T> a();

   T b();

   T a(T var1, Stream<cwo> var2);

   Stream<cwo> a(T var1);

   default void a(cwo $$0, T $$1, Stream<cwo> $$2) {
      T $$3 = $$0.a(this.a(), $$1);
      T $$4 = this.a($$3, $$2);
      $$0.b(this.a(), $$4);
   }

   default void a(cwo $$0, Stream<cwo> $$1) {
      this.a($$0, this.b(), $$1);
   }

   default void a(cwo $$0, UnaryOperator<cwo> $$1) {
      T $$2 = $$0.a(this.a());
      if ($$2 != null) {
         UnaryOperator<cwo> $$3 = $$1x -> {
            if ($$1x.f()) {
               return $$1x;
            } else {
               cwo $$2x = $$1.apply($$1x);
               $$2x.f($$2x.k());
               return $$2x;
            }
         };
         this.a($$0, this.a($$2).map($$3));
      }
   }
}
