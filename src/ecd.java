import java.util.function.Function;

public interface ecd<T extends ecd<T>> {
   T b(eck.a var1);

   default <E> T a_(Iterable<E> $$0, Function<E, eck.a> $$1) {
      T $$2 = this.d();

      for (E $$3 : $$0) {
         $$2 = $$2.b($$1.apply($$3));
      }

      return $$2;
   }

   T d();
}
