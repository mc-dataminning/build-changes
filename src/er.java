import java.util.Optional;
import java.util.stream.Stream;

public interface er extends jr.a {
   static er a(final jr.a $$0, final cra $$1) {
      return new er() {
         @Override
         public Stream<alg<? extends kc<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<jr.b<T>> a(alg<? extends kc<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }
      };
   }
}
