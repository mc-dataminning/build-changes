import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface eqt<T> {
   km<T> a();

   T b();

   T a(T var1, Stream<cud> var2);

   Stream<cud> a(T var1);

   default void a(cud $$0, T $$1, Stream<cud> $$2) {
      T $$3 = $$0.a(this.a(), $$1);
      T $$4 = this.a($$3, $$2);
      $$0.b(this.a(), $$4);
   }

   default void a(cud $$0, Stream<cud> $$1) {
      this.a($$0, this.b(), $$1);
   }

   default void a(cud $$0, UnaryOperator<cud> $$1) {
      T $$2 = $$0.a(this.a());
      if ($$2 != null) {
         UnaryOperator<cud> $$3 = $$1x -> {
            if ($$1x.e()) {
               return $$1x;
            } else {
               cud $$2x = $$1.apply($$1x);
               $$2x.f($$2x.j());
               return $$2x;
            }
         };
         this.a($$0, this.a($$2).map($$3));
      }
   }
}
