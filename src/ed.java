import java.util.Optional;
import java.util.stream.Stream;

public interface ed extends jc.a {
   static ed a(final jc.a $$0, final cop $$1) {
      return new ed() {
         @Override
         public Stream<aks<? extends jn<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<jc.b<T>> a(aks<? extends jn<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }
      };
   }
}
