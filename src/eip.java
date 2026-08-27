import java.util.Arrays;
import java.util.function.Function;

public interface eip<T extends eip<T>> {
   T b(eis.a var1);

   default <E> T a(Iterable<E> $$0, Function<E, eis.a> $$1) {
      T $$2 = this.c();

      for (E $$3 : $$0) {
         $$2 = $$2.b($$1.apply($$3));
      }

      return $$2;
   }

   default <E> T a(E[] $$0, Function<E, eis.a> $$1) {
      return this.a(Arrays.asList($$0), $$1);
   }

   T c();
}
