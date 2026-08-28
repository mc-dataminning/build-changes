import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface exi<T> {
   kw<T> a();

   T b();

   T a(T var1, Stream<cxy> var2);

   Stream<cxy> a(T var1);

   default void a(cxy $$0, T $$1, Stream<cxy> $$2) {
      T $$3 = $$0.a(this.a(), $$1);
      T $$4 = this.a($$3, $$2);
      $$0.b(this.a(), $$4);
   }

   default void a(cxy $$0, Stream<cxy> $$1) {
      this.a($$0, this.b(), $$1);
   }

   default void a(cxy $$0, UnaryOperator<cxy> $$1) {
      T $$2 = $$0.a(this.a());
      if ($$2 != null) {
         UnaryOperator<cxy> $$3 = $$1x -> {
            if ($$1x.f()) {
               return $$1x;
            } else {
               cxy $$2x = $$1.apply($$1x);
               $$2x.f($$2x.k());
               return $$2x;
            }
         };
         this.a($$0, this.a($$2).map($$3));
      }
   }
}
