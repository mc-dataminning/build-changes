import java.util.function.Function;

public interface fdi<T extends fdi<T>> {
   T b(fdq.a var1);

   default <E> T a_(Iterable<E> $$0, Function<E, fdq.a> $$1) {
      T $$2 = this.d();

      for (E $$3 : $$0) {
         $$2 = $$2.b($$1.apply($$3));
      }

      return $$2;
   }

   T d();
}
