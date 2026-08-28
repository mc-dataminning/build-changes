import java.util.function.Function;

public interface fam<T extends fam<T>> {
   T b(fau.a var1);

   default <E> T a_(Iterable<E> $$0, Function<E, fau.a> $$1) {
      T $$2 = this.d();

      for (E $$3 : $$0) {
         $$2 = $$2.b($$1.apply($$3));
      }

      return $$2;
   }

   T d();
}
