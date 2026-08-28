import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface ero<T> {
   kp<T> a();

   T b();

   T a(T var1, Stream<cuq> var2);

   Stream<cuq> a(T var1);

   default void a(cuq $$0, T $$1, Stream<cuq> $$2) {
      T $$3 = $$0.a(this.a(), $$1);
      T $$4 = this.a($$3, $$2);
      $$0.b(this.a(), $$4);
   }

   default void a(cuq $$0, Stream<cuq> $$1) {
      this.a($$0, this.b(), $$1);
   }

   default void a(cuq $$0, UnaryOperator<cuq> $$1) {
      T $$2 = $$0.a(this.a());
      if ($$2 != null) {
         UnaryOperator<cuq> $$3 = $$1x -> {
            if ($$1x.e()) {
               return $$1x;
            } else {
               cuq $$2x = $$1.apply($$1x);
               $$2x.f($$2x.j());
               return $$2x;
            }
         };
         this.a($$0, this.a($$2).map($$3));
      }
   }
}
